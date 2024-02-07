package week13;

public class Class13_4_1_Games_Methods_Polymorphism_OOP {
    public static void main(String[] args) {

    }
}

class GameStore {
    double calculateTotalPrice(Game[] listGame){
        double totalPrice = 0.0;
        for(Game game : listGame){
            totalPrice += game.getPrice();
        }
        return totalPrice;
    }

}
class Game{
    String title;
    double price;

    public Game(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}

class ActionGame  extends Game{
    public ActionGame(String title, double price) {
        super(title, price);
    }
}

class PuzzleGame extends Game{
    public PuzzleGame(String title, double price) {
        super(title, price);
    }
}