<template>
  <h3>GrandChild: {{ injectCount }}</h3>
  <button @click="injectCount++">GrandChild 증가</button>
</template>

<script setup>
  import { inject } from "vue";

  const injectCount = inject("count");
</script>
