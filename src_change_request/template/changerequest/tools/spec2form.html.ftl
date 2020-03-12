<!DOCTYPE html>
<html lang="en" slick-uniqueid="3">
<head>
    <title>${projectSpec.name} CR form</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
    <link href="https://cdn.rawgit.com/Eonasdan/bootstrap-datetimepicker/e8bddc60e73c1ec2475f827be36e1957af72e2ea/build/css/bootstrap-datetimepicker.css" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
    <link id="bsdp-css" href="https://unpkg.com/bootstrap-datepicker@1.9.0/dist/css/bootstrap-datepicker3.min.css" rel="stylesheet">



  	<script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
  	<script src="https://cdn.staticfile.org/popper.js/1.15.0/umd/popper.min.js"></script>
  	<script src="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.9.0/moment-with-locales.js"></script>
    <script src="https://cdn.rawgit.com/Eonasdan/bootstrap-datetimepicker/e8bddc60e73c1ec2475f827be36e1957af72e2ea/src/js/bootstrap-datetimepicker.js"></script>
    <script src="https://unpkg.com/bootstrap-datepicker@1.9.0/dist/js/bootstrap-datepicker.min.js"></script>


<style>
.main_pannel{
	display: flex;
	flex-direction: row;
}
.cr_nav_menu {
	
}
.cr_nav {
}
.cr_container {
	margin: 5px;
	padding: 5px 10px;
	border-left: 1px solid grey;
}

.event_container {
	padding: 5px 10px;
	margin-top: 15px;
}

.fd_display {
	padding: 2px 5px;
    color: #66a26e;
    font-style: italic;
    font-size: 18px;
}
.fd_tips {
	float: right;
	
}
.fd_tips a {
	color: #66a26e;
}
.evt_header {
	/* margin-top: 20px;
	border-bottom: 3px solid #cdcdcd;*/
}
.evt_header h4 {
	display: inline-block;
    /*
    padding: 3px 20px;
    background-color: #cdcdcd;
    color: black;
    border-top-left-radius: 10px;
    border-top-right-radius: 10px;
    margin-bottom: 0;
    padding-bottom: 0px;
    box-sizing: border-box;
    position: relative;
    bottom: -4px;
    */
}
.disabled {
	background-color: rgba(230,230,220,0.5);
}
.btn-sm {
	padding-left: 2rem;
	padding-right: 2rem;
}
.row {
	margin-left: unset;
	margin-right: unset;
}
</style>

</head>
<body>
<h1 style="text-align:center;">${projectSpec.name}的ChangeRequest规格展示</h1>
<div class="main_pannel">
<ul class="nav nav-pills flex-column cr_nav_menu" role="tablist">
<#list projectSpec.changeRequestList as crSpec>
	<li class="nav-item cr_nav">
		<a class="nav-link <#if crSpec?index==0>active</#if>" id="${helper.getCRName(crSpec)}_tab" data-toggle="tab" href="#${helper.getCRName(crSpec)}" role="tab" aria-controls="${helper.getCRName(crSpec)}" aria-selected="<#if crSpec?index==0>true<#else>false</#if>">${crSpec.title}</a>
	</li>
</#list>
</ul>
<div class="tab-content" style="flex:1;">
<#list projectSpec.changeRequestList as crSpec>
	<div class="tab-pane fade<#if crSpec?index==0> show active</#if>" id="${helper.getCRName(crSpec)}" role="tabpanel" aria-labelledby="${helper.getCRName(crSpec)}_tab">
		<div class="cr_container">
		<@CR_HEADER crSpec/>
		<#list crSpec.stepList as stepSpec>
			<div class="tab-pane fade<#if stepSpec?index==0> show active</#if>" id="${helper.getCRName(crSpec)}_${helper.getNavName(stepSpec.name)}" role="tabpanel" aria-labelledby="${helper.getCRName(crSpec)}_${helper.getNavName(stepSpec.name)}_tab">

			<div class="step_container">
			<@STEP_HEADER crSpec stepSpec/>
			<#list stepSpec.eventList as eventSpec>
				<div class="card event_container">
				<@EVENT_HEADER crSpec stepSpec eventSpec/>
				<#list eventSpec.fieldList as fieldSpec>
					<div class="field_container">
					<@FIELD crSpec stepSpec eventSpec fieldSpec/>
					</div>
				</#list>
				<@EVENT_FOOTER crSpec stepSpec eventSpec/>
				</div>
			</#list>
			<@STEP_FOOTER crSpec stepSpec/>
			</div>
			</div>
		</#list>
		<@CR_FOOTER crSpec/>
		</div>
	</div>
</#list>
</div>
</div>

