var sys = require("sys"),
my_http = require("http"),
path = require("path"),
url = require("url"),
filesys = require("fs");
my_http.createServer(function(request,response){
    console.log(request.url);
    if (request.method === 'POST') {
        console.log("POST");
        var body = '';
        request.on('begin', function (data) {
            body += data;
            console.log("Body: " + body);
        });
        request.on('data', function (data) {
            body += data;
            console.log("Partial body: " + body);
        });
        request.on('end', function (data) {
            console.log("Body: " + body);
        });
        response.writeHead(200, {'Content-Type': 'text/html'});
        console.log("RESULT: " + body);
        response.end('Changed backend to ' + request.url + '.');
    }
    else
    {
        console.log("GET");
        var my_path = url.parse(request.url).pathname;
        var full_path = path.join(process.cwd(),my_path);
        filesys.exists(full_path,function(exists){
            if(!exists){
                response.writeHeader(404, {"Content-Type": "text/plain"});  
                response.write("404 Not Found\n");  
                response.end();
            }
            else{
                filesys.readFile(full_path, "binary", function(err, file) {  
                     if(err) {  
                         response.writeHeader(500, {"Content-Type": "text/plain"});  
                         response.write(err + "\n");  
                         response.end();  
                    
                     }  
                     else{
                        response.writeHeader(200);  
                        response.write(file, "binary");  
                        response.end();
                    }
                          
                });
            }
        });
    }      
}).listen(8080);
sys.puts("Server Running on 8080");   