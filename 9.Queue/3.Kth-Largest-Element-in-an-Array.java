class Solution {
    public int findKthLargest(int[] nums, int k) {


        PriorityQueue<Integer> MaxHeap = new PriorityQueue<>(Collections.reverseOrder());


        for (int n : nums) {

            MaxHeap.add(n);
        }

        int count = 1;
        int res = 0;

        while (count <= k) {

            res = MaxHeap.poll();
            count++;


        }

        return res;

    }
}