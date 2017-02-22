var app=angular.module('myApp',[]);
app.controller('personCtrl',function($scope){
$scope.firstName="John";
$scope.lastName="Smith";
$scope.fullName=function(){
return $scope.firstName+" "+$scope.lastName;
};
}); 