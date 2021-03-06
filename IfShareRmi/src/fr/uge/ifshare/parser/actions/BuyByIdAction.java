package fr.uge.ifshare.parser.actions;

import java.rmi.RemoteException;

import fr.uge.ifshare.client.IfShareClient;
import fr.uge.ifshare.models.Product;
import fr.uge.ifshare.service.IIfShareService;

@SuppressWarnings("serial")
public class BuyByIdAction implements Action {
	private long id;
	private String error = "";
	
	public static String usage() {
		return "Usage : @buy [id]";
	}

	public boolean count(String[] command) {
		return command.length == 2;
	}

	@Override
	public void buildRequestFromCommand(String[] command) {
		if (!count(command)) {
			this.error = BuyByIdAction.usage();
			return;
		}

		String idString = command[1];

		try {
			this.id = Long.parseLong(idString);
		} catch (NumberFormatException nfe) {
			this.error = "ID doit être un entier";
		}
	}

	@Override
	public String getError() {
		return this.error;
	}

	@Override
	public void executeAction(IIfShareService ifShareService, IfShareClient client, long idClient)
			throws RemoteException {
		double price = ifShareService.getPrice(this.id);
		if (price == -1) {
			System.out.println("Le produit d'ID : " + this.id + " n'est plus disponible");
		} else {
			if (client.getBank() < price) {
				System.out.println("Vous n'avez plus assez d'argent dans votre banque pour acheter ce produit.");
			} else {
				Product product = ifShareService.buyProductById(this.id, idClient);
				if (product == null) {
					System.out.println("Le produit d'ID : " + this.id + " n'est plus disponible");
				} else {
					System.out.println("Vous avez acheté le produit " + product);
					client.removeFromBank(product.getPrice());
				}
			}
		}
	}

}
