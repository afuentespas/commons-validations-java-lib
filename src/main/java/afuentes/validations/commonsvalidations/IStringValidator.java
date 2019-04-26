package afuentes.validations.commonsvalidations;

public interface IStringValidator {

	public boolean isNullOrEmpty();
	
	public boolean isEmpty();
	
	public boolean isNull();
	
	public boolean isNumber();
	
	public boolean isAlphanumeric();
	
	public boolean isEmail();
	
	public boolean matches(String pattern);
	
	public boolean maxLength(int size);
	
	public boolean minLength(int size);
	
}
