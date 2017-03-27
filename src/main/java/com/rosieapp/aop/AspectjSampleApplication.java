package com.rosieapp.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * A simple Spring Boot Application for playing with AspectJ.
 *
 * <p>Originally written by
 * <a href="https://github.com/gkatzioura/egkatzioura.wordpress.com/tree/master/SpringAspectOrientation">
 * Emmanouil Gkatziouras</a>.</p>
 *
 * @author Emmanouil Gkatziouras (gkatzioura@gmail.com)
 * @author Guy Elsmore-Paddock (guy@rosieapp.com)
 */
@SpringBootApplication
public class AspectjSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AspectjSampleApplication.class, args);
	}
}
