package com.finepointmobile;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String sentence = "A slow yellow fox crawls under the proactive dog.";
        ArrayList<Character> characters = new ArrayList<Character>();

        // convert to lower case?
        sentence = sentence.toLowerCase();

        for (int i = 0; i < alphabet.length; i++) {
            if (!sentence.contains(String.valueOf(alphabet[i]))) {
                characters.add(alphabet[i]);
            }
        }

        if (characters.size() == 0) {
            System.out.println("NULL");
        } else {
            for (int i = 0; i < characters.size(); i++) {
                System.out.print(characters.get(i));
            }
        }

    }
}
