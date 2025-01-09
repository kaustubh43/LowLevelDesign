package Inheritance;

import AccessModifiers.Student;

public class User extends Student {
    int id;

    void login(){
        System.out.println("User with ID" + this.id + " has logged in");
    }
}
