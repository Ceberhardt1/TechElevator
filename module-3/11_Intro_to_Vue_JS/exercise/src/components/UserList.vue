<template>
  <table id="tblUsers">
    <thead>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Username</th>
        <th>Email Address</th>
        <th>Status</th>
    </tr>
    </thead>
    <tbody>
      <tr>
        <td><input type="text" id="firstNameFilter" v-model="search.firstName"/></td>
        <td><input type="text" id="lastNameFilter" v-model="search.lastName"/></td>
        <td><input type="text" id="usernameFilter" v-model="search.username"/></td>
        <td><input type="text" id="emailFilter" v-model="search.emailAddress"/></td>
        <td>
          <select id="statusFilter" v-model="search.status">
            <option value="">Show All</option>
            <option value="Active">Active</option>
            <option value="Inactive">Inactive</option>
          </select>
        </td>
      </tr>
      <!-- user listing goes here -->
      <tr v-for="usr in filteredList" v-bind:key="usr.username" v-bind:class="{'inactive' : usr.status == 'Inactive'}">
        
        <td>{{ usr.firstName }}</td>
        <td>{{ usr.lastName }}</td>
        <td>{{ usr.username }}</td>
        <td>{{ usr.emailAddress }}</td>
        <td>{{ usr.status }}</td>
      </tr>
      
    </tbody>
  </table>
</template>

<script>
export default {
  data() {
    return {
      search: {
        firstName: '',
        lastName: '',
        username: '',
        emailAddress: '',
        status: ''
      },
      users: [
        { firstName: 'John', lastName: 'Smith', username: 'jsmith', emailAddress: 'jsmith@gmail.com', status: 'Active' },
        { firstName: 'Anna', lastName: 'Bell', username: 'abell', emailAddress: 'abell@yahoo.com', status: 'Active' },
        { firstName: 'George', lastName: 'Best', username: 'gbest', emailAddress: 'gbest@gmail.com', status: 'Inactive' },
        { firstName: 'Ben', lastName: 'Carter', username: 'bcarter', emailAddress: 'bcarter@gmail.com', status: 'Active' },
        { firstName: 'Katie', lastName: 'Jackson', username: 'kjackson', emailAddress: 'kjackson@yahoo.com', status: 'Active' },
        { firstName: 'Mark', lastName: 'Smith', username: 'msmith', emailAddress: 'msmith@foo.com', status: 'Inactive' }
      ]
    }
  },
  computed: {
    filteredList(){
      return this.users.filter((user) => {
        const firstNameMatch = user.firstName.toLowerCase().includes(this.search.firstName.toLowerCase());
        const lastNameMatch = user.lastName.toLowerCase().includes(this.search.lastName.toLowerCase());
        const userNameMatch = user.username.toLowerCase().includes(this.search.username.toLowerCase());
        const EmailMatch = user.emailAddress.toLowerCase().includes(this.search.emailAddress.toLowerCase());
        const statusMatch = user.status.includes(this.search.status);
        return firstNameMatch && lastNameMatch && userNameMatch && EmailMatch && statusMatch;
      });
    },
  }
}
</script>

<style scoped>
table {
  margin-top: 20px;
  font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif
}
th {
  text-transform: uppercase
}
td {
  padding: 10px;
}
tr.inactive {
  color: red;
}
input, select {
  font-size: 16px;
}
</style>
