$(document).ready(function(){
    function ani() {
        $(".ban").not(":animated").animate({"margin-left":"-696px"},500, function(){
            $(".ban li").eq(0).appendTo(".ban");
            $(".ban").css("margin-left","0");
        });
    }
    var intv = setInterval(function(){ ani(); }, 4000);
});  