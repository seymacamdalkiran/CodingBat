public class ZeroDensity {
    public static void main(String[] args) {

        String str = "     aaaffccceee     1 12dda 123 ffc!aafff";
        String str1 = null;


        //    System.out.println(fizzBuzz(str));

        System.out.println(compressor(str));
    }

    public static String fizzBuzz(String text,int number) {

        text = text.replaceAll("\\s+", " ");
        String erase = "";
        for (int i = 0; i < text.length(); i++) {
            if (Character.isAlphabetic(text.charAt(i))) {
                int length = text.length() - text.replace(text.substring(i, i + 1), "").length();

                if (length < number) {
                    erase += text.substring(i, i + 1);
                }
            }
        }
        for (int i = 0; i < erase.length(); i++) {
            text = text.replace(erase.substring(i, i + 1), "");
        }
        return text.trim();
    }

    public static String compressor(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }
        text = text.replaceAll("[^a-zA-Z ]", "");
        text = text.replaceAll("\\s+", " ").trim();
        String result = "";
        char currentChar = text.charAt(0);
        int count = 1;
        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) == currentChar) {
                count++;
            } else {
                result += currentChar;
                if (count > 1) {
                    result += count;
                }
                currentChar = text.charAt(i);
                count = 1;
            }
        }

        result += currentChar;
        if (count > 1) {
            result += count;
        }

        return result;
    }
}
