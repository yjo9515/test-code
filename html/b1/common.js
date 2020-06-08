$(document).ready(function(){
    var sc_top = 0;
    $(window).scroll(function(){
        sc_top = parseInt($(window).scrollTop());
        if(sc_top >= 1) {
            $(".hd").addClass("active");
        } else {
            $(".hd").removeClass("active");
        }
    });
});
$(document).ready(function(){
    var sc_top = 0;
    $(window).scroll(function(){
        sc_top = parseInt($(window).scrollTop());
        if(sc_top >= 1) {
            $(".hd").addClass("active");
        } else {
            $(".hd").removeClass("active");
        }
    });
});