package generics.task3;

import java.util.ArrayList;

public class Task3 {
   public static <T> int getIndex(ArrayList<T>list,T ob){
       return list.indexOf(ob);
   };
}
