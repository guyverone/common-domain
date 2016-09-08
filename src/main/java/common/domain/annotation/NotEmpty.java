package common.domain.annotation;

import common.domain.finance.EnumUsedBusinessType;

import java.lang.annotation.*;

/**
 * <p>NotEmpty Annotation。</p>
 *
 * usage：
 * <br><tt>such as：@NotEmpty</tt> no specify parameter, then the value must be not empty.</br>
 * <br><tt>such as：@NotEmpty(EnumUsedBusinessType.TYPEA)</tt> only EnumUsedBusinessType.TYPEA type of Object needed to be validating.</br>
 * <br><tt>such as：@NotEmpty(exclusion={EnumUsedBusinessType.TYPEA})</tt> EnumUsedBusinessType.TYPEA type of Object won't be validating.</br>
 *
 * <p>Created by suhd on 2016-07-29.</p>
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NotEmpty {
    EnumUsedBusinessType[] value() default EnumUsedBusinessType.EMPTY;
    EnumUsedBusinessType[] exclusion() default EnumUsedBusinessType.EMPTY;
}
