/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myonlineshop;

/**
 *
 * @author cm
 */
public class MyOnlineShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product [] products = {
            new ChildBook(3) , 
            new ChildBook(3.2) ,
            new ChildBook(4) ,
            new ChildBook(5) ,
            new ChildBook(6) ,
            new ChildBook(7) ,
            new ChildBook(8) 
        };
        double totalPrice = 0 ; 
        for(var book :products ){
            totalPrice += book.getPrice() ;
        }
        System.out.println("The total price of books = " + totalPrice);
    }
    
}
