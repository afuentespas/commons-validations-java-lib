package afuentes.validations.commonsvalidations.factory;

import afuentes.validations.commonsvalidations.IStringValidator;
import afuentes.validations.commonsvalidations.string.StringValidator;

public class StringValidatorFactory {

	private StringValidatorFactory() {}
	
	public static IStringValidator createStringValidator(String string) {
		return new StringValidator(string);
	}
	
}
