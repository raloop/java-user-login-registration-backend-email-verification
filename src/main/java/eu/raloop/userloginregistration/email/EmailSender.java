package eu.raloop.userloginregistration.email;

public interface EmailSender {
    void send(String to, String email);
}
