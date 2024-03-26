<template>
  <div>
    <h1>Home</h1>
    <h2>currentRoute={{ currentRoute }}</h2>
    <button @click="changeRouter">router 경로 변경</button>
  </div>
</template>

<!-- 
  useRoute
  햔재 라우트 객체에 액세스 할 수 있도록 해주는 메소드로 이 객체를 사용하면 현재 라우트 정보 확인 가능
  주로 현재 라우트의 매개변수 혹은 쿼리 문자열과 같은 정보를 사용하여 동적으로 컴포넌트를 렌더링 하거나
  조건부 렌더링 구현 시 사용

  userRouter
  userRouter에서 제공하는 push 함수를 활용하여 우리가 원하는 라우팅 요청을 보낼 수 있게 되고
  해당 컴포넌트로 <RouterView>가 바뀌면서 정보도 전달 가능 (param 또는 query)
-->

<script setup>
import { useRoute, useRouter } from "vue-router";

const currentRoute = useRoute();
const router = useRouter();

function changeRouter() {

  const num = 2;
  // router.push('/pathvariable/2');
  router.push(`/pathvariable/${num}`)
}

</script>

