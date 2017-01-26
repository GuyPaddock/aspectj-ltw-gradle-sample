package com.rosieapp.aop.service;

import com.rosieapp.aop.model.Sample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author Guy Paddock (guy@redbottledesign.com)
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
