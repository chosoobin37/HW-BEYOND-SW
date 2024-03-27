<template>
  <div class="category">
    <div id="All" @click="changeCategory('')" :class="{All: activeCategory == ''}" >전체</div>
    <div id="food" @click="changeCategory(1)" :class="{food: activeCategory == 1}">음식점</div>
    <div id="cafe" @click="changeCategory(2)" :class="{cafe: activeCategory == 2}">카페</div>
    <div id="culture" @click="changeCategory(3)" :class="{culture: activeCategory == 3}">문화</div>
    <div id="activity" @click="changeCategory(4)" :class="{activity: activeCategory == 4}">액티비티</div>
    <div id="walk" @click="changeCategory(5)" :class="{walk: activeCategory == 5}">산책</div>
    <div id="etc" @click="changeCategory(6)" :class="{etc: activeCategory == 6}">기타</div>
  </div>
</template>

<script setup>
import { defineEmits, ref } from 'vue';

/* 부모로부터 물려받은 toggle이라는 이름의 이벤트를 호출할 수 있는 함수 반환받기(defineEmits를 활용하며 배열로 이벤트 이름 작성) */
const emit = defineEmits(['change']);
const activeCategory = ref('');

function changeCategory(category) {
  console.log(category);
  activeCategory.value = category;
  emit('change', category);
}

</script>

<style scoped>
.category div {
  width: 100px;
  height: 30px;
  text-align: center;
  border: #646464 solid 1px;
  border-radius: 10px 10px 0px 0px;
  float: left;
}

.category {
  margin-left: 120px;
  margin-top: 20px;
  transition: all 0.3s;
  font-family: 'KCC-Hanbit', sans-serif;
}
#All:hover, .All {
  background-color: khaki;
}

#food:hover, .food {
  background-color: lightpink;
}

#cafe:hover, .cafe {
  background-color: lightyellow;
}

#culture:hover, .culture {
  background-color: lightgreen;
}

#activity:hover, .activity {
  background-color: lightblue;
}

#walk:hover, .walk {
  background-color: rgba(212, 170, 255, 0.952);
}

#etc:hover, .etc {
  background-color: lightgray;
}

@font-face {
  font-family: 'KCC-Hanbit';
  src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/2403-2@1.0/KCC-Hanbit.woff2') format('woff2');
  font-weight: normal;
  font-style: normal;
}
</style>