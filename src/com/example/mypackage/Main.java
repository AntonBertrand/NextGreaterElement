package com.example.mypackage;

import java.util.Arrays;

//The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
//
//You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
//
//For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.
//
//Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

public class Main {

    public static void main(String[] args) {
        int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        // Creates an array of Nums1 length of -1's
        int counter = 0;
        for (int q : ans) {
            ans[counter] = -1;
            counter++;
        }

        for (int i = 0; i < nums1.length; i++) {

            int x = nums1[i];

            for (int j = 0; j < nums2.length ;j++) {

                if (nums2[j] == x) {
                    for (int z = j; z < nums2.length ;z++) {
                        if (nums2[z] > nums2[j]) {
                            //Add element to Array as it is larger
                            ans[i] = nums2[z];
                            break;
                        }
                    }
                }
            }

        }

        return ans;
    }


}
