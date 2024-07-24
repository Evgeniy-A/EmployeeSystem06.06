package generics.task1;

public class Task {

    public static <T> boolean isEqual ( T[] array1,T[] array2){
        if (array1.length != array2.length)
            return false;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i])
                return false;
        }
        return true; 
    }

}
