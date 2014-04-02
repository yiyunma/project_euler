/**
* The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
* 
* Find the sum of all the primes below two million.
*
* Output: 1179908153
* Why you chose the problems you did:
* This is a problem related to prime numbers.
* A description of the process you followed in solving the problem:
* for each number in the range, decide whether it is a prime or not.
* How much time you spent on the exercise:
* 10 minutes
*/

public class Problem10{
	// decide whether it is a prime number or not
	public boolean isPrime(int n){
		if(n % 2 == 0){
			return false;
		}
		for(int i = 3; i * i <= n; i += 2){
			if(n % i == 0)
				return false;
		}
		return true;
	}
	// sum up all prime numbers
	public int primeSum(int max){
		int sum = 0;
		for(int i = 1; i < max; i++){
			if(isPrime(i)){
				sum += i;
			}
		}
		return sum; 
	}
	public static void main(String[] args){
		int result = 0;
		Problem10 p10 = new Problem10();
		result = p10.primeSum(2000000);
		System.out.println(result);
	}
}

