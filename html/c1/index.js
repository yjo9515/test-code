$(document).ready(function(){
    function ani() {
        $(".ban_box").not(":animated").animate({"margin-left":"-640px"},500, function(){
            $(".ban_box li").eq(0).appendTo(".ban_box");
            $(".ban_box").css("margin-left","0");
        });
    }
    var intv = setInterval(function(){ ani(); }, 4000);
});  