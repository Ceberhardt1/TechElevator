<template>
  <div>
      <h4>TeamId    Team  Name   Year Established</h4>
      <div v-for="team in teams" v-bind:key="team.teamId">
         <p>{{ team.teamId }} : {{ team.teamName }} - Est. {{ team.yearEstablished }}</p>
      </div>
  </div>
</template>

<script>

import teamService from '../services/TeamService.js';

export default {

    data() {
        return {
            teams: []
        }
    },
    created() {

        teamService.getTeams().then(response => {
            this.teams = response.data;
        }).catch(error => {
            console.log('You are out of luck')
        }) 

    }

}
</script>

<style>

</style>