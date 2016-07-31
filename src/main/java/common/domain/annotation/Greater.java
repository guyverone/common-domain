package common.domain.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>Greater Annotation。</p>
 *
 * usage：
 * <br><tt>such as：@Greater</tt> default, value must greater than 0.</br>
 * <br><tt>such as：@Greater(100)</tt> value must greater 100.</br>
 *
 * <p>Created by suhd on 2016-07-29.</p>
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Greater {
    int value() default 0;
}
