<template>
  <div>
    <h1>PathVariavle</h1>
    <h2>currentRoute={{ currentRoute.params.id }}</h2>
  </div>
</template>

<script setup>
import { useRoute } from "vue-router";

const currentRoute = useRoute();

</script>

<style scoped>

</style>