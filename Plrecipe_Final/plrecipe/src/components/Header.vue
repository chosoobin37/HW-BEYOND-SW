<template>
    <header class="header">
        <img src="@/img/logo.jpg" alt="PLRECIPE 로고" class="logo" @click="goMain"> 
        <nav class="nav">
            <ul class="nav-list">
                <li class="category" @click="goPage('post')"><b>게시판</b></li>
                <li class="category" @click="goPage('place')"><b>장소</b></li>
                <li class="category" @click="goPage('freePost')"><b>자유게시판</b></li>
                <li class="category" @click="goPage('QnA')"><b>문의</b></li>
                <li class="category" @click="goPage('notice')"><b>공지사항</b></li>
                <li @click="goPage('myPage')">마이페이지</li> 
                <li @click="Logout">로그아웃</li> 
            </ul>
        </nav>
    </header>
</template>

<script setup>
import { ref } from 'vue';
import { useRouter } from 'vue-router';

const router = useRouter();
// const activeMenu = ref('main');

const goPage = (page) => {

  if(page == 'post' || page == 'place'){
    router.push(`/${page}`);
  }
  else
  {
    router.push('/ready')
  }
}

const goMain = () => {
    router.push('/');
};
const goPost = () => {
    router.push('/post');
};
const goPlace = () => {
    router.push('/place');
};
const goFreePost = () => {
  alert('준비중입니다');
};
const goQnA = () => {
  alert('준비중입니다');
};
const goNotice = () => {
  alert('준비중입니다');
};
const goMyPage = () => {
  alert('준비중입니다');
};
const Logout = () => {
  window.location.href = 'http://localhost:8080';
}
</script>

<style scoped>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

body {
  font-family: 'Arial', sans-serif;
  background-color: #f4f4f4;
  margin: 0;
  padding: 20px;
}

.header {
  font-family: 'KCC-Hanbit', sans-serif;
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 20px;
  background-color: #fff;
}

.logo {
  max-width: 300px;
}

.nav-list {
  list-style: none;
  display: flex;
}

.nav-list li {
  padding: 0 15px;
}

.nav-list li a {
  text-decoration: none;
  color: #333;
  font-weight: bold;
}

#app {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(240px, 1fr));
  grid-gap: 20px;
  margin-top: 20px;
}

.post {
  background-color: #fff;
  border: 1px solid #ddd;
  padding: 20px;
  box-shadow: 0 5px 15px rgba(0, 0, 0, 0.1);
}

.post .title p {
  font-size: 1.2em;
  margin-bottom: 10px;
}

.post .member p {
  color: #555;
  margin-bottom: 10px;
}

.post .hashtag p {
  color: #777;
  margin-bottom: 10px;
}

.post .hashtag span {
  background-color: #eee;
  padding: 3px 6px;
  border-radius: 3px;
  margin-right: 5px;
}

/* 이미지 스타일링 - 이미지가 있어야 적용 가능 */
.post .image {
  height: 200px;
  background-color: #ddd;
  margin-bottom: 10px;
}
/* 헤더 및 내비게이션 스타일 */
.header {
  background-color: #ffffff; /* 헤더 배경 색상 */
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1); /* 하단 그림자 */
  padding: 10px 20px; /* 헤더 안쪽 여백 */
}

.logo {
  height: 65px; /* 로고 높이 */
  width: 200px; /* 로고 너비는 자동으로 설정 */
}

.nav {
  display: flex;
  align-items: center; /* 항목들을 중앙 정렬 */
}

.nav-list {
  list-style-type: none;
  display: flex;
  gap: 20px; /* 네비게이션 항목 간 간격 */
  margin-left: auto; /* 왼쪽에 자동 마진을 줘서 오른쪽 정렬 */
}

.nav-list li {
  padding: 5px 10px; /* 네비게이션 항목 안쪽 여백 */
}

.nav-list li a {
  text-decoration: none; /* 밑줄 없애기 */
  color: #333333; /* 텍스트 색상 */
  font-weight: bold; /* 글씨 굵기 */
  transition: color 0.3s; /* 색상 변화 애니메이션 */
}

.nav-list li a:hover {
  color: #0056b3; /* 마우스 오버 시 색상 변경 */
}

/* 화면이 작을 때 네비게이션 바 스타일 조정 */
@media (max-width: 768px) {
  .nav-list {
    flex-direction: column;
    gap: 10px;
  }

  .nav-list li {
    text-align: center; /* 텍스트 중앙 정렬 */
  }
}


/* 큰 이미지 스타일 */
.big-image {
  width: 100%;
  height: 100%; /* 이미지가 컨테이너 크기에 맞게 설정 */
  display: block;
  margin-top: 10px;
  margin-right: 20px; 
}

/* 작은 이미지 스타일 */
.small-image {
  width: 48%; /* 큰 이미지의 1/3 크기로 설정 */
  height: 300px;
  margin-left: 10px;
  margin-top: 10px;
  margin-right: 10px;
}

.big-image-container {
    position: relative; /* 컨테이너를 상대적 위치로 설정 */
    width: 100%;
    height: 600px; /* 높이 조절이 필요하면 변경하세요 */
  }
  
  
  .image-text {
    position: absolute; /* 절대 위치 설정 */
    top: 50%; /* 상위 요소 기준으로 위에서 50% 위치에 배치 */
    left: 50%; /* 상위 요소 기준으로 왼쪽에서 50% 위치에 배치 */
    transform: translate(-50%, -50%); /* 중앙 정렬을 위해 위치 조정 */
    color: black; /* 텍스트 색상을 흰색으로 설정 */
    font-size: 2em; /* 텍스트 크기 설정 */
    text-align: center; /* 텍스트를 중앙 정렬 */
    /* 필요에 따라 추가 스타일링 */
  }
 
  .nav-list li.category:hover{
    font-size: large;
    color: lightskyblue;
  }

  
</style>