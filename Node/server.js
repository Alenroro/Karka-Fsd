const http = require("http");

// function listener(req,res) {
// console.log(req)
//     console.log(req.url)
//     console.log(req.method)
//     console.log(req.headers)
//     process.exit()
// }
// const server = http.createServer(listener)
// server.listen(8000)

const server = http.createServer((req, res) => {
  const url = req.url;
  console.log(url);
  if (url == "/") {
    res.setHeader("Content-type", "text/html");
    res.write("<html>");
    res.write("<head><title>Alen</title></head>");
    res.write("<body><h1>hi</h1></body>");
    res.write("</html>");
    return res.end();
  } else if (url == "/home") {
    res.setHeader("Content-type", "text/html");
    res.write("<html>");
    res.write("<head><title>Home</title></head>");
    res.write("<body><h1>This is home</h1></body>");
    res.write("</html>");
    return res.end();
  } else if (url == "/form") {
    res.setHeader("Content-type", "text/html");
    res.write("<html>");
    res.write("<head><title>Form</title></head>");
    res.write(
      "<body><h1>Form</h1><form method='post' action='/submit'><input type='text'value='' name='user'/><button type='submit' value='submit'>Submit</button></form></body>"
    );
    res.write("</html>");
    return res.end();
  }
  res.setHeader("Content-type", "text/html");
  res.write("<html>");
  res.write("<head><title>Alen</title></head>");
  res.write("<body><h1>hi</h1></body>");
  res.write("</html>");
  return res.end();
});

server.listen(8000);
