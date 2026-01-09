class Solution {
    public int reverse(int x) {
       int rev=0;
       int n=x;
       while(n!=0)
       {
          int d=n%10;
          n/=10;
          if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10) {
                return 0;
            }
            rev=rev*10+d;
       } 
       return rev;
    }
}