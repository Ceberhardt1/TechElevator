<template>
    <div>
        <h1>Player Search</h1>

        <div>
            <label for="">Search Player: </label>
            <input type="text" name="playerName" id="playerName" v-model="nameFilter">
        </div>

         <div id="card-container">
           <player-card v-bind:player=player v-for="player in filteredPlayers" v-bind:key="player.id" ></player-card>
        </div>

<!--

        <div class="divTable blueTable">
            <div class="divTableHeading">
                <div class="divTableRow">
                    <div class="divTableHead">Picture</div>
                    <div class="divTableHead">First Name</div>
                    <div class="divTableHead">Last Name</div>
                    <div class="divTableHead">Position</div>
                    <div class="divTableHead">Salary</div>
                    <div class="divTableHead">Player Id</div>
                </div>
            </div>
            <div class="divTableBody">
                <div class="divTableRow" v-for="player in filteredPlayers" v-bind:key="player.id">
                    <div class="divTableCell">
                        <img id="thumbnail" v-bind:src="player.imageUrl" alt="">
                    </div>
                    <div class="divTableCell">{{ player.firstName }}</div>
                    <div class="divTableCell">{{ player.lastName }}</div>
                    <div class="divTableCell">{{ player.positions[0]}}</div>
                    <div class="divTableCell">{{player.salary}}</div>
                    <div class="divTableCell">{{player.playerId}}</div>
                </div>
            </div>
        </div>


-->

    </div>
</template>

<script>

import playerService from '../services/PlayerService.js';
import PlayerCard from './PlayerCard.vue';

export default {

    components: {
        PlayerCard
    },



    data() {
        return {
           nameFilter: '',
           players: [],
        }
    },
    computed: {
        filteredPlayers() {


            return this.players.filter( (player) => {
               return this.nameFilter == '' ? true : player.fullName.includes(this.nameFilter);
            });


      
        }
    },
    methods: {

    },
    created() {
        //call a web service
        playerService.getPlayers().then( response => {
            console.log(response);
            this.players = response.data;
        }); 

    }

}
</script>

<style scoped>

input[type=text] {
    margin:10px;
    width: 20%;
}

#card-container {
    display: flex;
    flex-direction: row;
    justify-content:space-between;
    width: 100%;
    flex-wrap: wrap;
}

#thumbnail {
    height: 50px;
    width:auto;

}
div.blueTable {
    border: 1px solid #1C6EA4;
    background-color: #EEEEEE;
    width: 100%;
    text-align: left;
    border-collapse: collapse;
}

.divTable.blueTable .divTableCell,
.divTable.blueTable .divTableHead {
    border: 1px solid #AAAAAA;
    padding: 3px 2px;
}

.divTable.blueTable .divTableBody .divTableCell {
    font-size: 13px;
}

.divTable.blueTable .divTableRow:nth-child(even) {
    background: #D0E4F5;
}

.divTable.blueTable .divTableHeading {
    background: #1C6EA4;
    background: -moz-linear-gradient(top, #5592bb 0%, #327cad 66%, #1C6EA4 100%);
    background: -webkit-linear-gradient(top, #5592bb 0%, #327cad 66%, #1C6EA4 100%);
    background: linear-gradient(to bottom, #5592bb 0%, #327cad 66%, #1C6EA4 100%);
    border-bottom: 2px solid #444444;
}

.divTable.blueTable .divTableHeading .divTableHead {
    font-size: 15px;
    font-weight: bold;
    color: #FFFFFF;
    border-left: 2px solid #D0E4F5;
}

.divTable.blueTable .divTableHeading .divTableHead:first-child {
    border-left: none;
}

.blueTable .tableFootStyle {
    font-size: 14px;
}

.blueTable .tableFootStyle .links {
    text-align: right;
}

.blueTable .tableFootStyle .links a {
    display: inline-block;
    background: #1C6EA4;
    color: #FFFFFF;
    padding: 2px 8px;
    border-radius: 5px;
}

.blueTable.outerTableFooter {
    border-top: none;
}

.blueTable.outerTableFooter .tableFootStyle {
    padding: 3px 5px;
}

/* DivTable.com */
.divTable {
    display: table;
}

.divTableRow {
    display: table-row;
}

.divTableHeading {
    display: table-header-group;
}

.divTableCell,
.divTableHead {
    display: table-cell;
}

.divTableHeading {
    display: table-header-group;
}

.divTableFoot {
    display: table-footer-group;
}

.divTableBody {
    display: table-row-group;
}</style>