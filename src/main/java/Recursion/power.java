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
//2 power 5= 2*2*2*2*2
public class power {
    static int pow(int base,int exp){
    if(exp==0){return 1;}
    return base * pow(base,exp-1);
        
    }
    public static void main(String arg[]){
    System.out.println(pow(2,2));
    }
}
