<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<title>Customer Registration Form</title>
	<style>
		.error{color:red}
	</style>
</head>

<body>

<i>Please fill out the form.</i>
<br><br>
	<form:form action="processForm" modelAttribute="customer">
	
		First Name: <form:input path="firstName"/>
		<br><br>
		
		Last Name (*): <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error" />
		<br><br>
		
		Postal Code: <form:input path="postalCode"/>
		<form:errors path="postalCode" cssClass="error" />
		<br><br>
		
		Serial Number of Your Product: <form:input path="serialNumber"/>
		<form:errors path="serialNumber" cssClass="error"/>
		<br><br>
		
		Number of Complaints: <form:input path="numberComplaint"/>
		<form:errors path="numberComplaint" cssClass="error" />
		
		<br><br>
		
		<input type="submit" value="Submit" />
	
	</form:form>

</body>


</html>