package com.rosieapp.aop.service;

import com.rosieapp.aop.model.Sample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * A simple Spring service.
 *
 * <p>Originally written by
 * <a href="https://github.com/gkatzioura/egkatzioura.wordpress.com/tree/master/SpringAspectOrientation">
 * Emmanouil Gkatziouras</a>.</p>
 *
 * @author Emmanouil Gkatziouras (gkatzioura@gmail.com)
 * @author Guy Elsmore-Paddock (guy@rosieapp.com)
 */
@Service
public class SampleService {
  private static final Logger LOGGER = LoggerFactory.getLogger(SampleService.class);

  public Sample createSample(String sampleName) {
    LOGGER.info("Sample is being fetched.");

    Sample sample = new Sample();
    sample.setName(sampleName);

    return sample;
  }
}
