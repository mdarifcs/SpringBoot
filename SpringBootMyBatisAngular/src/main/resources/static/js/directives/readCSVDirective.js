var app = angular.module('application');

app.directive('fileChange',
		[ '$parse', function($parse) {
			return {
				require : 'ngModel',
				restrict : 'A',
				link : function($scope, element, attrs, ngModel) {
					var attrHandler = $parse(attrs['fileChange']);
					var handler = function(e) {
						$scope.$apply(function() {
							attrHandler($scope, {
								$event : e,
								files : e.target.files
							});
						});
					};
					element[0].addEventListener('change', handler, false);
				}
			};
		} ]);