package fr.uge.ifshare.parser.actions;

import java.rmi.RemoteException;
import java.util.StringJoiner;

import fr.uge.ifshare.client.IfShareClient;
import fr.uge.ifshare.models.Product;
import fr.uge.ifshare.models.Rating;
import fr.uge.ifshare.service.IIfShareService;

@SuppressWarnings("serial")
public class SellAction implements Action {
	private Product product;
	private String error = "";
	
	public static String usage() {
		return "Usage : @sell [type] [du] [produit] [prix] [état] [note]";
	}

	public boolean count(String[] command) {
		return command.length >= 5;
	}

	@Override
	public void buildRequestFromCommand(String[] command) {
		if(!count(command)) {
			this.error = SellAction.usage();
			return;
		}

		String noteStr = command[command.length-1];
		String stateSTR = command[command.length-2];
		String priceStr = command[command.length-3];
		StringJoiner typeProduct = new StringJoiner(" ");
		
		for(int i = 1; i < command.length-3; i++) {
			typeProduct.add(command[i]);
		}

		double price;
		int note;
		int state;
		try {
			price = Double.parseDouble(priceStr);
			note = Integer.parseInt(noteStr);
			state = Integer.parseInt(stateSTR);
			if(price < 1) {
				throw new IllegalArgumentException();
			}
			if(note < 0 || note > 5) {
				throw new IllegalArgumentException();
			}
			if(state < 0 || state > 5) {
				throw new IllegalArgumentException();
			}
			this.product = new Product(typeProduct.toString(), price, new Rating(note, state));
		} catch(NumberFormatException nfe) {
			this.error = "Price must be an integer";
		} catch(IllegalArgumentException iae) {
			this.error = "Le prix de vente doit être prositif.\nL'état et la note du produit doivent être compris entre 0 et 5.";
		}
	}

	@Override
	public String getError() {
		return this.error;
	}

	@Override
	public void executeAction(IIfShareService ifShareService, IfShareClient client, long idClient) throws RemoteException {
		ifShareService.sellProduct(product, idClient);
		client.addProductSell(product);
		System.out.println("Votre produit est en vente.");
	}
}
