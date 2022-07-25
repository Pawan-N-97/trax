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
  <form action="generateBill" method="post">
  <pre>
  
  First Name   <input type="text" name="firstName" value="${contact.firstName}"/>
  
  Last Name    <input type="text" name="lastName" value="${contact.lastName}"/>
  
   Email       <input type="text" name="email" value="${contact.email}"/>
   
   Mobile      <input type="text" name="mobile" value="${contact.mobile}"/>
   
   Product     <input type="text" name="product"/>
    
   Amount      <input type="text" name="amount"/>
   
               <input type="submit" value="Generate Bill"/>			  
  
  </pre>
  </form>
  ${errorEmail}
</body>
</html>