package coins;

import Coin.CreationOfTheCoin;
import Coin.Processes;
import java.util.Scanner;

/**
 *
 * @author CommonName(¿)
 */
public class Execution {
    
    public static Scanner textInput = new Scanner(System.in);
    public static Scanner coinData = new Scanner(System.in);
    public static Scanner dataInput = new Scanner(System.in);
    public static boolean question = true;
    
    public static void Running(){
        CoinMenu();
    }

    public static void CoinMenuText(){
        System.out.println("\nWelcome, please choose an option.\n"
                         + "\nAdd a coin. (1)\n"
                         + "Show the list of coins. (2)\n"
                         + "Override a coin. (3)\n"
                         + "Delete a coin. (4)\n"
                         + "Exit. (0)\n");
    }
    public static void CoinMenu(){
//Data
        int option;
//Execution
        do{
        CoinMenuText();
        option = dataInput.nextInt();
        switch(option){
            case 0->{question = false;}
            case 1->{CreationOfTheCoin.Spawner();}
            case 2->{
                if(CreationOfTheCoin.ChestOfMoney.isEmpty()){
                    System.err.println("There isn't data to be shown, please"
                                     + " introduce it.");
                    CreationOfTheCoin.Spawner();
                }else{Processes.OpenChest();}
            }
            case 3->{
                if(CreationOfTheCoin.ChestOfMoney.isEmpty()){
                    System.err.println("There isn't data to be shown, please"
                                     + " introduce it.");
                    CreationOfTheCoin.Spawner();
                }else{
                    System.out.println("Introduce the id of the coin you want to"
                     + " override");
                    Processes.Anvil(dataInput.nextInt());}
            }
            case 4->{
                if(CreationOfTheCoin.ChestOfMoney.isEmpty()){
                    System.err.println("There isn't data to be shown, please"
                                     + " introduce it.");
                    CreationOfTheCoin.Spawner();
                }else{
                    System.out.println("\nIntroduce the id of the coin you want to"
                                     + " delete.\n");
                    Processes.Lava(dataInput.nextInt());}
            }
        }
        }while(question);
    
    }

}
