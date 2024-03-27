<script setup>
import { ref, onMounted } from 'vue';

import { useRouter } from 'vue-router';

const router = useRouter();
const placeDetail = (id) => {
  router.push(`/place/detail/${id}`);
};


  const posts = ref([]);

  const categoryColors = {
    '음식점': '#93ACB5',
  '카페': '#96C5F7',
  '문화': '#A9D3FF',
  '액티비티': '#CEE4FF',
  '기타': '#E0ECFF',
  '산책': '#F2F4FF',
};
        
  onMounted(async () => {
    const response = fetch('http://localhost:3000/one_post')
                    .then(response => response.json());
    const data = await response;
    posts.value = data;
    console.log(posts.value);
  });

  const getMemberCountText = (count) => {
    switch (count) {
      case "ONE":
        return "1인";
      case "TWO":
        return "2인";
      case "MANY":
        return "다수";
      default:
        return count;
    }
  };

  const getCategoryColor = (categoryName) => {
  return categoryColors[categoryName] || '#FFFFFF'; // 기본 색상은 흰색으로 설정
};
</script>
<template>
    <div id="app">
      <div class="sidebar">
      <div 
        class="sidebar-item"
        v-for="course in posts[0].course"
        :key="course.placeId"
        v-if="posts.length > 0"
        @click="placeDetail(course.placeId)"
        :style="{ backgroundColor: getCategoryColor(course.placeCategory.placeCategoryName) }">
        {{ course.placeName }}
      </div>
    </div>
        <div class="post-container">
            <div v-if="posts.length > 0">
                <div id="post-title">{{ posts[0].postTitle }}</div>
                <div id="post-writer">
                    <img id="member-image" src="@/img/프로필.jpg">
                    <span id="post-nick">{{ posts[0].memberNickname }}</span>
                    <span id="post-member-count">{{ getMemberCountText(posts[0].memberCount) }}</span>
                </div>
                <ul class="post-image">
  <li>
    <img src="@/img/1_신라호텔.jpg" alt="">
  </li>
  <li>
    <img src="@/img/2_수영장.jpg" alt="">
  </li>
  <li>
    <img src="@/img/3_점심.jpg" alt="">
  </li>
  <li>
    <img src="@/img/4_점심.jpg" alt="">
  </li>
  <li>
    <img src="@/img/5_수영장.jpg" alt="">
  </li>
  <li>
    <img src="@/img/6_저녁.jpg" alt="">
  </li>
  <li>
    <img src="@/img/7_저녁.jpg" alt="">
  </li>
  <li>
    <img src="@/img/8_시장.jpg" alt="">
  </li>
  <li>
    <img src="@/img/9_시장.jpg" alt="">
  </li>
  <li>
    <img src="@/img/10_야식.jpg" alt="">
  </li>
  <li>
    <img src="@/img/11_베이커리.jpg" alt="">
  </li>
  <li>
    <img src="@/img/12_베이커리.jpg" alt="">
  </li>
  <li>
    <img src="@/img/13_수영장.jpg" alt="">
  </li>
  <li>
    <img src="@/img/14_수빈.jpg" alt="">
  </li>
  <li>
    <img src="@/img/15_수빈.jpg" alt="">
  </li>
  <li>
    <img src="@/img/16_수빈.jpg" alt="">
  </li>
  <li>
    <img src="@/img/17_수빈.jpg" alt="">
  </li>
  <li>
    <img src="@/img/18_본지르르.jpg" alt="">
  </li>
  <li>
    <img src="@/img/19_본지르르.jpg" alt="">
  </li>
  <li>
    <img src="@/img/20_본지르르.jpg" alt="">
  </li>
</ul>

                <div id="post-content">{{ posts[0].postContent }}</div>
                <div id="hashtag">
                <span v-for="hashtag in posts[0].hashtag" :key="hashtag.hashtagId">
                    #{{ hashtag.hashtagTitle }}
                </span>
            </div>
            </div>
        </div>
    </div>
</template>

<style scoped>
/* 외부 CSS 파일 연결 */
@import url('./SelectPost.css');
</style>
