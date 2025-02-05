package DesignPatterns.Decorator;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;

public class LoggingApiHandler implements ApiHandler{
    ApiHandler apiHandler;

    LoggingApiHandler(ApiHandler apiHandler) {
        this.apiHandler = apiHandler;
    }

    @Override
    public HttpResponse<Integer> call() {
        System.out.println("LoggingApiHandler::call()\nCurrent time is " + LocalDateTime.now());
        HttpResponse<Integer> response = apiHandler.call();

        System.out.println(response.uri());
        System.out.println(response.statusCode() + "\n");

        return response;
    }
}
