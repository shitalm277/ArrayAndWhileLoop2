public class ArrayContainsSpecificValue {
    //Question 7) WAP to test if an array contains specific value
    public static void main(String[] args) {
        int[] myArray = {55, 45, 69, 44};
        int num = 45;
        //int i = 0;

        for(int i = 0; i<myArray.length; i++)
        {
            if(num == myArray[i])
            {
                System.out.println("Array contains the specific value");
            }
            else
            {
                System.out.println("Array do not contains the specific value");
            }
        }

        //tried to do in while loop but not working for me.
        /*while (i < myArray.length) {
             i++;
            if(num == myArray[i])
            {
                System.out.println("Array contains the given element");
            }
        }*/
    }
}
