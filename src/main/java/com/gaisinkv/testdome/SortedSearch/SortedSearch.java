package com.gaisinkv.testdome.SortedSearch;

//30min
public class SortedSearch {

    public static int countNumbers(int[] sortedArray, int lessThan) {
        int left = 0;
        int right = sortedArray.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (sortedArray[mid] < lessThan) {
                if (mid < right && sortedArray[mid + 1] < lessThan) {
                    left = mid + 1;
                    continue;
                } else
                    return mid + 1;
            }
            right = mid - 1;
        }
        return 0;
    }

        public static void main (String[]args){
            System.out.println(SortedSearch.countNumbers(new int[]{1, 3, 5, 7}, 4));
        }
    }
