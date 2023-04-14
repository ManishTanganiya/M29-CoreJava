package org.tnsif.multilevel;

//child class 2
public class City extends State {
	private String cityName;
	private String area;
	
	//getters and setters
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	//toString() method
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", area=" + area + ", getCityName()=" + getCityName() + ", getArea()="
				+ getArea() + ", getStateName()=" + getStateName() + ", getLanguage()=" + getLanguage()
				+ ", toString()=" + super.toString() + ", getCountryName()=" + getCountryName()
				+ ", getCountryCapital()=" + getCountryCapital() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
}