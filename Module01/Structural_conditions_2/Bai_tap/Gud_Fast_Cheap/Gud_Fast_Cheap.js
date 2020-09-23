let uncheck = function (el){
    console.log(el);
    $(el).prop('checked', false);
    $(el).parent().removeClass('active');
};

let checkOptions = function(optionTry){
    let good = $('#good')[0].checked;
    let cheap = $('#cheap')[0].checked;
    let fast = $('#fast')[0].checked;
    let option = optionTry;

    if (good && option == 'cheap') {
        uncheck('#fast');

    } else if (cheap && option == 'fast') {
        uncheck('#good');

    } else if (fast && option == "good") {
        uncheck('#cheap');
    }
    //console.log(optionTry);
    //console.log(good, cheap, fast);
}

$(function(){
    $(':radio').on('change', function(){
        let id = $(this)[0].id;
        $(this).parent().addClass('active');
        checkOptions(id);
    });
});