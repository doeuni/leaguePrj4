package dao;

public class ReservationVO {
	private LeagueVO lVO;
	private PlayerVO pVO;
	private String division;
	
	public ReservationVO(LeagueVO lVO, PlayerVO pVO, String division) {
		this.setlVO(lVO);
		this.setpVO(pVO);
		this.setDivision(division);
	}

	public LeagueVO getlVO() {
		return lVO;
	}

	public void setlVO(LeagueVO lVO) {
		this.lVO = lVO;
	}

	public PlayerVO getpVO() {
		return pVO;
	}

	public void setpVO(PlayerVO pVO) {
		this.pVO = pVO;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}
}
