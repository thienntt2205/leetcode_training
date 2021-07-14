//https://leetcode.com/problems/construct-the-rectangle/
package leetcode;

public class No492_ConstructtheRectangle {
    public int[] constructRectangle(int area) {
        int w = (int) Math.sqrt(area);
        while (area % w != 0) w--;
        return new int[]{area / w, w};
    }
}
