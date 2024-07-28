import { createRouter as _createRouter, createWebHistory } from 'vue-router';

import HomeView from '../views/HomeView.vue'
import MyBooksView from '../views/MyBooksView.vue'
import NewBookView from '../views/NewBookView.vue'
import BookDetails from '../views/BookDetails.vue'
const routes = [
{
  path: '/',
  name: 'home',
  component: HomeView
},

{
  path: '/myBooks',
  name: 'myBooks',
  component: MyBooksView
},

{
  path: '/addBook',
  name: 'addBook',
  component: NewBookView
},
{
  path: '/book/:isbn',
  name: 'BookDetails',
  component: BookDetails
}
];

export function createRouter () {
  return _createRouter({
    history: createWebHistory(),
    routes: routes
  })
}
