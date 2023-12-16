package eCommerceSystem.core;

import eCommerceSystem.jGoogle.JGoogleManager;

public class JGoogleManagerAdapter implements GoogleService {
    @Override
    public boolean registrationTheSystemWithGoogleAccount() {
        JGoogleManager googleManager = new JGoogleManager();
        return googleManager.checkGoogleRegistration();
    }
}
