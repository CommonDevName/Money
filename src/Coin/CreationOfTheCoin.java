package Coin;

import java.util.ArrayList;
import static coins.Execution.dataInput;
import static coins.Execution.coinData;
import static coins.Execution.textInput;

/**
 *
 * @author CommonName(¿)
 */


public class CreationOfTheCoin {
    
   
    public static ArrayList <TypeOfCoin> ChestOfMoney = new ArrayList<>();
    
    public static void Spawner(){
        boolean question = true;
        char answer;
        
        do{
        System.out.println("\nIntroduce the type of coin.\n");
        ChestOfMoney.add(new TypeOfCoin(coinData.nextInt(),
                                        textInput.nextLine(),
                                        coinData.next().charAt(0),
                                        coinData.nextInt()));
        System.out.println("\nDo you want to add another?\n");
        answer = dataInput.next().charAt(0);
        switch(answer){
            case 'Y' ->{}
            case 'N' ->{question = false;}
        }
        }while(question);
    }
    
}
