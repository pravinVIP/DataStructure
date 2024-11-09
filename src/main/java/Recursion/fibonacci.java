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
public class fibonacci {
    static int fibonacci(int n){
    if(n<0){return -1;}
    else if(n==0||n==1){return n;}
    else{return fibonacci(n-1)+fibonacci(n-2);}
    }
    public static void main(String arg[]){
    System.out.println(fibonacci(4));
    
    }
}
