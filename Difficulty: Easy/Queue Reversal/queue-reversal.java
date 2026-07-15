class Solution {
    public void reverseQueue(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        for(int i=1;i<=n;i++){
            st.push(q.remove());
        }
        
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        
    }
}