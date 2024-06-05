$(document).ready(function () {
  $("#signup").click(function () {
    $("#loginpage").css("display", "none");
    $("#registerpage").css("display", "block");
  });

  $("#frgtpwd").click(function () {
    $("#loginpage").css("display", "none");
    $("#forgotpwdpage").css("display", "block");
  });

  $("#bcksignup").click(function () {
    $("#forgotpwdpage").css("display", "none");
    $("#registerpage").css("display", "block");
  });

  $("#bcklogin").click(function () {
    $("#forgotpwdpage").css("display", "none");
    $("#loginpage").css("display", "block");
  });

  $("#reg").click(function (event) {
    event.preventDefault();

    var regtext = $("#regtext").val();
    var regfname = $("#regfname").val();
    var reguname = $("#reguname").val();
    var regpassword = $("#regpassword").val();
    if (
      regtext !== "" &&
      regfname !== "" &&
      reguname !== "" &&
      regpassword !== ""
    ) {
      var obj = {
        text: regtext,
        fullname: regfname,
        username: reguname,
        password: regpassword,
      };
      array = [];
      array.push(obj);
      console.log(array);

      $("#regtext").val("");
      $("#regfname").val("");
      $("#reguname").val("");
      $("#regpassword").val("");

      $("#loginpage").css("display", "block");
      $("#registerpage").css("display", "none");
    }
  });

  $("#login").on("click", function (event) {
    event.preventDefault();

    var loginUsername = $("#username").val();
    var loginPassword = $("#pwd").val();

    var loggedInUser = array.find(function (user) {
      return (
        (loginUsername === user.text ||
          loginUsername === user.fullname ||
          loginUsername === user.username) &&
        user.password === loginPassword
      );
    });

    if (loggedInUser) {
      $("#loginpage").css("display", "none");
      $("#feedpage").css("display", "block");
    } else {
      alert("Login failed. Invalid username or password.");
    }
  });
});
