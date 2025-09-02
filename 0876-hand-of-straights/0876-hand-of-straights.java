class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;

        TreeMap<Integer, Integer> countMap = new TreeMap<>();
        for (int card : hand) {
            countMap.put(card, countMap.getOrDefault(card, 0) + 1);
        }

        while (!countMap.isEmpty()) {
            int first = countMap.firstKey(); // smallest available card
            for (int i = 0; i < groupSize; i++) {
                int card = first + i;
                if (!countMap.containsKey(card)) return false;

                countMap.put(card, countMap.get(card) - 1);
                if (countMap.get(card) == 0) {
                    countMap.remove(card);
                }
            }
        }
        return true;
    }
}
