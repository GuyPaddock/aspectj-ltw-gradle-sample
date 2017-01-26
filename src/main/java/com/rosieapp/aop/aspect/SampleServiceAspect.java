package com.rosieapp.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by gkatzioura on 5/28/16.
 */
@Aspect
@Component
public class SampleServiceAspect {
  private static final Logger LOGGER = LoggerFactory.getLogger(SampleServiceAspect.class);

  @Before("execution(* com.rosieapp.aop.service.SampleService.createSample (java.lang.String)) && args(sampleName)")
  public void beforeSampleCreation(String sampleName) {
      LOGGER.info("A request was issued for a sample name: "+sampleName);
  }
}
