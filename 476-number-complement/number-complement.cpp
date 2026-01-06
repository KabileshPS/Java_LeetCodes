class Solution {
public:
    int findComplement(int num) {
       int n=num;
       int c=0;
       long long r=0;
       long  power=1;
       while(n!=0)
       {
           c=n%2;
           if(c==0)
           c=1;
           else if (c==1)
           c=0;
           if(c==1)
           r=r+power;
           power=power*2;
           n=n/2;
       }
       return (int)r;
    }
};