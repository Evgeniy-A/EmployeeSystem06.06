//package task_kata_20;
//
//import java.util.logging.Logger;
//
//public class MailSystem {
//    public interface Sendable {
//        String getFrom();
//
//        String getTo();
//    }
//
//    public static abstract class AbstractSendable implements Sendable {
//
//        protected final String from;
//        protected final String to;
//
//        public AbstractSendable(String from, String to) {
//            this.from = from;
//            this.to = to;
//        }
//
//        @Override
//        public String getFrom() {
//            return from;
//        }
//
//        @Override
//        public String getTo() {
//            return to;
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//
//            AbstractSendable that = (AbstractSendable) o;
//
//            if (!from.equals(that.from)) return false;
//            if (!to.equals(that.to)) return false;
//
//            return true;
//        }
//    }
//
//    public static class MailMessage extends AbstractSendable {
//
//        private final String message;
//
//        public MailMessage(String from, String to, String message) {
//            super(from, to);
//            this.message = message;
//        }
//
//        public String getMessage() {
//            return message;
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            if (!super.equals(o)) return false;
//
//            MailMessage that = (MailMessage) o;
//
//            if (message != null ? !message.equals(that.message) : that.message != null) return false;
//
//            return true;
//        }
//
//    }
//
//    public static class MailPackage extends AbstractSendable {
//        private final Package content;
//
//        public MailPackage(String from, String to, Package content) {
//            super(from, to);
//            this.content = content;
//        }
//
//        public Package getContent() {
//            return content;
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            if (!super.equals(o)) return false;
//
//            MailPackage that = (MailPackage) o;
//
//            if (!content.equals(that.content)) return false;
//
//            return true;
//        }
//
//    }
//
//    public static class Package {
//        private final String content;
//        private final int price;
//
//        public Package(String content, int price) {
//            this.content = content;
//            this.price = price;
//        }
//
//        public String getContent() {
//            return content;
//        }
//
//        public int getPrice() {
//            return price;
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//
//            Package aPackage = (Package) o;
//
//            if (price != aPackage.price) return false;
//            if (!content.equals(aPackage.content)) return false;
//
//            return true;
//        }
//    }
//
//    public static interface MailService {
//        Sendable processMail(Sendable mail);
//    }
//
//    /*
//    Класс, в котором скрыта логика настоящей почты
//    */
//    public static class RealMailService implements MailService {
//
//        @Override
//        public Sendable processMail(Sendable mail) {
//            // Здесь описан код настоящей системы отправки почты.
//            return mail;
//        }
//    }
//    public static class UntrustworthyMailWorker implements MailService{
//        MailService[] mailServices;
//        RealMailService rms = new RealMailService();
//        public UntrustworthyMailWorker(MailService[] mailServices) {
//            this.mailServices = mailServices;
//        }
//        @Override
//        public Sendable processMail(Sendable mail) {
//            for (MailService m: mailServices) {
//                mail =  m.processMail(mail);
//            }
//            return rms.processMail(mail);
//        }
//    }
//
//    public static class Spy implements MailService{
//        private final Logger logger;
//
//        public Spy(Logger logger) {
//            this.logger = logger;
//        }
//
//
//        @Override
//        public Sendable processMail(Sendable mail) {
//           if (mail instanceof MailMessage) {
//               MailMessage newMail = (MailMessage) mail;
//               if(newMail.from.equals("Austin Powers"));
//           }
//        }
//    }
//
//}
//
//
