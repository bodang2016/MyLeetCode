package mycode;

public class Day4 {
	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int midPos = (nums1.length + nums2.length) / 2 + 1, i = 0, j = 0;
	        double[] line = new double[midPos];
	        while(i+j<midPos) {
	            if(i<nums1.length&&j<nums2.length) {
	                if(nums1[i]<nums2[j]) {
	                    line[i+j] = nums1[i];
	                    i++;
	                } else {
	                    line[i+j] = nums2[j];
	                    j++;
	                }
	            } else if (i < nums1.length) {
	                line[i+j] = nums1[i];
	                i++;
	            } else {
	                 line[i+j] = nums2[j];
	                j++;
	            }
	        }
	        if((nums1.length + nums2.length) % 2 == 0) {
	            return (line[midPos-1] + line[midPos-2]) / 2;
	        } else {
	            return line[midPos-1];
	        }
	    }
}
