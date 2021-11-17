public class TransposeMatrix {
    //Question 9)  Write a 2-D array and WAP to transpose a matrix
    public static void main(String[]args){
        int[][] original = new int[][]
                {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
                };

        for (int i = 0; i < original.length; i++)
        {
            for (int j = 0; j < original[i].length; j++)
            {
                System.out.print(original[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("matrix transpose:");
        // transpose
        if (original.length > 0) {
            for (int i = 0; i < original[0].length; i++) {
                for (int j = 0; j < original.length; j++) {
                    System.out.print(original[j][i] + " ");
                }
                System.out.println(" ");
            }
        }
    }
}