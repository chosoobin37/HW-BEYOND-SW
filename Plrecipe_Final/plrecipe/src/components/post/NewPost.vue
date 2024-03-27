<template>
  <div class="new-post-container">
    <form @submit.prevent="submitPost">
      <div>
        <label for="title">제목:</label>
        <input type="text" id="title" v-model="postForm.title">
      </div>
      <div>
        <label for="people">인원 선택:</label>
        <select id="people" v-model="postForm.people">
          <option disabled value="">선택해주세요</option>
          <option value="1인">1인</option>
          <option value="2인">2인</option>
          <option value="다수">다수</option>
        </select>
      </div>
      <div>
        <label for="content">내용:</label>
        <textarea id="content" v-model="postForm.content"></textarea>
      </div>
      <div>
        <label for="hashtags">해시태그 (쉼표로 구분):</label>
        <input type="text" id="hashtags" v-model="hashtagsInput" @blur="splitHashtags">
      </div>
      <button type="submit">게시글 작성</button>
    </form>
  </div>
</template>

<script setup>
import { reactive, ref } from 'vue';

const postForm = reactive({
  title: '',
  people: '',
  content: '',
  hashtags: []
});

const hashtagsInput = ref('');

function splitHashtags() {
  postForm.hashtags = hashtagsInput.value.split(',').map(tag => tag.trim()).filter(tag => tag !== '');
}

function submitPost() {
  console.log('게시글 데이터:', postForm);
  // 게시글 데이터를 서버에 전송하거나 저장하는 로직을 여기에 추가
}
</script>

<style scoped>
/* 외부 CSS 파일 연결 */
@import url('./NewPost.css');

</style>
