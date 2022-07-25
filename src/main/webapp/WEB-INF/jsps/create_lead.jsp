<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create | Lead</title>
</head>
<body>
  <h2>Create | Lead</h2>
  <hr>
  <form action="saveLead" method="post">
  <pre>
  
  First Name   <input type="text" name="firstName"/>
  
  Last Name    <input type="text" name="lastName"/>
  
  Lead Source  <select name="leadSource">
			   <option value="radio">Radio Channel</option>
			   <option value="newsPaper">News Paper</option>
			   <option value="tv">TV</option>
			   <option value="online">Online</option>
			   </select>
			  
   Email       <input type="text" name="email"/>
   
   Mobile      <input type="text" name="mobile"/>
   
               <input type="submit" value="Save"/>			  
  
  </pre>
  </form>
  ${errorEmail}
</body>
</html>