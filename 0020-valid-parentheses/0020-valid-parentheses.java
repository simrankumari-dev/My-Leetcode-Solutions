class Solution {
    public boolean isValid(String s) {
        int n=s.length();

        Stack<Character> stack=new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){ //When we get opening we will push it into stack
                stack.push(s.charAt(i));
            }
            else{ //we get closing so here we check if stack is empty if empty then return false invalid string
                if(stack.isEmpty()){
                    return false;
                }

                if((stack.peek()=='('&& s.charAt(i)==')') ||
                 (stack.peek()=='{'&& s.charAt(i)=='}')||
                 (stack.peek()=='['&&s.charAt(i)==']')
                 ){
                    stack.pop();
                 }
                 else{ //no match is found
                    return false;
                 }


            }

        }
        return stack.isEmpty();
        //if at the end stack size is 0 that means valid string and if stack size is not equal to 0 that means is invalid string case 3 : when opening is greater than closing

    }
}