<script>
$(function(){
	$(document).ready(function(){
	  $('[data-toggle="popover"]').popover();   
	});
	
	/*
	$(".input_date").datepicker({
    	maxViewMode: 3,
    	format: "yyyy/mm/dd"
	});
	*/
});
</script>
</body>
</html>

<#macro CR_HEADER crSpec>
	<h2 style="display:inline;">${crSpec.title}</h2>(${helper.getCRName(crSpec)?upper_case})
	<ul class="nav nav-tabs nav-justified flex-row" role="tablist">
<#list crSpec.stepList as stepSpec>
		<li class="nav-item step_nav">
			<a class="nav-link <#if stepSpec?index==0>active</#if>" id="${helper.getCRName(crSpec)}_${helper.getNavName(stepSpec.name)}_tab" data-toggle="tab" href="#${helper.getCRName(crSpec)}_${helper.getNavName(stepSpec.name)}" role="tab" aria-controls="${helper.getNavName(stepSpec.name)}" aria-selected="<#if stepSpec?index==0>true<#else>false</#if>">Step ${stepSpec.index}: ${stepSpec.title!}</a>
		</li>
</#list>
	</ul>
	<div class="tab-content">
</#macro>
<#macro CR_FOOTER crSpec>
	</div>
</#macro>
<#macro STEP_HEADER crSpec stepSpec>
<#if crSpec.stepList?size gt 1>
	<div class="row justify-content-center">
		<#if stepSpec.index gt 1>
		<button type="button" class="btn btn-primary btn-lg col-sm-4">上一步</button>
		<#else>
		<div class="col-sm-4"></div>
		</#if>
		<div class="col-sm-4"></div>
		<#if stepSpec.index == crSpec.stepList?size>
		<button type="button" class="btn btn-primary btn-lg col-sm-4">提交</button>
		<#else>
		<button type="button" class="btn btn-primary btn-lg col-sm-4">下一步</button>
		</#if>
	</div>
<#else>
	<div class="row justify-content-center">
	<button type="button" class="btn btn-primary btn-lg col-sm-4">提交</button>
	</div>
</#if>
</#macro>
<#macro STEP_FOOTER crSpec stepSpec>
</#macro>
<#macro EVENT_HEADER crSpec stepSpec eventSpec>
	<@compress single_line=true>
	<div class="card-header evt_header">
		<h4>${eventSpec.title}
			<#if eventSpec.mustHave><span style="color:red;">*</span></#if>
		</h4>(${eventSpec.name}:${helper.toModelStyleName(eventSpec.eventType)})<#if eventSpec.multiple>
				[${eventSpec.minimalNumber!}~${eventSpec.maximumNumber!}]
			</#if>
	</div>
	</@compress>
	<form>
</#macro>
<#macro EVENT_FOOTER crSpec stepSpec eventSpec>
	</form>
	<#if eventSpec.multiple>
	<div style="display:flex; flex-direction: row; justify-content:space-between;">
		<button type="button" class="btn btn-primary btn-sm">上一条</button>
		<button type="button" class="btn btn-danger btn-sm">删除</button>
		<button type="button" class="btn btn-primary btn-sm">下一条</button>
	</div>
	</#if>
