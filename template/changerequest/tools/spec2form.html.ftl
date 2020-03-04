<!DOCTYPE html>
<html lang="en" slick-uniqueid="3">
<head>
    <title>${projectSpec.name} CR form</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
  	<script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
  	<script src="https://cdn.staticfile.org/popper.js/1.15.0/umd/popper.min.js"></script>
  	<script src="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>

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
	border: 1px solid red;
}
</style>

</head>
<body>
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
				<div class="event_container">
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
</body>
</html>

<#macro CR_HEADER crSpec>
	<h2>${crSpec.title}</h2>
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
</#macro>
<#macro STEP_FOOTER crSpec stepSpec>
</#macro>
<#macro EVENT_HEADER crSpec stepSpec eventSpec>
	<@compress single_line=true>
	<h4 style="display:inline;">${eventSpec.title}
		<#if eventSpec.mustHave><span style="color:red;">*</span></#if>
	</h4>(${eventSpec.name}:${eventSpec.eventType})<#if eventSpec.multiple>
			[${eventSpec.minimalNumber!}~${eventSpec.maximumNumber!}]
		</#if>
	</@compress>
</#macro>
<#macro EVENT_FOOTER crSpec stepSpec eventSpec>
	<hr></hr>
</#macro>
<#macro FIELD crSpec stepSpec eventSpec fieldSpec>
</#macro>
