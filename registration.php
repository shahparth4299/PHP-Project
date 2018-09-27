<?php
	include("connection.php");
	include("registrationclass.php");
	$c = new Connection;
	$conn = $c->connect();
	$r = new Registration;
	$uname = mysqli_real_escape_string($conn,$_POST['uname']);
	$email = mysqli_real_escape_string($conn,$_POST['email']);
	$pass = mysqli_real_escape_string($conn,$_POST['pass']);
	$r->insertData($conn,$uname,$pass,$email);
?>