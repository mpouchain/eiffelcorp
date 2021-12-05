package fr.uge.ifshare.parser.actions;

import java.rmi.RemoteException;
import java.util.StringJoiner;

import fr.uge.ifshare.client.IfShareClient;
import fr.uge.ifshare.models.Product;
import fr.uge.ifshare.service.IIfShareService;

@SuppressWarnings("serial")
public class BuyByTypeAction implements Action {
	private String type;
	private String error = "";
	
	public static String usage() {
		return "Usage : @buytype [type] [du] [produit]";
	}

	public boolean count(String[] command) {
		return command.length >= 2;
	}

	@Override
	public void buildRequestFromCommand(String[] command) {
		if (!count(command)) {
			this.error = BuyByTypeAction.usage();
			return;
		}

		StringJoiner typeProduct = new StringJoiner(" ");

		for (int i = 1; i < command.length; i++) {
			typeProduct.add(command[i]);
		}
		type = typeProduct.toString();
	}

	@Override
	public String getError() {
		return this.error;
	}

	@Override
	public void executeAction(IIfShareService ifShareService, IfShareClient client, long idClient)
			throws RemoteException {
		double price = ifShareService.getPrice(this.type);
		if (price == -1) {
			System.out.println("Le produit : " + this.type + " n'est plus disponible");
			System.out.println("Vous êtes inscrit sur liste d'attente");
		} else {
			if (client.getBank() < price) {
				System.out.println("Vous n'avez plus assez d'argent dans votre banque pour acheter ce produit.");
			} else {
				Product product = ifShareService.buyProductByType(this.type, idClient);
				if (product == null) {
					System.out.println("Le produit : " + this.type + " n'est plus disponible");
					System.out.println("Vous êtes inscrit sur liste d'attente");
				} else {
					System.out.println("Vous avez acheté le produit " + product);
					client.removeFromBank(product.getPrice());
				}
			}
		}
	}
}
