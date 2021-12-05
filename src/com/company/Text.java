package com.company;

import java.util.Scanner;

public class Text {
    public Text(Scanner sc) {
        String str;
        str=sc.next();
        while (str.equals("Exit")==false)
        {
            if (str.equals("Save")==true)
                System.out.println("сохранен файл");
            if (str.equals("New")==true)
                System.out.println("создан файл");
            if (str.equals("Open")==true)
                System.out.println("открыт файл");
            str=sc.next();
        }
        System.out.println("закрыт файл");

    }
}
