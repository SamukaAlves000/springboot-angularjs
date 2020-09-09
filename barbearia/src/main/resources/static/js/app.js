var app = angular.module("app",['ngRoute']);

app.config(function($routeProvider,$locationProvider) {
	$routeProvider
		.when('/servico', {
			templateUrl : "view/servico.html",
    		controller : "servicoController"
		})
		.when('/servico/:servicoId', {
			templateUrl : "view/servico-detalhe.html",
    		controller : "servicoDetalheController"
		})
		.when('/atendimento', {
			templateUrl : "view/atendimento.html",
    		controller : "atendimentoController"
		})
		.when('/login', {
			templateUrl : "view/login.html",
    		controller : "loginController"
		})
		.otherwise({
			redirectTo: '/'
		});
		
		$locationProvider.html5Mode(true);
});

app.config(function($httpProvider){
	
	$httpProvider.interceptors.push('tokenInterceptor');
	
});


