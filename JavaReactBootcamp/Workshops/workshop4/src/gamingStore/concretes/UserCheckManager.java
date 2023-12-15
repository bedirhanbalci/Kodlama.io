package gamingStore.concretes;

import gamingStore.abstracts.UserCheckService;

public class UserCheckManager implements UserCheckService {
    @Override
    public boolean checkIfUserReal() {
        return true;
    }
}
