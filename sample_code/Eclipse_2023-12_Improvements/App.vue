<script setup>
import { ref } from 'vue'
const data = ref(["First", "Second"])
</script>
<template>
	<ul v-if="data.length">
		<li>{{  }}</li>
	</ul>
	<p v-else>No data</p>
</template>