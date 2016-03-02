package org.rekdev.shapes;

import java.util.logging.Logger;

public class Point extends Shape {
  private double x;
  private double y;
  
  private static final Logger logger = Logger.getLogger("org.rekdev.shapes");
  
  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  @Override
  public void move(double deltaX, double deltaY) {
    x += deltaX;
    y += deltaY;
  }
  
  public static void bob() {}
}
