public class TotalNoOfCharInString {
    //Question 3) WAP to enter any String and count the total number of 'a' in that String.
    public static void main(String[]args){
        String input = ("Character appearance in the String.");
        int times = 0 ;
        for (int position = 0; position < input.length(); position++)
        {
            if (input.charAt(position) == 'a')
            {
                times++;
            }
        }
        System.out.println("'a' appears " + times + " times in this sentence.");

    }
}
