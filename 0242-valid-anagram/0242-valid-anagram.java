class Solution {
    public boolean isAnagram(String s, String t) {
        //Checking if the length of string same or not , If not same then definately it will be not a valid anagram
        if(s.length()!=t.length()){
            return false;

        }
        //We do not have a sorting method in string to sort the string so we have to convert it into charArray
        char[] sArr=s.toCharArray();
        char[] tArr=t.toCharArray();

        //sort both arrays
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        //Commpare sorted arrays
        return Arrays.equals(sArr,tArr);

     


        
    }
}