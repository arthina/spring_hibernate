<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to SCBBankingServices</title>
<link type="text/css" rel="stylesheet" href="styles/reg.css">
</head>
<body>
<div>
<section>
		<!-- img src="images/Standard_Chartered.jpeg" -->
		<img src="images/Standard_Chartered.svg">
	</section>
	<section>
			<form:form name="RegForm" method="POST" action="registration.htm" commandName="customer">
				<fieldset>
					<legend>Customer Form</legend>
					<form:errors path="customerId" class="errors"/>
					<form:errors path="name" class="errors"/>
					<form:errors path="address" class="errors"/>
					<form:errors path="dob" class="errors"/>
					<form:errors path="phoneNo" class="errors"/>
					<form:errors path="email" class="errors"/>
					
					<form:input path="customerId" type="number" placeholder="CustomerId"/>
					<form:input path="name" type="text" placeholder="Name"/>
					<form:input path="address" type="text" placeholder="Address"/>
					<form:input path="dob" type="Date" placeholder="DOB"/>
					<form:input path="phoneNo" type="tel" placeholder="Phone No"/>
					<form:input path="email" type="email" placeholder="Email"/>
					<form:select path="stateCode">
						<form:options items="${stateList}" itemValue="stateCode" 
						itemLabel="name"/>
					</form:select>
					
					<form:input path="" type="submit" value="submit"/>
				</fieldset>
			</form:form>
		</section>

	</div>
</body>
</html>