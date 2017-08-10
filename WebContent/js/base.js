$(document).ready(function(){

	loginStart();
	setUserName();
	selectCourse();
	logoutBtn();

	$(".p-a").click(function() {
		$("#question").show();
	});

	$("#questionBtn").click(function() {
		var question_title = $("#question_title").val();
		var question_content = $("#question_content").val();
		var usrname = 111;
		var params = {
			question_title: question_title,
			question_content: question_content,
			usrname: 111
		}
		
		var str;
		// 	$("ul.addDataCourse").html(str); 
	 	str="<div class='md-left'>"+
				"<i class='i'>88</i>"+
				"<span>顶</span>"+
				"<a href='#'>"+question_title+"</a>"+
			"</div>"+
			"<div class='md-left'>"+
				"<i class='i2'>88</i>"+
				"<span class='span2'>[最新回答]</span>"+
				"<a href='http://imysql.com/2014/07/02/per ... hmark-testing.shtml'><img src='imgs/55a3180d0001a3d906400658-160-160.jpg' width='16' height='16'></a>"+
				"<span class='span3'><a href='#'>王宇的qq:</a></span>"+
				"<span class='span2'>"+question_content+"</span>"+
			"</div>"+
			"<div class='md-left1'>"+
				"<span class='time-span'>提问时间：2015-11-13</span>"+
				"<span class='t-span'><a href='#'>mariadb</a></span>"+
				"<span class='t-span'><a href='#'>mysql</a></span>"+
				"<span class='t-span'><a href='#'>php</a></span>"+
			"</div>"
		$("#liuyan_add").html(str); 
	 	/*  end  */
	 	$.post("CreateQuestionServlet",params ,function(data, status){

			if(data=="true"){
				alert("提交成功！");
				document.url="Community.html";
				//window.open('login_success.html','登录成功','height=100,width=400,top=0,left=0,toolbar=no,menubar=no,scrollbars=no,resizable=no,location=no,status=no'); 
				
			}else {
				console.log("error");
				alert("提交失败");
			}
		});

		$("#question").hide();

	});


// 注销start
function logoutBtn() {
	$(".logoutBtn").click(function() {
		alert(1);
		sessionStorage.setItem("username", "null");

		$(".username").text("");
		$(".signin").show();
		$(".register").show();
		$(".button2").hide();
	});
}
// 注销end


	
$("#register").click(function() {
//		location.href = "login_success.html";
		alert("aaaa");
		var rtel = $("#rtel").val();
		var rname = $("#rname").val();
		var rpwd = $("#rpwd").val();
		var params = {
			rtel: rtel,
			rname: rname,
			rpwd: rpwd
		}
		$.post("register.action",params ,function(data, status){

			// alert(data);
//			console.log(data);
//			alert(data);
			if(data=="true"){
				document.url="Login.html";
				//window.open('login_success.html','登录成功','height=100,width=400,top=0,left=0,toolbar=no,menubar=no,scrollbars=no,resizable=no,location=no,status=no'); 
				
			}else {
				console.log("error");
				alert("该用户名被占用");
			}
		});
	});
});


//楠岃瘉鐧诲綍start
function loginStart(){
	$("#loginBtn").click(function(){
		var params = {
			username:$("#username").val(),
			password:$("#password").val()
		};
		alert($("#username").val());

		$.post("LoginServlet.action",params,
			function(data,status){
				console.log(status);
				//var name=JSON.parse(data).username;
				//alert(name);
				if(data=="") {
				   	alert("11111");
				   	// document.url="Login.html";
				}else {
					alert("弹");
					sessionStorage.setItem("username",data);
					setUserName();
					//document.url="index.html";
				}
			});
		});
}

function setUserName(){
	var username = sessionStorage.getItem("username");
	if(username != "" && username != null && username != "null"){
			// alert(username);
		$(".username").text(username);
		$(".signin").hide();
		$(".register").hide();
		$(".button2").show();
	}else{
		$(".button2").hide();
	    $(".button1").show();
	}
}

//璇剧▼寮�濮媠tart
function selectCourse(){
	$(".kinds-ul li").click(function(){
		//$("#quanbu").removeClass();
		$(".all").removeClass();
		$(this).parent().children().filter(".current").removeClass("current");
		$(this).addClass("current");

		var course_direction=$("#ul-d .current").text();
		var course_classification=$("#ul-c .current").text();
		var course_rank=$("#ul-r .current").text();
		console.log(course_direction);
		$.post("/study/QueryAllCourseServlet.action",{
			course_direction:course_direction,
			course_classification:course_classification,
			course_rank:course_rank
		},function(data){
			var str = "";
			$.each(JSON.parse(data),function(i,item){
				if(item != null && item != ""){
				str += "<li class='col-md-3'>" +
				"<a href='#'>"+
				"<img style='width:240px; height:135px' src='imgs/"+item.course_id+".jpg' alt=''/>"+
				"<h4>"+item.course_name+"</h4>"+
				"<p>"+item.course_description+"</p>"+
				"<span>"+item.course_progress+"</span>"+
				"<span>"+item.course_studyNum+"浜哄涔�</span>"+
				"<span class='tip'>"+item.course_studyTime+"|"+item.course_rank+"</span>"+
				"</a>"+
				"</li>"
				}
			});
			$("ul.addDataCourse").html(str); 
		});
		var url = this.href;
	});
}
//璇剧▼寮�濮媏nd
//
// 娉ㄥ唽楠岃瘉start
// function register() {
// 	$("#register").click(function() {
// 		var rtel = $("#rtel").val();
// 		var rname = $("#rname").val();
// 		var rpwd = $("#rpwd").val();
// 		var params = {
// 			rtel: rtel,
// 			rname: rname,
// 			rpwd: rpwd
// 		}
// 		$.post("register.action",params ,function(data, status){
			
// 			alert(data);
// 			if(data=="true"){
// 				alert("注册成功！");
// 			}else {
// 				alert("该用户名被占用");
// 			}
// 		});
// 	});
// }
// 娉ㄥ唽楠岃瘉end