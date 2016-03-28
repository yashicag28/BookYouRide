
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>Book Your Ride</title>

  <link rel="stylesheet" href="css/style.css">

</head>

<body>

<body class="align">
<p  align="center" class="form__input"><h1>Book Your Ride</h1></p>
<div class="site__container">

  <div class="grid__container">
    <form action="LoginForm" method="POST" class="form form--login">

      <div class="form__field">
        <label class="fontawesome-user" for="login__username"><span class="hidden">Username</span></label>
        <input id="login__username" type="text" class="form__input" name="uname" placeholder="Username" required>
      </div>

      <div class="form__field">
        <label class="fontawesome-lock" for="login__password"><span class="hidden">Password</span></label>
        <input id="login__password" type="password" class="form__input" name="pwd" placeholder="Password" required>
      </div>

      <div class="form__field">
        <input type="submit"  value="Sign In">
      </div>


    <p class="text--center">Not a member? <a href="#">Sign up now</a> <span class="font-arrow-right"></span></p>

    <h3><p class="text--center" >${error}<span class="font-arrow-right"></span></p></h3>
    </form>
  </div>

</div>

</body>
<script>


</script>





</body>
</html>
