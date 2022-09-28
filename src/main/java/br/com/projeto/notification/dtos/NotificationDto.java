package br.com.projeto.notification.dtos;


import br.com.projeto.notification.enums.NotificationStatus;
import javax.validation.constraints.NotNull;

public class NotificationDto {

    @NotNull
    private NotificationStatus notificationStatus;

    public NotificationStatus getNotificationStatus() {
        return notificationStatus;
    }

    public void setNotificationStatus(NotificationStatus notificationStatus) {
        this.notificationStatus = notificationStatus;
    }
}
