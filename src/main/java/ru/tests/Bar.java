package ru.tests;

public class Bar {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        for (int x = 0; x < nums.length; x++) {
            x += nums[x];
        }
        //System.out.println(x);
    }
}
