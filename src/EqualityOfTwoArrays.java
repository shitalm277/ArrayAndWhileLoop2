public class EqualityOfTwoArrays {
    //Question 1) WAP to test the equality of two arrays.
    //Question 8)WAP to test the equality of 2 arrays
    //both questions are same.
    public static void main(String[]args){
        boolean  equalOrNot = true;
        int[] array1 =  {2, 5, 7, 8, 11};
        int[] array2 =  {2, 5, 7, 8, 11,};
        if(array1.length == array2.length)
        {
            for (int i  = 0; i < array1.length; i++)
            {
                if(array1[i] != array2[i])
                    // confusion here we are matching array1 with aaray2
                    // why have we entered (array1[i] != array1[i])
                {
                    equalOrNot = false;
                }
            }
        }
        else
        {
            equalOrNot  = false;
        }

        if (equalOrNot)
        {
            System.out.println("Two arrays are equal.");
        }
        else
        {
            System.out.println("Two  arrays are not equal.");
        }
    }
}