
import java.io.*;
import java.util.*;

class Assignment
{
    static final String NO_CARD_DEALT= "No card is dealt. Resuffle dake";   
    Set<String> cardSet;
    static String card[] = new String[52];
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br; 
        Assignment code;
        
        br = new BufferedReader(new InputStreamReader(System.in));
        code = new Assignment();
        code.initCard(card);
        System.out.println("1 : shuffle ");
        System.out.println("2 : dealtone card ");
        System.out.println(" Any other key to exit "); 
        
        while(true){
          
           System.out.println(" Enter the choice ");    
            int choice;
            try{
                choice = Integer.parseInt(br.readLine());     
            }catch(Exception e){
                System.out.println("Exiting...!");
                break;
            }
           
           
           switch(choice){
               case 1:
                 card =  code.shuffle(card);
                 code.displayCrad();
                 break; 
               case 2:
                 System.out.println(" card return "+code.dealOneCard());
                 break;     
               default :
                   System.out.println("Exiting...!");
                break;
           }
        }
       
    }
    
    public String[] shuffle(String[] card){
        cardSet = new HashSet();
        for(int i = 0; i< card.length; i++){
           cardSet.add(card[i]); 
        }
        
        card = cardSet.toArray(new String[cardSet.size()]);
        
        for(int i =0; i<card.length; i++){
            int randNum = (int) ((Math.random() * 997)%(card.length-1));
            swapCard(card,i,randNum);
        }
        return card;
    }
    
    public void swapCard(String[] card, int originalPos, int newPos){
        String temp = card[originalPos];
        card[originalPos] = card[newPos];
        card[newPos]  = temp;
    }
    
    String dealOneCard(){
        if(cardSet.isEmpty()){
            return NO_CARD_DEALT;
        }
        String crd=null;
        int randNum = (int) ((Math.random() * 997)%(card.length-1));
        while(true){
            crd = card[randNum];
            if(!cardSet.contains(crd)){
              randNum = (randNum+1)%(card.length);   
            }else{
                cardSet.remove(crd);
                break;
            }    
        }
        
        return crd;
        
    }
    
    
    private void displayCrad(){
        for(String crd: card){
            System.out.println(" "+crd);
        }
    }
    
    private void initCard(String[] card){
    	card [1] = "Ace of Spades";
    	card [2] = "2 of Spades";
    	card [3] = "3 of Spades";
    	card [4] = "4 of Spades";
    	card [5] = "5 of Spades";
    	card [6] = "6 of Spades";
    	card [7] = "7 of Spades";
    	card [8] = "8 of Spades";
    	card [9] = "9 of Spades";
    	card [10] = "10 of Spades";
    	card [11] = "Jack of Spades";
    	card [12] = "Queen of Spades";
    	card [13] = "King of Spades";
    	card [14] = "Ace of Hearts";
    	card [15] = "2 of Hearts";
    	card [16] = "3 of Hearts";
    	card [17] = "4 of Hearts";
    	card [18] = "5 of Hearts";
    	card [19] = "6 of Hearts";
    	card [20] = "7 of Hearts";
    	card [21] = "8 of Hearts";
    	card [22] = "9 of Hearts";
    	card [23] = "10 of Hearts";
    	card [24] = "Jack of Hearts";
    	card [25] = "Queen of Hearts";
    	card [26] = "King of Hearts";
    	card [27] = "Ace of Diamonds";
    	card [28] = "2 of Diamonds";
    	card [29] = "3 of Diamonds";
    	card [30] = "4 of Diamonds";
    	card [31] = "5 of Diamonds";
    	card [32] = "6 of Diamonds";
    	card [33] = "7 of Diamonds";
    	card [34] = "8 of Diamonds";
    	card [35] = "9 of Diamonds";
    	card [36] = "10 of Diamonds";
    	card [37] = "Jack of Diamonds";
    	card [38] = "Queen of Diamonds";
    	card [39] = "King of Diamonds";
    	card [40] = "Ace of Clubs";
    	card [41] = "2 of Clubs";
    	card [42] = "3 of Clubs";
    	card [43] = "4 of Clubs";
    	card [44] = "5 of Clubs";
    	card [45] = "6 of Clubs";
    	card [46] = "7 of Clubs";
    	card [47] = "8 of Clubs";
    	card [48] = "9 of Clubs";
    	card [49] = "10 of Clubs";
    	card [50] = "Jack of Clubs";
    	card [51] = "Queen of Clubs";
    	card [0] = "King of Clubs";
    }
}