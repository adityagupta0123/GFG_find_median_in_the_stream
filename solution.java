class Solution
{
    static PriorityQueue<Integer> maxHeap = new PriorityQueue<>
        (Collections.reverseOrder());
    static  PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    public static void insertHeap(int num)
    {
       if(maxHeap.isEmpty() || maxHeap.peek() >= num)
          maxHeap.add(num);
        else
          minHeap.add(num);
          
       if(maxHeap.size() > minHeap.size() + 1)
          minHeap.add(maxHeap.poll());
        else if( maxHeap.size() < minHeap.size())
          maxHeap.add(minHeap.poll());
    }
    
    public static double getMedian()
    {
        if(maxHeap.size() == minHeap.size())
        return maxHeap.peek() / 2.0 + minHeap.peek() / 2.0;
        
        return maxHeap.peek();
    }
    
}
