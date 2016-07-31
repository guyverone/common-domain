package common.domain.finance;

/**
 * <p>Type Class</p>
 *
 * <p>Identifying the kind of Master for validating</p>
 *
 * <p>Created by suhd on 2016-07-29.</p>
 */
public enum EnumUsedBusinessType {
    TYPEA("type_a"),
    TYPEB("type_b"),
    EMPTY("");

    private String typeValue;

    EnumUsedBusinessType(String typeValue) {
        this.typeValue = typeValue;
    }

    public String getType() {
        return this.typeValue;
    }
}
