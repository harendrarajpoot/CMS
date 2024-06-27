<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <link href="https://fonts.googleapis.com/css?family=Raleway:500,800" rel="stylesheet">
  <title>Access Denied</title>
  <style type="text/css">
  
body{
  background: #233142;
  
}

div
{
text-align: center;
}
h1{

;
  color: #facf5a;
  text-align: center;
  font-family: 'Raleway';
  font-size: 90px;
  font-weight: 800;
}
h2{
  color: #455d7a;
  text-align: center;
  font-family: 'Raleway';
  font-size: 30px;
  text-transform: uppercase;
}
input {
	font-size: 40px;
	background: #455d7a;
	color :#fff;
	background;none;
	outline: none;
	border: 0;
	cursor: pointer;
}
  </style>
</head>
<body>



<h1>You don't have permission</h1>
<h1>403</h1>
<h2>Not this time, access forbidden!</h2>
<div>
<form action="<%=request.getContextPath()%>/logout">
                <input type="submit" value="Sign out" > 
               
   </form>
</div>
</body>
</html>
