<style>
body{
	word-wrap: break-word
}
</style>
<body bgcolor="#eceff1">
<br><br>
<?php
    include("icon.html");
    include("removeerror.php");
	include("add.html");
	include("navbar.php");
	include("connection.php");
	$c = new Connection;
	$conn = $c->connect();
	$fname = $_GET['fname'];
        	$sql = "SELECT * FROM sourcecode WHERE p_file='$fname'";
			$retval = $conn->query($sql) or die("Code is Not Available");
			while($row = $retval->fetch_assoc())
			{?>
					<div class='row'>
						<div class="card">
						<div class="col s12 m10 offset-m1">
							<h4><?php echo $row['p_heading']; ?></h4>
						</div>
					</div>
						<div class="col s12 m10 offset-m1">
							<div class="card">	
								<h5><?php echo "&nbsp;&nbsp;"; ?>Problem Statement : </h5><h6><?php echo "&nbsp;&nbsp;&nbsp;&nbsp;".$row['p_problemstatement']; ?></h6>
							</div>
						</div>
					</div>
					
<?php } ?>
<div class="row">
	<div class="col s12 m10 offset-m1">
		<div class="card">
<?php
    $file = fopen($fname,"r") or die("Source Code is not Available");
    echo "&nbsp;&nbsp;&nbsp;&nbsp;";
    while(!feof($file))
    {
        echo fgets($file) . "<br />&nbsp;&nbsp;&nbsp;&nbsp;";
    }
    fclose($file);
    //$myfile = fopen($fname, "r") or die("Source Code is not Available");
    //echo fread($myfile,filesize($fname));
    //fclose($myfile);
	//show_source($fname) or die("<b>Sorry Code is not available</b>");
?>	
		</div>
	</div>
</div>
<br><br>
</body>
<?php
	include("footer2.php");
?>