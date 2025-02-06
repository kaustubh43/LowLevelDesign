package DesignPatterns.Decorator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<ApiHandler> apiHandlers = List.of(new AuthApiHandler(new LoggingApiHandler(new InstructorApi())),
                new AuthApiHandler(new LoggingApiHandler(new StudentApiHandler())));

        apiHandlers.stream().forEach(apiHandler -> apiHandler.call());
    }
}
