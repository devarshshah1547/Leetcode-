class Solution {
    public boolean isPalindrome(int x) {
        
        int rev=0,rem;

        if(x<0)
        {
            return false;
        }

        int temp=x;
        while(temp!=0)
        {
            rem=temp%10;
            rev=(rev*10)+rem;
            temp=temp/10;
        }
        if(rev==x)
        {
            return true;
        }
        else return false;

    }
}