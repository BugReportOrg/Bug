package edu.nju.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.nju.dao.BugHistoryDao;
import edu.nju.entities.BugHistory;

@Service
public class HistoryService {
	
	@Autowired
	BugHistoryDao historydao;
	
	public boolean getHistory(BugHistory history) {
		return true;
	}
	
}