</#macro>
<#macro FIELD crSpec stepSpec eventSpec fieldSpec>
	<#assign fieldId=helper.getLowerCaseName(stepSpec.name, eventSpec.name, fieldSpec.name)/>
	<#if fieldSpec.interactionMode=="display">
		<div class="fd_display">${fieldSpec.value!"<span style='color:red;'>你忘了写信息内容</span>"}</div>
	<#elseif fieldSpec.interactionMode=="hidden">
		<div class="form-group" style="background-color: #ededed;">
			<label for="${helper.getLowerCaseName(stepSpec.name, eventSpec.name, fieldSpec.name)}">${fieldSpec.title!}</label>
			<input class="form-control disabled" 
				type="text" 
				disabled="disabled"
				value="${fieldSpec.value!"后台指定值"}"
				id="${fieldId}" />
		</div>
	<#else>
		<div class="form-group">
			<label for="${helper.getLowerCaseName(stepSpec.name, eventSpec.name, fieldSpec.name)}">${fieldSpec.title!}</label>
			<#if fieldSpec.mustHave><span style="color:red;">*</span></#if>
			<span style="color:#66a26e; font-size: 80%;">
				(${helper.toJavaVariableName(fieldSpec.name)}):${fieldSpec.inputType}
				<#if fieldSpec.minimal?? || fieldSpec.maximum??>
					[${fieldSpec.minimal!}~${fieldSpec.maximum!}]
				</#if>
				<#if fieldSpec.valuesRetrieveApi?has_content>
					使用"${fieldSpec.valuesRetrieveApi}"查询数据
				</#if>
				<#if fieldSpec.tipsContent??>
					<div class="fd_tips">
						<a href="#" data-toggle="popover" title="温馨提示" data-content="${fieldSpec.tipsContent}">${fieldSpec.tipsTitle!"提示"}</a>
					</div>
				</#if>
			</span>
			
			<#if fieldSpec.selectable == "single_selectable">
				<@SINGLE_SELECTABLE_INPUT crSpec stepSpec eventSpec fieldSpec fieldId/>
			<#elseif fieldSpec.selectable == "multi_selectable">
				<@MULTI_SELECTABLE_INPUT crSpec stepSpec eventSpec fieldSpec fieldId/>
			<#else>	
				<#switch fieldSpec.inputType>
					<#case "string">
						<@STRING_FIELD_INPUT crSpec stepSpec eventSpec fieldSpec fieldId/>
						<#break>
					<#case "longtext">
						<@LONGTEXT_FIELD_INPUT crSpec stepSpec eventSpec fieldSpec fieldId/>
						<#break>
					<#case "money">
						<@MONEY_FIELD_INPUT crSpec stepSpec eventSpec fieldSpec fieldId/>
						<#break>
					<#case "date">
					<#case "datetime">
						<@DATE_FIELD_INPUT crSpec stepSpec eventSpec fieldSpec fieldId/>
						<#break>
					<#case "time">
						<@TIME_FIELD_INPUT crSpec stepSpec eventSpec fieldSpec fieldId/>
						<#break>
					<#case "images">
						<@IMAGES_FIELD_INPUT crSpec stepSpec eventSpec fieldSpec fieldId/>
						<#break>
					<#default>
					<span style="color:red;">${fieldSpec.inputType}类型的输入还没处理</span>
				</#switch>
			</#if>
			
		</div>
	</#if>
</#macro>


<#macro SINGLE_SELECTABLE_INPUT crSpec stepSpec eventSpec fieldSpec fieldId>
	<#if fieldSpec.valuesRetrieveApi?has_content>
		<select class="form-control" id="${fieldId}">
			<option value="1">后台返回的值 1</option>
			<option value="2">后台返回的值 2</option>
			<option value="3">后台返回的值 3</option>
		</select>
		<#return>
	</#if>
	
	
	<#assign tgtValue = fieldSpec.defaultValue!""/>
	<#if fieldSpec.value?has_content>
		<#assign tgtValue = fieldSpec.value + ""/>
	<#else>
		<#assign tgtValue = tgtValue + ""/>
	</#if>
	
	<#if fieldSpec.valuesMapping?keys?size gt 2>
		<select class="form-control"<#if fieldSpec.interactionMode=="disabled"> disabled="disabled"</#if> id="${fieldId}">
		<#list fieldSpec.valuesMapping?keys as valueKey>
		    <option value="valueKey"<#if tgtValue==valueKey> selected</#if>>${fieldSpec.valuesMapping[valueKey]}</option>
		</#list>
	  	</select>
	  	<#return>
	</#if>
	 
	 <div class="form-control<#if fieldSpec.interactionMode=="disabled"> disabled</#if>">
	 <#list fieldSpec.valuesMapping?keys as valueKey>
	 	<div class="form-check-inline">
  			<label class="form-check-label">
    			<input type="radio" class="form-check-input" name="${fieldId}"
    				<#if fieldSpec.interactionMode=="disabled"> disabled="disabled"</#if>
    				<#if tgtValue==valueKey> checked</#if> />${fieldSpec.valuesMapping[valueKey]}
  			</label>
		</div>
	 </#list>
	 </div>
</#macro>
<#macro MULTI_SELECTABLE_INPUT crSpec stepSpec eventSpec fieldSpec fieldId>
	<div class="form-control<#if fieldSpec.interactionMode=="disabled"> disabled</#if>">
	<#if fieldSpec.valuesRetrieveApi?has_content>
		<div class="form-check-inline">
  			<label class="form-check-label">
    			<input type="checkbox" class="form-check-input" value="1">后台返回的值-1
  			</label>
		</div>
		<div class="form-check-inline">
  			<label class="form-check-label">
    			<input type="checkbox" class="form-check-input" value="2">后台返回的值-2
  			</label>
		</div>
		<div class="form-check-inline">
  			<label class="form-check-label">
    			<input type="checkbox" class="form-check-input" value="3">后台返回的值-3
  			</label>
		</div>
	</div>
		<#return>
	</#if>
	<#list fieldSpec.valuesMapping?keys as valueKey>
	 	<div class="form-check-inline">
  			<label class="form-check-label">
    			<input type="checkbox" class="form-check-input" name="${fieldId}"
    				<#if fieldSpec.interactionMode=="disabled"> disabled="disabled"</#if>
    				/>${fieldSpec.valuesMapping[valueKey]}
  			</label>
		</div>
	 </#list>
	 </div>
