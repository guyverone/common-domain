package common.domain.finance;


import common.domain.annotation.Greater;
import common.domain.annotation.Label;
import common.domain.annotation.NotEmpty;

import java.math.BigDecimal;

/**
 * <p>Detail Class</p>
 *
 * <p>Created by suhd on 2016-07-26.</p>
 */
public class Detail {

    @NotEmpty(EnumUsedBusinessType.TYPEB)@Label("crmId")
    private String crmId;
    @NotEmpty@Label("crmName")
    private String crmName;

    private String subcmpId;
    private String subcmpName;

    @NotEmpty@Greater(0)@Label("amount")
    private BigDecimal amount;

    public String getCrmId() {
        return crmId;
    }

    public void setCrmId(String crmId) {
        this.crmId = crmId;
    }

    public String getCrmName() {
        return crmName;
    }

    public void setCrmName(String crmName) {
        this.crmName = crmName;
    }

    public String getSubcmpId() {
        return subcmpId;
    }

    public void setSubcmpId(String subcmpId) {
        this.subcmpId = subcmpId;
    }

    public String getSubcmpName() {
        return subcmpName;
    }

    public void setSubcmpName(String subcmpName) {
        this.subcmpName = subcmpName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
