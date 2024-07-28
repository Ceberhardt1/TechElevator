<template>
    <div>
        <h1>My Books</h1>
        <ReadingList/>
        <router-link to="/addBook">Add A New Book</router-link>
    </div>
</template>

<script>
import ReadingList from '../components/ReadingList.vue';

export default {
    components: {
        ReadingList
    }
}
</script>


<style scoped>
.my-books-view{
    margin: 20px;
}

</style>