<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/search.js"></script>
<style type="text/css">
	table{
		width:100%;
	}
	td{
		height:20px,
		width:20px;
		border: 2px solid ; 	
	}
</style>
<title>查询界面</title>
</head>
<body>
	<div id="instructDiv">
		<h1>查询乐器</h1>
		<lable>选择类型</lable>
		<select id="instruct_select">
			<option id="guitar" value="吉他" >吉他</option>
			<option id="man" value="曼陀林" >曼陀林</option>
		</select>
		<form id="instruct">
			builder <input name="builder" type="text" value="1"></br>
			model <input name="model" type="text" value="1"></br>
			type <input name="type" type="text" value="1"></br>
			backWood <input name="backWood" type="text" value="1"></br>
			topWood <input name="topWood" type="text" value="1"></br>
			<div class="numString">
			numString <input  name="numString" value="1"></br>
			</div>		
			<div class="style" style="display:none">
			style <input  name="style"  value="1">
			</div>
			<button id="instructSearch">提交</button>
		</form>
	</div>
	<div id="instructList" style="display:none">
		<h1>查询结果</h1>
		<table>
			<thead id="instructListHead">
				<tr>
					<td>builder</td>
					<td>model</td>
					<td>type</td>
					<td>backWood</td>
					<td>topWood</td>
					<td>price</td>
					<td>serialNumber</td>
					<td class="numString">numString</td>
					<td class="style" style="display:none">style</td>
				</tr>			
			</thead>
			<tbody id="instructMessage">			
			</tbody>
		</table>
	</div>
</body>
</html>