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
        // update stock below threshold
        sail.updateStockPrice(88);
        System.out.println("Stock price updated to 88");
        // update above threshold
        sail.updateStockPrice(102);
        System.out.println("Stock price updated to 102");
    }
}
