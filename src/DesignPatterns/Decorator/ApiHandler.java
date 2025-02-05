package DesignPatterns.Decorator;

import java.net.http.HttpResponse;

public interface ApiHandler {
    HttpResponse<Integer> call();
}
