package com.company;

import java.time.LocalDate;

import Abstract.BaseCampaignManager;
import Abstract.BaseCustomerManager;
import Abstract.BaseSellerManager;
import Adapters.EdevletServiceAdapter;
import Adapters.SalesServiceAdapters;
import Concreate.CampaignManager;
import Concreate.GamerCustomerManager;
import Concreate.SellerCustomerManager;
import Entities.Gamer;
import Entities.Games;
import Entities.Seller;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager baseCustomerManager = new GamerCustomerManager(new EdevletServiceAdapter());
		BaseCampaignManager baseCampaignManager = new CampaignManager(new SalesServiceAdapters());
		BaseSellerManager baseSellerManager = new SellerCustomerManager(new SalesServiceAdapters());

		Gamer gamer = new Gamer("12875465407", "ab@gmail.com", "ramazan", "kayış", LocalDate.of(1992, 7, 1), "12347891",
				"uzman");
		Seller seller = new Seller("12365896", "kayis.ramazan@gmail.com", "Elif", "tümer", LocalDate.of(2013, 8, 18),
				"12365236545", "5");
		Games game1 = new Games("Pubg", 2230, 30);

		Games game2 = new Games("CS", 1230, 10);
		
		
		baseCustomerManager.add(gamer);
		baseCustomerManager.delete(gamer);
		baseCustomerManager.update(gamer);
		baseSellerManager.sell(game1, gamer);
		baseSellerManager.sell(game2, gamer);
		baseCampaignManager.campaignAdd(game1, seller);
		baseCampaignManager.campaignUpdate(game1, seller);
		baseCampaignManager.campaignDelete(game1, seller);
	}

}
