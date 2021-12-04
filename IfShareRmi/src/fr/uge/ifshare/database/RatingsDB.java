package fr.uge.ifshare.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RatingsDB {
	private final Map<String, List<Integer>> gradeDB;
	
	public RatingsDB() {
		this.gradeDB = new HashMap<String, List<Integer>>();
	}
	
	public void addGradeToType(String type, int grade) {
		if(!this.gradeDB.containsKey(type)) {
			this.gradeDB.put(type, new ArrayList<Integer>());
		}
		this.gradeDB.merge(type, List.of(grade), (list, val) -> {
			list.addAll(val);
			return list;
		});
	}
	
	public List<Integer> getListOfGrades(String product) {
		return this.gradeDB.get(product);
	}
}
