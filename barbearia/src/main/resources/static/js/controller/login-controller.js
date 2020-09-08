app.controller("loginController",function($scope,$http){
	
	$scope.usuario = {};
	
	$scope.autenticar = function(){
		$http.post('/autenticar', $scope.usuario).then(
			function(response){
				
			}, function(response){
				
			});

	};
	
	
	
	
});