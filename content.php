<!DOCTYPE html>
<html>
  <style>
        .button {
          border-radius: 4px;
          background-color: #34495e;
          border: none;
          color: #FFFFFF;
          text-align: center;
          font-size: 18px;
          padding: 20px;
          width: 200px;
          transition: all 0.5s;
          cursor: pointer;
          margin: 5px;
        }

        .button span {
          cursor: pointer;
          display: inline-block;
          position: relative;
          transition: 0.5s;
        }

        .button span:after {
          content: '\00bb';
          position: absolute;
          opacity: 0;
          top: 0;
          right: -20px;
          transition: 0.5s;
        }

        .button:hover span {
          padding-right: 25px;
        }

        .button:hover span:after {
          opacity: 1;
          right: 0;
        }
        html{
           font-family: GillSans, Calibri, Trebuchet, sans-serif;  
        }
        blockquote{
        margin: 20px 0;
        padding-left: 1.5rem;
        border-left: 5px solid #34495e; /* Just change the color value and that's it*/
}
    </style>
  <body bgcolor="#eeeeee">
    <?php
        
        include("connection.php");
        $c = new Connection;
        $conn = $c->connect();
        $sql = "SELECT * FROM program_list";
        $retval = $conn->query($sql);
        $total = mysqli_num_rows($retval);
        while($row = $retval->fetch_assoc())
        {
    ?>
    <div class="row container">
    <div class="col s12 m5 center">
      <div class="card">        
        <img src="<?php echo $row['image'] ?>" width="100%" height="300">
    </div>
  </div>
    <div class="col s12 m7 center">
        <div class="card-panel">
        <h3><?php echo $row['language'] ?></h3><br>
        <div class="hide-on-med-and-down">
            <blockquote><?php echo $row['description'] ?></blockquote>
            <br>
        </div>
        <center>
        <a href="displaylist.php?language=<?php echo $row['name']; ?>" class="button" name="<?php echo $row['language']; ?>"><span>View Examples</span></a>
        </center>
        <br>
      </div>
    </div>
</div>
<br><br>
<?php } ?>
  </body>
</html>