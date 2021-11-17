public class ArrayInAscendingOrders {
    //Question 2) WAP to enter array and sort the values in ascending order
    public static void main(String[] args){
        //initialize array
        int a[] = {4, 2, 1, 5, 3};//size of array =5(length of array) and index=0,1,2,3,4
        int temp = 0;
        //Displaying elements of original array
        System.out.print("Elements of original array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        //Sort the array in descending order
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println();
        // Displaying elements of array after sorting
        System.out.print("Elements of array sorted in ascending order: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i] + " ");
        }
    }
}