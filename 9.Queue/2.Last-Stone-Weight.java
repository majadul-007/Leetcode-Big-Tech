class Solution {
    public int lastStoneWeight(int[] stones) {

 //maxheap for pushing the heaviest stone

        PriorityQueue<Integer> maxHeap = new PriorityQueue();


        for (int stone : stones) {
            maxHeap.add(-stone);

        }
//while loop until maxheap has minimum one value

        while (maxHeap.size() > 1) {

            int stone1 = maxHeap.remove();
            int stone2 = maxHeap.remove();

//if stone1 not equal stone2 get the new weight by subtract

            if (stone1 != stone2) {
                int val = stone1 - stone2;
                maxHeap.add(val);
            }




        }

        return maxHeap.size() != 0 ? (-maxHeap.remove()) : 0;

    }
}