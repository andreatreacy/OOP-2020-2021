package ie.tudublin;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world");

        Animal misty = new Dog("Misty");

        Animal topCat = new Cat("TopCat");

        System.out.println(misty);
        System.out.println(topCat);

        misty = topCat;

        topCat.setName("Garfield");

        System.out.println(misty);
        System.out.println(topCat);

        // What will get printed out??

        // 1. topcat, Garfield
        // 2. garfield, Garfield - THIS ONE

        Cat ginger = new Cat("Ginger");
        System.out.println(ginger);     //Ginger
        System.out.println(ginger.getNumLives());   //9 to start

        //access the kill() method until the 9 lives run out
        for(int i=0; i<10; i++)
        {
            ginger.kill();
            System.out.println(ginger.getNumLives());
        }

        // THIS WONT WORK as topCat was made as an Animal not Cat
        //System.out.println(topCat.getNumLives());
    }
} 