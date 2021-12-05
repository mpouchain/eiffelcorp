package fr.uge.ifshare.parser.actions;

import java.rmi.RemoteException;
import java.util.Optional;

import fr.uge.ifshare.client.IfShareClient;
import fr.uge.ifshare.service.IIfShareService;

@SuppressWarnings("serial")
public class HelpAction implements Action {

	@Override
	public void buildRequestFromCommand(String[] command) {
		// Nothing
	}

	@Override
	public Optional<String> getError() {
		return Optional.empty();
	}

	@Override
	public void executeAction(IIfShareService ifShareService, IfShareClient client, long idClient)
			throws RemoteException {
		StringBuilder str = new StringBuilder();
		str.append(SellAction.usage()).append(" : Vendre un produit\n")
			.append(BuyByIdAction.usage()).append(" : Acheter un produit par son id")
										  .append(", pas d'ajout dans la liste d'attente si non présent\n")
			.append(BuyByTypeAction.usage()).append(" : Acheter un produit par son type")
											.append(", achat du moins cher s'il y en a plusieurs")
											.append(", ajout à la liste d'attente si non présent\n")
			.append(GetAllProductAction.usage()).append(" : Affichage de tous les produits disponibles\n")
			.append(GetAllProductByTypeAction.usage()).append(" : Affichage de tous les produits disponibles filtrés par le type\n")
			.append(GetNoteOfProductAction.usage()).append(" : Affichage de la note d'un produit donné\n")
			.append(DisplayInfoClientAction.usage()).append(" : Affichage des informations du client\n");
		System.out.println(str.toString());
	}

}
