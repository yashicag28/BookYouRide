<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="css/style.css"/>

<html>

<head>
  <title></title>
</head>
<body>


<body class="align">

<div class="site__container">

  <div class="grid__container">

    <form action="BookingForm" method="POST" class="form form--login">

      <div class="form__field">
        <label for="login__username">Username:</label>
        <input id="login__username" type="text" class="form__input" name="userName" placeholder="userName" value =${userName}>
      </div>
      <div class="form__field">
        <label for="userContact">Contact:&nbsp;&nbsp;<br></label>
        <input id="userContact" type="text" class="form__input" name="userContact" placeholder="userContact" value=${userContact}>
      </div>
      <div class="form__field">
        <label   for="pickUp">Pick Up: &nbsp;&nbsp;</label>
        <input id="pickUp" type="text" class="form__input" name="pickUp" placeholder="from" required>
      </div>

      <div class="form__field">
        <label>Drop: &nbsp;&nbsp; &nbsp;&nbsp; <br></label>
        <input id="drop" type="text" class="form__input" name="drop" placeholder="To" required>
      </div>
      <div>
        <br class="form__field">
        <label>Cab Type:&nbsp;   </label>&nbsp;&nbsp;&nbsp;
        <input  class="form__input" type=radio name="cabType" value="Micro" checked > &nbsp;&nbsp;Micro&nbsp;&nbsp;&nbsp;

        <input  class="form__input" type=radio name="cabType" value="Mini" > Mini
      </div>
      <br>
      <div class="form__field">
        <input type="submit"  value="Book">
      </div>

    </form>


  </div>

</div>

</body>
</html>
