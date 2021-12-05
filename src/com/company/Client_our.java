package com.company;

public class Client_our {
    public void sit(Random rand)
    {
        int ra= rand.Random();
        if (ra % 3 == 0)
        {
            VictorianChair ch = new VictorianChair(222, 100);
            System.out.println("sit down on " + ch.toString());
        }
        if (ra % 3 == 1)
        {
            MultifunctionalChair ch = new MultifunctionalChair(500, 1000);
            System.out.println("sit down on " +  ch.toString());
        }
        if (ra % 3 == 2)
        {
            MagicChair ch = new MagicChair(100, 150);
            System.out.println("sit down on " + ch.toString());
        }
    }
}
