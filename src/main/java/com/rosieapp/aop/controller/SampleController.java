package com.rosieapp.aop.controller;

import com.rosieapp.aop.model.Sample;
import com.rosieapp.aop.service.SampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A simple REST controller.
 *
 * <p>This exposes a single resource, {@code /sample}, which can take an optional
 * {@code sampleName} query string parameter.</p>
 *
 * <p>Originally written by
 * <a href="https://github.com/gkatzioura/egkatzioura.wordpress.com/tree/master/SpringAspectOrientation">
 * Emmanouil Gkatziouras</a>.</p>
 *
 * @author Emmanouil Gkatziouras (gkatzioura@gmail.com)
 * @author Guy Elsmore-Paddock (guy@rosieapp.com)
 */
@RestController
public class SampleController {
  @Autowired
  private SampleService sampleService;

  @RequestMapping("/sample")
  public Sample sample(String sampleName) {
      return sampleService.createSample(sampleName);
  }
}
