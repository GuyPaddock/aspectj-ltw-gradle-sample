package com.rosieapp.aop.model;

/**
 * A simple model for manipulation by our sample controller.
 *
 * <p>Originally written by
 * <a href="https://github.com/gkatzioura/egkatzioura.wordpress.com/tree/master/SpringAspectOrientation">
 * Emmanouil Gkatziouras</a>.</p>
 *
 * @author Emmanouil Gkatziouras (gkatzioura@gmail.com)
 * @author Guy Elsmore-Paddock (guy@rosieapp.com)
 */
public class Sample {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
