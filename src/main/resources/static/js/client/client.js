/**
 * CLIENT
 */

let apiRequestAPI = '/client';

$(document).ready(function() {
    console.log(1);
    clientDashBoard();

});
function clientDashBoard(){

    $.ajax({

        url : `${apiRequestAPI}`,
        type : 'GET',
        success : function(data){
            console.log(data);
            console.log(2);
        },
        error(xhr, status, error){

            getErrorMsg(xhr.status);

        }
    })

}
