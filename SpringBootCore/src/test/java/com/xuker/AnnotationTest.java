package com.xuker;

import java.util.Arrays;

/**
 * @Author:XuKe
 * @CreateOn:2019-01-08 14:09
 * @Email ：wxk1035@gmail.com
 */
public class AnnotationTest {
    public static void main(String[] args) {
        Class<Sub> clazz = Sub.class;
        System.out.println("================注解==============");
        //注解ChildAnnotation是否存在于元素上
        System.out.println(clazz.isAnnotationPresent(ChildAnnotation.class));
        //如果存在该元素的指定类型的注解ChildAnnotation，则返回这些注释，否则返回 null。
        System.out.println(clazz.getAnnotation(ChildAnnotation.class));
        //继承
        System.out.println(Arrays.toString(clazz.getAnnotations()));
        //自身
        System.out.println(Arrays.toString(clazz.getDeclaredAnnotations()));
    }
}
@ParentAnnotation
class Super{
    private int superPrivateParam;
    public int superPublicParam;

    public Super(){
    }

    private int superPrivateParam(){
        return 0;
    }
    public int superPublicParam(){
        return 0;
    }
    public  String out(){
        System.out.println("666");
        return "";
    }
}

@ChildAnnotation
class Sub extends Super{
    private int subPrivateParam;
    public int subPublicParam;

    private Sub(){
    }
    public Sub(int i){
    }

    private int superPrivateParam(){
        return 0;
    }
    public int superPublicParam(){
        return 0;
    }
}