package org.rekdev.shapes;

import java.util.List;
import java.util.logging.Logger;

public class Line extends Shape {
  private Point p1;
  private Point p2;

  private static Logger logger = Logger.getLogger("org.rekdev.shapes");

  public Line(List<Point> points) throws MyIllegalArgumentException {
    if (points == null || (points.size() != 2)) {
      MyIllegalArgumentException e =
          new MyIllegalArgumentException("we are expecting exactly two points");
      logger.warning("Throwing " + e);
      throw e;
    }
    logger.fine("I'm here");
    this.p1 = points.get(0);
    this.p2 = points.get(1);
  }

  public Line(Point p1, Point p2) {
    this.p1 = p1;
    this.p2 = p2;
  }

  public void move(double deltaX, double deltaY) {
    this.p1.move(deltaX, deltaY);
    this.p2.move(deltaX, deltaY);
  }

}
