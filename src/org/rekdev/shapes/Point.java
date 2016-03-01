package org.rekdev.shapes;

public class Point extends Shape {
  private double x;
  private double y;
  
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
  public void move(double deltaX, double delataY) {
    this.x += deltaX;
    this.y += delataY;
  }

}
