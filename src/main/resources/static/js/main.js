$(document).ready(function () {
    $("#search-form").submit(function (event) {
        event.preventDefault();
        find_txn();
    });
});

function find_txn() {
    var txn = $("#txn").val();
    $.ajax({
        type: "GET",
        url: "/getOne/" + txn,
        success: function (data) {
            console.log("success:", data)
        },
        error: function (data) {
            console.log("error:", data)
        },
    });
}