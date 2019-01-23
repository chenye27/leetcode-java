class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> L1 = new LinkedList<>();
        List<Integer> L2 = new ArrayList<>();
        L1.add(new ArrayList<>(L2));
        find(nums,L1,L2,0);
        return L1;
        
    }
    public void find(int[] nums,List<List<Integer>> L1,List<Integer> L2,int start){
        for(int i = start;i<nums.length;i++){
            L2.add(nums[i]);
            L1.add(new ArrayList<>(L2));
            find(nums,L1,L2,i+1);
            L2.remove(L2.size()-1);
        }
    }
}