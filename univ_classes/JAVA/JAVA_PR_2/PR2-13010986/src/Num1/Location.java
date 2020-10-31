package Num1;

public class Location {
	private String cityName;
	private int latitude, longitude;
	
	public Location(String nm, int lat, int lng) {
		this.cityName = nm;
		this.latitude = lat;
		this.longitude = lng;
	}
	
	public String toString() {
		return this.cityName + "\t" + this.latitude + "\t" + this.longitude;
	}
}
