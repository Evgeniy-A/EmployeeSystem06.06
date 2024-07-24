package enumes.season;


public class test {
    public static void main(String[] args) {

        Season[] seasons = Season.values();
        Season lovelySeason = Season.WINTER;

        for (Season season : seasons) {
            System.out.println("Время года: " + season.getSeasonName());
            System.out.println("Средняя температура: " + season.getAverageTemp());
            System.out.println(season.getDescription());
            System.out.println();
        }


        System.out.println("Любимое время года: " + lovelySeason.getSeasonName());
        System.out.println("Средняя температура: " + lovelySeason.getAverageTemp());
        System.out.println(lovelySeason.getDescription());
    }
}