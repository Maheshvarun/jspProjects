$(document).ready(function(){
	var limit=0;
	var offse=5;
	$("#stbl").click(function()
			{
			    $.get("fetch.jsp",{limit:limit,offse:offse},function(data){
				alert("hi");
				limit=limit+5;
				alert(limit);
				alert(offse);
				$("#div2").html(data);
			});
		});
	$("#first").click(function(){
		alert("first");
		var limitfirst=0;
		var offselast=5;
			$.get("fetch.jsp",{limit:limitfirst,offse:offselast},function(data){
				alert("hi");
				$("#div2").html(data);
			});
	});
	$("#last").click(function(){
		alert("last");
		$('#first').prop('disabled', false);
	});
	$("#next").click(function(){
		alert("next");
		$('#first').prop('disabled', false);
		$.get("fetch.jsp",{limit:limit,offse:offse},function(data){
			alert("hi");
			limit=limit+5;
			alert(limit);
			alert(offse);
			$("#div2").html(data);
		});
	});
	
	$("#previous").click(function(){
		alert("previous");
		$('#first').prop('disabled', false);
	});
});