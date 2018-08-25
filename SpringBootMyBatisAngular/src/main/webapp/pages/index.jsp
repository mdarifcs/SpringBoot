<html ng-app="application">
	<head>
		
		<script src="js/lib/angular/angular.js"></script>
		<script src="js/lib/angular/angular-route.js"></script>
		<script src="js/lib/angular/angular-resource.js"></script>
		<script src="js/lib/jquery/jquery-1.10.2.js"></script>
		<script src="js/lib/jquery/jquery-ui.js"></script>
		<script src="js/app.js"></script>
		<script src="js/directives/readCSVDirective.js"></script>
		<script src="js/controllers/HeaderCntlr.js"></script>
		<script src="js/controllers/LoginCntlr.js"></script>
		<link href="css/login.css" rel="stylesheet" media="screen">
	</head>
	<body ng-controller="HeaderCntlr">
		<div ng-view></div>
	</body>
</html>