package dao;

public class LeagueVO {
	private String id;
	private String year;
	private String season;
	private String title;
	
	public LeagueVO() {
		
	}
	public LeagueVO(String year, String season, String title) {
		this.year = year;
		this.season = season;
		this.title = title;
	}
	public LeagueVO(String id, String year, String season, String title) {
		this.id = id;
		this.year = year;
		this.season = season;
		this.title = title;		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
