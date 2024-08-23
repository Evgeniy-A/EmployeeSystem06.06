package clone.car;

public class Car implements Cloneable{
   private String name;
    private Engine engine;

    public Car(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public Car(Car cloningCar){
        this (cloningCar.name, new Engine(cloningCar.engine));
    }

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

//    public Car clone () throws CloneNotSupportedException {
//        return (Car) super.clone();
//    }

    public Car clone () throws CloneNotSupportedException{
        Car car = (Car) super.clone();
        car.setEngine(this.getEngine().clone());
        return car;
    }

    public static class Engine implements Cloneable{
        private String name;

        public Engine(String name) {
            this.name = name;
        }
        public Engine (Engine cloningEngine){
            this(cloningEngine.name);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Engine clone () throws CloneNotSupportedException{
            return (Engine) super.clone();
        }
    }
}