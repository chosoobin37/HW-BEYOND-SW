<template>
  <h3>전달 받은 props: {{ props.text }}</h3>   <!-- 객체 형태기 때문에 .message로 접근 -->
</template>

<script setup>
  import { defineProps } from 'vue';

  const props = defineProps({

      /* defineProps 함수를 활용해 String형의 message props를 받아 props 변수에 담는다. */
      text: String
  })
</script>
