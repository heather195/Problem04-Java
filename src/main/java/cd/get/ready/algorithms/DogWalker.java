package cd.get.ready.algorithms;

import java.util.HashMap;

public class DogWalker {

    public int numberOfWalksCalculator(int[] dogSizes){
        int numberOfWalks = 0;
        //create new hashtable dogPairs of type <int, int>
        HashMap<Integer, Integer> dogPairs = new HashMap<>();

        // loop through the dog sizes array
        for(int d: dogSizes) {
            System.out.println(d);
            // if key exists in dogPairs
            if(dogPairs.containsKey(d)){
                // remove that key value pair
                System.out.println("exists, remove");
                dogPairs.remove(d);
            } else {
                //add the key value pair and increment the numberOfWalks
                dogPairs.put(d, 1);
                numberOfWalks++;
                System.out.println("doesn't exist, add");
            }
            System.out.printf("Number of walks: %d %n", numberOfWalks);
        }

        return numberOfWalks;
    }

// If two dogs are the same size, they can be walked in one hour
// 3 of the same size take 2 hours?
    /*
    using a hashmap:
    - use the size as the key, and a count as the value
    - if the key doesn't exist, increment the number of hours.
    - if the key doesn't exist, remove the key/ value pair and don't increment hours

     */
}
