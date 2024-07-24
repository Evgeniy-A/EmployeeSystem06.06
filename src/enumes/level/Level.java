package enumes.level;

public enum Level {
Low{
    @Override
    public void printInfo() {
        System.out.println("Низкий уровень");
    }
},
    Medium{
        @Override
        public void printInfo() {
            System.out.println("Средний уровень");
        }
    },
    High{
        @Override
        public void printInfo() {
            System.out.println("Высокий уровень");
        }
    }, printInfo();

    private int scores;

    Level(int scores) {
        this.scores = scores;
    }

    Level() {
        this(0);
    }

    public int getScores() {
        return scores;
    }

    public void printInfo(){};
}
