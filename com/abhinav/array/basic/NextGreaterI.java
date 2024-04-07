package com.abhinav.array.basic;

import java.util.HashMap;
import java.util.Map;

public class NextGreaterI {
    public static void main(String[] args) {
        int[] nums1 = { 2, 4 };
        int[] nums2 = { 1, 2, 3, 4 };
        NextGreaterISolution ngis = new NextGreaterISolution();
        System.out.println(ngis.nextGreaterElement(nums1, nums2));

    }
}

class NextGreaterISolution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] solution = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length-1; i++) {
            for (int j = i + 1; j < nums2.length; j++) {
                if (nums2[i]<nums2[j]) {
                    map.put(nums2[i], nums2[j]);
                    break;
                }
            }
        }

        for (int i = 0; i < nums1.length; i++) {
            solution[i] = map.getOrDefault(nums1[i], -1);
        }
        return solution;

    }
}
