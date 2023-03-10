/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circlecylinder;

/**
 *
 * @author cm
 */
public class Cylinder extends Circle{
    private double height=1.0;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder() {}

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    @Override
    public String toString() {
        String out = "Cylinder {radius = " + getRadius()+",height = "+getHeight() +",color = "+getColor()+"}";
        return out;
    }

    public double getVolume(){
        return getArea()*height;
    }

}

