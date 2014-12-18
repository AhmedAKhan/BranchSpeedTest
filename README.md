This program's function was the test the branch prediction

Branch Prediction
	when the compiler tries to compile the program it tries to get rid of as many hazards as possible. The hardest hazard to try to fix is the control hazard. 

Why we need branch prediction
	To make the program run faster it runs multiple instructions at once. An if statement when compiled to assembly is called a branch instruction. When the computer runs a branch instruction it can not know the instruction to run next because a branch instruction can change the next instruction to run. 	To solve this problem the computer tries to predict which instruction to run next.

Why a sorted array will make the program run faster
	Currently in the code we have a loop that takes the numbers from an array and runs the if statement on all those numbers. When the numbers are in a random order the compiler can not accuratly predict what the next instruction will be. So the compiler gets it wrong a large amount of the time and therfore the total time is significantly large. When we sort the array the branch predictor can accuratly predict the next instruction therfore the program runs significantly faster (around 5 times faster)

Time taken for sorted array
1.777645 seconds
1.780279 seconds
1.817067 seconds

Time taken for unsorted array
9.669864 seconds
9.467151 seconds
9.496195 seconds 

average time taken for unsorted is 9.54298833333
	(9.669864 + 9.467151 + 9.49195)/3 = 9.54298833333
average time for sorted array is 1.79166366667
	(1.777645 + 1.780279 + 1.817067)/3 = 1.79166366667
the branch predictor improved performance by 5.32632798826
	9.54298833333/1.79166366667 = 5.32632798826

NO IF STATEMENT

If we remove the if statement entirely then it would not matter whether the array is sorted or not. If we replace                 int t = (arrayOfNumbers[counter] - maxNumber/2) >> 31;
               	sum += (~t) & arrayOfNumbers[counter];

with the old value lines 
            	if (arrayOfNumbers[counter] >= maxNumber/2)
                  sum += arrayOfNumbers[counter];
they would result the exact same thing except it wouldnt use a branch instruction. 

Time with sorted
4.19173 seconds
4.232401 seconds
4.284957 seconds

Time with unsorted
4.199538 seconds
4.204544 seconds
4.202131 seconds


WORST CASE SCENARIO
	There is a function in the code called worsePossibleCase which tries to create a scenariot that would be produce the highest number of wrong predictions by the branch predictor. currently the worst case scenario works by 

