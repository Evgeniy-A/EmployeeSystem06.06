package enumes.level;

import org.w3c.dom.ls.LSOutput;

public class Test {

        public void printInfo (Level level){
            switch (level) {
                case Low:
                    System.out.println("Низкий");
                    break;
                case Medium:
                    System.out.println("Средний");
                    break;
                case High:
                    System.out.println("Высокий");
                    break;
            }
        }
    }

