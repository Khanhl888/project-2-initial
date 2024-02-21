package com.csc205.project2;

public class Cone extends Shape {

    private double height;
    private double radius;

    public Cone() {
        super();
        this.height = 0.0;
        this.radius = 0.0;
    }

    public Cone(double height, double radius) {
        super();
        this.height = radius;
        this.radius = height;
    }

    public double getHeight(){
        return height;
    }
    public double getRadius(){
        return radius;
    }

    public void setHeight(double height){
        this.height=height;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double surfaceArea(){
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + slantHeight);
    }

    public double volume(){
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cone{");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
