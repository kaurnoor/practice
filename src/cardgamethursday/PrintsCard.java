/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgamethursday;

/**
 *
 * @author Dell
 */
public class PrintsCard {
     public static void main(String[]args){
            
            
          
            
            GeneratesCard c1 = new GeneratesCard();//object to access method generate
            
           c1.generatearray();//calls the array to generate 52 cards
           for( CardGameThursday d : c1.deck){
               System.out.println(d.getSuit()+" "+d.getValue());
           }

        }
    
}
