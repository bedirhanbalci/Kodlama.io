package gamingStore.concretes;

import gamingStore.abstracts.CampaignService;
import gamingStore.entities.concretes.Campaign;

public class CampaignManager implements CampaignService {
    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getName() + " added");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getName() + " deleted");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getName() + " updated");
    }
}
