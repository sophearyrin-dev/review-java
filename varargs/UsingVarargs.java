public class UsingVarargs{
    public static int sumNumbers(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int testLength(int a, int... arrs){
        return arrs.length;
    }

    public static void main(String[] args) {
        // Passing individual numbers
        System.out.println("Sum of 1, 2: " + sumNumbers(1, 2));                // Output: 3
        
        // Passing an array of numbers
        int[] numberArray = {1, 2, 3, 4, 5};
        System.out.println("Sum of array: " + sumNumbers(numberArray));        // Output: 15

        // Passing args to see the length
        System.out.println(testLength(1,1,2,3));    
    }
    
}