<template>
  <div :class="{container: true, dark: darkState}">
      props 입력: <input v-model="message"/>
      <PropsChild :text="message"/>        <!-- 물려줄 때 이름과 물려줄 값을 명시해줘야 한다  -->
      <DarkMode @toggle="toggleDarkMode"/>
      <ReadProps :readValue="readValue"/>
      부모의 readValue: <input v-model="readValue"/>
  </div>
</template>

<!-- 
  props
  1. 부모에서 자식 컴포넌트로 데이터를 전달하는 경우 다양한 slot 이용 가능
  2. 하지만 slot의 경우 컨텐츠 또는 구조를 전달하기 위해 사용하는 것으로 단일 데이터 전달 경우 적합 X
  3. 부모에게 전달받은 데이터를 조작하는 데 어려움
    -> 이러한 경우 우리는 데이터만 전달하기 위한 용도로 props 사용 가능
  4. 자식에게 물려주면 자식 컴포넌트는 readOnly로 사용해야 함
    -> vue는 자식 컴포넌트가 물려받은 값을 수정해도 어차피 부모 컴포넌트에게 영향X (readOnly 효과)
-->

<script setup>
  import { ref } from 'vue';
  import PropsChild from './PropsChild.vue';
  import DarkMode from './DarkMode.vue';
  import ReadProps from './ReadProps.vue';

  const message = ref('hello');
  const darkState = ref(false);
  const readValue = ref('Vue는 재밌어');

  function toggleDarkMode() {
    darkState.value =!darkState.value;
  }
  
</script>

<style scoped>
.container {
  border: 1px solid;
  display: flex;
  flex-direction: column;
  align-items: center;
}

.dark{
  background-color: black;
  color: white;
}
</style>