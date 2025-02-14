package Job_Programs;

// import java.util.Arrays;

class Anagram {
    boolean isAnagram = true;

    public void checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            isAnagram = false;
        } 
        else {
            char[] str1 = s1.toLowerCase().toCharArray();
            char[] str2 = s2.toLowerCase().toCharArray();

            boolean[] visited = new boolean[str2.length];  // Track visited characters

            for (int i = 0; i < str1.length; i++) {
                boolean found = false;
                for (int j = 0; j < str2.length; j++) {
                    if (str1[i] == str2[j] && !visited[j]) { // Check if character is not visited
                        visited[j] = true;  // Mark character as used
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    isAnagram = false;
                    break;
                }
            }
        }
    }


    public void display (String s1, String s2) {
        System.out.println();
        if (isAnagram) {
            System.out.println(s1 + " and " + s2 + " are Anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not Anagrams");
        }
    }
}

public class Anagram_or_Not {
    public static void main(String[] args) {
        String s1 = "llggmm";
        String s2 = "lgmlgm";

        // // Method 1: Using Arrays.sort() and Arrays.equals()
        
        // boolean isAnagram = true;
        // if (s1.length() != s2.length()) {
        //     isAnagram = false;
        // } else {
        //     char[] str1 = s1.toLowerCase().toCharArray();
        //     char[] str2 = s2.toLowerCase().toCharArray();
        //     Arrays.sort(str1);
        //     Arrays.sort(str2);
        //     isAnagram = Arrays.equals(str1, str2);
        // }
        // System.out.println();
        // if (isAnagram) {
        //     System.out.println(s1 + " and " + s2 + " are Anagrams");
        // } else {
        //     System.out.println(s1 + " and " + s2 + " are not Anagrams");
        // }

        // Method 2: Using custom method

        Anagram anagram = new Anagram();
        anagram.checkAnagram(s1, s2);

        anagram.display(s1, s2);
    }
}