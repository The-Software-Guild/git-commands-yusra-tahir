/**
 *
 * @author Yusra
 * email: yusra-tahir@hotmail.co.uk
 * date: 12-10-2022
 */
package com.sg.foundations.flowcontrol.ifs;

public class LlamasWhalesAndDodosOhMy {
    
    public static void main(String[] args) {
    int llamas = 20;
    int whales = 15;
    int dodos = 0;
    
    if(dodos > 0) {
        System.out.println("Egads, I thought dodos were extinct!");
        }
    
    if(dodos < 0) {
        System.out.println("Whales may be bigger, but llamas are better, ha!");
        }
    
    if(llamas > whales){
            System.out.println("Whales may be bigger, but llamas are better, ha!");
        }
    
    if(llamas <= whales) {
       System.out.println("Aw man, brawn over brains I guess. Whales beat llamas");
        }
    
    System.out.println("There's been a huge increase in the dodo population via cloning!");
    
    dodos += 5;

    if( (whales + llamas) < dodos){
            System.out.println("I never thought I'd see the day when dodos ruled the earth.");
        }

    if(llamas > whales && llamas > dodos){
            System.out.println("I don't know how, but the llamas have come out ahead! Sneaky!");
        }
    
    }
    
}
