public class Main {
    public static void main(String[] args) {
        String input = "heLLo WOrLd";
        String swappedString = swapCase(input);
        System.out.println(swappedString);
    }

    public static String swapCase(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (Character.isUpperCase(c)) {
                charArray[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                charArray[i] = Character.toUpperCase(c);
            }
        }
        return new String(charArray);
    }
}