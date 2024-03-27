<script setup>
import PlaceInfo from './PlaceInfo.vue'
import PlaceStars from './PlaceStars.vue'

import { ref, onMounted } from "vue";
import { useRoute } from 'vue-router'

const place = ref(null);
const stars = ref(null);
const pId = useRoute().params.id;


onMounted(async () => {
    await getPlaceData(pId)
});

async function getPlaceData(id) {
    const response = fetch('http://localhost:3000/place')
        .then(response => response.json());
    const data = await response;

    const selectPlace = data.find(place => place.placeId == id);
    place.value = selectPlace;

    await getStarsData(pId)
}

async function getStarsData(id) {
    const response = fetch('http://localhost:3000/star')
        .then(response => response.json());
    const data = await response;
    stars.value = data.filter(star => star.place.placeId == id);
}

</script>

<template>

    <template v-if="place && stars">
        <PlaceInfo :placeData="place" />
        <PlaceStars :starBlocks="stars" />
    </template>
</template>

<style scoped></style>