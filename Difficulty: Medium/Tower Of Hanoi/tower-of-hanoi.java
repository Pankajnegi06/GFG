class Solution {

    static int count;

    public int towerOfHanoi(int n, int from, int to, int aux) {

        count = 0;

        // A = Source
        // B = Auxiliary
        // C = Destination
        hanoi(n, 'A', 'B', 'C');

        return count;
    }

    private static void hanoi(int n, char source, char helper, char destination) {

        // Base case
        if (n == 0)
            return;

        
        hanoi(n - 1, source, destination, helper);

       
        count++;

     
        hanoi(n - 1, helper, source, destination);
    }
}