public class String_1 {
    public static void main(String[] args) {
        System.out.println("atFirst(\"h\") = " + atFirst("h"));
    }
    public String helloName(String name) {
        /*
        Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

        helloName("Bob") → "Hello Bob!"
        helloName("Alice") → "Hello Alice!"
        helloName("X") → "Hello X!"
         */
        return "Hello "+name+"!";
    }

    public String makeOutWord(String out, String word) {
        /*
        Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

        makeOutWord("<<>>", "Yay") → "<<Yay>>"
        makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
        makeOutWord("[[]]", "word") → "[[word]]"
         */
        return out.substring(0,2)+word+out.substring(2);
    }

    public String firstHalf(String str) {
/*
        Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

        firstHalf("WooHoo") → "Woo"
        firstHalf("HelloThere") → "Hello"
        firstHalf("abcdef") → "abc"
 */
        return str.substring(0,str.length()/2);
    }

    public String nonStart(String a, String b) {
        /*
         Given 2 strings, return their concatenation, except omit the first char of each.
         The strings will be at least length 1.

        nonStart("Hello", "There") → "ellohere"
        nonStart("java", "code") → "avaode"
        nonStart("shotl", "java") → "hotlava"
         */
        return a.substring(1)+b.substring(1);
    }

    public String theEnd(String str, boolean front) {
        /*
        Given a string, return a string length 1 from its front, unless front is false,
        in which case return a string length 1 from its back. The string will be non-empty.

        theEnd("Hello", true) → "H"
        theEnd("Hello", false) → "o"
        theEnd("oh", true) → "o"
         */
        if(front) return str.substring(0,1);
        else return str.substring(str.length()-1);
    }

    public boolean endsLy(String str) {
        /*
        Given a string, return true if it ends in "ly".

        endsLy("oddly") → true
        endsLy("y") → false
        endsLy("oddy") → false
         */
        return str.endsWith("ly");
    }

    public String middleThree(String str) {
        /*
        Given a string of odd length, return the string length 3 from its middle,
        so "Candy" yields "and". The string length will be at least 3.

        middleThree("Candy") → "and"
        middleThree("and") → "and"
        middleThree("solving") → "lvi"
         */
        return str.substring(str.length()/2-1,str.length()/2+2);
    }

    public String lastChars(String a, String b) {
        /*
        Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
        so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.

        lastChars("last", "chars") → "ls"
        lastChars("yo", "java") → "ya"
        lastChars("hi", "") → "h@"
         */
        String result="";
            if(a.isEmpty()&&!b.isEmpty()) result="@"+b.substring(b.length()-1);
            else if(!a.isEmpty()&&b.isEmpty()) result=a.substring(0,1)+"@";
            else if(a.isEmpty()&&b.isEmpty()) result="@@";
            else return a.substring(0,1)+b.substring(b.length()-1);
        return result;
    }

    public String seeColor(String str) {
        /*
        Given a string, if the string begins with "red" or "blue" return
        that color string, otherwise return the empty string.

        seeColor("redxx") → "red"
        seeColor("xxred") → ""
        seeColor("blueTimes") → "blue"
         */
        if(str.startsWith("red")) return "red";
        else if (str.startsWith("blue")) return "blue";
        return "";
    }

    public String extraFront(String str) {
        /*
        Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
        The string may be any length. If there are fewer than 2 chars, use whatever is there.

        extraFront("Hello") → "HeHeHe"
        extraFront("ab") → "ababab"
        extraFront("H") → "HHH"
         */
        if(str.length()>2) return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
        return str+str+str;
    }

    public String startWord(String str, String word) {
        /*
        Given a string and a second "word" string, we'll say that the word matches
        the string if it appears at the front of the string, except its first char does not
        need to match exactly. On a match, return the front of the string, or otherwise return
        the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip"
        returns "hip". The word will be at least length 1.

        startWord("hippo", "hi") → "hi"
        startWord("hippo", "xip") → "hip"
        startWord("hippo", "i") → "h"
         */
        if(!str.isEmpty() && (str.startsWith(word) || str.substring(1).startsWith(word.substring(1)))){
            return str.substring(0,word.length());
        }
        return "";
    }

    public String makeAbba(String a, String b) {
        /*
        Given two strings, a and b, return the result of putting them together
        in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

        makeAbba("Hi", "Bye") → "HiByeByeHi"
        makeAbba("Yo", "Alice") → "YoAliceAliceYo"
        makeAbba("What", "Up") → "WhatUpUpWhat"
         */
        return a+b+b+a;
    }

