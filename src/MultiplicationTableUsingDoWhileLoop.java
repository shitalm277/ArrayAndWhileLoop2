public class MultiplicationTableUsingDoWhileLoop {
    //Question 4) Printing multiplication table using do while loop
    //1 2 3
    //2 4 6
    //3 6 9
    public static void main(String[] args) {
        System.out.println("Multiplication table : ");
        int i = 1;
        do {
            int j = 1;
            do
            {
                System.out.print(i * j + "  ");
                j++;
            }
            while (j <= 3);
            i++;
            System.out.println();
        }
        while (i <= 3);
    }
}
