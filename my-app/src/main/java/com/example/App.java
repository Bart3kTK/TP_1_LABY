package com.example;

import java.util.Random;

public class App 
{
    public static void main( String[] args )
    {
        Random random = new Random();
        Protist[] tab = {new Protist(), new Mammal(), new Bird(), new Sponge(), new Rabbit()};
        Protist prot = tab[random.nextInt(5)];
        prot.sayHi();

    }
}
