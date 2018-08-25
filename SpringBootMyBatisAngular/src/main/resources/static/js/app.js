'use strict';

var application = angular.module('application',['ngRoute','ngResource']);

application.config(function ($routeProvider,$locationProvider) {
	console.log("----app.js Started----");
  
	$routeProvider.when('/',{
    	templateUrl: 'login',
        controller: 'LoginCntlr'
    });
	
    console.log("----app.js ENDED----");
    
});

