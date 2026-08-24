class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        int[] lastSeen = new int[128];
        for(int i = 0; i < 128; i++) {
            lastSeen[i] = -1;
        }
        char[] chars = s.toCharArray();
        for(int right = 0; right < chars.length; right++) {
            char ch = chars[right];
            if(lastSeen[ch] >= left) {
                left = lastSeen[ch] + 1;
            }
            lastSeen[ch] = right;
            int currentLength = right - left + 1;
            if(currentLength > maxLength) {
                maxLength = currentLength;
            }
        }
        return maxLength;
    }
}