package org.rekdev.shapes;

public abstract class Shape implements Named, Movable {
  
  private String name;
  
  public Shape() {
  }
  
  public Shape(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
  
  public abstract void move(double deltaX, double deltaY );
}
