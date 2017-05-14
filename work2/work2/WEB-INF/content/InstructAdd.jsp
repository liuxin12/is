<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="js/InstructAdd.js" type="text/javascript"></script>
</head>
<body>
	<h1>添加乐器</h1>
	<lable>选择类型</lable>
	<select id="instruct_select">
		<option id="guitar" value="吉他" selected="selected">吉他</option>
		<option id="man" value="曼陀林" >曼陀林</option>
	</select>
	<form id="instruct">
		serialNumber <input name="serialNumber" type="text"></br>
		price <input name="price" type="text"></br>
		builder <input name="builder" type="text"></br>
		model <input name="model" type="text"></br>
		type <input name="type" type="text"></br>
		backWood <input name="backWood" type="text"></br>
		topWood <input name="topWood" type="text"></br>
		<div id="numString">
		numString <input  name="numString"></br>
		</div>		
		<div id="style" style="display:none">
		style <input  name="style" >
		</div>
		<button id="instructAdd">提交</button>
	</form> 
</body>
</html>


			
