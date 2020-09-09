app.factory("tokenInterceptor",function($q){
	
	return {
		
		'request':function(config){
			
			
			config.headers.Authorization = "Bearer " + localStorage.getItem("UserToken")
			
			return config;
		}
		
	};
});
