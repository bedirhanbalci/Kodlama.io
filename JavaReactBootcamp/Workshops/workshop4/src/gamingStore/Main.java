package gamingStore;

import gamingStore.abstracts.UserCheckService;
import gamingStore.concretes.CampaignManager;
import gamingStore.concretes.SaleManager;
import gamingStore.concretes.UserManager;
import gamingStore.entities.concretes.Campaign;
import gamingStore.entities.concretes.Game;
import gamingStore.entities.concretes.Gamer;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Game game = new Game(1, "Assassin's Creed", "Black Flag", 250);
        Gamer gamer = new Gamer(1, "Bedirhan", "Balcı", new Date(1999, 1, 1), "123456");

        Campaign campaign = new Campaign(1, "Black Friday", "For Winter", new Date(2023, 11, 11), new Date(2023, 11, 18), 100);

        CampaignManager campaignManager = new CampaignManager();

        SaleManager saleManager = new SaleManager(campaignManager, campaign);

        UserManager userManager = new UserManager(new UserCheckService() {
            @Override
            public boolean checkIfUserReal() {
                return true;
            }
        });
        userManager.add(gamer);
        saleManager.add(gamer);
    }
}