package cn.itcast.annotation;

import java.lang.annotation.*;

@Target(value = {ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})//描述注解的使用位置
@Retention(RetentionPolicy.RUNTIME)//描述注解的使用时间
@Documented
@Inherited
public @interface MyAnno4 {
}
