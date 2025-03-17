package DesignPatterns.Observer.Assignment.Services;

import DesignPatterns.Observer.Assignment.Observer;
import DesignPatterns.Observer.Assignment.Utils.NotificationUtils;

public class SmsService implements Observer {
    @Override
    public void notifyObservers(String stockName, double price) {
        String subject = "Price update for " + stockName;
        String body = "New Price is " + price + "::" + stockName;
        NotificationUtils.sendSMS(subject, body);
    }
}
