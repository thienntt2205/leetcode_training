//https://leetcode.com/problems/assign-cookies/
package leetcode;

import java.util.Arrays;

public class No455_AssignCookies {
    public int findContentChildren(int[] children, int[] cookies) {
        Arrays.sort(children);
        Arrays.sort(cookies);

        int child = 0;
        for (int cookie = 0; child < children.length && cookie < cookies.length; cookie++) {
            if (cookies[cookie] >= children[child]) {
                child++;
            }
        }

        return child;
    }

}
