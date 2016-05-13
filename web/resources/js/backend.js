function Backend() {
  this.select = function(selection) {
    this.post(selection);
  };

  this.post = function(selection) {
    $.post(selection, '', function(data, status) {
      alert("Data: " + data + "\nStatus: " + status);
    });	
  };
};

// module.exports = Backend;
