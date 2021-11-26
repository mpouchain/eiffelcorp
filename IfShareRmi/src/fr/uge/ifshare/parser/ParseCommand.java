package fr.uge.ifshare.parser;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.Optional;

import fr.uge.ifshare.client.IfShareClient;
import fr.uge.ifshare.parser.actions.Action;
import fr.uge.ifshare.parser.actions.BuyAction;
import fr.uge.ifshare.parser.actions.GetAllProductAction;
import fr.uge.ifshare.parser.actions.GetAllProductByTypeAction;
import fr.uge.ifshare.parser.actions.SellAction;
import fr.uge.ifshare.service.IIfShareService;

@SuppressWarnings("serial")
public class ParseCommand implements Serializable {
	@SuppressWarnings("rawtypes")
	private Action action;

	@SuppressWarnings("rawtypes")
	private Optional<Action> getActionFromCommandLine(String command) {
		String[] commands = command.split(" ");
		String act = commands[0];
		
		switch (act) {
		case "@buy":
			return Optional.of(new BuyAction());
		case "@sell":
			return Optional.of(new SellAction());
		case "@all":
			return Optional.of(new GetAllProductAction());
		case "@type":
			return Optional.of(new GetAllProductByTypeAction());
		default:
			return Optional.empty();
		}
	}

	@SuppressWarnings("rawtypes")
	public void parseCommand(String command, IIfShareService ifShareService, IfShareClient client) throws RemoteException {
		Optional<Action> optAction = getActionFromCommandLine(command);
		if(optAction.isEmpty()) {
			System.out.println("Cette commande n'est pas reconnue.\nUtilisez @help pour afficher la liste des commandes.");
			return;
		}
		this.action = optAction.get();
		this.action.buildFromCommand(command.split(" "));
		var optError = this.action.getError();
		if(optError.isEmpty()) {
			this.action.executeAction(ifShareService, client);
		} else {
			System.out.println(optError.get());
		}
	}
}
