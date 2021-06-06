/*
 *  UCF COP3330 Summer 2021 Assignment 15 Solution
 *  Copyright 2021 Brandon Barbour
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("What is the username? ");
        Scanner input = new Scanner(System.in);
        String user = input.next();
        System.out.print("What is the password? ");
        String password = input.next();
        if (password.equals("abc$123")) {
            System.out.println("Welcome!");
        }
        else {
            System.out.print("I don't know you.");
        }
    }
}
