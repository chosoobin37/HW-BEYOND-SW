<template>
   <div class="preparation-container">
    <img src="@/img/배경제거팬더.png" alt="First Image" class="prep-image" />
    <h1 class="prep-text"><img src="@/img/플레시피 캐릭터(배경 제거).png" class="prep-image1" />준비중입니다..</h1>
  </div>

</template>

<script setup>

</script>

<style scoped>
.preparation-container {
  position: relative;
  text-align: center;
}

.prep-image {
    position: absolute;
    top: 100;
    left: 50;
    width: 50%;

}

.prep-image1 {
  max-width: 100px; /* 이미지 크기 조정이 필요하면 변경 */
  height: auto;
  display: inline; /* 이미지를 나란히 배치 */
  margin: 0 10px; /* 이미지 사이의 간격 */
}

.prep-text {
  position: absolute;
  top: 30vh; 
  left: 15%;
  color: #000000; /* 텍스트 색상 */
  font-size: 4em; /* 텍스트 크기 */
  font-family: 'MapleStoryOTFBold';
}

@font-face {
    font-family: 'MaplestoryOTFBold';
    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_20-04@2.1/MaplestoryOTFBold.woff') format('woff');
    font-weight: normal;
    font-style: normal;
}

</style>

