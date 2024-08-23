package task.kata;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(textModifier());
    }
    public static String textModifier() {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] charArray = line.toCharArray();
        int sum = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                while (i + 1 < charArray.length && charArray[i + 1] == ' ') {
                    i++;
                }
            }
            result.append(charArray[i]);
        }


        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '-' && i > 0 && i < result.length() - 1) {
                char left = result.charAt(i - 1);
                char right = result.charAt(i + 1);
                result.setCharAt(i - 1, right);
                result.setCharAt(i + 1, left);
                result.deleteCharAt(i);
                i++;
            }
        }


        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '+') {
                result.setCharAt(i, '!');
            }
        }

        StringBuilder sb = new StringBuilder();
        if (result.toString().matches(".*[0-9]+.*")) {
            for (int i = 0; i < result.length(); i++) {
                if (Character.isDigit(result.charAt(i))) {
                    sum += Character.getNumericValue(result.charAt(i));
                } else {
                    sb.append(result.charAt(i));
                }
            }
            sb.append(" ").append(sum);
            return sb.toString();
        }
        return result.toString();
    }
}