package com.rosieapp.aop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.EnableLoadTimeWeaving.AspectJWeaving;

/**
 * A Spring configuration that ensures that Load-Time Weaving is always on.
 *
 * <p>Based on Justin Wilson's blog article,
 * <a href="https://www.credera.com/blog/technology-insights/open-source-technology-insights/aspect-oriented-programming-in-spring-boot-part-3-setting-up-aspectj-load-time-weaving/">
 * Aspect-Oriented Programming in Spring Boot Part 3: Setting up AspectJ Load-Time Weaving</a>.
 * Unfortunately, the blog article indicates that an exception will be thrown automatically if
 * {@code AspectJWeaving.ENABLED}</code> is passed and {@code aop.xml} is missing; this does not
 * seem to be the case.</p>
 *
 * @author Guy Elsmore-Paddock (guy@rosieapp.com)
 */
@Configuration
@EnableLoadTimeWeaving(aspectjWeaving = AspectJWeaving.ENABLED)
public class AspectJConfig {
}
