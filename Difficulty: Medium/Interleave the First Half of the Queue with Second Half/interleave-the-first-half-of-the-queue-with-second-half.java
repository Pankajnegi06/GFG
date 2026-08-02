class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        int half = q.size() / 2;
        
        Queue<Integer> helper = new LinkedList<>();
        
        for(int i=1;i<=half;i++){
            helper.add(q.remove());    
        }
        
        for(int i=1;i<=half;i++){
            q.add(helper.remove()); 
            q.add(q.remove());
        }
        
    }
}
