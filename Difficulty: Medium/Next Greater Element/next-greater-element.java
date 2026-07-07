class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        nge[n-1] = -1;
        
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && st.peek() <= arr[i]) st.pop();
            if(st.isEmpty()) nge[i] = -1;
            else nge[i] = st.peek();
            st.push(arr[i]);
        }
        ArrayList<Integer> list = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            list.add(nge[i]);
        }
        return list;
    }
}