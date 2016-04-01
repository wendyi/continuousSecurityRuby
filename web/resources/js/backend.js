function selectBackend(selection) {
    $.post(selection, '', function(data, status) {
    	alert("Data: " + data + "\nStatus: " + status);
    });
}
