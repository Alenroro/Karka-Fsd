$(document).ready(function () {
  let s = 0;

  $("#add").click(function () {
    let a = $("#text").val();
    s++;
    $("#op").append(
      "<tr id='trow'>" +
        "<td>" +
        s +
        "</td>" +
        "<td>" +
        a +
        "</td>" +
        "<td>" +
        '<button click="edit()" id="edi">Edit</button>' +
        "</td>" +
        "<td>" +
        '<button click="del()" id="dele">Delete</button>' +
        "</td>" +
        "</tr>"
    );
    $("#text").val("");

    // $("#dele").click(function () {
    //   $("#trow").remove();
    // });
  });
});
