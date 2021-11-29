package fr.uge.ifshare.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RatingsDB {
	private final Map<String, List<Integer>> noteDB;
	
	public RatingsDB() {
		this.noteDB = new HashMap<String, List<Integer>>();
	}
	
	public void addNoteToType(String type, int note) {
		if(!this.noteDB.containsKey(type)) {
			this.noteDB.put(type, new ArrayList<Integer>());
		}
		this.noteDB.merge(type, List.of(note), (list, val) -> {
			list.addAll(val);
			return list;
		});
	}
	
	public List<Integer> getListOfNote(String product) {
		return this.noteDB.get(product);
	}
}
