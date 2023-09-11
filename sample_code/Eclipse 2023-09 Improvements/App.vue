<script setup>
import { ref } from 'vue'

const data = ref(["First", "Second"])
</script>
<template>
   <ul v-if="data.length" >
    <li v-for="item of data">{{ item }}</li>
  </ul>
<p v-else>No data</p>
</template>