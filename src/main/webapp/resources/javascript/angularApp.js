var myApp = angular.module('myApp', [ 'ngRoute' ]);

myApp.config(function($routeProvider) {
	$routeProvider

	// route for the home page
	.when('/', {
		templateUrl : '/',
		controller : ''
	})

	// route for the price page
	.when('/product', {
		templateUrl : 'product',
		controller : 'productController'
	})

	.when('/display', {
		templateUrl : "display",
		controller : "displayController"
	})

});

myApp.controller('productController', [ '$scope', '$http',
		function($scope, $http) {

			$scope.submitForm = function() {
				//console.log($scope.Product)
				$http.post('product', $scope.Product)

				.success(function(data) {
					$scope.Product = {};
					//console.log(JSON.stringify(data));
					alert(data.name);
					alert("inserted successfully");

				}).error(function(data) {
					alert("Error occured11");

				});
			}

		} ]);

myApp.controller("myController", function($scope) {
	$scope.message = "AngularJS tutorial";
});

myApp.controller("displayController", [ '$scope', '$http','$location',
		function($scope, $http , $location) {
			$http.get('displayInfo').success(function(data) {
				console.log(JSON.stringify(data))
				$scope.product = data;
			});

			// delete function
			$scope.deleteProduct = function(index) {

				var id = $scope.product[index].id;

				$http.get('delete/' + id).success(function(yes) {
					if (yes) {
						$scope.product.splice(index, 1);
						alert("data of " + id + "is deleted successfully")
					}

				});
			}

			
			
			// edit function
			$scope.updateProduct =function(prod){
				$location.path("product");
				
				
			}

			/*$scope.updateProduct = function(prod) {
				$scope.Product = prod;
				
				$scope.submitForm = function() {

					$http.put('product', $scope.Product)

					.success(function(data) {
						$scope.Product = {};
						alert("inserted successfully");

					}).error(function(data) {
						alert("Error occured");

					});
				}

			}*/

		} ]);
