package com.ml.spring.caseOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Inside Runtime environment of JDK20
 * CaseOne : No beans.
 * @Autowired(required = true)
 * @Qualifier
 * 
 * Output :
 * 1.
 * Default constructor in ClassOne
 * Error creating bean with name 'getClassOne': Unsatisfied dependency expressed through field 'two';
 * nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException:
 * No qualifying bean of type 'com.ml.spring.ClassTwo' available: expected at least 1 bean which qualifies as autowire candidate.
 * Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true),
 * @org.springframework.beans.factory.annotation.Qualifier("")}
 * */
public class TestConfig {

    public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(com.ml.spring.caseOne.AppConfig.class);
	System.out.println("Spring Container is ready");
	((ConfigurableApplicationContext)ctx).close();
    }
}
