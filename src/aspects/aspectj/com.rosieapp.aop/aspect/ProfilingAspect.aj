package com.rosieapp.aop.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;

/**
 * An aspect for timing how long it takes to execute a method.
 *
 * <p>This is a direct port of an example in Spring's documentation on
 * <a href="https://docs.spring.io/spring/docs/current/spring-framework-reference/html/aop.html#aop-aj-ltw-first-example">
 * Aspect Oriented Programming with Spring</a> into native AspectJ syntax.</p>
 *
 * @author Guy Elsmore-Paddock (guy@rosieapp.com)
 */
public aspect ProfilingAspect {
  private static final Logger LOGGER = LoggerFactory.getLogger(ProfilingAspect.class);

  pointcut methodsToBeProfiled():
    execution(* com.rosieapp.aop.service.SampleService.createSample(java.lang.String));

  Object around() : methodsToBeProfiled() {
    StopWatch sw = new StopWatch(getClass().getSimpleName());
    try {
        sw.start(thisJoinPoint.getSignature().getName());
        return proceed();
    } finally {
        sw.stop();
        LOGGER.info(sw.prettyPrint());
    }
  }
}
