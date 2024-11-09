/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author Admin
 */


public class Num {
    static void recMethod(int n){
    if(n<1){
    System.out.println("Done");
    }
    else{
    recMethod(n-1);
    System.out.println(n);
    }
    }
    public static void main(String args[]){
    
    recMethod(10);
    }
    
}
