package com.example.Tester_Ignite;

import java.util.ArrayList;
import java.util.Scanner;

public class TestA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase = sc.nextLine();
//        String phrase = "All your base are belong to us.";

        String[] letter = phrase.toLowerCase().split("");
        ArrayList<String> newPhrase = new ArrayList<String>();
        for (String c:letter) {
            switch (c) {
                case "a":
                    c = "@";
                    newPhrase.add(c);
                    break;
                case "b":
                    c = "8";
                    newPhrase.add(c);
                    break;
                case "c":
                    c = "(";
                    newPhrase.add(c);
                    break;
                case "d":
                    c = "|)";
                    newPhrase.add(c);
                    break;
                case "e":
                    c = "3";
                    newPhrase.add(c);
                    break;
                case "f":
                    c = "#";
                    newPhrase.add(c);
                    break;
                case "g":
                    c = "6";
                    newPhrase.add(c);
                    break;
                case "h":
                    c = "[-]";
                    newPhrase.add(c);
                    break;
                case "i":
                    c = "|";
                    newPhrase.add(c);
                    break;
                case "j":
                    c = "_|";
                    newPhrase.add(c);
                    break;
                case "k":
                    c = "|<";
                    newPhrase.add(c);
                    break;
                case "l":
                    c = "1";
                    newPhrase.add(c);
                    break;
                case "m":
                    c = "[]\\/[]";
                    newPhrase.add(c);
                    break;
                case "n":
                    c = "[]\\[]";
                    newPhrase.add(c);
                    break;
                case "o":
                    c = "0";
                    newPhrase.add(c);
                    break;
                case "p":
                    c = "|D";
                    newPhrase.add(c);
                    break;
                case "q":
                    c = "(,)";
                    newPhrase.add(c);
                    break;
                case "r":
                    c = "|Z";
                    newPhrase.add(c);
                    break;
                case "s":
                    c = "$";
                    newPhrase.add(c);
                    break;
                case "t":
                    c = "']['";
                    newPhrase.add(c);
                    break;
                case "u":
                    c = "|_|";
                    newPhrase.add(c);
                    break;
                case "v":
                    c = "\\/";
                    newPhrase.add(c);
                    break;
                case "w":
                    c = "\\/\\/";
                    newPhrase.add(c);
                    break;
                case "x":
                    c = "}{";
                    newPhrase.add(c);
                    break;
                case "y":
                    c = "`/";
                    newPhrase.add(c);
                    break;
                case "z":
                    c = "2";
                    newPhrase.add(c);
                    break;
                default:
                    newPhrase.add(c);
            }
        }
        for (String s : newPhrase)
        System.out.print(s);
    }
}
