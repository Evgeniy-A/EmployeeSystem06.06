package exceptions.TaskExceopt;

public class Task2  {

        public static String castToString(Object o) {
            String result = "";
            try {
                result = (String) o;
            } catch (ClassCastException e) {
                System.err.println("Error: Object cannot be cast to String");
            }
            return result;
        }
    }


