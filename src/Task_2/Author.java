package Task_2;

import java.security.AlgorithmConstraints;

public class Author {

    String author ;

    public String getAuthor() {
        return author;
    }

    public boolean setAuthor(String author) {
        if (isAlphabetic(author)) {
            this.author = author;
            return true;
        } else {
            return false;
        }
    }

     static boolean isAlphabetic(String text) {
        boolean isAlphabetic = false;
        text = text.strip();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isAlphabetic(text.charAt(i)))
            {
                isAlphabetic = true;

            } else {
                isAlphabetic = false;
                break;
            }
        }
        return isAlphabetic;
    }


    public void show() {
        System.out.println( "Author: " +
                  author) ;
    }
}
