<template>
  <div>
    <h2>Nasa Picture of the Day</h2>
    <button v-on:click="getInfo" type="button" class="btn btn-outline-primary">Click me to win a prize!!!</button>

    <div v-show="info != {}">
       <img v-bind:src="info.url" alt="">
    </div>
  </div>
</template>

<script>

import NasaService from '../services/NasaService.js';

export default {

    data() {
        return {
            info: {}
        }
    },
    methods: {
       getInfo() {
           console.log('I am here');
           NasaService.getNASAData().then( response => {
            this.info = response.data;
           })
       }
    }

}
</script>

<style>

</style>