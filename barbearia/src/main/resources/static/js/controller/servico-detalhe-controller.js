app.controller("servicoDetalheController",function($scope,$http,$routeParams){
	
	$scope.servicoDetalhe = {};
	
	$http.get('/api/servicos/'+$routeParams.servicoId)
	.then(function(response){
		$scope.servicoDetalhe = response.data;
	}, function(response){
		console.log(response)
	});
	
});