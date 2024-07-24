package generics;

public class Pair<T,E> {
   T firstElement;
   E secondElement;

    public Pair(T firstElement, E secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public T getFirstElement() {
        return firstElement;
    }

    public void setFirstElement(T firstElement) {
        this.firstElement = firstElement;
    }

    public E getSecondElement() {
        return secondElement;
    }

    public void setSecondElement(E secondElement) {
        this.secondElement = secondElement;
    }
}

