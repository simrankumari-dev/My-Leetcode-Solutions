class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        for (char s : stones.toCharArray()) {
            if (jewels.indexOf(s) != -1) {  // character found in jewels
                count++;
            }
        }

        return count;
    }
}
