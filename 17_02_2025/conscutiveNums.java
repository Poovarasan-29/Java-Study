public class conscutiveNums {
    public static void main(String[] args) {
        String str = "111010101101001";
        int onesC = 0;
        int zerosC = 0;
        int maxOnesC = 0;
        int maxZerosC = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                if (str.charAt(i) == '1') {
                    onesC++;
                    if (onesC > maxOnesC)
                        maxOnesC = onesC;
                } else {
                    zerosC++;
                    if (zerosC > maxZerosC)
                        maxZerosC = zerosC;
                }
            } else {
                zerosC = 0;
                onesC = 0;
            }
        }

        if (maxOnesC > 0)
            maxOnesC++;
        if (maxZerosC > 0)
            maxZerosC++;
        System.out.println(maxOnesC + " : " + maxZerosC);

    }
}
