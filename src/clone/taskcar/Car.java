package clone.taskcar;

import java.io.Serializable;

public class Car implements Cloneable, Serializable {
    private String marker;
    private String model;

    public Car(String marker, String model) {
        this.marker = marker;
        this.model = model;
    }

    public Car() {
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car clone() throws CloneNotSupportedException{
        return (Car) super.clone();
    }



}