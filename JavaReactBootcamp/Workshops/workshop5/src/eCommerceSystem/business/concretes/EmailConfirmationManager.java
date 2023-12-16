package eCommerceSystem.business.concretes;

import eCommerceSystem.business.abstracts.ConfirmationService;

public class EmailConfirmationManager implements ConfirmationService {
    @Override
    public void sendConfirmationEmail() {
        System.out.println("Confirmation code sent to your email");
    }

    @Override
    public boolean checkEmailConfirmation() {
        return true;
    }
}
