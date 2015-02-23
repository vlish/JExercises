<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<c:set var="basedir" value="${pageContext.request.contextPath}" />
<jsp:include page="../base.jsp" />
<jsp:include page="../navigation.jsp" />
<link href="${basedir}/resources/css/registration.css" rel="stylesheet"
	type="text/css">
<script src="${basedir}/resources/js/lib/moment.js"></script>
<script src="${basedir}/resources/js/lib/combodate.js"></script>
<script src="${basedir}/resources/js/registration_data_validation.js"></script>
<script src="${basedir}/resources/js/register.js"></script>
<script src="${basedir}/resources/js/lib/jquery.validate.min.js"></script>
</head>
<body id="container">
	<div class="container">
		<div class="row" style="margin-top: 60px;">
			<div class="col-md-4 col-md-offset-4">
				<form id="registrationForm" method="POST"
					class="panel panel-default">
					<div class="container-fluid">
						<h3 class="sign-up-title"
							style="color: dimgray; text-align: center">JExercises Please
							Register</h3>
						<hr class="colorgraph">
						<input class="form-control" placeholder="First name"
							id="firstName" name="firstName" type="text" /> <input
							class="form-control" placeholder="Last name" id="lastName"
							name="lastName" type="text" /> <input class="form-control"
							placeholder="E-mail" id="email" name="email" type="email"
							data-toggle="popover" /> <input
							id="password" class="form-control" placeholder="Password"
							name="password" type="password" /> <input id="matchingPassword"
							class="form-control" placeholder="Confirm Password"
							name="matchingPassword" type="password" /><br> <label
							class="label">Birthday</label> <br> <input id="birthDate"
							class="combodate" type="text" data-format="MM/DD/YYYY"
							data-template="D MMM YYYY" name="birthDate" /> <br> <br>
						<input id="submitButton" class="btn btn-lg btn-success btn-block"
							type="button" value="Sign up"> <br>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>