class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int max=0;
        for(int ele: candies){
            if(max < ele){
                max = ele;
            }
        }
        for(int ele: candies){
            if(max > ele + extraCandies){
                list.add(false);
            }
            else{
                list.add(true);
            }
        }        
        return list;
    }
}