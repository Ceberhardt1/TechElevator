<template>
  <div class="book-container">
    <book-card 
    v-for="book in $store.state.books"
    v-bind:key="book.id"
    v-bind:book="book"
    />

  </div>
</template>

<script>
import BookCard from '../components/bookcard.vue'

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