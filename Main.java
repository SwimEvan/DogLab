// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************


public class Main
{
    public static void main(String[] args)
    {
	Dog dog = new Dog("Spike");
	System.out.println(dog.getName() + " says " + dog.bark());
	
	Labrador lab = new Labrador("Labby Babby", "red");
        System.out.println(lab.getName());
        System.out.println(lab.bark());
Yorkshire yorky = new Yorkshire("Yorky Borky", 1000);
        System.out.println(yorky.getName());
        System.out.println(yorky.bark());
        yorky.waddle();
        //lab didnt have waddle so I had to add it
        lab.waddle();
Dog[] doges = new Dog[3];
doges[0] = new Dog("DogeCoin");
doges[1] = new Yorkshire("Dorky Worky", 10);
        doges[2] = new Labrador("Yacky Labby", "Blood red");
        for(int i = 0; i < doges.length;i++){
            System.out.println(doges[i].bark());
        }
        for (Dog hi: doges) {
            System.out.println(hi.bark());
        }
        ((Labrador)doges[2]).waddle();


    }
}
