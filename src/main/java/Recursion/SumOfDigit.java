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
public class SumOfDigit {
    static int sum(int n){
        if(n<=0){return n;}
    return n%10 + sum(n/10);
    }
    public static void main(String args[]){
    
    System.out.println(sum(32));
    }
    
}
