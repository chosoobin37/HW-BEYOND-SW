<template>
    <head>
        <Header>
            <nav>
        <RouterLink to="/" active-class="active" replace>메인</RouterLink>
        <RouterLink to="/post" active-class="active" replace>게시글</RouterLink>
        <RouterLink to="/place" active-class="active" replace>장소</RouterLink>
        <Header></Header>
      </nav> 
        </Header>
    </head>
    <div>
        <Main></Main>
    </div>
</template>

<script setup>
    import Main from '@/components/Main.vue'
    import Header from '@/components/Header.vue';
</script>

<style scoped>

</style>