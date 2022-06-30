<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
$(document).ready(function(){

    $.ajax({url: "./rest/emp/findAll", success: function(result){
      console.log(result);
      for(var i=0;i<result.length;i++){
    	  $("#result").append("<b>"+result[i].eid+" - "+result[i].ename+" - "+result[i].esal+"</b><br>");
      }
    }});
 
});
</script>
</head>
<body>
<h1>Call Rest API Using AJAX  ---  </h1>
<div id="result">
     
</div>
</body>
</html>