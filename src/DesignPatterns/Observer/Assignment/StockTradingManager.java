package DesignPatterns.Observer.Assignment;

import java.util.Observable;

public class StockTradingManager extends Publisher {
    private final String stockName;
    private double stockPrice;
    private final double notificationThreshold;

    public StockTradingManager(String stockName, double stockPrice, double notificationThreshold) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.notificationThreshold = notificationThreshold;
    }

    public void updateStockPrice(double newPrice) {
        stockPrice =newPrice;
        if (stockPrice >= notificationThreshold) {
            notifyObservers(stockName, stockPrice);
        }
    }
}
