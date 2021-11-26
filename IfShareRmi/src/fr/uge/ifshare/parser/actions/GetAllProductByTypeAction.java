package fr.uge.ifshare.parser.actions;

import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import fr.uge.ifshare.client.IfShareClient;
import fr.uge.ifshare.models.Product;
import fr.uge.ifshare.service.IIfShareService;

@SuppressWarnings("serial")
public class GetAllProductByTypeAction implements Action<String> {
	private String type;
	private String error = "";

	public boolean count(String[] command) {
		return command.length >= 2;
	}

	@Override
	public void buildFromCommand(String[] command) {
		if(!count(command)) {
			this.error = "Usage : [type of product]";
		}
		
		this.type = "";
		
		for(int i = 1; i < command.length; i++) {
			this.type += command[i] + " ";
		}
	}

	@Override
	public Optional<String> getError() {
		return this.error != "" ? Optional.of(this.error) : Optional.empty();
	}

	@Override
	public void executeAction(IIfShareService ifShareService, IfShareClient client) throws RemoteException {
		Map<Product, List<Long>> listProducts = ifShareService.getAllProductWithType(type);
		if (listProducts.isEmpty()) {
			System.out.println("Il n'y a aucun produit de type " + type + " actuellement");
		} else {
			System.out.println("Liste des produits de type " + type + " :");
			listProducts.entrySet()
					.forEach(entry -> 
					System.out.println("\t" + entry.getKey() + ", " + 
					entry.getValue().size() + " en stock actuellement, IDs : " + 
					entry.getValue().stream().map(l -> l.toString()).collect(Collectors.joining(",", "[", "]"))));
		}
	}
}
