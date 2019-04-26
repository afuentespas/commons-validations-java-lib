package afuentes.validations.commonsvalidations.string;

public enum StringPatterns {

	ALPHANUMERIC("[A-Za-z0-9]+"),
	
	EMAIL("^[A-z0-9._%+-]+@[A-z0-9.-]+\\.[A-z]{2,6}$");
	
	private String value;
	
	private StringPatterns(String value){
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
	
}
