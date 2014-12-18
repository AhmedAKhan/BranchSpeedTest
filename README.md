This program's function was the test the branch prediction

Branch Prediction
	when the compiler tries to compile the program it tries to get rid of as many hazards as possible. The hardest hazard to try to fix is the control hazard. 

Why we need branch prediction
	To make the program run faster it runs multiple instructions at once. An if statement when compiled to assembly is called a branch instruction. When the computer runs a branch instruction it can not know the instruction to run next because a branch instruction can change the next instruction to run. 

Why a sorted array will make the program run faster
	To solve this problem the computer tries to predict which instruction to run next. Currently in the code we have a loop that takes the numbers from an array and runs the if statement on all those numbers. When the numbers are in a random order the compiler can not accuratly predict what the next instruction will be. So the compiler gets it wrong a large amount of the time and therfore the total time is significantly large. When we sort the array the branch predictor can accuratly predict the next instruction therfore the program runs significantly faster (around 5 times faster)



