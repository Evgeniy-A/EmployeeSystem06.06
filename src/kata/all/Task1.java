package kata.all;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    public static int[] inverseArray(int[] numbers) {
        if (numbers.length == 0) {
            return new int[0];
        }
        int index = numbers.length - 1;
        int[] newArray = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            newArray[index--] = numbers[i];
        }
        return newArray;
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] array = new int[firstArray.length + secondArray.length];
        int index = 0;

        for (int i = 0; i < firstArray.length; i++) {
            array[index++] = firstArray[i];
        }
        for (int i = 0; i < secondArray.length; i++) {
            array[index++] = secondArray[i];
        }
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int sort = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = sort;
                }
            }
        }
        return array;
    }

    public static void printArray(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length == 0) {
            return new int[0];
        }
        int[] center;
        int len = numbers.length / 2;

        if (numbers.length % 2 == 0) {
            center = Arrays.copyOfRange(numbers, len - 1, len + 1);
        } else {
            center = Arrays.copyOfRange(numbers, len, len + 1);
        }
        return center;
    }

    public static int[] dSort(int[] firstArray, int[] secondArray) {
        int[] array = Arrays.copyOf(firstArray, firstArray.length + secondArray.length);
        System.arraycopy(secondArray, 0, array, firstArray.length, secondArray.length);
        Arrays.sort(array);
        return array;
    }

    public static void printOddNumbers(int[] arr) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                str.append(arr[i]).append(",");
            }
        }

        if (!str.isEmpty()) {
            str.deleteCharAt(str.length() - 1);
            System.out.println(str);
        } else {
            System.out.println("");
        }
    }

    public void parseAndPrintNumber(String str) {
        int x = Integer.parseInt(str);
        System.out.print (x / 2);
    }

    public static boolean isPalindrome(String text) {
        String str = text.replaceAll("[^a-zA-Z0-9]", "");
        String reverseStr = new StringBuilder(str).reverse().toString();
        return (str.equalsIgnoreCase(reverseStr));
    }

    public static boolean isGmailOrOutlook(String email) {
        //return email.matches("^[a-zA-Z0-9._%+-]{3,}@(gmail\\.com|outlook\\.com)$");
        Pattern patern = Pattern.compile("^[a-zA-Z0-9._%+-]{3,}@(gmail\\.com|outlook\\.com)$");
        Matcher matcher = patern.matcher(email);
        boolean matches = matcher.matches();
        return matches;
    }

    public static String Text(String [] roles, String [] textLines) {

        StringBuilder[] roleTexts = new StringBuilder[roles.length];
        for (int i = 0; i < roles.length; i++) {
            roleTexts[i] = new StringBuilder(roles[i] + ":\n");
        }


        for (int i = 0; i < textLines.length; i++) {
            String line = textLines[i];
            for (int j = 0; j < roles.length; j++) {
                String role = roles[j] + ":";
                if (line.startsWith(role)) {
                    String speech = line.substring(role.length()).trim();
                    roleTexts[j].append((i + 1)).append(") ").append(speech).append("\n");
                    break;
                }
            }
        }


        StringBuilder result = new StringBuilder();
        for (StringBuilder roleText : roleTexts) {
            result.append(roleText).append("\n");
        }


        return result.toString().trim();
    }

}