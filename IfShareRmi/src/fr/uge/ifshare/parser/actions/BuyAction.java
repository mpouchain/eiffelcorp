package fr.uge.ifshare.parser.actions;

import java.rmi.RemoteException;
import java.util.Optional;

import fr.uge.ifshare.client.IfShareClient;
import fr.uge.ifshare.models.Product;
import fr.uge.ifshare.service.IIfShareService;

@SuppressWarnings("serial")
public class BuyAction implements Action<Product> {
	private long id;
	private String error = "";

	public boolean count(String[] command) {
		return command.length == 2;
	}

	@Override
	public void buildFromCommand(String[] command) {
		if (!count(command)) {
			this.error = "Usage : @buy [id]";
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
	public Optional<String> getError() {
		return this.error != "" ? Optional.of(this.error) : Optional.empty();
	}

	@Override
	public void executeAction(IIfShareService ifShareService, IfShareClient client) throws RemoteException {
		Product product = ifShareService.buyProduct(this.id, client);
		if (product == null) {
			System.out.println("Le produit d'ID : " + this.id + " n'est plus disponible");
			System.out.println("Vous êtes inscrit sur liste d'attente");
		} else {
			if (product.getPrice() > client.getBank()) {
				System.out.println("Vous n'avez pas assea d'argent sur votre compte pour acheter ce produit.");
			} else {
				System.out.println("Vous avez acheté le produit " + product);
			}
		}
	}

}
