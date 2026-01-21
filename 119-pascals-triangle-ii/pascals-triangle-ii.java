class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>(); 
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        ans.add(new ArrayList<>(prev));
        if (rowIndex == 0) return ans.get(0);
        prev.add(1);
        ans.add(new ArrayList<>(prev));
        if (rowIndex == 1) return ans.get(1);
        int sz=1;
        for (int i = 3; i <= rowIndex+1; i++) {
            List<Integer> curr = new ArrayList<>(); 
            curr.add(1);
            sz = prev.size();
            for (int j = 1; j < sz; j++) {
                curr.add(prev.get(j) + prev.get(j - 1));
            }
            curr.add(1);
            ans.add(curr);
            prev = curr;
        }
        return ans.get(sz);
    }
}