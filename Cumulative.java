public class Cumulative {
    public static void main(String[] args) {
        try {
            int[] arrNum = {5, 3, 4, 2, 0, 8};

            calculate(arrNum);

            System.out.print("arrNum = [");
            for (int i = 0; i < arrNum.length; i++) {
                System.out.print(arrNum[i]);
                if (i < arrNum.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static void calculate(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] *= arr[i - 1];
        }
    }
}
