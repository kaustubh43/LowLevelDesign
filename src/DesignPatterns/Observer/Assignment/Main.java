package DesignPatterns.Observer.Assignment;

import DesignPatterns.Observer.Assignment.Services.AppService;
import DesignPatterns.Observer.Assignment.Services.EmailService;
import DesignPatterns.Observer.Assignment.Services.SmsService;

public class Main {
    public static void main(String[] args) {
        // Instantiate stock symbol
        StockTradingManager sail = new StockTradingManager("SAIL", 80, 90);
        // Add various observers for that stock.
        sail.addObserver(new AppService());
        sail.addObserver(new EmailService());
        sail.addObserver(new SmsService());

        updateStockPrice(88, sail);
        updateStockPrice(100, sail);
    }

    public static void updateStockPrice(int price, StockTradingManager sail) {
        System.out.println("Stock price updated to " + price);
        sail.updateStockPrice(price);
        System.out.println("***DONE***");
    }
}
