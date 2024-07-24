package exceptions;

public class TaskException {

    public static void makeUser(String login, String password, String confirmPassword){
        try {
            check(login, "login");
            check(password, "passwd");
            if(!password.equals(confirmPassword)){
                throw new WrongPasswordException("Пароли не совпадают");
            }
        }
        catch (WrongLoginException e){
            System.out.println("Неверный логин " + e.getMessage());
        }
        catch (WrongPasswordException e){
            System.out.println(("Неверный пароль " + e.getMessage()));
        }
    }
    public static void check(String line, String type) {
        String pattern = "[a-zA-Z0-9_]*";
        if (line.length() > 20 || !line.matches(pattern)) {
            if (type.equals("login")) {
                throw new WrongLoginException("Некорректный логин");
            } else {
                throw new WrongPasswordException("Некорректный пароль");
            }
        }
    }
}


