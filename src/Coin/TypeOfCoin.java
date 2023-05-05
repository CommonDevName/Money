package Coin;

/**
 *
 * @author CommonName(¿)
 */
public class TypeOfCoin {
//Propieties
    private int id;
    private String type;
    private char symbol;
    private int value;
    
//Constructor   
    public TypeOfCoin(int id, String type, char symbol, int value){
        this.id = id;
        this.type = type;
        this.symbol = symbol;
        this.value = value;
    }

    @Override
    public String toString() {
        return id + ". " + type + ", " + symbol + value;
    }
    
    
}
