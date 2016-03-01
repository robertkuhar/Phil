package org.rekdev.shapes;

public class Line extends Shape {
  private Point p1;
  private Point p2;
  
  public Line(Point p1, Point p2) {
    this.p1 = p1;
    this.p2 = p2;
  }
  
  public void move(double deltaX, double delataY) {
    p1.move(deltaX, delataY);
    p2.move(deltaX, delataY);
  }

}
