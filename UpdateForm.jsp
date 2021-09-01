<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<body>
<form action="controler" method="get">
<input type="hidden" name="action" value="update">
<br>
Enterthe amount			  :<input type="text" name="amount">
</br>

<br>
Enterthe Rate Of Interest :<input type="text" name="rate">
</br>

<br>
Enterthe Number of months :<input type="text" name="month">
</br>

<br>
Username				  :<input type="text" maxlength=10 name="user">
</br>

<br>
Id						 :<input type="text" maxlength=10 name="user">
</br>

<br>
Emipayable				:<input type="text" maxlength=10 name="user">
</br>

<br>
TotalInterest			:<input type="text" maxlength=10 name="user">
</br>

<br>
Totalpay				:<input type="text" maxlength=10 name="user">
</br>

<br>
<input type=submit value="Update" onClick="update()";/>
</br>
</form>
<input type="hidden">
</body>
</html>
