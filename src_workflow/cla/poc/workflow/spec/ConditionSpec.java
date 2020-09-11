package cla.poc.workflow.spec;

import java.util.List;

public class ConditionSpec extends BaseSpec{
    String transferType;
    List<String> targetStatusCode;

    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    public List<String> getTargetStatusCode() {
        return targetStatusCode;
    }

    public void setTargetStatusCode(List<String> targetStatusCode) {
        this.targetStatusCode = targetStatusCode;
    }
}
