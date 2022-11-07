class Solution {
    public int[] twoSum(int[] num, int target) {
        int len = num.length;

        int[] result = new int[2] ;
       
        int sum = 0;

        for (int i = 0; i < len; i++) {
            

            for(int j = i+1; j < len; j++)
            {

                sum = num[i]+num[j];       
                if(sum == target)
                {
                    result[0]=i;
                    result[1]=j;
                }
            }
        
        }
        return result;
    }
}
