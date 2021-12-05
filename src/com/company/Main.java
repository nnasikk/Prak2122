package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Первое задание комплексные числа");
        Random rand = new Random();
        System.out.print(rand.Random());
        int complexnum = rand.Random();
        if (complexnum > 0)
            System.out.println("+" + complexnum + "i");
        else System.out.println(complexnum + "i");
        System.out.println("\n\n\nВторое задание фабрика стульев");
        Client_our client = new Client_our();
        client.sit(rand);
        System.out.println("\n\n\nТретье задание изменение текстового файла\nВведите New/Open/Save/Exit:");
        Scanner scanner = new Scanner(System.in);
        Text text= new Text(scanner);
    }
}
