<html>
<head>
<title>
Please login
</title>
<body>
Please Log in
<% String loginError = (String)request.getAttribute("loginError");
if(loginError!=null){
%>
<span style ="color:red"> <%=loginError %></span>

<%
}
%>


<form method="post" action="/Shop/cs">
Username: <input type='text' name='username'/>
Password: <input type='password' name='password'/>
<input type='submit' name='action' value='login'/>
<input type= 'reset' value='Reset'/>
<input type="hidden" name= "page" value= "login"/>

</form>

</body>




</head>



</html>