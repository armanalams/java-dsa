class Solution {
    public int numTilePossibilities(String tiles) {
        int[] freq = new int[26];

        for (char ch : tiles.toCharArray()) {
            freq[ch - 'A']++;
        }

        return backtrack(freq);
    }

    public int backtrack(int[] freq) {
        int count = 0;

        for (int i = 0; i < 26; i++) {

            // Is letter ki tile available nahi hai
            if (freq[i] == 0) {
                continue;
            }

            // Ek naya string bana
            count++;

            // Letter use karo
            freq[i]--;

            // Aage aur letters add karo
            count += backtrack(freq);

            // Backtrack: letter wapas
            freq[i]++;
        }

        return count;
    }
}
