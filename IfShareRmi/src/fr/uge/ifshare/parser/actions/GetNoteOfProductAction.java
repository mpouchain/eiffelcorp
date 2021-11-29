package fr.uge.ifshare.parser.actions;

import java.rmi.RemoteException;
import java.util.Optional;
import java.util.StringJoiner;

import fr.uge.ifshare.client.IfShareClient;
import fr.uge.ifshare.service.IIfShareService;

@SuppressWarnings("serial")
public class GetNoteOfProductAction implements Action {
	private String type;
	private String error = "";
	
	
	public static String usage() {
		return "Usage : @note [type] [du] [produit]";
	}
	
	public boolean count(String[] command) {
		return command.length == 2;
	}

	@Override
	public void buildRequestFromCommand(String[] command) {
		if (!count(command)) {
			this.error = GetNoteOfProductAction.usage();
			return;
		}

		StringJoiner typeProduct = new StringJoiner(" ");

		for (int i = 1; i < command.length; i++) {
			typeProduct.add(command[i]);
		}
		type = typeProduct.toString();
	}

	@Override
	public Optional<String> getError() {
		return this.error != "" ? Optional.of(this.error) : Optional.empty();
	}

	@Override
	public void executeAction(IIfShareService ifShareService, IfShareClient client, long idClient)
			throws RemoteException {
		float note = ifShareService.getNoteOfProduct(type);
		if(note < 0) {
			System.out.println("Aucun produit de type " + type + " n'a été noté.");
		} else {
			System.out.println("Le produit de type " + type + " a une note moyenne de " + note);
		}
	}

}
