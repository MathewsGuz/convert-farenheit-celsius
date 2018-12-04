/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var ConvertControllerModule = (function (){
    var getCelsius = function(){
        var number = document.getElementById("number").value;
        var callback = {
            onSuccess: function(result){
                console.log("number submitted");
                var output = document.getElementById("result");
                output.innerHTML=result["celsiusDegrees"];
            },
            onFailed: function(exception){
                console.log(exception);
                alert("There is a problem with our servers. We apologize for the inconvince, please try again later"); 
            }
        };
        RestControllerModule.getCelsius(number,callback);
    };
    
    var getFarenheit = function(){
        var number = document.getElementById("number").value;
        var callback = {
            onSuccess: function(result){
                console.log("number submitted");
                var output = document.getElementById("result");
                output.innerHTML=result["farenheitDegrees"];
            },
            onFailed: function(exception){
                console.log(exception);
                alert("There is a problem with our servers. We apologize for the inconvince, please try again later"); 
            }
        };
        RestControllerModule.getFarenheit(number,callback);
    };
    
    
    return{
        getCelsius: getCelsius,
        getFarenheit: getFarenheit
    };
})();
        
