<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html lang="en">
<head>
</head>
<body>
<form:form method = "POST" action = "/newkumar/saveCustomer" modelAttribute="customer">
         <table>
            <tr>
               <td><form:label path = "customerName">Customer name</form:label></td>
               <td><form:input path = "customerName" /></td>
            </tr>
            <tr>
               <td><form:label path = "customerAddress">Customer Address</form:label></td>
               <td><form:input path = "customerAddress" /></td>
            </tr>
            <tr>
               <td><form:label path = "phoneNumber">id</form:label></td>
               <td><form:input path = "phoneNumber" /></td>
            </tr>
            <tr>
               <td colspan = "2">
               <form:hidden path = "id" />
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>
         <table  border="1">
                 <c:forEach var="i" varStatus="count" items="${customerList}">
				  <tr>
				  <td>${count.count}</td>
				  <td>${i.customerName}</td>
				  <td>${i.customerAddress}</td>
				  <td>${i.phoneNumber}</td>
				  <td><a href="editCustomer/${i.id}">edit</a>/<a href="deleteCustomer/${i.id}">delete</a></td>
				  </tr>
				</c:forEach>
         
         </table>  
      </form:form>
</body>

</html>
