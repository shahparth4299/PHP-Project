<?php
  include("addnav.html");
  include("add.html");
  include("navbar.php");
?>
<!DOCTYPE html>
<html>
  <style>
    #but{
      background-color: #34495e;
    }
  </style>
  <body>
    <div class="row">
      <div class="col s12 m4 offset-m4">
        <div class="card">
          <div class="card-action lighten-1 white-text" id="but">
            <h3>Login Form</h3>
          </div>
          <div class="card-content">
            <form name="f1" method="POST" action="login.php">
            <div class="form-field">
              <label for="username">Username</label>
              <input type="text" name="uname">
            </div><br>
            <div class="form-field">
              <label for="password">Password</label>
              <input type="password" name="pass">
            </div><br>
            <div class="form-field">
              <button class="btn-large waves-effect waves-dark" id="but" style="width:100%;">Login</button>
            </div><br>
          </form>
        </div>
      </div>
    </div>
  </body>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>
      $(document).ready(function()
      {
        $("div").hide();
        $("h3").hide();
        $("button").hide();
        $("div").fadeIn(2000);
        $("h3").fadeIn(3000);
        $("button").fadeIn(3000);
      });
    </script>
</html>
<?php
  include("footer2.php");
?>
