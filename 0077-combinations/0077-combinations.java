class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), 1, n, k);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> temp, int start, int n, int k) {
        // base case: if the current combination has size k
        if (temp.size() == k) {
            result.add(new ArrayList<>(temp));
            return;
        }
        
        // try adding each number from start → n
        for (int i = start; i <= n; i++) {
            temp.add(i);                 // choose
            backtrack(result, temp, i+1, n, k);  // explore
            temp.remove(temp.size()-1); // un-choose (backtrack)
        }
    }
}
