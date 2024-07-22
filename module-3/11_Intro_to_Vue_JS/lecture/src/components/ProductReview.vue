<template>
    <div class="product-review">
        <h3>{{ name }}</h3>
        <p>{{ description }}</p>
    </div>
    
</template>
  
  <script>
  export default {
        data(){
            return{
                name: 'Head First Design',
                description: "This is the description"
            }
        }
  }
  </script>
  
  <!-- Add "scoped" attribute to limit CSS to this component only -->
  <style scoped>
  h3 {
    margin: 40px 0 0;
  }
  .product-review{
    
  }

  
  </style>
  