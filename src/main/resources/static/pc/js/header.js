$(function(){
    $(".nav-bar").mouseenter(function(){
        $(".nav-bar-bd").addClass('active');
        $(".nav-about").addClass('active');
    }).mouseleave(function (){
        $(".nav-bar-bd").removeClass('active');
        $(".nav-about").removeClass('active');
    });

    //显示购物车浮动窗口
    /*$('.nav-user-buy').mouseenter(function (){
        var nav_cart_list = $(".nav-cart-list");
        if(nav_cart_list.find('.more-item').length > 0){
            nav_cart_list.addClass('active-cart');
        }
    }).mouseleave(function (){
        var nav_cart_list = $(".nav-cart-list");
        if(nav_cart_list.find('.more-item').length > 0){
            nav_cart_list.removeClass('active-cart');
        }
    });*/

    findUserCart();
    userIsLogin();

})

//查询用户购物车信息
function findUserCart(){
    var user_id = $.cookie('user-id');
    var token = $.cookie('token');
    var guest_token = $.cookie('guestToken');
    var param = {
        guestToken: guest_token
    }
    $.ajax({
        type: "post",
        headers: {user_id: user_id,token: token},
        url: "/api/shopping_cart/info",
        data: JSON.stringify(param),
        contentType:"application/json;charset=utf-8",
        dataType: "json",
        success: function (data) {
            if (data.status == 0) {
                //显示购物车浮动窗口
                /*var cart_data = data.result.itemList;
                var cart_html = '';
                var cart_num = 0;
                if(cart_data.length > 0){
                    var data_value = {data: cart_data};
                    cart_html = $("#cartTemp").render(data_value);
                    cart_num = cart_data.length;
                }
                $('.nav-cart-num').text(cart_num);
                $(".nav-cart-list").html(cart_html);*/

                $('.nav-cart-num').text(data.result.countChecked);
            }
        }
    });
}


function userIsLogin(){
    var user_id = $.cookie('user-id');
    var token = $.cookie('token');
    if(user_id && token){
        $('.visitor').addClass('disable');
        $('.user-line').removeClass('disable');
    }else{
        $('.visitor').removeClass('disable');
        $('.user-line').addClass('disable');
    }
}

function userLoginOut(){
    var token = $.cookie('token');
    var user_id = $.cookie('user-id');
    $.ajax({
        type: "post",
        url: "/api/user/logout",
        headers: {user_id: 0,token: token},
        contentType:"application/json;charset=utf-8",
        dataType: "json",
        success: function (data) {
            if (data.status == 0) {
                $.removeCookie('user-id',{ path: '/'});
                $.removeCookie('token',{ path: '/'});
                window.location.reload();
            }
        }
    });
}