class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int l =  0 ;
        int h = sb.length() - 1;
        String vowels = "aeiouAEIOU";

        while (l < h) {
            if (vowels.indexOf(sb.charAt(l)) != -1 && vowels.indexOf(sb.charAt(h)) != -1) {
                // Swap vowels
                char temp = sb.charAt(l);
                sb.setCharAt(l, sb.charAt(h));
                sb.setCharAt(h, temp);
                l++;
                h--;
            } else if (vowels.indexOf(sb.charAt(l)) == -1) {
                l++;
            } else {
                h--;
            }
        }

        return sb.toString();
    }
}
