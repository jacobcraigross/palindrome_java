var express = require("express");
var app = express();

app.get("/", function(req, res){
   res.render("home.ejs");
});

app.get("/warishell/:death", function(req, res){
    var death = req.params.death;
    res.render("war.ejs", {deathVar: death});
})

app.listen(process.env.PORT, process.env.IP, function(){
   console.log("SEVERED"); 
});