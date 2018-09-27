<style>
	.hov:hover{
		background-color: #eeeeee;
	}
</style>
<?php
	include("add.html");
	class Main
	{
		public function getProblem($conn,$lang)
		{	
			?>
			<html>	
				<body bgcolor="#eeeeee">
					<div class="container">
					<ul class="collection with-header">
        			<li class="collection-header">
        			<h4>List Of <?php echo $lang ?> Programs</h4>
        			</li>
        	<?php
        	$sql = "SELECT * FROM sourcecode WHERE p_language='$lang'";
			$retval = $conn->query($sql);
			while($row = $retval->fetch_assoc())
			{?>
				<li class="collection-item">
					<a href="code.php?fname=<?php echo $row['p_file'] ?>" style="color:#000000;">
					<div class="hov"><?php echo $row['p_problemstatement']; ?>
					</a></div></li>	
			<?php 
			}
			?></a></li></ul></div>
			<?php
		}
	}
?>
</body>
</html>