</#macro>
<#macro STRING_FIELD_INPUT crSpec stepSpec eventSpec fieldSpec fieldId>
	<#if fieldSpec.interactionMode=="input">
		<input class="form-control" 
				type="text" 
				<#if fieldSpec.placeholder??>placeholder="${fieldSpec.placeholder}"</#if>
				id="${fieldId}" />
	</#if>
	<#if fieldSpec.interactionMode=="disabled">
		<input class="form-control disabled" 
				type="text" 
				disabled="disabled"
				value="${fieldSpec.value!fieldSpec.placeholder}"
				id="${fieldId}" />
	</#if>
</#macro>
<#macro LONGTEXT_FIELD_INPUT crSpec stepSpec eventSpec fieldSpec fieldId>
	<#if fieldSpec.interactionMode=="input">
		<textarea class="form-control" 
				type="text" 
				<#if fieldSpec.placeholder??>placeholder="${fieldSpec.placeholder}"</#if>
				id="${fieldId}"></textarea>
	</#if>
	<#if fieldSpec.interactionMode=="disabled">
		<textarea class="form-control disabled" 
				type="text" 
				disabled="disabled"
				value="${fieldSpec.value!fieldSpec.placeholder}"
				id="${fieldId}" ></textarea>
	</#if>
</#macro>
<#macro MONEY_FIELD_INPUT crSpec stepSpec eventSpec fieldSpec fieldId>
<div class="input-group mb-3">
    <div class="input-group-prepend">
      	<span class="input-group-text">$</span>
    </div>
	<#if fieldSpec.interactionMode=="input">
		<input class="form-control" 
				type="number" min="0.00" max="10000.00" step="0.01"
				<#if fieldSpec.placeholder??>placeholder="${fieldSpec.placeholder}"</#if>
				id="${fieldId}" />
	</#if>
	<#if fieldSpec.interactionMode=="disabled">
		
			<input class="form-control disabled" 
				type="number" min="0.00" max="10000.00" step="0.01"
				disabled="disabled"
				value="${fieldSpec.value!fieldSpec.placeholder}"
				id="${fieldId}" />
		
	</#if>
</div>
</#macro>
<#macro DATE_FIELD_INPUT crSpec stepSpec eventSpec fieldSpec fieldId>
	<#if fieldSpec.interactionMode=="input">
		<div class="input-group input_date mb-3">
  			<input type="text" class="form-control" data-provide="datepicker" <#if fieldSpec.placeholder??>placeholder="${fieldSpec.placeholder}"</#if>>
  			<div class="input-group-append">
    			<span class="input-group-text"><i class="fa fa-calendar" aria-hidden="true"></i></span>
  			</div>
		</div>
       <#return>
    </#if>
    <#if fieldSpec.interactionMode=="disabled">
		<div class="input-group input_date mb-3">
  			<input type="text" class="form-control" data-provide="datepicker" disabled="disabled" value="${fieldSpec.value!}">
  			<div class="input-group-append">
    			<span class="input-group-text"><i class="fa fa-calendar" aria-hidden="true"></i></span>
  			</div>
		</div>
       <#return>
    </#if>
</#macro>
<#macro TIME_FIELD_INPUT crSpec stepSpec eventSpec fieldSpec fieldId>
	<#if fieldSpec.interactionMode=="input">
		<div class="input-group input_date mb-3">
  			<input type="text" class="form-control" data-provide="timepicker" <#if fieldSpec.placeholder??>placeholder="${fieldSpec.placeholder}"</#if>>
  			<div class="input-group-append">
    			<span class="input-group-text"><i class="fa fa-clock-o" aria-hidden="true"></i></span>
  			</div>
		</div>
       <#return>
    </#if>
    <#if fieldSpec.interactionMode=="disabled">
		<div class="input-group input_date mb-3">
  			<input type="text" class="form-control" data-provide="timepicker" disabled="disabled" value="${fieldSpec.value}">
  			<div class="input-group-append">
    			<span class="input-group-text"><i class="fa fa-clock-o" aria-hidden="true"></i></span>
  			</div>
		</div>
       <#return>
    </#if>
</#macro>
<#macro IMAGES_FIELD_INPUT crSpec stepSpec eventSpec fieldSpec fieldId>
	<#if fieldSpec.interactionMode=="input">
		<input class="form-control" 
				type="file" 
				<#if fieldSpec.placeholder??>placeholder="${fieldSpec.placeholder}"</#if>
				id="${fieldId}" />
	</#if>
	<#if fieldSpec.interactionMode=="disabled">
		<img src="${fieldSpec.value!}" class="rounded-circle"/>
	</#if>
</#macro>