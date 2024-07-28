<template>
    <div class="book-details">
        <h2>{{ book.title }}</h2>
        <p>Author: {{ book.author }}</p>
        <p>ISBN: {{ book.isbn }}</p>
        <p>Number of Pages: {{ book.numPages }}</p>
    </div>
</template>

<script>

export default{
    props: ['book'],
    computed: {
        bookDetails(){
            const isbn = this.$route.params.isbn;
            return this.$store.state.books.find(book => book.isbn === isbn);

        }
    }
}
</script>

<style scoped>


</style>