class Solution {
    private int slove(int n){
        if(n==0|| n==1) return n;
        return slove(n-1)+slove(n-2);
    }
    public int fib(int n) {
        int ans=slove(n);
        return ans;
        
    }
}