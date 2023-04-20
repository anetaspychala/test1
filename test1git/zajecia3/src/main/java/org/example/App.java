package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //Collections - data types, that allow storage of multiple values in one variable
        // collections example - arreys, lists, sets, maps, stacks, queues, heap, tre
        // array - collection, fixed-size, ordered, index- based
        // Create an array with given size, the assign values
        String[] cities = new String[5];
        //Computers start count from 0
        // Index [0] - number of the array's field, going from 0 to (array, lengh -1)
        cities[0] = "Warszawa";
        cities[1] = "Krakow";
        cities[2] = "Wroclaw";
        cities[3] = "poznan";
        cities[4] = "opole";
        //create an array with values
        String[] countries = new String[] {"Poland", "Czechia", "Slovakia", "Hungary"};
        // How to read a value from an array
        String someCity = cities[3];
        //Iterate over an array with numeric for

        for(Integer i =0; i<cities.length; i++){
            String city = cities[i];
            System.out.println((i +1)+ ". " + city);
        }
        //Iterate over an array with an iterative for
        for (String country: countries){
            System.out.println(country);
        }
        //You cannot modify the iterated collection inside the for loop

    }

}
