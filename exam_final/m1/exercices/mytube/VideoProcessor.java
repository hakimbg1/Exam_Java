package m1.exercices.mytube;

public class VideoProcessor {
    private VideoEncoder encoder;
    private VideoDatabase database;

    public VideoProcessor(VideoEncoder encoder, VideoDatabase database, NotificationService notification) {
        this.encoder = encoder;
        this.database = database;
        this.notification = notification;
    }

    private NotificationService notification;
    public void process(Video video) {
        encoder.encode(video);

        database.store(video);

        notification.sendNotification(video.getUser());
    }
}

