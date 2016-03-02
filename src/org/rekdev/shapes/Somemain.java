package org.rekdev.shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Somemain {
  public static final Logger logger = Logger.getLogger("org.rekdev.shapes");

  public static void main(String[] args) throws Exception {
    
    FileHandler fileHandler = new FileHandler("log/somemain.log");
    fileHandler.setLevel(Level.ALL);
    ConsoleHandler consoleHandler = new ConsoleHandler();
    consoleHandler.setLevel(Level.INFO);
    
    logger.addHandler(fileHandler);
    logger.addHandler(consoleHandler);
    
    logger.setLevel(Level.ALL);
    
    logger.info("I am in main");
    
    List<Point> points = new ArrayList<Point>();
    Line line = null;

    line = makeLine(null);

    line = Somemain.makeLine(points);
    
    points.add(new Point(0.0, 0.0));
    points.add(new Point(0.0, 1.0));
    line = makeLine(points);
  }

  private static Line makeLine(List<Point> points) {
    try {
      Line line = new Line(points);
      System.out.println("line is " + line);
      return line;
    } catch (MyIllegalArgumentException e) {
      e.printStackTrace();
    }
    return null;
  }

}
