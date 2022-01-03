
public class Holiday {

	private String city;
	private String country;
	private int postcode;
	
	public Holiday() {
		
	}
	 public Holiday(String city, String country) {
		 this.city = city;
		 this.country = country; 
	 }
	 public Holiday(String city, String country, int postcode) {
		 this.postcode = postcode;
		 this.city = city;
		 this.country = country; 
	 }
	 
	 public String getCity() {
		 return city;
	 }
	 public void setCity(String city) {
		 this.city = city;
	 }
	 public String getCountry() {
		 return country;
	 }
	 public void setCountry(String country) {
		 this.country = country;
	 }
	 public int getPostcode() {
		 return postcode;
	 }
	 public void setPostcode(int postcode) {
		 this.postcode = postcode;
	 }
	 public boolean isStarted() {
		 return true;
	 }
	 public String destination() {
		 return this.city + " " + this.country + ", " + this.postcode;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Holiday haha= new Holiday("new bremen","ohio",45869);
  System.out.println(haha.destination());
	}

}
