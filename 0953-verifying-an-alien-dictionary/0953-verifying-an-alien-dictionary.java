class Solution {
     public boolean isAlienSorted(String[] words, String order) {
        int[] dict = new int[26];
        for (int i = 0; i < dict.length; i++) {
            int idx = order.charAt(i) - 'a';
            dict[idx] = i;
        }
        for (int i = 0; i < words.length -1; i++) {
            if(compare(words[i], words[i +1], dict) > 0)return false;
        }

        return true;
    }

    private int compare(String word1, String word2, int[] dict)
    {
        int L1 = word1.length();
        int L2 = word2.length();
        int min = Math.min(L1,L2);
        for (int i = 0; i < min; i++) {
            int c1 = word1.charAt(i) - 'a';
            int c2 = word2.charAt(i) - 'a';
            if(c1 != c2)
                return dict[c1] - dict[c2];
        }
        return L1 == min ? -1 : 1;
    }
}