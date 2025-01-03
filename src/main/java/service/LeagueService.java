package service;

import java.util.ArrayList;

import dao.LeagueDAO;
import dao.LeagueVO;
import dao.PlayerVO;   // 이 import도 필요합니다
import dao.PlayerDAO;

public class LeagueService {
	LeagueDAO dao;
	PlayerDAO pdao;
	
	public LeagueService() {
		dao = new LeagueDAO();
		pdao = new PlayerDAO();
	}
	
	public ArrayList listLeagues() {
		return dao.listLeagues(); 
	}
	
	public void addLeague(LeagueVO vo) {
		dao.addLeague(vo);
	}
	

	public ArrayList playerList() {
		return pdao.playerList(); 
	}
	
	
	public void registerLeague(PlayerVO vo) {
		System.out.println("12fjlk");

		pdao.registerLeague(vo);
	}
}
