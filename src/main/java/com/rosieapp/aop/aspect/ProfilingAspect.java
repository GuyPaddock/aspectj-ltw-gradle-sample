package com.rosieapp.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
public class ProfilingAspect {
  private static final Logger LOGGER = LoggerFactory.getLogger(ProfilingAspect.class);

  @Around("methodsToBeProfiled()")
  public Object profile(ProceedingJoinPoint pjp) throws Throwable {
      StopWatch sw = new StopWatch(getClass().getSimpleName());
      try {
          sw.start(pjp.getSignature().getName());
          return pjp.proceed();
      } finally {
          sw.stop();
          LOGGER.info(sw.prettyPrint());
      }
  }

  @Pointcut("execution(* com.rosieapp.aop.service.SampleService.createSample(java.lang.String))")
  public void methodsToBeProfiled(){}
}
