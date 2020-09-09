app.controller("servicoController", function ($scope,$http) {
 	$scope.servicos = [];
	$scope.servico = {};
	
	$scope.carregarServicos = function(){
		
		///token = localStorage.getItem("UserToken");
		//$http.defaults.headers.common.Authorization = "Bearer "+ token;
			// Simple GET request example:
			$http({
					  method: 'GET',
					  url: '/api/servicos'}).
			then(function successCallback(response) {
				$scope.servicos = response.data
				console.log(response.data);
				console.log(response.status);
				
		  }, function errorCallback(response) {
			console.log(response.status);
		  });
	};
	
	$scope.deletarServico = function(id){
			
			// Simple POST request example:
			$http({
					  method: 'DELETE',
					  url: '/api/servicos/'+id
			}).
			then(function successCallback(response) {
				
				for(i = 0; i < $scope.servicos.length; i++){
					if($scope.servicos[i].id == id){
						$scope.servicos.splice(i,1);
						break;
					}
				}
				
		  }, function errorCallback(response) {
			console.log(response.status);
		  });
			
			
	};
	
	$scope.salvarServico = function(){
			// Simple POST request example:
			$http({
					  method: 'POST',
					  url: '/api/servicos',
					  data:$scope.servico
			}).
			then(function successCallback(response) {
				
				//$scope.servicos.push(response.data);
				$scope.carregarServicos();
				$scope.servico = {};
				$scope.formServico.txtId.$setPristine(true);
				
				console.log(response.data);
				console.log(response.status);
				
		  }, function errorCallback(response) {
			console.log(response.status);
		  });
	};
	
	
		$scope.preecherServico = function(servico){
			$scope.servico = angular.copy(servico);
	};
	
		$scope.cancelar = function(){
			$scope.servico = {};
	};
	
	$scope.carregarServicos();
	
});