package cn.itcast.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@Pro2(className ="cn.itcast.annotation.Demo1",methodName ="show" )
public class RefkectTest2 {
    public static void main(String[] args) throws Exception {
        Class cl=RefkectTest2.class;
        Pro2 pro2= (Pro2) cl.getAnnotation(Pro2.class);
        String className=pro2.className();
        String methodName=pro2.methodName();
        System.out.println(className+"111111");
        System.out.println(methodName+"22222");

    Class demo1=Class.forName(className);
    Method show=demo1.getMethod(methodName);
    Object o=demo1.newInstance();
        show.invoke(o);
}
}
