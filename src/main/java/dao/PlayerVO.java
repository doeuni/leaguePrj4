package dao;

public class PlayerVO {
	private String year;
	private String season;
	private String name;
	private String address; 
	private String city;
	private String province; 
	private String postalCode;
	private String division;

	public PlayerVO() {
	
	}
	public PlayerVO(String year, String season,  String name, String address, String city, String province, String postalCode ,String division){
		this.setYear(year); 
		this.setSeason(season);
		this.setName(name);
		this.setAddress(address);
		this.setCity(city);
		this.setProvince(province);
		this.setPostalCode(postalCode);
		 this.setDivision(division);
	}


	public String getDivision() {
		return division;
	}


	public void setDivision(String division) {
		this.division = division;
	}


	public String getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	public String getProvince() {
		return province;
	}


	public void setProvince(String province) {
		this.province = province;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSeason() {
		return season;
	}


	public void setSeason(String season) {
		this.season = season;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}

	
	
	
}
