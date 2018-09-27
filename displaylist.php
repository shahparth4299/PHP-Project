<br><br><br><vr>
<?php
    include("connection.php");
    include("navbar.php");
    include("main.php");
    $language = $_GET['language'];
    $c = new Connection;
    $conn = $c->connect();
    $m = new Main;
    $m->getProblem($conn,$language);
    echo "<br><br>";
    include("footer.php");
?>