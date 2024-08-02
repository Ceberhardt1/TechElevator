<template>
    <div>
        <h2>Local Weather</h2>
        <p>{{ weather }}</p>
    </div>
</template>

<script>

//https://api.openweathermap.org/data/2.5/weather?zip=43021,US&appid=2f7bdcc26bc9669ab55f8341c4521509

export default {


    data() {
        return {
            weather: {}
        }
    },
    created() {
        const url = 'https://api.openweathermap.org/data/2.5/weather?zip=43021,US&appid=2f7bdcc26bc9669ab55f8341c4521509'
        fetch(url).then(response => {

            if (response.status == 200) {
                response.json().then((data) => {
                    console.log(data);
                    this.weather = data
                })
            }
            else {
                this.weather = 'No results. Java Green has left you high and dry!'
            }


        }).catch( error => {
            this.weather = 'No results. Java Green has left you high and dry!'
        })

    }

}
</script>

<style></style>