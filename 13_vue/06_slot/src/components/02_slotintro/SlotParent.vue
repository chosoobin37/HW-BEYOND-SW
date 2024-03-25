<template>
  <div class="parentContainer">
    <h1>Parent</h1>
    <Child>
      {{ slotData }}
    </Child>
  </div>
</template>

<!-- 
  slot:
  Vue 컴포넌트에서 컨텐츠를 전달하는 매커니즘으로 부모 컴포넌트에서 자식 컴포넌트로
  데이터나 구조를 전달하는 데 사용 됨 -> 주로 구조를 전달하는 데 목적, 데이터는 prop으로
  구조: 부모에서 만든 컴포넌트 요소
-->
<script setup>

// 자식 컴포넌트
// 컴포넌트를 호출할 때 현재 파일을 기준으로 상대 경로를 잡아 호출하게 됨 (import 파일의 이름을 기준으로 사용)

  import Child from './SlotChild.vue'
  import { ref } from 'vue';

  const slotData = ref('hello data');
</script>

<style scoped>
.parentContainer {
  display: flex;
  align-items: center;
  flex-direction: column;
  border: 1px solid black;;
}
</style>
