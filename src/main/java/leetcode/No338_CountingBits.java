package leetcode;

public class No338_CountingBits {
    public int[] countBits(int n) {
        int[] finalArr = new int[n + 1];

        for (int x = 0; x <= n; x++) {
            int counter = 0;
            String val = Integer.toBinaryString(x);
            for (int y = 0; y < val.length(); y++) {
                if (val.charAt(y) == '1') {
                    counter = counter + 1;
                }
            }
            finalArr[x] = counter;

        }


        return finalArr;
    }
}
