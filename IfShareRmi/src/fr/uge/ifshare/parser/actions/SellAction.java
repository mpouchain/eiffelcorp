package fr.uge.ifshare.parser.actions;

import java.rmi.RemoteException;
import java.util.Optional;

import fr.uge.ifshare.client.IfShareClient;
import fr.uge.ifshare.models.Product;
import fr.uge.ifshare.service.IIfShareService;

@SuppressWarnings("serial")
public class SellAction implements Action<Product> {
	private Product product;
	private String error = "";

	public boolean count(String[] command) {
		return command.length >= 3;
	}

	@Override
	public void buildFromCommand(String[] command) {
		if(!count(command)) {
			this.error = "Usage : @sell [type of product] [price]";
			return;
		}
		
		String priceStr = command[command.length-1];
		String typeProduct = "";
		long price;
		
		for(int i = 1; i < command.length-1; i++) {
			typeProduct += command[i] + " ";
		}
		
		try {
			price = Long.parseLong(priceStr);
			this.product = new Product(typeProduct, price);
		} catch(NumberFormatException nfe) {
			this.error = "Price must be an integer";
		}
	}

	@Override
	public Optional<String> getError() {
		return this.error != "" ? Optional.of(this.error) : Optional.empty();
	}

	@Override
	public void executeAction(IIfShareService ifShareService, IfShareClient client) throws RemoteException {
		ifShareService.sellProduct(product, client);
		System.out.println("Votre produit est en vente, vous recevrez votre argent lorsqu'il sera acheté par une tierce personne");
	}
}
