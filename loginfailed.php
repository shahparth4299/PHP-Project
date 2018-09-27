<?php
      echo '<link rel="stylesheet" type="text/css" href="sweetalert.css">';
      echo '<script src="sweetalert.min.js"></script>';
      echo '<script type="text/javascript">';
      echo 'setTimeout(function () { swal({
  title: "Alert!",
  text: "Wrong Username Or Password",
  timer: 2000,
  showConfirmButton: false
});';
      echo '}, 1000);</script>';
   
?>