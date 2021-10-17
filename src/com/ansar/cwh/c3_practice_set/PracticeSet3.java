package com.ansar.cwh.c3_practice_set;

public class PracticeSet3 {
    public static void main(String[] args) {
        //Problem1
        String name = "Ansar";
        name = name.toLowerCase(); // now the letter variable referring to this letter
        System.out.println(name);

        //Problem2
        String str = "This is string for test";
        str = str.replace(" ", "_");
        System.out.println(str);

        //Problem3
        String letter = "Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>", name);
        System.out.println(letter);

        //Problem4
        String line = "This line has double  spcae and triple   space.";
        System.out.println(line.indexOf("  "));
        System.out.println(line.indexOf("   "));

        //Problem5
        String myLetter = "Dear Ansar,\n \tThis is java practice is nice.\n \tThanks!";
        System.out.println(myLetter);

    }
}
