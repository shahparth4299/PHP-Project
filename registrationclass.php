<?php
  class Registration{
    public function getUsername(){
      $username = $_GET['user'];
      return $username;
    }
    public function getPassword(){
      $password = $_GET['pass'];
      return $password;
    }
    public function getEmail(){
      $email = $_GET['email'];
      return $email;
    }
    public function insertData($conn,$user,$pass,$email){
      echo $user;
      $sql = "INSERT INTO userinfo(user,email,password) VALUES ('$user','$email','$pass')";
      $retval = $conn->query($sql) or die($conn->error);
      if($retval == true)
      {
        echo "<script>alert('Registration Success')</script>";
        session_start();
        $_SESSION['uname'] = $user;
        
        //header("location:index.php");
      }
      else { 
          echo "<script>alert('Registration Failed')</script>";
          //echo("location:registrationform.php");
      }
    }
  }
?>
