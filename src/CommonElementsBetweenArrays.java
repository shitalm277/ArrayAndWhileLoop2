public class CommonElementsBetweenArrays {
    //Question 5)  Write a Java program to find the common elements between two arrays (string values).
    public static void main(String[] args) {
        int array1[] = {2, 4, 5, 9, 10, 115, 118};

        int array2[] = {4, 115, 118, 117, 116, 115, 114, 113, 112};

        int i = 0, j = 0;

        while (i < array1.length && j < array2.length) {

            if (array1[i] == array2[j]) {

                System.out.println(array1[i] + " ");

                i++;

                j++;

            } else if (array1[i] < array2[j]) {

                i++;

            } else {

                j++;

            }


        }
    }
}
