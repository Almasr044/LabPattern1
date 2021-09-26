package ObserverPatternLab.Listener;

import ObserverPatternLab.Object.FacebookUser;

public class EmailNotificationListener implements IEventListener {

        private FacebookUser user;

        public EmailNotificationListener(FacebookUser user) {
            this.user = user;
        }

        @Override
        public void update(String eventType, String displayName, String url) {
            System.out.println(
                    "Уведомление почты от Facebook >> Привет " + this.user.getFirstName() + ", " +
                            displayName + " вышел новый контент (успей посмотреть его!): " + eventType + " >> " + url );
        }
    }

