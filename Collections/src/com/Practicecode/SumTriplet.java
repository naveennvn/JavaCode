package com.Practicecode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SumTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {2,7,2,2,7,11,15};
		Arrays.sort(nums);
		List<List<Integer>> output=new LinkedList();
		int target=11;
		for(int i=0;i<nums.length;i++)
		{
			int left=i+1;
			int right=nums.length-1;
			int sum=target-nums[i];
			while(left<right) {
				if(nums[left]+nums[right]>sum) 
					right--;
				else if(nums[left]+nums[right]<sum) 
					left++;
				else
				{
					output.add(Arrays.asList(nums[i],nums[left],nums[right]));
					
					//System.out.println(nums[i]+""+nums[left]+""+nums[right]);
					break;
				}
			}
		}
		System.out.println(output);

	}

}
