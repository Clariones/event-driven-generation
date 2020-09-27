package cla.poc.workflow.spec;

import clariones.tool.builder.Utils;

import java.util.HashSet;
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
        if (this.targetStatusCode == null) {
            this.targetStatusCode = targetStatusCode;
            return;
        }

        HashSet<String> tmpList = new HashSet<>(targetStatusCode);
        tmpList.removeAll(this.targetStatusCode);
        if (tmpList.isEmpty()) {
            return;
        }
        Utils.error("条件分支%s已有目标%s,与新指定的目标%s不一致", this.getName(), this.targetStatusCode, targetStatusCode);
    }
}
