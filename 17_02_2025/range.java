public class range {
    public static void main(String[] args) {
        int[] array = { 11, 12, 16, 23, 25, 51, 55 };
        int start = 5;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.println(start + " : " + (array[i] - 1));
            } else {
                if (array[i] == (array[i - 1] + 2)) {
                    System.out.println(array[i] - 1);

                } else if (array[i] != array[i - 1] + 1) {
                    System.out.println((array[i - 1] + 1) + " : " + (array[i] - 1));
                }
            }
        }
    }
}
