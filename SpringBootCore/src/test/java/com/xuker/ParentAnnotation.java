package com.xuker;

import java.lang.annotation.*;

/**
 * @Author:XuKe
 * @CreateOn:2019-01-08 14:12
 * @Email ：wxk1035@gmail.com
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value= ElementType.TYPE)
@Inherited
public @interface ParentAnnotation {
    public String out() default "";
}
