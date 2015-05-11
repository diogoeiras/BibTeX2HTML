package data;

public class TechreportData extends BibData {
	//standard constructor
	public TechreportData(){
		super();
	}
	
	//required data constructor
	public TechreportData(String _author, String _title, String _institution, String _year){
		author = _author;
		title = _title;
		institution = _institution;
		year = _year;
		type = null;
		number = null;
		address = null;
		month = null;
		note = null;
		key = null;
	}
	
	//optional data constructor
	public TechreportData(String _author, String _title, String _institution, String _year,
						  String _type, Integer _number, String _address, String _month, String _note, String _key){
		author = _author;
		title = _title;
		institution = _institution;
		year = _year;
		type = _type;
		number = _number;
		address = _address;
		month = _month;
		note = _note;
		key = _key;
	}
	
	// Gets for FreeMarker HTML Parse
	public String getAuthor(){
		return author;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getInstitution(){
		return institution;
	}
	
	public String getYear(){
		return year;
	}
	
	public String getType(){
		return type;
	}
	
	public Integer getNumber(){
		return number;
	}
	
	public String getAddress(){
		return address;
	}
	
	public String getMonth(){
		return month;
	}
	
	public String getNote(){
		return note;
	}
	
	public String getKey(){
		return key;
	}
	
	
	public String toString(){
		return super.toString() 
				+ "," + author
				+ "," + title
				+ "," + institution
				+ "," + year
				+ "," + type
				+ "," + number
				+ "," + address
				+ "," + month
				+ "," + note
				+ "," + key;		
	}
}
