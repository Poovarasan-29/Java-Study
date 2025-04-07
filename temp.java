public class temp {

    public static void main(String[] args) {
        int n = 3;// 3+2 4+3 5+4
        int start;
        for (int i = 1; i <= n; i++) {
            for (int subTree = i * 2 - 1; subTree < n * i - (i - 1) + (i * 2 - 1); subTree++) {
                for (int j = 1; j <= subTree; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= subTree; j++) {
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
    }
}
