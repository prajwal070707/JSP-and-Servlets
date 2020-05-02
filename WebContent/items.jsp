<%@page import= "java.util.*,com.prajwal.shop.domain.Item" %>




<html>
<head>
<title>
List of Items</title>
<body>

<form method="post">

<table>
<tr>
<td>ID</td>
<td>Name</td>
<td>Price</td>
</tr>
<%
List<Item> items =(List<Item>)request.getAttribute("items");
for(Item item: items){
%>
<tr>
 <td><%=item.getId() %></td>
 <td><%=item.getName() %></td>
 <td><%=item.getPrice() %></td>
 </tr>
<%
}
%>

</table>

<input type='hidden' name= 'page' value= 'items'/>

</form>

</body>




</head>


</html>