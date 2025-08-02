class Solution {
    public String removeOuterParentheses(String s) {
        String ans="";
        int n=s.length();
        int count=0;
        boolean flag=true;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(')count++;
            else count--;

            if(count==1&&flag==true){
                flag=false;
                continue;
            }
            if(count==0 && flag==false){
                flag=true;
                continue;
            }
            ans=ans+s.charAt(i);

        }
        return ans;
        
    }
}