package week12;

public class Class12_7_1_Crypto_OOP {
    public static void main(String[] args) {

    }
}
class Crypto{

    private String name;// Represents the name of the cryptocurrency.

    private String symbol;// Represents the symbol of the cryptocurrency.

    private double price;// Represents the current price of the cryptocurrency.

    private long marketCap;// Represents the market capitalization of the cryptocurrency.

    private int rank;// Represents the rank of the cryptocurrency in the market.

    public Crypto(String name, String symbol, double price, long marketCap, int rank) {
        this.name = name;
        this.symbol = symbol;
        this.price = price;
        this.marketCap = marketCap;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return price;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public int getRank() {
        return rank;
    }

    public void setName(String name) {
        if (name.length()>3) {
            this.name = name;
        }else {
            System.out.println("Name must be at least 3 characters long.");
        }
    }

    public void setSymbol(String symbol) {
        if (symbol.length() < 3 || symbol.length() > 5) {
            System.out.println("Symbol must be between 3 and 5 characters inclusive.");
        } else if (!symbol.toUpperCase().equals(symbol)) {
            System.out.println("Symbol must have all letters capitalized.");
        } else {
            this.symbol = symbol;
        }
    }

    public void setPrice(double price) {
        if (price>0) {
            this.price = price;
        }else {
            System.out.println("Price cannot be negative.");
        }
    }

    public void setMarketCap(long marketCap) {
        if (marketCap>0) {
            this.marketCap = marketCap;
        }else {
            System.out.println("Market capitalization cannot be negative.");
        }
    }

    public void setRank(int rank) {
        if (rank>0) {
            this.rank = rank;
        }else {
            System.out.println("Rank cannot be negative.");
        }
    }

    public double calculateTotalValue(double quantity){
        if (quantity<0) {
            System.out.println("Quantity cannot be negative.");
            return 0.0;
        }else {
            return quantity*price;
        }
    }

    public void printCryptoDetails() {
        System.out.println(name + " (" + symbol + ") - Price: " + price + " USD, Market Cap: " + marketCap + ", Rank: " + rank);
    }
}