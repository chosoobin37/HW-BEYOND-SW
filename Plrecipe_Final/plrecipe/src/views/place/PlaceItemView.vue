<template>

  <div class="places" id="places">

    <b-container class="bv-example-row mb-3">
      <b-row cols="4">
        <template v-for="place in props.places" :key="place.placeId">
          <b-col>
            <div class="place-block" @click="placeDetail(place.placeId)">
              <p id="place-name">{{ place.placeName }}</p>

              <p id="star">
                <span id="star-span" v-for='n in parseInt(place.avgStar)'>★</span>
                <span id="star-span" v-for='n in (5 - parseInt(place.avgStar))'>☆</span>
              </p>

              <p id="address">{{ place.placeLocation }}</p>

              <div id="place-category" :style="{ backgroundColor: getCategoryColor(place.placeCategory.placeCategoryName) }">
                {{ place.placeCategory.placeCategoryName }}
              </div>
            </div>
          </b-col>
        </template>
      </b-row>
    </b-container>

  </div>

</template>

<script setup>

import { defineProps } from 'vue';
import { useRouter } from "vue-router";

const props = defineProps({
  places: Array
});

const router = useRouter();

const placeDetail = (id) => {
  console.log(id);
  router.push(`/place/detail/${id}`);
};

const categoryColors = {
  '음식점': 'lightpink',
  '카페': 'lightyellow',
  '문화': 'lightgreen',
  '액티비티': 'lightblue',
  '기타': 'lightgray',
  '산책': 'rgba(212, 170, 255, 0.952)',
};

const getCategoryColor = (categoryName) => {
  return categoryColors[categoryName] || '#FFFFFF'; // 기본 색상은 흰색
};

</script>

<style scoped>

.star-block,
.place-block {
  width: 320px;
  height: 150px;
  border: black solid 3px;
  padding: 10px 15px;
  margin: 5px 5px;
  border-radius: 10px;
  position: relative;
  font-size: 15px;
  font-family: 'KCC-Hanbit', sans-serif;

}

#star {
  float: left;
  position: absolute;
  right: 10px;
  top: 10px;
}

#place-name {
  font-weight: bold;
  font-size: 18px;
  float: left;
}

#comment,
#address {
  clear: both;
}

#place-category {
  font-family: 'KCC-Hanbit', sans-serif;
  width: 80px;
  height: 30px;
  padding: 2px;
  border-radius: 10px;
  text-align: center;
  font-size: 15px;
  font-weight: bold;
  background-color: rgb(255, 196, 196);
  position: absolute;
  right: 10px;
  bottom: 10px;
}

#star-span {
  font-size: 20px;
  color: gold;
}

.star-block:hover, .place-block:hover {
  transition: all 0.3s;
  box-shadow: 5px 5px lightblue;
}

#stars,
#places {
  clear: both;
  padding-top: 20px;
}

@font-face {
  font-family: 'KCC-Hanbit';
  src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/2403-2@1.0/KCC-Hanbit.woff2') format('woff2');
  font-weight: normal;
  font-style: normal;
}

</style>