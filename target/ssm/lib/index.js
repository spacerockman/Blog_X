/* 选中动画 */
$(document).ready(function(){
    $(".topbar").mouseenter(function(){
        $(this).css("background-color","lightgray");
    });
    $(".topbar").mouseleave(function(){
        $(this).css("background-color","");
    });
});
