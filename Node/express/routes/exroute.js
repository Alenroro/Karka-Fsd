const express = require("express");
const egroute = express.Router();

egroute.get("/form",(req, res) => {
    console.log("esfdgnm");
  res.send(
    "<form action='/example/store' method='post'><input type='text' name='file'/><input type='text' name='product'/><button type='submit'x>submit</button></form>"
  );
});

egroute.post("/store",(req,res)=>{
    console.log(req.body);
    res.send("product stored");
})

module.exports=egroute
