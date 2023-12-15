package gamingStore.concretes;

import gamingStore.abstracts.CampaignService;
import gamingStore.abstracts.SaleService;
import gamingStore.entities.concretes.Campaign;
import gamingStore.entities.concretes.Gamer;

public class SaleManager implements SaleService {

    private final CampaignService campaignService;
    private final Campaign campaign;

    public SaleManager(CampaignService campaignService, Campaign campaign) {
        this.campaignService = campaignService;
        this.campaign = campaign;
    }

    @Override
    public void add(Gamer entities) {
        System.out.println(entities.getFirstName() + " your payment added");
        campaignService.add(campaign);
    }

    @Override
    public void delete(Gamer entities) {
        System.out.println(entities.getFirstName() + " your payment deleted");
        campaignService.delete(campaign);
    }

    @Override
    public void update(Gamer entities) {
        System.out.println(entities.getFirstName() + " your payment updated");
    }
}
