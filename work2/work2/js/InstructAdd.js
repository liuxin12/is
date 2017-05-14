$(document).ready(function(){
	$("#instruct_select").change(function(){
		if($(this).val()=="曼陀林"){
			$("#numString").hide();
			$("#style").show();
		}
		if($(this).val()=="吉他"){
			$("#numString").show();
			$("#style").hide();
		}
	})
	var str="";
	$("#instructAdd").click(function(){		
		init();
		$.ajax({			
			type:"POST",
			url:"instruct_add",
			dateType:"json",
			contentType:"application/x-www-form-urlencoded; charset=UTF-8",
			data:{
				"serialNumber":$("#instruct input:eq(0)").val(),
				"price":$("#instruct input:eq(1)").val(),
				"instructMap":str,
			},
			success:function(data){
				alert("添加成功");
				$.html("<p>添加成功</p>").css(color,red);
			},
			error:function(data){
				alert("出错了");
				$.html("<p>添加失败</p>").css(color,red);
			}
		})
	});
	function init(){	
		var map={};
		var key;
		var value;		
		$("#instruct input:gt(1):visible").each(function(){
			value=$(this).val();
			key=$(this).attr("name");
			map[key]=value;
			str=JSON.stringify(map);			
		});		
	}
})	