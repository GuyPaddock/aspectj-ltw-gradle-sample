package com.rosieapp.aop.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An aspect for logging a query-string parameter to the log in our sample service.
 *
 * <p>This is a direct port of the aspect provided by
 * <a href="https://github.com/gkatzioura/egkatzioura.wordpress.com/tree/master/SpringAspectOrientation">
 * Emmanouil Gkatziouras</a> into native AspectJ syntax.</p>
 *
 * @author Emmanouil Gkatziouras (gkatzioura@gmail.com)
 * @author Guy Elsmore-Paddock (guy@rosieapp.com)
 */
public aspect SampleServiceAspect {
  private static final Logger LOGGER = LoggerFactory.getLogger(SampleServiceAspect.class);

  before(String sampleName) :
    execution(* com.rosieapp.aop.service.SampleService.createSample (java.lang.String)) &&
    args(sampleName) {
      LOGGER.info("A request was issued for a sample name: " + sampleName);
  }
}
