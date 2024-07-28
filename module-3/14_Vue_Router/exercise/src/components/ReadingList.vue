<template>
  <div class="book-container">
    <router-link :to="`/book/${book.isbn}`" v-bind:book="book" v-for="book in $store.state.books" v-bind:key="book.isbn" >
    <BookCard :book="book" />
    </router-link>
  </div>
</template>

<script>
import BookCard from '../components/BookCard.vue';

export default {
  components: {
    BookCard
  }
}
</script>

<style>
.book-container {
  display: flex;
  justify-content: space-evenly;
  flex-wrap: wrap;
}
</style>