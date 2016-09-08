package common.domain.finance;


import common.domain.annotation.Greater;
import common.domain.annotation.GreaterOrEqual;
import common.domain.annotation.Label;
import common.domain.annotation.NotEmpty;

import java.math.BigDecimal;

/**
 * <p>Master Class</p>
 *
 * <p>Created by suhd on 2016-07-26.</p>
 */
public class Master {

    @NotEmpty(EnumUsedBusinessType.TYPEA)@Label("companyId")
    private String companyId;
    @NotEmpty@Label("companyName")
    private String companyName;

    @NotEmpty(exclusion = EnumUsedBusinessType.TYPEB)
    private String subCmpId;
    private String subCmpName;

    @NotEmpty@Greater(0)@Label("ttlamt")
    private BigDecimal ttlamt;
    @GreaterOrEqual(0)@Label("taxRate")
    private BigDecimal taxRate;

    private EnumUsedBusinessType usedBusinessType;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSubCmpId() {
        return subCmpId;
    }

    public void setSubCmpId(String subCmpId) {
        this.subCmpId = subCmpId;
    }

    public String getSubCmpName() {
        return subCmpName;
    }

    public void setSubCmpName(String subCmpName) {
        this.subCmpName = subCmpName;
    }

    public BigDecimal getTtlamt() {
        return ttlamt;
    }

    public void setTtlamt(BigDecimal ttlamt) {
        this.ttlamt = ttlamt;
    }

    public EnumUsedBusinessType getUsedBusinessType() {
        return usedBusinessType;
    }

    public void setUsedBusinessType(EnumUsedBusinessType usedBusinessType) {
        this.usedBusinessType = usedBusinessType;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }
}
