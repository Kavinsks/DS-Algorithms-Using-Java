package com.techcrack.DSA.Arrays;

public class SpecialArray1 {
    public boolean isArraySpecial(int[] nums) {

        for(int k = 1; k < nums.length; k++){
            if(nums[k-1] % 2 == nums[k] % 2)
                return false;
        }

        return true;
    }
}
