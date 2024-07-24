package enumes.season;

public enum Season {
    WINTER(-25, "Зима"),
    SPRING(12, "Весна"),
    SUMMER(25, "Лето") {
        @Override
        public String getDescription(){
            return "Теплое время года";
        }
    },
    AUTUMN(6, "Осень");
// переменная
    private double averageTemp;
    private String seasonName;
// конструктор

    Season(double averageTemp, String seasonName) {
        this.averageTemp = averageTemp;
        this.seasonName = seasonName;
    }

    //  метод с описанием
    public String getDescription(){
        return "Холодное время года";
    }
// геттер для получения средней температуры
    public double getAverageTemp() {
        return averageTemp;
    }

    public String getSeasonName() {
        return seasonName;
    }

}
