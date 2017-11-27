$(document).ready(function()
	{
	 $("#div2").slideToggle("slow");
	    $("#div1").slideToggle("slow");
	    $("#div3").slideToggle("slow");
	 alert("It is mandatory to fill (*) mark fields");
	$("#fname").focusin(function(){
		var a="This is mandatory";
		$("#sfname").text(a);
	});
	$("#fname").focusout(function(){
		var a=$("#fname").val();
		if(a=="")
			{
		  //	alert("it could not be empty");
			}
		else
			{
			$("span").remove();
			}
	});	
	$("#lname").focusin(function(){
		var a="first name and last name should not be same";
		$("#slname").text(a);
	});
	$("#lname").focusout(function(){
		var a=$("#fname").val();
		var b=$("#lname").val();
		if(a=="")
		{
		var c="plz provide some values";
		$("#sfname").text(c);
		}		  
		 else if(a==b)
			{
			 var d="plz provide differnt values";
			    $("#slname").text(d);
			}
			 else
				 {
				 
				 }
	});
	 var radioValue = $("input[type='radio']:checked").val();
	 alert(radioValue);
		  var date=new Date();
		  var day=date.getDate();
		  if(day<10)
			  {
			  day="0"+day;
			  }
		  var month=date.getMonth()+1;
		  if(month<10)
			  {
			  month="0"+month;
			  }
		  var year=date.getFullYear();
		  var maxDate=year+"-"+month+"-"+day;
		  var minDate=2008+"-"+12+"-"+31;
		  //alert(minDate);
		  //alert(maxDate);
		  $("#dob").attr("min",minDate);
		  $("#dob").attr("max",maxDate);
		 
		  $("#register").click(function(){
			    $("#div1").slideToggle("fast");
			});
		  $("#login").click(function(){
			    $("#div2").slideToggle("fast");
			});
		  /*$elements = $('.rotating-content').find('p');
		  $elements.hide().first().show();

		  setInterval(function() {
		     $elements.filter(':visible').fadeOut('slow', function() {
		        $next = $(this).next();
		        if ($next.length === 0) {
		           $next = $elements.first(); 
		        }
		        $next.fadeIn('slow');
		     });
		  }, 4000);*/
	});