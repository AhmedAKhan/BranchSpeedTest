package branchSpeedTest;

import java.util.Arrays;
import java.util.Random;

public class Main {
	
	public static void worstPossibleCase(int[] array, int maxNumber){
		//the worst possible case for the if statement would be if it alternates every time
		Random rand = new Random();
		for(int counter = 0; counter < array.length; counter++){
			array[counter] = rand.nextInt(maxNumber/2);
			if(counter % 3 == 0)  array[counter] += maxNumber/2;
			System.out.println("array[counter]: " + array[counter]);
		}//end for
	}//end func
	
	public static void main(String[] args)
    {
		System.out.println("initializing data \n.\n.\n");
        // Generate data
        int arraySize = 32768;
        int arrayOfNumbers[] = new int[arraySize];
        int maxNumber = 500;
       
        System.out.println(".");
        
        Random rand = new Random();
        for (int c = 0; c < arraySize; c++)
        	arrayOfNumbers[c] = rand.nextInt(maxNumber);
        
        // !!! With this, the next loop runs faster
        Arrays.sort(arrayOfNumbers);
        //worstPossibleCase(arrayOfNumbers, maxNumber);
        
        System.out.println("starting test \n . \n . \n .");
        
        // Test
        long start = System.nanoTime();
        long sum = 0;

        for (int i = 0; i < 100000; ++i)
        {
            for (int c = 0; c < arraySize; ++c)
            {
                if (arrayOfNumbers[c] >= maxNumber/2)
                    sum += arrayOfNumbers[c];
            }
        }

        System.out.println("the program took " + ((System.nanoTime() - start) / 1000000000.0) + " seconds ");
        System.out.println("sum = " + sum);
        System.out.println(".\n.\n.\n.\n Test ended");
    }
	
}
