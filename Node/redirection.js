const http = require("http");
const server = http.createServer((req, res) => {
  const url = req.url;
  if (url == "/") {
    res.setHeader("Content-type", "text/html");
    res.write("<html>");
    res.write("<head><title>Alen</title></head>");
    res.write("<body><h1>hi</h1></body>");
    res.write("</html>");
    return res.end();
  } 
  else if (url == "/form") {
    res.setHeader("Content-type", "text/html");
    res.write("<html>");
    res.write("<head><title>Form</title></head>");
    res.write(
      "<body><h1>Form</h1><form enctype='multipart/form-data' method='post' action='/submit'><input type='text'value='' name='user'/><br/><input type='file'name='file'/><br/><button type='submit' value='submit'>Submit</button></form></body>"
    );
    res.write("</html>");
    return res.end();
  } 
  else if (url == "/submit") {
    req.on("data",(chunk)=>{
        console.log(chunk)
    })
    res.setHeader("Location", "/");
    res.statusCode = 302;
    return res.end();
  }
});
server.listen(8000);

