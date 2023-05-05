package m1.exercices.mytube;

public class EmailService implements NotificationService {
    @Override
    public void sendNotification(User user) {
        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done!\n");
    }
}
