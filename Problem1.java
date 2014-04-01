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
