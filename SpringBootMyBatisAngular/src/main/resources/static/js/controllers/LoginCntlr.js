var app = angular.module('application');

app.controller('LoginCntlr',['$scope','$location','$http','$filter','$window',
                             function($scope,$location,$http,$filter,$window){
	console.log("LoginCntlr started");
	
	$scope.user = {};
	$scope.loginFlag = false;
	
		$scope.doLogin = function(){
		console.log("userName - "+$scope.user.userName);
		console.log("userPassword - "+$scope.user.password);
		var res = $http.post('/doLogin',$scope.user);
		
		res.success(function(data, status, headers, config){
			if (data === "success") {
				console.log("success");
				$scope.loginFlag = true;
			}else {
				console.log(data);
				$scope.loginFlag = false;
				$window.alert(data);
			}
		});
		res.error(function(data, status, headers, config){
			console.log(data);
		});
	}
	
	console.log("LoginCntlr ended");
}]);