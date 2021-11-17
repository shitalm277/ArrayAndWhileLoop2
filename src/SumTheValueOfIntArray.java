public class SumTheValueOfIntArray {
    //Question 6)  WAP to sum values of an int array
    public static void main(String[] args) {
        //array to sum
        int[] numbers = new int[]{10, 10, 10, 10, 10};
        int sum = 0;
       for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}