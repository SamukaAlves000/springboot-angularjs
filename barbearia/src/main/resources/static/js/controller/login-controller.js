app.controller("loginController",function($scope,$http){
	
	$scope.usuario = {};
	$scope.token = "";
	$scope.autenticar = function(){
		$http.post('/autenticar', $scope.usuario).then(
			function(response){
				$scope.token = response.data.token;
				localStorage.setItem("UserToken",$scope.token);
			}, function(response){
				
			});

	};
	
	
	
	
});