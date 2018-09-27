<!DOCTYPE html>
<html>
<title>programtolive</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style>
.menu {display: none}
.bgimg-1 {
    background-position: center;
    background-size: cover;
    background-image: url("/w3images/mac.jpg");
    min-height: 100%;
}
.w3-bar .w3-button {
    padding: 16px;
}
</style>
<body>

<div class="w3-top">
  <div class="w3-bar w3-white w3-card" id="myNavbar">
    <a href="#home" class="w3-bar-item w3-button w3-wide">PROGRAMTOLIVE</a>
    <div class="w3-right w3-hide-small">
      <a href="displaylist.php?language=C" class="w3-bar-item w3-button">C</a>
      <a href="displaylist.php?language=CPP" class="w3-bar-item w3-button">CPP</a>
      <a href="displaylist.php?language=JAVA" class="w3-bar-item w3-button">JAVA</a>
      <a href="displaylist.php?language=PYTHON" class="w3-bar-item w3-button">PYTHON</a>
      <a href="displaylist.php?language=CG" class="w3-bar-item w3-button">CG</a>
    </div>

    <a href="javascript:void(0)" class="w3-bar-item w3-button w3-right w3-hide-large w3-hide-medium" onclick="w3_open()">
      <i class="fa fa-bars"></i>
    </a>
  </div>
</div>
<nav class="w3-sidebar w3-bar-block w3-black w3-card w3-animate-left w3-hide-medium w3-hide-large" style="display:none" id="mySidebar">
  <a href="javascript:void(0)" onclick="w3_close()" class="w3-bar-item w3-button w3-large w3-padding-16">Close ×</a>
  <a href="displaylist.php?language=C" onclick="w3_close()" class="w3-bar-item w3-button">C</a>
  <a href="displaylist.php?language=CPP" onclick="w3_close()" class="w3-bar-item w3-button">CPP</a>
  <a href="displaylist.php?language=JAVA" onclick="w3_close()" class="w3-bar-item w3-button">JAVA</a>
  <a href="displaylist.php?language=PYTHON" onclick="w3_close()" class="w3-bar-item w3-button">PYTHON</a>
  <a href="displaylist.php?language=PHP" onclick="w3_close()" class="w3-bar-item w3-button">PHP</a>
</nav>
<script>

function onClick(element) {
  document.getElementById("img01").src = element.src;
  document.getElementById("modal01").style.display = "block";
  var captionText = document.getElementById("caption");
  captionText.innerHTML = element.alt;
}
var mySidebar = document.getElementById("mySidebar");
function w3_open() {
    if (mySidebar.style.display === 'block') {
        mySidebar.style.display = 'none';
    } else {
        mySidebar.style.display = 'block';
    }
}
function w3_close() {
    mySidebar.style.display = "none";
}
</script>

</body>
</html>
