/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circlecylinder;

/**
 *
 * @author cm
 */
public class Circlecylinder {

    public static void main(String[] args) {

        Cylinder obj = new Cylinder();
        obj.setColor("blue");
        obj.setRadius(2.0);
        System.out.println(obj.getArea());
        obj.toString();


        obj.setColor("black");
        obj.setHeight(4.0);
        System.out.println(obj.getVolume());
        obj.toString();
    }
}