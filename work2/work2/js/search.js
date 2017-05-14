$(document).ready(function(){	
	var str="";
	$("#instructSearch").click(function(){		
		init();
		$.ajax({			
			type:"POST",
			url:"instruct_search",
			dateType:"json",
			contentType:"application/x-www-form-urlencoded; charset=UTF-8",
			data:{
				"instructMap":str,
			},
			success:function(data){
				$("#instructDiv").hide();				
				$("#instructList").show();
				var data1=JSON.parse(data);				
				if(data1.list==null || data1.list==""){
					$("#instructListHead").hide();					
					var c=$("#instructMessage").append("<tr id='message'></tr>");
					c.append("<td>没有你需要的乐器</td>");
					alert(data1.list);
				}
				else{
					$.each(data1.list,function(i,instruct){					
						var c=$("#instructMessage").append("<tr id='message'></tr>");
						c.append("<td>"+instruct.serialNumber+"</td>");
						c.append("<td>"+instruct.price+"</td>");
						$.each(instruct.instructSpecService.properties,function(k,v){
							c.append("<td>"+v+"</td>");
						});
						alert("ch");
					});
				};		
			},
			error:function(data){
				alert("出错了");
			}
		})
	});
	function init(){	
		var map={};
		var key;
		var value;		
		$("#instruct input:visible").each(function(){
			value=$(this).val();
			key=$(this).attr("name");
			map[key]=value;
			str=JSON.stringify(map);			
		});		
	};
	$("#instruct_select").change(function(){
		if($(this).val()=="曼陀林"){
			$(".numString").hide();
			$(".style").show();
		}
		if($(this).val()=="吉他"){
			$(".numString").show();
			$(".style").hide();
		}
	})
})