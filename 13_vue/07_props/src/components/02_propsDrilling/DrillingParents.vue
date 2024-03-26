<template>
  <div class="container">
    <h1>Parents: {{ count }}</h1>
    <Child/>
  </div>
</template>

<!-- 
  PropsDrilling
  상위 컴포넌트에서 하위 컴포넌트로 데이터를 전달하는 과정에서 중단에 여러 컴포넌트를 거쳐가는 경우
  여러 컴포넌트를 거쳐 props를 전달하는 것은 코드를 복잡하게 만들고 유지보수를 어렵게 함
  -> vue에서는 필요한 부모 컴포넌트 하위의 컴포넌트에서 필요 시 inject하여 어디서든 사용할 수 있으며
  이를 통해 drilling을 최소화 가능 (다만, 하위 컴포넌트가 많지 않을 떄는 오히려 유지보수 악영향 가능성)
-->

<script setup>
import { provide, ref, readonly } from 'vue';
import Child from './DrillingChild.vue';


const count = ref(412);

// provide를 통해 별도의 공간에 count 반응형 변수값을 'count'라는 이름으로 담아둠
provide('count',count);  

// provide를 활용하는 부모 컴포넌트에서는 수정하지만  inject를 활용하는 곳은 읽기 전용으로 작성 (권장)
// provide('count', readonly(count));  
</script>

<style scoped>
  .container {
    border: solid 1px black;
    display: flex;
    flex-direction: column;
    align-items: center;
  }
</style>