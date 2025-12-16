import java.util.*;

class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        Set<String> bankSet = new HashSet<>();
        for (String gene : bank) {
            bankSet.add(gene);
        }
        
        // If endGene is not in bank, no valid mutation path
        if (!bankSet.contains(endGene)) {
            return -1;
        }

        char[] genes = {'A', 'C', 'G', 'T'};
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.offer(startGene);
        visited.add(startGene);

        int mutations = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                String current = queue.poll();
                
                if (current.equals(endGene)) {
                    return mutations;
                }

                char[] currentArr = current.toCharArray();
                
                for (int pos = 0; pos < currentArr.length; pos++) {
                    char oldChar = currentArr[pos];
                    
                    for (char c : genes) {
                        if (c == oldChar) continue;
                        
                        currentArr[pos] = c;
                        String next = new String(currentArr);
                        
                        if (bankSet.contains(next) && !visited.contains(next)) {
                            visited.add(next);
                            queue.offer(next);
                        }
                    }
                    
                    currentArr[pos] = oldChar; // restore
                }
            }
            mutations++;
        }

        return -1;
    }
}
