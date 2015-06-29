<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="../include/header.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
	<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header" >
	<h1>Job</h1>
	<ol class="breadcrumb">
		<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
		<li class="subPage active">job</li>
	</ol>
	</section>
	<section class="content"> 
		<div class="row">
			<div class="col-md-12">
              <!-- general form elements disabled -->
              <div class="box box-warning">
                <div class="box-header">
                  <h3 class="box-title">General Elements</h3>
                  <button class='btn btn-sm btn-info btn-flat pull-right' style="margin-right: 5%;" id="listBtn"><h4>List</h4></button>
                   <button class='btn btn-sm btn-info btn-flat pull-right' style="margin-right: 1%;" id="submitBtn"><h4><i class="fa-check-square-o"></i>Submit</h4></button>
                </div><!-- /.box-header -->
                <div class="box-body">
                  <form role="form" id="registForm">

                    <!-- input states -->
                    <div class="form-group has-success">
                      <label class="control-label" for="inputSuccess"><i class="fa fa-check"></i> JobName</label>
                      <input type="text" class="form-control" id="inputSuccess" placeholder="Enter ..."/>
                    </div>
                    <div>
                    	<label>
                    	<button class="btn btn-sm btn-block btn-success pull-left" id="chkBtn">Name Check</button>
                    	</label>
                    </div>
                    <!-- radio -->
                    <div class="form-group">
                    
                      <div class="radio">
                      <h4>1차 카테고리</h4>
                      <c:forEach var="jobName" items="${jobName }">
                      <label>
                        <div class="firstJob">
                        
                          <input type="radio" class="firstCh" name="optionsRadios" id="${jobName.jobNo }" value="${jobName.depth }">
                         	 ${jobName.jobName }
                          <input type="hidden" class="hideParent" name="hideParent" value="${jobName.parent }">
                       
                         </div>
                       </label>
                        </c:forEach>
                        <div class="secondJob"></div>
                        <div class="thirdJob"></div>
                        <div class="forthJob"></div>
                        </div>
                    </div>
                    
                  </form>
                  <form id="jobForm">
                  	<input type="hidden" name="jobName" value="">
					<input type="hidden" name="depth" value="">
					<input type="hidden" name="parent" value="">
					<input type="hidden" name="realDepth" value="">
					<input type="hidden" name="realParent" value="">
					<input type="hidden" name="idCheck" value="notdefined">
				</form>
                </div><!-- /.box-body -->
              </div><!-- /.box -->
            </div><!--/.col (right) -->
          </div>   <!-- /.row -->
        </section><!-- /.content -->		
		</div>
		<script src="/resources/plugins/jQuery/jQuery-2.1.4.min.js"></script>
		<script type="text/javascript">
			$('#chkBtn').on("click",function(event){
				event.preventDefault();
				var jobNameText = $('#inputSuccess').val();
				$.get("nameCheck/"+jobNameText, function(data){
					$('#jobForm').find("input[name='idCheck']").val(data);
					if(data == "yes"){
						alert("현재 등록하려는 직업이 존재합니다.");
					}else{
						alert("직업이 존재하지않습니다.");
						$('#jobForm').find("input[name='jobName']").val(jobNameText);
					}
				});
			});
			$("#submitBtn").on("click", function(){
				var idchk = $('#jobForm').find("input[name=idCheck]").val();
				console.log(idchk);
				if(idchk == "no"){
					$('#jobForm').attr("method","post");
					$('#jobForm').attr("action", "/job/regist");
					if($('#jobForm').find("input[name=realDepth]").val() ==""){
						alert("카테고리를 설정해주세요");
					}else{
						$('#jobForm').submit();
					}
				}else if(idchk == "yes"){
					alert("현재 등록하려는 직업이 존재합니다.");
				}else{
					alert("Please push the 'Name Check' Button");
				}
			});
			$('#listBtn').on("click", function(){
				location.href="/job/list";
			});
			
		</script>
	<!-- /.content-wrapper -->
<%@include file="../include/footer.jsp"%>
</html>