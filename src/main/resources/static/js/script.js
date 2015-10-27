$(document).ready(function(){



});

function loadDevicesInRoom(element){
    var roomId = element.getAttribute("data-id");
    $.get("/room/"+roomId+"/devices", function(data){
        $("#room-devices").html(data);
    });
}