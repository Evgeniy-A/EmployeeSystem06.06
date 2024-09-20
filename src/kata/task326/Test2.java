package kata.task326;

public class Test2 {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        int count = 3;
        for (int i = 0; i < count; i++) {
            RobotConnection connection = null;
            try {
                connection = robotConnectionManager.getConnection();
                connection.moveRobotTo(toX, toY);
                return;
            } catch (RobotConnectionException rce) {
                if (i == 2) {
                    throw rce;
                }
            } finally {
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (Exception e) {
                    }
                }
            }
        }
    }
}