const express = require("express");
const app = express();
const adminRoute = require("./routes/admin");
const egRoute = require("./routes/exroute");
// app.use((req,res,next)=>{
//     console.log("Express works")
//     next()
// })
// app.use((req,res,next)=>{
//     console.log("First Middleware")
//     next()
// })
// app.use((req,res,next)=>{
//     console.log("Second Middleware")
//     res.send("hello")
// })

//routing

// app.use("/home", (req, res) => {
//   console.log("First ");
//   res.send("hi");

// });
// app.use("/feed", (req, res) => {
//   console.log("Second ");
//   res.send("hello");
// });
// in use below is not usable
// app.use("/", (req, res) => {
//   console.log("it works");
// });

// form in routin

const bodyparser = require("body-parser");
app.use(bodyparser.urlencoded());

// app.use("/form", (req, res) => {
//   console.log("Form ");
//   res.send(
//     "<form action='/store' method='post'><input type='text' name='file'/><button type='submit'>submit</button></form>"
//   );
// });

// app.post("/store", (req, res) => {
//   console.log("store ");
//   console.log(req.body);
//   res.send("product stored");
// });
app.use("/admin",adminRoute);
app.use("/example",egRoute);


app.use((req,res)=>{
    res.status(404). send("<h1>404 Error , Page Not found</h1>")
})

app.listen(8000);
