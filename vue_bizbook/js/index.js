//import button-counter from './components/button-counter'
//import tdo-item from './components/tdo-item'
//import todo-item from './components/todo-item'
//export default{
//	components:{
//		button-counter,
//		todo-item,
//		tdo-item
//	}
//}




Vue.component('button-counter',{
	data:function(){
		return {
			count: 0
		}
	},
	template:'<button v-on:click="count++">You click me {{count}} times.</button>'
})
Vue.component('tdo-item',{
    props:['tdo'],
    template: '<li>{{ tdo.text }}</li>',

});
Vue.component('todo-item',{
    props:['todo'],
    template: '<li>{{ todo.text }}</li>',

});

var fuComponent = {
    template :"<div><h1>只在父模板可用</h1></div>"
};
var data = {
    a:1,
};
var app = new Vue({
    el : "#app",
    data:{
        nav :[
            { text:"首页"},
            { text:"朋友圈"},
            { text:"好友列表"},
            { text:"shareView"},
            { text:"个人中心"},
        ],
        message :data,
        minHeight :150,
	    styleObject: {
			color: 'red',
			fontSize: '13px'
		},
        message1 :'你好 王志君 !' ,
        loadTime : '页面加载于:'+new Date().toLocaleString(),
        seen : false,
        modelData:'双向数据绑定',
        groceryList:[
            {id:0,text:'蔬菜'},
            {id:1,text:'水果'},
            {id:2,text:'奶酪'},
        ]

    },
    methods :{
        reverseMes : function(){
            this.message1 = this.message1.split("").reverse().join("")
        },
        //mediaMinH : function(){
          //  this.minHeight = document.documentElement.clientHeight;
        //},
    },
    components :{
        'fucom':fuComponent
    }

});
var vm = new Vue({
    el:"#vmApp",
    data:{
        message:data,
        a:1,
        isActive :true,
        hasError :false,
    },
    //声明周期钩子
    created:() => console.log("a is: "+ this.a)
        
});

var watchExample = new Vue({
    el:'#watch-example',
    data:{
        quesiton :'',
        answer : 'I can\'t give you answer until you ask a question',
    },
    watch:{
        //如果question 发生改变 会出发这个function
        question :function(newQuestion){
            this.answer = 'Wating for you to stop typing....'
            this.getAnswer()
        }
    },
    method:{
        getAnswer : _.debounce(
            function (){
                if(this.quesiton.indexOf("?")===-1){
                    this.answer ='Question usually contain a question mark. :-)'
                    return ;
                }
                this.answer = 'Thiking...'
                var vm = this
                axios.get('http://yesno.wtf/api')
                    .then(function (response){
                        vm.answer = _.capitalize(response.data.answer)
                    })
                    .catch(function (error) {
                        vm.answer = 'Error ! could not reach the Api .'+error
                    })
            },500
        ),
    }
})