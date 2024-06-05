$(document).ready(function () {
  $("#add").click(function () {
    let a = $("#text").val();
    $("#op").append("<li>" + a + "</li>");
    $("#text").val("");

    $("#op li").dblclick(function () {
      $(this).remove();
    });
  });
});
