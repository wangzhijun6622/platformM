Vue.component('button-counter',{
	data:function(){
		return {
			count: 0
		}
	},
	template:'<button v-on:click="count++">You click me {{count}} times.</button>'
})