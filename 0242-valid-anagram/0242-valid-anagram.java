class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int count[]=new int[26];//we assume only lower case letters
        
        for(char ch:s.toCharArray()){  //Loop of incrementing the value of count as its correct place
            count[ch-'a']++;
            
        }
        for(char ch:t.toCharArray()){ // Loop of decrementing the value of count when we get the sepcifiecd character in string 2 which is already in string1 
            count[ch-'a']--;
        }
        for(int val:count){  // Checking if count has number other than 1 if yes then return false as this is not the anagrams case 
            if(val!=0){
                return false;
            }
        }
        return true;
        
    }
}
