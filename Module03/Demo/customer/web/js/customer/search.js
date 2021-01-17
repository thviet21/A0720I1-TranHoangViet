$(document).ready(function() {
    $('#search').click(function(event) {
        let customerCountryName = $('#customerCountryName').val();
        $.post('search', {
            country : customerCountryName
        }, function(responseText) {
            if (responseText === "Not found"){
                $('#result').html("Not found");
            }else {
                $('#result').html(responseText);
            }
        });
    });
});