    public String extraEnd(String str) {
        /*
        Given a string, return a new string made of 3 copies of the last 2 chars
        of the original string. The string length will be at least 2.

        extraEnd("Hello") → "lololo"
        extraEnd("ab") → "ababab"
        extraEnd("Hi") → "HiHiHi"
         */
        return str.substring(str.length()-2)+str.substring(str.length()-2)+str.substring(str.length()-2);
    }

    public String withoutEnd(String str) {
        /*
        Given a string, return a version without the first and last char, so
        "Hello" yields "ell". The string length will be at least 2.

        withoutEnd("Hello") → "ell"
        withoutEnd("java") → "av"
        withoutEnd("coding") → "odin"
         */
        return str.substring(1,str.length()-1);
    }

    public String left2(String str) {
        /*
        Given a string, return a "rotated left 2" version where the first 2 chars are
        moved to the end. The string length will be at least 2.

        left2("Hello") → "lloHe"
        left2("java") → "vaja"
        left2("Hi") → "Hi"
         */
        return str.substring(2)+str.substring(0,2);
    }

    public String withouEnd2(String str) {
        /*
        Given a string, return a version without both the first and last char of the string.
        The string may be any length, including 0.

        withouEnd2("Hello") → "ell"
        withouEnd2("abc") → "b"
        withouEnd2("ab") → ""
         */
        if(str.length()>2) return str.substring(1,str.length()-1);
        return "";
    }

    public String nTwice(String str, int n) {
        /*
        Given a string and an int n, return a string made of the first and last n chars from the string.
        The string length will be at least n.

        nTwice("Hello", 2) → "Helo"
        nTwice("Chocolate", 3) → "Choate"
        nTwice("Chocolate", 1) → "Ce"
         */
        return str.substring(0,n)+str.substring(str.length()-n);
    }

    public boolean hasBad(String str) {
        /*
        Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
        such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
        Note: use .equals() to compare 2 strings.

        hasBad("badxx") → true
        hasBad("xbadxx") → true
        hasBad("xxbadxx") → false
         */
        return !str.isEmpty()&&(str.startsWith("bad")||str.substring(1).startsWith("bad"));
    }

    public String conCat(String a, String b) {
        /*
        Given two strings, append them together (known as "concatenation") and return the result. However, if
        the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

        conCat("abc", "cat") → "abcat"
        conCat("dog", "cat") → "dogcat"
        conCat("abc", "") → "abc"
         */
        if(!a.isEmpty() && !b.isEmpty() && a.substring(a.length()-1).equals(b.substring(0,1))) return a.substring(0,a.length()-1)+b;
        return a+b;
    }

    public boolean frontAgain(String str) {
        /*
        Given a string, return true if the first 2 chars in the string also
        appear at the end of the string, such as with "edited".

        frontAgain("edited") → true
        frontAgain("edit") → false
        frontAgain("ed") → true
         */
        return str.length()>1 &&str.endsWith(str.substring(0,2));
    }

    public String without2(String str) {
        /*
        Given a string, if a length 2 substring appears at both its beginning and end,
        return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
        The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.

        without2("HelloHe") → "lloHe"
        without2("HelloHi") → "HelloHi"
        without2("Hi") → ""
         */
        if (str.length()>1 && str.endsWith(str.substring(0,2))) return str.substring(2);
        else return str;
    }

    public String withoutX(String str) {
        /*
        Given a string, if the first or last chars are 'x', return the string without
        those 'x' chars, and otherwise return the string unchanged.

        withoutX("xHix") → "Hi"
        withoutX("xHi") → "Hi"
        withoutX("Hxix") → "Hxi"
         */
        if(str.length()>1 && str.startsWith("x") && str.endsWith("x")) return str.substring(1,str.length()-1);
        else if(str.startsWith("x")) return str.substring(1);
        else if(str.endsWith("x")) return str.substring(0,str.length()-1);
        return str;
    }

    public String makeTags(String tag, String word) {
        /*
        The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
        In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and
        word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

        makeTags("i", "Yay") → "<i>Yay</i>"
        makeTags("i", "Hello") → "<i>Hello</i>"
        makeTags("cite", "Yay") → "<cite>Yay</cite>"
         */
        return "<"+tag+">"+word+"</"+tag+">";
    }

    public String firstTwo(String str) {
        /*
       Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
       If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string ""
       yields the empty string "". Note that str.length() returns the length of a string.

        firstTwo("Hello") → "He"
        firstTwo("abcdefg") → "ab"
        firstTwo("ab") → "ab"
         */
        if(str.length()>2) return str.substring(0,2);
        return str;
    }

