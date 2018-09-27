<?php
	include("connection.php");
	include("loginclass.php");
	$c = new Connection;
	$conn = $c->connect();
	$l = new Login;
	$uname = mysqli_real_escape_string($conn,$_POST['uname']);
	$pass = mysqli_real_escape_string($conn,$_POST['pass']);
	$l->validate($conn,$uname,$pass);
?>