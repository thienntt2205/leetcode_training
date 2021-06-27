package leetcode;

public class No167_TwoSum_II {public int[] twoSum(int[] numbers, int target) {
    int fisrtIndex = 0, secondIndex = numbers.length - 1;
    while (numbers[fisrtIndex] + numbers[secondIndex] != target) {
        if (numbers[fisrtIndex] + numbers[secondIndex] > target) {
            secondIndex--;
        } else {
            fisrtIndex++;
        }
    }
    return new int[]{fisrtIndex + 1, secondIndex + 1};
}
}
