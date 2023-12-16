package eCommerceSystem.business.abstracts;

public interface ConfirmationService {
    void sendConfirmationEmail();

    boolean checkEmailConfirmation();
}
