/**
 * Created by Volodymyr Lishchynskiy on 25.02.15.
 */
$(document).ready(function() {
	$("#public").hide();
	$("#private").hide();
	$("#okbtn").hide();
	$("#admin").hide();
	getRole();
	sendPost();
});
var role;
function getRole() {
	$.ajax({
		url : "web/user/profile",
		type : 'post',
		dataType : 'json',
		data : '',
		contentType : 'application/json',
		mimeType : 'application/json',
		success : function(responseData) {
			role = responseData.role;
		}
	});
}

function sendPost() {
	$.ajax({
		url : location.pathname,
		type : 'post',
		dataType : 'json',
		data : '',
		contentType : 'application/json',
		mimeType : 'application/json',
		success : function(responseData) {
			$("#user").text(
					"User: " + responseData.firstName + "  "
							+ responseData.lastName);
			$("#test").text("Test: " + responseData.testName);
			$("#date").text("Date: " + responseData.date);
			$("#result").text(
					"Test result is " + responseData.correctAnswersCount
							+ " of " + responseData.totalAnswersCount);
			$("#testresult").dataTable({
				"bFilter" : false,
				"data" : responseData.answers,
				"columns" : [ {
					"data" : "questionName"
				}, {
					"data" : "isCorrect"
				}, ]
			});

			if (role == "ROLE_ADMIN") {
				$("#loadingIcon").hide();
				$("#admin").show();
				$("#public").show();
				$("#okbtn").show();

			} else {
				if (responseData.public) {
					$("#loadingIcon").hide();
					$("#public").show();
					$("#okbtn").show();
				} else {
					$("#loadingIcon").hide();
					$("#private").show();
					$("#okbtn").show();
				}
			}
		}
	})
}
