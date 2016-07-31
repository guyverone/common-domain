package common.domain.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>GreaterOrEqual Annotation。</p>
 *
 * usage：
 * <br><tt>such as：@GreaterOrEqual</tt> default, value must greater than or be equal of 0.</br>
 * <br><tt>such as：GreaterOrEqual(100)</tt> value must greater than or be equal of 100.</br>
 *
 * <p>Created by suhd on 2016-07-29.</p>
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface GreaterOrEqual {
    int value() default 0;
}
