//extra Credit: generate me a Cube class with width and have the methods to
// generate surfaceArea and volume and only use return in those methods

package com.csc205.project2;

public class Cube extends Shape {
    private double width;

    public Cube() {
        super();
        this.width=0.0;
    }

  public Cube(double width){
        super();
        this.width= width;
    }

   public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width=width;
    }

    public double surfaceArea(){
     return (6 * Math.pow(width,2));
    }

    public double volume(){
        return Math.pow(width,3);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube{");
        sb.append("Width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }


}
