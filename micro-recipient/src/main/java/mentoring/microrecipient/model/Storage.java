package mentoring.microrecipient.model;

import java.util.ArrayList;
import java.util.List;

public final class Storage {

    private Storage(){}

    private static final List<Notification> internalStorage = new ArrayList<>();

    public static List<Notification> getNotifications(){
        List<Notification> list = List.copyOf(internalStorage);
        internalStorage.clear();
        return list;
    }

    public static void addNotification(Notification notification){
        internalStorage.add(notification);
    }
}
