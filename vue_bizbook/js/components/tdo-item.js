Vue.component('tdo-item',{
    props:['tdo'],
    template: '<li>{{ tdo.text }}</li>',

});