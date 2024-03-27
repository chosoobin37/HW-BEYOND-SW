<script setup>
import { RouterLink, RouterView } from 'vue-router';
import Header from '@/components/Header.vue';
</script>

<template>
  <header>
    <nav>
        <Header></Header>
      </nav> 
  </header>

  <main>
    <RouterView />
    <!-- <Post /> -->
  </main>
</template>

<style>
.active{
  color: steelblue;
}
</style>./views/post/SelectPost.vue