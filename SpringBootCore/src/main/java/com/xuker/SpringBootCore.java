package com.xuker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//此注解为组合注解
/**
 *@Target({ElementType.TYPE})--可用于类或者接口上--注解只能在ElementType设定的范围内使用，否则将会编译报错
 @Retention(RetentionPolicy.RUNTIME)--表示它所注解的注解保留多久--根据RetentionPolicy而定
 @Documented--注解表明这个注解应该被javadoc工具记录,所以注解类型信息也会被包括在生成的文档中
 @Inherited--允许子类继承父类的注解。即在两个类之间存在继承关系，且父类标记的注解使用了@Inherited注解，这时继承的子类可以使用父类的注解
 @Configuration--用于定义配置类，可替换xml配置文件
 @EnableAutoConfiguration--让springboot根据类路径中的jar包依赖为当前项目进行自动配置
 @ComponentScan--扫描当前目录下的所有类，所以启动类的位置有特殊要求
 */
@SpringBootApplication
public class SpringBootCore {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCore.class, args);
		//关闭banner
        /** SpringApplication app=new SpringApplication(SpringBootCore.class);
         *  app.setShowBanner(false);
         *  app.run(args);
         *
         */

	}

}
/**
 * @Target注解详解
 *  ------- 开始于JDK 5
 *   ElementType的用法
 *   取值	           注解使用范围
 *   METHOD	           可用于方法上
 *   TYPE	          可用于类或者接口上
 *   ANNOTATION_TYPE  可用于注解类型上（被@interface修饰的类型）
 *   CONSTRUCTOR	   可用于构造方法上
 *   FIELD	            可用于域上
 *   LOCAL_VARIABLE	    可用于局部变量上
 *   PACKAGE	       用于记录java文件的package信息
 *   PARAMETER	       可用于参数上
 */
/**
 *  @Retention
 *  可以用来修饰注解，是注解的注解，称之为元注解。
 *   可以指定不同的RetentionPolicy值来选择合适的声明周期
 *   生命周期长度 SOURCE < CLASS < RUNTIME
 *   RetentionPolicy值	           注解使用范围
 *   SOURCE	                      注解只保留在源文件中，当java文件被编译成class文件的时候注解会被遗弃.
 *   CLASS	                      注解会被保留到class文件中，当class文件被jvm加载的嘿嘿会被遗弃，这也是默认的声明周期.
 *   RUNTIME                      注解不仅会被保存到class文件中，当class文件被jvm加载后仍然会存在.

 */
/**
 *   @Configuration
 *  被注解的类内部包含有一个或多个被@Bean注解的方法，这些方法将会被
 *  AnnotationConfigApplicationContext或AnnotationConfigWebApplicationContext类进行扫描，
 *  并用于构建bean定义，初始化Spring容器。
 *    注意：@Configuration注解的配置类有如下要求：
 *      1.@Configuration不可以是final类型；
 *      2.@Configuration不可以是匿名类；
 *      3.嵌套的configuration必须是静态类。
 */