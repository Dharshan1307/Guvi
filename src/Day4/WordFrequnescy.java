package Day4;

import java.util.*;

public class WordFrequnescy {

    public static void main(String[] args) {
        String str = "Java Coding Java";
        String[] words = str.split(" ");
        int n = words.length;

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int count = 1; 
                for (int j = i + 1; j < n; j++) {
                    if (words[i].equals(words[j])) {
                        visited[j] = true;
                        count++;
                    }
                }
                System.out.println("count of " + words[i] + " = " + count);
            }
        }
    }
}
