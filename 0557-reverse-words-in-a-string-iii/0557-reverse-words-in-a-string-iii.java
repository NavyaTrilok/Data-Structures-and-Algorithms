class Solution {
    public String reverseWords(String s) {
        // Trim leading and trailing whitespace
        s = s.trim();
        
        // Split the string into words
        String[] words = s.split("\\s+");
        String[] reversedWords = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            char[] wordChars = words[i].toCharArray();
            // Reverse the characters of each word
            for (int j = 0, k = wordChars.length - 1; j < k; j++, k--) {
                char temp = wordChars[j];
                wordChars[j] = wordChars[k];
                wordChars[k] = temp;
            }
            reversedWords[i] = new String(wordChars);
        }

        // Join the reversed words with spaces
        return String.join(" ", reversedWords);
    }
}
