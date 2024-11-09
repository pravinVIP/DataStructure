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
public class factorial {
    static int factorial(int n){
        if(n<0){return -1;}
        else if(n==0||n==1){return 1;}
        else { return n*factorial(n-1);}
    }
    public static void main(String args[]){
    System.out.println(factorial(4));
    }
}
