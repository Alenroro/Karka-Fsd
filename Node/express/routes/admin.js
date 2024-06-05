const express = require("express");
const path = require("path")
const route=express.Router()

route.get("/form", (req, res) => {
    console.log("Form ");
    // res.send(
    //   "<form action='/admin/submit' method='post'><input type='text' name='file'/><button type='submit'>submit</button></form>"
    // );
    res.sendFile(path.join(__dirname,'..','views','product.html'))
  });
  
  route.post("/submit", (req, res) => {
    console.log("store ");
    console.log(req.body);
    res.send("product stored");
  });
  
  module.exports=route