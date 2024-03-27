<template>
    <div id="stars">
        <div class="star-block" v-for="star in starBlocks" :key="star.id">
            <div class="img">
                <img src="@/img/ham.jpeg" alt="Member">
            </div>
            <div class="star-info">
                <p class="member-nickname">{{ star.member.memberNickname }}</p>
                <p class="star">
                    <span class="star-span" v-for="n in Math.floor(star.starPoint)" :key="`star-${n}`">★</span>
                    <span class="star-span" v-for="n in (5 - Math.ceil(star.starPoint))"
                        :key="`empty-star-${n}`">☆</span>
                </p>
                <div class="comment">{{ star.starComment }}</div>
            </div>
        </div>
    </div>
</template>

<script setup>

import { defineProps } from 'vue';

const props = defineProps({
    starBlocks: Array
});

</script>

<style scoped>
.comment {
    margin: 10px;
    padding: 20px;
    width: 650px;
    height: 100px;
    border-radius: 10px;
    background-color: lightblue;
    border: 3px solid skyblue;
    font-size: 15px;
}

#img,
#etc {
    width: 20%;
}

table img {
    width: 180px;
    margin: auto;
}

.star,
.member-nickname {
    font-size: 15px;
    float: left;
    margin: 25px;
}

.star-span {
    color: yellow;
}

.star-block img {
    width: 100px;
    height: 100px;
    border-radius: 50px;
    float: left;
    margin: 10px;
    padding: 10px;
}

.star-block {
    width: 680px;
    height: 150px;
    /* border: lightblue solid 1px; */
    /* padding: 20px; */
    padding-left: 3px;
    padding-top: 17px;
    margin-top: 20px;
    margin-bottom: 10px;
    margin-left: auto;
    margin-right: auto;
    border-radius: 10px;
    position: relative;
}

#stars {
    margin: auto;
}

#star-info {
    float: left;
}
</style>