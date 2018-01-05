Vue.component('todo-item',{
    props:['todo'],
    template: '<li>{{ todo.text }}</li>',

});
Vue.component('tdo-item',{
    props:['tdo'],
    template: '<li>{{ tdo.text }}</li>',

});
var fuComponent = {
    template :"<div><h1>只在父模板可用</h1></div>"
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
        message :'Hello Vue! 文本插值',
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
    },
    components :{
        'fucom':fuComponent
    }

});

