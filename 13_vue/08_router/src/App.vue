<script setup>
import { RouterLink, RouterView } from 'vue-router';
</script>

<!-- 
  npm install vue-router@next

  RouterLink
  사용자가 다른 라우트로 이동할 수 있도록 하는 링크 생성하는 데 사용

  RouterLink의 속성
  1. to: 이동할 라우트의 경로 지정 (uri)
  2. active-class: 현재 라우트와 일치할 때 적용할 css 클래스를 지정 -> 활성화 되었던 RouterLink에 css 적용 시 사용

  RouterView
  현재 라우트에 해당하는 컴포넌트를 렌더링하는 지점을 정하기 위해 사용
  vue-router가 현자 uri에 따라 매칭되는 컴포넌트를 찾으면 해당 컴포넌트를 RouterView 내부에 렌더링 하여
  이를 통해 페이지 간의 전환 구현

  일반적으로 RouterView -> RouterLink와 함께 사용되며 라우팅 기능 완성
-->

<template>
  <header>
    <h1>Router 사용하기</h1>
    <hr>
    <div class="wrapper">
      <!--       
        <h2>basic router</h2>
        <nav>
          <RouterLink to="/" active-class="active">Home</RouterLink>
          <RouterLink to="/pathvariable/1" active-class="active">PathVariavle</RouterLink>
          <RouterLink to="/querystring?name=조먹밥&age=3" active-class="active">QueryString</RouterLink>
        </nav>
      -->

      <h2>nested router</h2>
      <nav>
        <RouterLink to="/" active-class="active">Home</RouterLink>
        <RouterLink to="/nested" active-class="active">중첩 인덱스</RouterLink>
        <RouterLink to="/nested/view" active-class="active">중첩 라우터</RouterLink>
      </nav>
    </div>
  </header>

  <main>
    <RouterView/>
  </main>
</template>

<style scoped>
nav {
  width: 100%;
  font-size: 12px;
  text-align: center;
  margin-top: 2rem;
  font-size: 30px;
}

a {
  margin-left: 10px;
}

.active {
  color: red;
}

main {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}

header {
  text-align: center;
}
</style>
