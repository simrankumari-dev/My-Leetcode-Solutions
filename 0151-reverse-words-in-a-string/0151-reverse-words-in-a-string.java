class Solution {
    public String reverseWords(String s) {

        // Converting the normal string to StringBuilder string so that i can do modification in it 
        StringBuilder sb=new StringBuilder(s);
        
        sb.reverse();
        String reversed=sb.toString();// Now converting the reverse string into normal string 

        StringBuilder ans=new StringBuilder();
        int n=reversed.length();

        //Step2: Go Through the reversed string using for loop
        for(int i=0;i<n;i++){
            StringBuilder word = new StringBuilder();
            while(i<n&& reversed.charAt(i)!=' '){
                word.append(reversed.charAt(i));
                i++;
            }
            //Reverse the individual word
            word.reverse();

            if(word.length()>0){
                ans.append(" ").append(word);//space+word
            }
        }

        
    
    return ans.toString().trim();

    }
}
