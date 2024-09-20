package kata.oop.task2311;

public class Task {
    public class Human {

        private final String secret; //секретики

        public final String news; //новости

        protected final String experience; //опыт

        final String gossip; //сплетни


        public Human(String secret, String news, String experience, String gossip) {

            this.secret = secret;

            this.news = news;

            this.experience = experience;

            this.gossip = gossip;

        }

        private String getSecret() {
            return secret;
        }

        public String getNews() {
            return news;
        }

        protected String getExperience() {
            return experience;
        }

        String getGossip() {
            return gossip;
        }
    }
}
