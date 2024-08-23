package generics.task2;



import java.io.Serializable;
import java.sql.SQLOutput;

public class Task2 <T extends Comparable,V, K>{
    T name1;
    V name2;
    K name3;

    public Task2(T name1, V name2, K name3) {
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
    }



    public T getName1() {
        return name1;
    }
    public V getName2() {
        return name2;
    }
    public K getName3() {
        return name3;
    }
    public void GetNameClass(){
        System.out.println(name1.getClass().getName());
        System.out.println(name2.getClass().getName());
        System.out.println(name3.getClass().getName());
    }




}
