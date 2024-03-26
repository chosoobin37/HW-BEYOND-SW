import { createRouter, createWebHashHistory } from 'vue-router';
import HomeView from "@/views/01_router/HomeView.vue";
import PathVariable from "@/views/01_router/PathVariable.vue";

const router = createRouter({
  history: createWebHashHistory(),
  routes: [
    {
      path: '/',
      component: HomeView
    },
    {
      path: '/pathvariable',
      component: PathVariable
    }
  ]
})

/* router 객체를 export -> main.js에서 import 할 용도 */
export default router;