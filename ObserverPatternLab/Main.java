package ObserverPatternLab;

import ObserverPatternLab.Listener.EmailNotificationListener;
import ObserverPatternLab.Object.FacebookUser;
import ObserverPatternLab.Object.FollowType;
import ObserverPatternLab.Publisher.FacebookPage;

public class Main {

    public static void main(String[] args) {
        FacebookPage facebookPage = new FacebookPage("от канала Мемы кодинга :)");

        FacebookUser user1 = new FacebookUser("Almas", "almas_nur02@mail.ru");


        EmailNotificationListener EmailNotification = new EmailNotificationListener(user1);

        facebookPage.follow(FollowType.VIDEO, EmailNotification);
        facebookPage.follow(FollowType.LIVE_STREAM, EmailNotification);
        facebookPage.follow(FollowType.ARTICLE, EmailNotification);

        facebookPage.publishVideo("https://www.youtube.com/");
        facebookPage.startLiveStream("https://www.microsoft.com/en-us/microsoft-365/microsoft-stream");
        facebookPage.publishArticle("https://ru-ru.facebook.com/");
    }
}