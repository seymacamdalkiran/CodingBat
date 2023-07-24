import java.util.*;
public class Warmup_2 {
    public static void main(String[] args) {
        int[] arr={1, 1, 1, 2, 2, 2, 1};
        System.out.println("noTriples(arr) = " + noTriples(arr));
    }

    public String stringTimes(String str, int n) {
/*
Given a string and a non-negative int n, return a larger string that is n copies of the original string.

stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
 */
        String result="";
        for (int i = 0; i < n; i++) {
            result+=str;
        }
        return result;
    }

    boolean doubleX(String str) {
/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
 */
        for (int i = 0; i < str.length() - 1; i++) {
            if(str.substring(i,i+1).equals("x")){
                if(str.substring(i+1,i+2).equals("x")){
                    return true;
                }else return false;
            }
        }
        return false;
    }

    public int last2(String str) {
/*
Given a string, return the count of the number of times that a substring length 2 appears in the
string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).

last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
 */
        int count=0;
        for (int i = 0; i < str.length() - 2; i++) {
            if(str.substring(i,i+2).equals(str.substring(str.length()-2))){
                count++;
            }
        }
        return count;
    }

    public boolean array123(int[] nums) {
/*
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
 */
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set.contains(1)&& set.contains(2)&&set.contains(3);
    }
    public static String altPairs(String str) {
/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
 */
        String result = "";
        for (int i = 0; i < str.length(); ) {
            if(str.length()<2){
                return str;
            }
            result+=str.substring(i,i+2);
            i+=4;
            if(i==str.length()-1){
                result+=str.substring(i,i+1);
                i++;
            }
        }
        return result;
    }

    public static boolean noTriples(int[] nums) {
/*
Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
Return true if the array does not contain any triples.

noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false
 */
        if(nums.length<3) return true;
        for (int i = 0; i <nums.length-2 ; i++) {
            if(nums[i]==nums[i+1]&& nums[i+1]==nums[i+2]) return false;
        }
        return true;
    }

    public String frontTimes(String str, int n) {
/*
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
or whatever is there if the string is less than length 3. Return n copies of the front;

frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
 */
        String result="";
        for (int i = 0; i < n; i++) {
            if(str.length()>3) result+=str.substring(0,3);
            else result+=str;
        }
        return result;
    }

    public String stringBits(String str) {
/*
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
 */
        String result="";
        for (int i = 0; i < str.length(); ) {
            result+=str.substring(i,i+1);
            i+=2;
        }
        return result;
    }

    public int arrayCount9(int[] nums) {
/*
Given an array of ints, return the number of 9's in the array.

arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
 */
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==9) count++;
        }
        return count;
    }

    public int stringMatch(String a, String b) {
/*
Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.

stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
 */
        int count=0;
        for (int i = 0; i < a.length() - 1; i++) {
            if(i<b.length()-1 && a.substring(i,i+2).equals(b.substring(i,i+2))) count++;
        }
        return count;
    }

    public String stringYak(String str) {
/*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
but the "a" can be any char. The "yak" strings will not overlap.

stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
 */
        return str.replace("yak","");
    }

    public boolean has271(int[] nums) {
/*
Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5,
followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true
 */
        for (int i = 0; i < nums.length - 2; i++) {
            int num=nums[i];
            if (nums[i+1]==num+5) {
                if(nums[i+2]==num-1) return true;
                else if(Math.abs(nums[i+2]-(num-1))<=2) return true;    //abs mutlak değer demek
            }
        }
        return false;
    }

    int countXX(String str) {
/*
Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
 */
        int count=0;
        for (int i = 0; i < str.length() - 1; i++) {
            if(str.substring(i,i+2).equals("xx")) count++;
        }
        return count;
    }

    public String stringSplosion(String str) {
/*
Given a non-empty string like "Code" return a string like "CCoCodCode".

stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
 */
        String result="";
        for (int i = 0; i < str.length()+1; i++) {
            result+=str.substring(0,i);
        }
        return result;
    }

    public boolean arrayFront9(int[] nums) {
/*
Given an array of ints, return true if one of the first 4 elements in the array is a 9.
The array length may be less than 4.


arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false
 */
        for (int i = 0; i < 4; i++) {
            if(nums.length==i) break;
            if (nums[i]==9) return true;
        }
        return false;
    }
    public String stringX(String str) {
/*
Given a string, return a version where all the "x" have been removed.
Except an "x" at the very start or end should not be removed.

stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
 */
        if(str.length()<2) return str;
        return str.substring(0,1)+str.substring(1,str.length()-1).replace("x","")+str.substring(str.length()-1);
    }

    public int array667(int[] nums) {
/*
Given an array of ints, return the number of times that two 6's are next to each other in the array.
Also count instances where the second "6" is actually a 7.

array667([6, 6, 2]) → 1
array667([6, 6, 2, 6]) → 1
array667([6, 7, 2, 6]) → 1
 */
        int count=0;
        for (int i = 0; i < nums.length - 1; i++) {
            if((nums[i]==6 && nums[i+1]==6)|| (nums[i]==6 && nums[i+1]==7) ){
                count++;
            }
        }
        return count;
    }

}
