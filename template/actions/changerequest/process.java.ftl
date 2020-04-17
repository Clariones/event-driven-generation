<#if has_cr_need_process>

	protected void processChangeRequest(${custom_context_name} ctx, CafEntity changeRequest) throws Exception {
		if (!(changeRequest instanceof ChangeRequest)) {
			return;
		}
		ChangeRequestService changeRequestService = (ChangeRequestService) ctx.getBean("changeRequestService");
		changeRequestService.process(ctx, (ChangeRequest)changeRequest);
	}
</#if>