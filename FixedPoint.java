class Solution {

    public int fixedPoint(int[] A) {
        int l = 0;
        int h = A.length;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (A[mid] > mid) h = mid - 1;
            else if (A[mid] < mid) l = mid + 1;
            else return mid;
        }
        return -1;
    }
    
}