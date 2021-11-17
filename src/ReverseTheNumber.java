public class ReverseTheNumber {
    //Question 10)  WAP to input any file digit number and then reverse the number.
    public static void main(String[]args){
        int num = 12345, reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}
