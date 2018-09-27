<?php
  class Connection{
    public function connect(){
        $dbhost = 'localhost';
        $user = 'id4160788_localhost';
        $password = 'parth4299';
        $dbname = 'id4160788_programtolive';
        $conn = mysqli_connect($dbhost,$user,$password,$dbname) or die("Not able to establish connection");
        return $conn;
    }
  }
?>
