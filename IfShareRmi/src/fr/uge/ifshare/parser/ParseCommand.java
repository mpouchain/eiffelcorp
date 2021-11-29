package fr.uge.ifshare.parser;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.Optional;

import fr.uge.ifshare.client.IfShareClient;
import fr.uge.ifshare.parser.actions.Action;
import fr.uge.ifshare.parser.actions.BuyByIdAction;
import fr.uge.ifshare.parser.actions.BuyByTypeAction;
import fr.uge.ifshare.parser.actions.DisplayInfoClientAction;
import fr.uge.ifshare.parser.actions.GetAllProductAction;
import fr.uge.ifshare.parser.actions.GetAllProductByTypeAction;
import fr.uge.ifshare.parser.actions.GetNoteOfProductAction;
import fr.uge.ifshare.parser.actions.HelpAction;
import fr.uge.ifshare.parser.actions.SellAction;
import fr.uge.ifshare.service.IIfShareService;

@SuppressWarnings("serial")
public class ParseCommand implements Serializable {
	private Action action;

	private Optional<Action> getActionFromCommandLine(String command) {
		String[] commands = command.split(" ");
		String act = commands[0];
		
		switch (act) {
		case "@buy":
			return Optional.of(new BuyByIdAction());
		case "@buytype":
			return Optional.of(new BuyByTypeAction());
		case "@sell":
			return Optional.of(new SellAction());
		case "@all":
			return Optional.of(new GetAllProductAction());
		case "@type":
			return Optional.of(new GetAllProductByTypeAction());
		case "@info":
			return Optional.of(new DisplayInfoClientAction());
		case "@note":
			return Optional.of(new GetNoteOfProductAction());
		case "@help":
			return Optional.of(new HelpAction());
		default:
			return Optional.empty();
		}
	}
	
	public void parseCommand(String command, IIfShareService ifShareService, IfShareClient client, long idClient) throws RemoteException {
		Optional<Action> optAction = getActionFromCommandLine(command);
		if(optAction.isEmpty()) {
			System.out.println("Cette commande n'est pas reconnue.\nUtilisez @help pour afficher la liste des commandes.");
			return;
		}
		this.action = optAction.get();
		this.action.buildRequestFromCommand(command.split(" "));
		var optError = this.action.getError();
		if(optError.isEmpty()) {
			this.action.executeAction(ifShareService, client, idClient);
		} else {
			System.out.println(optError.get());
		}
	}
}
