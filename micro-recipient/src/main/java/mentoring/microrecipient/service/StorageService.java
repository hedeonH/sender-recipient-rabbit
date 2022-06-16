package mentoring.microrecipient.service;

import model.Notification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StorageService {

    private static final List<Notification> internalStorage = new ArrayList<>();

    public List<Notification> getNotifications(){
        return List.copyOf(internalStorage);
    }

    public void resetStorage(){
        internalStorage.clear();
    }

    public  void addNotification(Notification notification){
        internalStorage.add(notification);
    }
}
