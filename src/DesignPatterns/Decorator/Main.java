package DesignPatterns.Decorator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<ApiHandler> apiHandlers = List.of(new LoggingApiHandler(new InstructorApi()), new LoggingApiHandler(new StudentApiHandler()));

        apiHandlers.stream().forEach(apiHandler -> apiHandler.call());
    }
}
