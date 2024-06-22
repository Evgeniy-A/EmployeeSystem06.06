package phone;

public interface SmartPhone {

    default void call(String phoneNumber) {
        System.out.println("Звонок по номеру" + phoneNumber);
    }
    default void sendSms (String text,String phoneNumber){
        System.out.println("Отправить");
    }
    void takePhoto();
}
