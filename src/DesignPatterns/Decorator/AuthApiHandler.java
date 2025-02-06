package DesignPatterns.Decorator;

import java.net.http.HttpResponse;
import java.sql.SQLOutput;
import java.util.Random;

public class AuthApiHandler implements ApiHandler{
    ApiHandler apiHandler;

    public AuthApiHandler(ApiHandler apiHandler) {
        this.apiHandler = apiHandler;
    }

    @Override
    public HttpResponse<Integer> call() {
        System.out.println("Check if the user has been authorized.");

        int random = new Random().nextInt() % 2;
        if (random == 0) {
            throw new IllegalArgumentException("Not authorized");
        }

        return apiHandler.call();
    }
}
