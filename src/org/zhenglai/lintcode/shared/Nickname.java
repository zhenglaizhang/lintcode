/**
 * 
 */
package org.zhenglai.lintcode.shared;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Zhenglai Zhang(zhenglaizhang@hotmail.com)
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Nickname {
	String[] value() default {};
}
