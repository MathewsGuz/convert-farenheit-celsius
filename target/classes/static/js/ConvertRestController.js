/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var RestControllerModule = (function (){
    
    var getCelsius = function (value,callback){
        axios.get('/convert/toCelsius/'+value)
            .then(function(response){
                callback.onSuccess(response.data);
            })
            .catch(function(error){
                callback.onFailed(error.data);
                console.log(error.data)
            });
    };
    
    var getFarenheit = function (value,callback){
        axios.get('/convert/toFarenheit/'+value)
            .then(function(response){
                callback.onSuccess(response.data);
            })
            .catch(function(error){
                callback.onFailed(error.data);
                console.log(error.data)
            });
    };
    
    return {
        getCelsius: getCelsius,
        getFarenheit:getFarenheit
    };
})();


