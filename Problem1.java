/**
* Problem 1
* If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
* Find the sum of all the multiples of 3 or 5 below 1000.
*
* Output:233168
* Why you chose the problems you did:
* It is the first problem.
* A description of the process you followed in solving problem:
* use a for loop to iterate all the numbers and filter out numbers that are multiples of 3 or 5
* How much time you spent on the exercise:
* 5 minutes
*/


public class Problem1{
        // sum up multiplies
        public int sumMultiples(int max){
                int sum = 0;
                for(int i = 0; i < max; i++){
                        if(i%3 == 0 || i%5 == 0){
                                sum += i;
                        }
                }
                return sum;
        }
        public static void main(String[] args){
                int result = 0;
                Problem1 p1 = new Problem1();
                result = p1.sumMultiples(1000);
                System.out.println(result);
        }
}
