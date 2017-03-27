package com.rosieapp.aop.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;

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
