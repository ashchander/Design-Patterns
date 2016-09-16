(function(angular) {
    'use strict';

    function AppController(){
        this.posts = [];
        this.entry = {
            title: '',
            body: ''
        };
    }

    AppController.prototype.post = function() {
        this.posts.push(this.entry);
        this.entry = {
            title: '',
            body: ''
        };
    }

    angular.module('app', []).controller('AppController', AppController);

})(window.angular);
