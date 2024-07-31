<template>
  <div class="loading" v-if="isLoading">
    <p>Loading...</p>
  </div>
  <div v-else>
    <nav>
      <router-link v-bind:to="{ name: 'TopicDetailsView', params: { topicId: topicId } }">Back to Topic
        Details</router-link>
    </nav>
    <message-details v-bind:message="message" />
  </div>
</template>

<script>
import MessageDetails from '../components/MessageDetails.vue';
import TopicService from '../services/TopicService';

export default {
  components: {
    MessageDetails,
  },
  data() {
    return {
      topicId: this.$route.params.topicId,
      message: {},
      isLoading: true
    }
  },
  methods: {
    getMessage(id) {
      TopicService.getMessage(id).then(response => {
        this.message = response.data;
        this.isLoading= false;
      })
    },
  },
  created() {
    this.getMessage(this.$route.params.messageId);
  }
};
</script>

<style scoped></style>
