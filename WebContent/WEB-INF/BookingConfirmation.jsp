
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

    <form class="form form--login">

      <div class="form__field">
          <label class="label"  >Username:</label>
        <label class="label" >${userName}</label>
      </div>
      <div class="form__field">
        <label class="label"  >User Contact Number:</label>
        <label class="label" >${contactNumber}</label>
      </div>

      <div class="form__field">
        <label class="label"  >Pick Up:</label>
        <label class="label" >${pickUp}</label>
      </div>

      <div class="form__field">
        <label class="label"  >Drop:</label>
        <label class="label" >${drop}</label>
      </div>

      <div class="form__field">
        <label class="label"  >Cab Type :</label>
        <label class="label" >${cabType}</label>
      </div>

      <div class="form__field">
        <label class="label"  >Driver Name:</label>
        <label class="label" >${driverName}</label>
      </div>


      <div class="form__field">
        <label class="label"  >Driver Contact:</label>
        <label class="label" >${driverContactNumber}</label>
      </div>


      <div class="form__field">
        <label class="label"  >Vehicle Reg Number:</label>
        <label class="label" >${vehicleRegNumber}</label>
      </div>

      <div class="form__field">
        <label class="label"  >Estimated Fare:</label>
        <label class="label" >${fare}</label>
      </div>

      <div class="form__field">
        <input type="submit"  value="Close"><br/>
        <input type="submit"  value="Print">

      </div>

    </form>


  </div>

</div>

</body>
</html>
