package kata.task326;

public class Test {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        int count = 3;
        for (int i = 0; i < count; i++) {
            try (RobotConnection connection = robotConnectionManager.getConnection()) {
                connection.moveRobotTo(toX, toY);
                return;
            } catch (RobotConnectionException rce) {
                if (i == 2) {
                    throw rce;
                }
            }
        }
    }
}
