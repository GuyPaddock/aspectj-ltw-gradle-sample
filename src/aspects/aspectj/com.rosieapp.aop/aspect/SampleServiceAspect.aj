package com.rosieapp.aop.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public aspect SampleServiceAspect {
  private static final Logger LOGGER = LoggerFactory.getLogger(SampleServiceAspect.class);

  before(String sampleName) :
    execution(* com.rosieapp.aop.service.SampleService.createSample (java.lang.String)) &&
    args(sampleName) {
      LOGGER.info("A request was issued for a sample name: " + sampleName);
  }
}
