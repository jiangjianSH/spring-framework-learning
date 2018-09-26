package com.together.learning.spring.aop.step2_pointcut_designator;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * AOP PCD(Pointcut Designator)支持的类型
 * 1. execution 格式：
 *    execution(modifiers-pattern? ret-type-pattern declaring-type-pattern?name-pattern(param-pattern)
 *             throws-pattern?)
 *  eg:
 *      //The execution of any public method
 *      execution(public * *(..))
 *
 *      //The execution of any method with a name that begins with set
 *      execution(* set*(..))
 *
 *      //The execution of any method defined by the AccountService interface
 *      execution(* com.xyz.service.AccountService.*(..))
 *
 *      //The execution of any method defined in the service package
 *      execution(* com.xyz.service.*.*(..))
 *
 *      //The execution of any method defined in the service package or one of its sub-packages
 *      execution(* com.xyz.service..*.*(..))
 *
 * 2.within格式:
 * eg:
 *   //Any join point (method execution only in Spring AOP) within the service package
 *   within(com.xyz.service.*)
 *
 *   //Any join point (method execution only in Spring AOP) within the service package or one of its sub-packages
 *   within(com.xyz.service..*)
 *
 * 3. this格式:
 * eg:
 *   //Any join point (method execution only in Spring AOP) where the proxy implements
 *   the AccountService interface
 *   this(com.xyz.service.AccountService)
 *
 * 4. target格式:
 * eg:
 *   //Any join point (method execution only in Spring AOP)
 *   where the target object implements the AccountService interface
 *
 *   target(com.xyz.service.AccountService)
 *
 * 5. args 格式：
 * eg:
 *  //Any join point (method execution only in Spring AOP) that takes a single
 *  parameter and where the argument passed at runtime is Serializable
 *
 *  args(java.io.Serializable)
 *
 *  NOTE: Note that the pointcut given in this example is different from execution(* *(java.io.Serializable)).
 *  The args version matches if the argument passed at runtime is Serializable, and the execution
 *  version matches if the method signature declares a single parameter of type Serializable.
 *
 * 6. @target 格式：
 * eg:
 *   //Any join point (method execution only in Spring AOP) where the target object
 *   has a @Transactional annotation
 *
 *   @target(org.springframework.transaction.annotation.Transactional)
 *
 * 7. @with 格式：
 * eg:
 *     //Any join point (method execution only in Spring AOP) where
 *     the declared type of the target object has an @Transactional annotation
 *     @within(org.springframework.transaction.annotation.Transactional)
 *
 * 8. @annotation 格式：
 *   //Any join point (method execution only in Spring AOP) where the
 *   executing method has an @Transactional annotation
 *   @annotation(org.springframework.transaction.annotation.Transactional)
 *
 * 9. @args 格式:
 * eg:
 *  //Any join point (method execution only in Spring AOP) which takes a
 *  single parameter, and where the runtime type of the argument passed
 *  has the @Classified annotation
 *  @args(com.xyz.security.Classified)
 *
 * 10. bean 格式(spring aop拓展支持的PCD):
 * eg:
 *    //Any join point (method execution only in Spring AOP) on a Spring bean named tradeService
 *    bean(tradeService)
 *
 *    //Any join point (method execution only in Spring AOP) on Spring beans
 *    having names that match the wildcard expression *Service
 *    bean(*Service)
 *
 *
 * @author jiangjian
 */
@Aspect
@Component
public class PointcutDesignator {
    @Pointcut("execution(public java.lang.Integer com.together.learning.spring.aop.step2_pointcut_designator.A.add(..))")
    public void executionPointcut() {}

    @Around("executionPointcut()")
    public void around4ExecutionPCD(ProceedingJoinPoint joinPoint) throws Throwable {
        doProcess(joinPoint, "execution");
    }

    @Pointcut("within(com.together.learning.spring.aop.step2_pointcut_designator.subpackag1.*)")
    public void withPointcut() {}

    @Around("withPointcut()")
    public void around4withPCD(ProceedingJoinPoint joinPoint) throws Throwable {
        doProcess(joinPoint, "with");
    }

    @Pointcut("this(com.together.learning.spring.aop.step2_pointcut_designator.D)")
    public void thisPointcut(){}

    @Around("thisPointcut()")
    public void around4thisPCD(ProceedingJoinPoint joinPoint) throws Throwable {
        doProcess(joinPoint, "this");
    }

    @Pointcut("target(com.together.learning.spring.aop.step2_pointcut_designator.Display)")
    public void targetPointcut(){}

    @Around("targetPointcut()")
    public void around4targetPCD(ProceedingJoinPoint joinPoint) throws Throwable {
        doProcess(joinPoint, "target");
    }

    @Pointcut("args(com.together.learning.spring.aop.step2_pointcut_designator.Storage)")
    public void argsPointcut(){}

    @Around("argsPointcut()")
    public void around4argsPCD(ProceedingJoinPoint joinPoint) throws Throwable {
        doProcess(joinPoint, "args");
    }

    /**
     * 注意对应的注解应该是: @Retention(RetentionPolicy.RUNTIME)
     */
    @Pointcut("@target(com.together.learning.spring.aop.step2_pointcut_designator.Lucky)")
    public void atTargetPoint() {}

    @Around("atTargetPoint()")
    public void around4atTargetPCD(ProceedingJoinPoint joinPoint) throws Throwable {
        doProcess(joinPoint, "@target");
    }

    /**
     * @within 和@target的区别如下:
     * Difference is in retention policy requirements
     *
     * This is a good question. One difference between the two is that @within()
     * is matched statically, requiring the corresponding annotation type to have
     * only the CLASS retention. Whereas, @target() is matched at runtime,
     * requiring the same to have the RUNTIME retention. Other than that,
     * within the context of Spring, there is no difference between the join points selected by two.
     */
    @Pointcut("@within(com.together.learning.spring.aop.step2_pointcut_designator.Unlucky)")
    public void atWithinPoint() {}

    @Around("atWithinPoint()")
    public void around4atWithinPCD(ProceedingJoinPoint joinPoint) throws Throwable {
        doProcess(joinPoint, "@within");
    }

    @Pointcut("@annotation(com.together.learning.spring.aop.step2_pointcut_designator.Lucky)")
    public void atAnnotationPoint() {}

    @Around("atAnnotationPoint()")
    public void around4atAnnotationPCD(ProceedingJoinPoint joinPoint) throws Throwable {
        doProcess(joinPoint, "@annotation");
    }

    /**
     * 指定的注解得定义在参数的实体上面
     */
    @Pointcut("@args(com.together.learning.spring.aop.step2_pointcut_designator.Lucky)")
    public void atArgsPoint() {}

    @Around("atArgsPoint()")
    public void around4atArgsPCD(ProceedingJoinPoint joinPoint) throws Throwable {
        doProcess(joinPoint, "@args");
    }

    @Pointcut("bean(k)")
    public void atBeanPoint() {}

    @Around("atBeanPoint()")
    public void around4BeanPCD(ProceedingJoinPoint joinPoint) throws Throwable {
        doProcess(joinPoint, "bean");
    }

    public void doProcess(ProceedingJoinPoint joinPoint, String pcd) throws Throwable {
        System.out.println("\n--------------");
        System.out.println("target on " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName()
                + " using 【" + pcd + "】 pointcut");
        joinPoint.proceed();
        System.out.println("--------------\n");
    }
}
