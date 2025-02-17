public class reverseArrayByK {
    public static void main(String[] args) {
        int array[] = { 4, 12, 5, 7, 8, 2, 3, 6 };
        int k = 2;
        if (k > array.length || k < 1) {
            System.out.println("Wrong K value so Array Not modified");
        } else {
            for (int i = 0; i < array.length / k; i++) {
                int con = i * k + k - 1;
                for (int j = i * k; j < con; j++) {
                    array[j] = array[j] ^ array[con];
                    array[con] = array[j] ^ array[con];
                    array[j] = array[j] ^ array[con--];
                }
            }
        }
        for (int n : array) {
            System.out.print(n + " ");
        }
    }
}
