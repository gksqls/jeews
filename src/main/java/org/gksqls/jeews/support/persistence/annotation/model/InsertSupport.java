package org.gksqls.jeews.support.persistence.annotation.model;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Insert SQL
 * @author G.N.E
 *
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface InsertSupport {
	
	/**
	 * SQL ID
	 * @return
	 */
	String value() default "";
	
	/**
	 * return entity
	 * @return T
	 */
	Class<?> result();
	
}
