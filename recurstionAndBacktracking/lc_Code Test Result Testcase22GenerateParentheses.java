class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
       back(n, ans,0,0, "");
        return ans;
    }

    public void back(int n, List<String>ans, int oc, int cc,String s){
    if(oc==n&&cc==oc){
        ans.add(s);
        return;
    }
    if(oc<n){
        
        back(n, ans, oc+1, cc, s+'(');
    }
    if(cc<oc){
        
        back(n,ans,oc, cc+1, s+')');
    }

    }
}
