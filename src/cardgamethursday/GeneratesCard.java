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
public class GeneratesCard {
    private int numberofcards = 60;
   CardGameThursday [] deck= new CardGameThursday [numberofcards];
                                           //array of object declaration
   
   //array for generate 60 card in array
  
   public void generatearray(){
       int count = 0;
       for(CardGameThursday. Color s:CardGameThursday. Color.values()){
            
           for(CardGameThursday.Value v:CardGameThursday.Value.values()){
                deck[count] = new CardGameThursday(s,v);//constructor
   
                count++;
                 //System.out.println(deck[count].getSuit()+""+deck[count].getValue());
           
           }
                   
       
       }

    }
    
}
