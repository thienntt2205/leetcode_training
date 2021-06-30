//https://leetcode.com/problems/excel-sheet-column-number/
package leetcode;

public class No171_ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        if (s == null) {
            return -1;
        }
        int sum = 0;
        for (char c : s.toUpperCase().toCharArray()) {
            sum *= 26;
            sum += c - 'A' + 1;
        }
        return sum;
    }
}
