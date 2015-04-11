package data;

public class ManualData extends BibData {
	//standard Construct
	public ManualData(){
		super();
	}
	
	// Required data constructor
	public ManualData(String _title){
		title = _title;
		author = null;
		organization = null;
		address = null;
		edition = null;
		month = null;
		year = null;
		note = null;
		key = null;
	}
	
	//Optional data constructor
	public ManualData(String _title, String _author, String _organization, String _address, String _edition, String _month, Integer _year, String _note, String _key){
		title = _title;
		author = _author;
		organization = _organization;
		address = _address;
		edition = _edition;
		month = _month;
		year = _year;
		note = _note;
		key = _key;
	}
	

	// Gets for FreeMarker HTML Parse
	public String getTitle(){
		return title;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public String getOrganization()
	{
		return organization;
	}
	
	public String getAddress(){
		return address;
	}
	
	public String getEdition(){
		return edition;
	}	
	
	public String getMonth(){
		return month;
	}
	
	public Integer getYear(){
		return year;
	}
	
	public String getNote(){
		return note;
	}
	
	public String getKey(){
		return key;
	}
	
	public String toString(){
		return super.toString() 
				+ "," + title
				+ "," + author
				+ "," + organization
				+ "," + address
				+ "," + edition
				+ "," + month
				+ "," + year
				+ "," + note
				+ "," + key;
	}
}