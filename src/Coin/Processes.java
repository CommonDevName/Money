package Coin;

import static Coin.CreationOfTheCoin.ChestOfMoney;
import static coins.Execution.coinData;
import static coins.Execution.textInput;

/**
 *
 * @author CommonName(¿)
 */
public class Processes{
    
    public static void OpenChest(){  
    System.out.println(ChestOfMoney);
    }
    
    public static void Lava(int id){
    ChestOfMoney.remove(id-1);
    }
    
    public static void Anvil(int id){
    ChestOfMoney.set(id-1, 
                    new TypeOfCoin(coinData.nextInt(),
                                   textInput.nextLine(),
                                   coinData.next().charAt(0),
                                   coinData.nextInt()));
    }
}
