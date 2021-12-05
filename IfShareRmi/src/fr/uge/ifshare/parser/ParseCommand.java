package fr.uge.ifshare.parser;

import java.io.Serializable;
import java.rmi.RemoteException;

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

	private Action getActionFromCommandLine(String command) {
		String[] commands = command.split(" ");
		String act = commands[0];
		
		switch (act) {
		case "@buy":
			return new BuyByIdAction();
		case "@buytype":
			return new BuyByTypeAction();
		case "@sell":
			return new SellAction();
		case "@all":
			return new GetAllProductAction();
		case "@type":
			return new GetAllProductByTypeAction();
		case "@info":
			return new DisplayInfoClientAction();
		case "@note":
			return new GetNoteOfProductAction();
		case "@help":
			return new HelpAction();
		default:
			return null;
		}
	}
	
	public void parseCommand(String command, IIfShareService ifShareService, IfShareClient client, long idClient) throws RemoteException {
		this.action = getActionFromCommandLine(command);
		if(this.action == null) {
			System.out.println("Cette commande n'est pas reconnue.\nUtilisez @help pour afficher la liste des commandes.");
			return;
		}
		this.action.buildRequestFromCommand(command.split(" "));
		String error = this.action.getError();
		if(error.equals("")) {
			this.action.executeAction(ifShareService, client, idClient);
		} else {
			System.out.println(error);
		}
	}
}
