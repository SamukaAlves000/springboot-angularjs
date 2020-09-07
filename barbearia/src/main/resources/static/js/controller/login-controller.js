app.controller("loginController",function($scope){
	
	$scope.usuario = {};
	
	$scope.autenticar = function(){
		
	console.log("Usuário:"+$scope.usuario.user +"| Senha:"+$scope.usuario.pass);
	};
	
	
	
	
});