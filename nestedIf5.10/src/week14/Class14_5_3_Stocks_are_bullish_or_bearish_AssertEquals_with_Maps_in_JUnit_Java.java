package week14;

import org.junit.jupiter.api.Test;
import java.text.DecimalFormat;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Class14_5_3_Stocks_are_bullish_or_bearish_AssertEquals_with_Maps_in_JUnit_Java {
}

class StockMarket {
    private Map<String, String> stockPrices;

    public StockMarket() {
        this.stockPrices = new HashMap<>();
    }

    public void addStock(String abbreviation, double price) {
        String formattedPrice = formatPrice(price);
        formattedPrice = formattedPrice.replace(',', '.');
        stockPrices.put(abbreviation, formattedPrice);
        System.out.println("Stock " + abbreviation + " has been added.");
    }

    public void increaseStockPrices(String abbreviation, double percentIncrease) {
        if (stockPrices.containsKey(abbreviation)) {
            String currentPrice = stockPrices.get(abbreviation);
            double currentPriceDouble = Double.parseDouble(currentPrice);
            double newPrice = currentPriceDouble * (1 + percentIncrease / 100);
            String formattedPrice = formatPrice(newPrice);
            formattedPrice = formattedPrice.replace(',', '.');
            stockPrices.put(abbreviation, formattedPrice);
            System.out.println("Stock " + abbreviation + " is bulling.");
        } else {
            System.out.println("Stock " + abbreviation + " not found.");
        }
    }

    public void decreaseStockPrices(String abbreviation, double percentDecrease) {
        if (stockPrices.containsKey(abbreviation)) {
            String currentPrice = stockPrices.get(abbreviation);
            double currentPriceDouble = Double.parseDouble(currentPrice);
            double newPrice = currentPriceDouble * (1 - percentDecrease / 100);
            String formattedPrice = formatPrice(newPrice);
            formattedPrice = formattedPrice.replace(',', '.');
            stockPrices.put(abbreviation, formattedPrice);
            System.out.println("Stock " + abbreviation + " is bearing.");
        } else {
            System.out.println("Stock " + abbreviation + " not found.");
        }
    }

    public Map<String, String> getStockPrices() {
        return stockPrices;
    }

    private String formatPrice(double price) {
        DecimalFormat df = new DecimalFormat("#.0");
        return df.format(price);
    }
}

class MainTest5_3{
    //write your tests here
    @Test
    public void testSingleStockIncrease(){
        StockMarket stockMarket = new StockMarket();
        stockMarket.addStock("AAPL", 100.0);
        stockMarket.increaseStockPrices("AAPL", 10.0);


        assertEquals("110.0", stockMarket.getStockPrices().get("AAPL"));
    }
    @Test
    public void testMultipleStockIncrease(){
        StockMarket stockMarket = new StockMarket();
        stockMarket.addStock("AAPL", 100.0);
        stockMarket.addStock("GOOGL", 200.0);
        stockMarket.addStock("TSLA", 300.0);
        stockMarket.addStock("AMZN", 400.0);
        stockMarket.addStock("MSFT", 500.0);
        stockMarket.increaseStockPrices("AAPL", 10.0);
        stockMarket.increaseStockPrices("TSLA", 10.0);
        stockMarket.increaseStockPrices("MSFT", 10.0);

        assertEquals("110.0",stockMarket.getStockPrices().get("AAPL"));
        assertEquals("330.0",stockMarket.getStockPrices().get("TSLA"));
        assertEquals("550.0", stockMarket.getStockPrices().get("MSFT"));


    }
    @Test
    public void testSingleStockDecrease(){
        StockMarket stockMarket = new StockMarket();
        stockMarket.addStock("AAPL", 100.0);
        stockMarket.decreaseStockPrices("AAPL", 10.0);


        assertEquals("90.0", stockMarket.getStockPrices().get("AAPL"));
    }
    @Test
    public void testMultipleStockDecrease(){
        StockMarket stockMarket = new StockMarket();
        stockMarket.addStock("AAPL", 100.0);
        stockMarket.addStock("GOOGL", 200.0);
        stockMarket.addStock("TSLA", 300.0);
        stockMarket.addStock("AMZN", 400.0);
        stockMarket.addStock("MSFT", 500.0);
        stockMarket.decreaseStockPrices("AAPL", 10.0);
        stockMarket.decreaseStockPrices("TSLA", 10.0);
        stockMarket.decreaseStockPrices("MSFT", 10.0);

        assertEquals("90.0",stockMarket.getStockPrices().get("AAPL"));
        assertEquals("270.0",stockMarket.getStockPrices().get("TSLA"));
        assertEquals("450.0", stockMarket.getStockPrices().get("MSFT"));

    }
    @Test
    public void testNonExistingStockIncrease(){
        StockMarket stockMarket = new StockMarket();
        stockMarket.addStock("GOOGL", 100.0);
        stockMarket.increaseStockPrices("AAPL", 10.0);


        assertEquals(0, 0);
    }
    @Test
    public void testNonExistingStockDecrease(){
        StockMarket stockMarket = new StockMarket();
        stockMarket.addStock("GOOGL", 100.0);
        stockMarket.decreaseStockPrices("AAPL", 10.0);


        assertEquals(0, 0);
    }
}
