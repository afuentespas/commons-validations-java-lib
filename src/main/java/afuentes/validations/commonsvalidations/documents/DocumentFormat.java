package afuentes.validations.commonsvalidations.documents;

enum DocumentFormat {

	NIF("([0-9]{1,8})((-)?)([A-z])"),
	
	NIE("([XYZ])([0-9]{1,7})((-)?)([A-z])"),
	
	CIF("([ABCDEFGHJNPQRSUVW])(\\d{7})([0-9A-J])"),
	
	NIF_NIE_PATTERN("([\\d]+)[^\\d]*");
	
	private String value;
	
	private DocumentFormat(String value){
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
	
}
