<?php
  class Login{
    public function getName()
    {
        $name = $_GET['name'];
        return $name;
    }
    public function getPassword()
    {
      $password = $_GET['pass'];
      return $password;
    }
    public function validate($conn,$name,$pass)
    {
      $sql = "SELECT * FROM userinfo";
      $retval = $conn->query($sql);
      while($row = $retval->fetch_assoc())
      {
      	if($name==$row['user'] && $pass == $row['password'])
      	{
          	echo "Valid ".$name;
            session_start();
            $_SESSION['uname'] = $name;
            header("location:index.php");
          	break;
        }
        else
        {
            Login::loginfailed();
            echo("<script>window.location.href='loginform.php';</script>");
          	break;
        }
      }
    }
    public function loginfailed()
    {
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
    }
  }
?>
