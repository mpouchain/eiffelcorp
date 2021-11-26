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
public class GetAllProductAction implements Action {

	@Override
	public void buildFromCommand(String[] command) {
		// Nothing
	}

	@Override
	public Optional<String> getError() {
		return Optional.empty();
	}

	@Override
	public void executeAction(IIfShareService ifShareService, IfShareClient client, long idClient) throws RemoteException {
		Map<Product, List<Long>> listProducts = ifShareService.getAllProduct();
		if (listProducts.isEmpty()) {
			System.out.println("Il n'y a aucun produit en stock actuellement");
		} else {
			System.out.println("Liste des produits en stock :");
			listProducts.entrySet()
					.forEach(entry -> 
					System.out.println("\t" + entry.getKey() + ", " + 
					entry.getValue().size() + " en stock actuellement, IDs : " + 
					entry.getValue().stream().map(l -> l.toString()).collect(Collectors.joining(",", "[", "]"))));
		}
	}

}
