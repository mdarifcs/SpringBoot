<div class="modal-dialog" ng-if="loginFlag == false">
	<div class="loginmodal-container">
		<h1>Login to Your Account</h1>
		<br>
		<form>
			<input type="text" name="user" ng-model="user.userName" placeholder="Username"> 
			<input type="password" name="pass" ng-model="user.password" placeholder="Password"> 
			<input type="submit" name="login" class="login loginmodal-submit" value="Login" ng-click="doLogin()">
		</form>
	</div>
</div>

<div class="balance-container" ng-if="loginFlag == true">
	<h1>You have logged in Successfully</h1>
</div>

