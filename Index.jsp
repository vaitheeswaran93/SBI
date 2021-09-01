<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
   <title>EMI Calculator</title>
 </head>
  <body>
    <div class="container" style="margin-top: 150px;">
    <form action="controler" method="POST">
    
       <fieldset>
        <legend>EMI Calculator</legend>
   		<div class="form-group">
         <label class="col-md-4 control-label" for="amount">Enterthe amount</label>
         <div class="col-md-5">
          <input id="amount" name="amount" type="text" placeholder=""class="form-control input-md">
          </div>
         </div>
         
         
         <div class="form-group">
          <label class="col-md-4 control-label" for="rate">Enterthe Rate Of Interest</label>
          <div class="col-md-5">
           <input id="rate" name="rate" type="text" placeholder=""class="form-control input-md">
           </div>
          </div>
          
          
          <div class="form-group">
           <label class="col-md-4 control-label" for="month">Enterthe Number of months</label>
           <div class="col-md-5">
            <input id="month" name="month" type="text" placeholder=""class="form-control input-md">
            </div>
           </div>
           
           <div class="form-group">
          <label class="col-md-4 control-label" for="rate">Username</label>
          <div class="col-md-5">
           <input id="user" name="user" type="text" placeholder=""class="form-control input-md">
           </div>
          
          <div class="form-group">
          <label class="col-md-4 control-label" for="rate">Id</label>
          <div class="col-md-5">
           <input id="id" name="id" type="text" placeholder=""class="form-control input-md">
           </div>
          
          
           
           <div class="form-group">
            <label class="col-md-4 control-label" for="emi"></label>
            <div class="col-md-4">
            <input type="submit" value="Calculate EMI">
            </div>
          </fieldset>
         </form>
        </div>
    
    </body>
   </html>
   
   
   <!-- Text input-->
