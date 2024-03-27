<template>
    <table id="place-info">
        <tr>
            <td rowspan="5" colspan="2" id="placeImg"><img src="@/img/boramae.jpg" alt="Place"></td>
            <td colspan="2" id="placeName">[{{ placeData.placeName }}]</td>
        </tr>
        <tr>
            <td colspan="2" id="place-category"><span :style="{ backgroundColor: getCategoryColor(placeData.placeCategory.placeCategoryName) }">{{ placeData.placeCategory.placeCategoryName }}</span></td>
        </tr>
        <tr>
            <td colspan="2" id="address">📌{{ placeData.placeLocation }}</td>
        </tr>
        <tr>
            <td colspan="2" id="avg-star">
                <p id="avg"> 평균 별점 </p>
                <p id="star-rating">
                    <span v-for="n in Math.floor(placeData.avgStar)" :key="'full-star-' + n">★</span>
                    <span v-for="n in (5 - Math.ceil(placeData.avgStar))" :key="'empty-star-' + n">☆</span>
                    <span>({{ placeData.avgStar.toFixed(1) }})</span>
                </p>
            </td>
        </tr>
        <tr id="etc">
            <td id="locationMap"><a href="https://map.naver.com/p/search/보라매공원" target="_blank" rel="noopener">위치(지도)</a></td>
            <td id="phone"><span v-if="placeData.placePhoneNum">☎️ {{ placeData.placePhoneNum }}</span></td>
        </tr>
    </table>
</template>

<script setup>
import { defineProps } from 'vue';

const props = defineProps({
  placeData: Array
});

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
#place-info {
    width: 680px;
    /* border: 1px solid black; */
    margin: auto;
    font-size: 13px;
    padding: 30px;
    margin-top: 20px;
}

#place-info * {
    margin: 1px;
}

#placeName {
        font-weight: bolder;
        font-size: 30px;
        float: left;
    }


table #placeName {
    margin: 15px;
}

#place-category span {
    width: 50px;
    padding: 5px 15px;
    border-radius: 15px;
    text-align: center;
    font-size: 12px;
    font-weight: bold;
    background-color: bisque;
}

#star-span {
    color: yellow;
}

#avg {
    font-size: 10px;
}

#locationMap, #phone {
    background-color: lightblue;
    margin-left: 15px;
    margin-right: 15px;
    padding: 5px;
    text-align: center;
    border-radius: 20px;
    font-size: 10px;
}

#img,
    #etc {
        width: 70%;
    }

table img {
    width: 250px;
    margin: auto;
}

</style>