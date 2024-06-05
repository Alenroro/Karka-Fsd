function change() {
  let ip = document.getElementById("text").value;
  if (ip === "") {
    alert("type something");
  } else {
    let list = document.createElement("li");
    list.innerHTML =
      ip +
      ' <button onclick="edi()"><i class="fa fa-close"></i></button> <button onclick="del()"><i class="fas fa-edit"></i></button>';
    document.getElementById("op").appendChild(list);
  }

  document.getElementById("text").value = "";
}

function edi() {
  document.getElementById("text").contentEditable;
}

function del() {
  document.getElementsByName("li").removeChild(ip);
}
