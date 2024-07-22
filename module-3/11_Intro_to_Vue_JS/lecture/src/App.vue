<template>
  <div class="main">
    <img alt="Vue logo" src="./assets/logo.png" />
    <HelloWorld msg="Welcome to Your Vue.js App" />
    <br/>
    <ProductReview/>
  </div>
</template>

<script>
import ProductReview from './components/ProductReview.vue';
import HelloWorld from './components/HelloWorld.vue'; 


export default {
  components: {
    HelloWorld, 
    ProductReview
  }
}
</script>

<style>
.main {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #f1eaea;
  margin-top: 60px;
}
body{
  background-image: url(./assets/vue-lecture-introbackground.webp);
  background-size: cover;
  
  
}
&:before {
    content: '';
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background: linear-gradient( rgba(0, 0, 0, 0.57), rgba(0, 0, 0, 0.34)); /* Adjust the rgba values and gradient direction */
  }
</style>
