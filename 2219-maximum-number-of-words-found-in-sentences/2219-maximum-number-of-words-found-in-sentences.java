class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        
        for (String sentence : sentences) {
            // Split the sentence by spaces
            String[] words = sentence.split(" ");
            // Count words in this sentence
            int wordCount = words.length;
            // Update maxWords if current sentence has more words
            maxWords = Math.max(maxWords, wordCount);
        }
        
        return maxWords;
    }
}