    public String comboString(String a, String b) {
        /*
        Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the
        outside and the longer string on the inside. The strings will not be the same length,
        but they may be empty (length 0).

        comboString("Hello", "hi") → "hiHellohi"
        comboString("hi", "Hello") → "hiHellohi"
        comboString("aaa", "b") → "baaab"
         */
        if(Math.min(a.length(),b.length())==a.length()) return a+b+a;
        else return b+a+b;
    }

    public String right2(String str) {
        /*
        Given a string, return a "rotated right 2" version where the last 2 chars are
        moved to the start. The string length will be at least 2.

        right2("Hello") → "loHel"
        right2("java") → "vaja"
        right2("Hi") → "Hi"
         */
        return str.substring(str.length()-2)+str.substring(0,str.length()-2);
    }

    public String middleTwo(String str) {
/*
        Given a string of even length, return a string made of the middle two chars,
        so the string "string" yields "ri". The string length will be at least 2.

        middleTwo("string") → "ri"
        middleTwo("code") → "od"
        middleTwo("Practice") → "ct"
 */
        return str.substring(str.length()/2-1,str.length()/2+1);
    }

    public String twoChar(String str, int index) {
/*
        Given a string and an index, return a string length 2 starting at the given index.
        If the index is too big or too small to define a string length 2, use the first 2 chars.
        The string length will be at least 2.

        twoChar("java", 0) → "ja"
        twoChar("java", 2) → "va"
        twoChar("java", 3) → "ja"
 */
        if (str.length()<index+2 || index<0) return str.substring(0,2);
        else return str.substring(index,index+2);
    }

    public static String atFirst(String str) {
        /*
        Given a string, return a string length 2 made of its first 2 chars.
        If the string length is less than 2, use '@' for the missing chars.

        atFirst("hello") → "he"
        atFirst("hi") → "hi"
        atFirst("h") → "h@"
         */
        /*
        String result="";
        for (int i = 0; i < 2; i++) {
            try {
                result+=str.substring(i,i+1);
            } catch (Exception e) {
                result+="@";
            }
        }
        return result;
         */
        if(str.length()>1) return str.substring(0,2);
        else if (str.length() == 1) return str+"@";
        else return "@@";
    }

    public String lastTwo(String str) {
        /*
        Given a string of any length, return a new string where the last 2 chars,
        if present, are swapped, so "coding" yields "codign".

        lastTwo("coding") → "codign"
        lastTwo("cat") → "cta"
        lastTwo("ab") → "ba"
         */
        if (str.length()>1) return str.substring(0,str.length()-2)+str.substring(str.length()-1)+str.substring(str.length()-2,str.length()-1);
        return str;
    }

    public String minCat(String a, String b) {
        /*
        Given two strings, append them together (known as "concatenation") and return the result.
        However, if the strings are different lengths, omit chars from the longer string so it is
        the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

        minCat("Hello", "Hi") → "loHi"
        minCat("Hello", "java") → "ellojava"
        minCat("java", "Hello") → "javaello"
         */
        if(a.length()>b.length()) return a.substring(a.length()-b.length())+b;
        return a+b.substring(b.length()-a.length());
    }

    public String deFront(String str) {
        /*
        Given a string, return a version without the first 2 chars. Except keep the first char
        if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.

        deFront("Hello") → "llo"
        deFront("java") → "va"
        deFront("away") → "aay"
         */
        if(str.length()>1 && !str.startsWith("a") && !str.substring(1,2).equals("b")) return str.substring(2);
        if(str.startsWith("ab")) return "ab"+ str.substring(2);
        else if(str.length()>1 && str.startsWith("a")) return "a"+str.substring(2);
        else if(str.length()>1 && str.substring(1,2).equals("b")) return "b"+ str.substring(2);
        else return "";
    }

    public String withoutX2(String str) {
        /*
        Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x'
        chars, and otherwise return the string unchanged. This is a little harder than it looks.

        withoutX2("xHi") → "Hi"
        withoutX2("Hxi") → "Hi"
        withoutX2("Hi") → "Hi"
         */
        if (str.startsWith("xx")) return str.substring(2);
        else if (str.startsWith("x")) return str.substring(1);
        else if (!str.isEmpty()&&str.substring(1,2).equals("x")) return str.substring(0,1)+str.substring(2);
        else return str;
    }

}
