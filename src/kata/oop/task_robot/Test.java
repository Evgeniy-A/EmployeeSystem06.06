//package kata.oop.task_robot;
//
//import static jdk.internal.icu.lang.UCharacter.getDirection;
//
//public class Test {
//    public static void main(String[] args) {
//
//        public static void moveRobot(Robot robot, int toX, int toY) {
//            if (robot.getX() == toX && robot.getY() == toY) {
//                return;
//            }
//            if (toX > robot.getX()) {
//                while (robot.getDirection() !=  Direction.RIGHT) {
//                    robot.turnRight();
//                }
//                while (toX != robot.getX()) {
//                    robot.stepForward();
//                }
//            }
//            if (toX < robot.getX()) {
//                while (robot.getDirection() != Direction.LEFT ) {
//                    robot.turnLeft();
//                }
//                while (toX != robot.getX()){
//                    robot.stepForward();
//                }
//            }
//            if (toY > robot.getY()) {
//                while (robot.getDirection() != Direction.UP) {
//                    robot.turnRight();
//                }
//                while (toY != robot.getY()) {
//                    robot.stepForward();
//                }
//            }
//            if (toY < robot.getY()) {
//                while (robot.getDirection() != Direction.DOWN) {
//                    robot.turnRight();
//                }
//                while (toY != robot.getY()) {
//                    robot.stepForward();
//                }
//            }
//        }
//    }
//
//}
