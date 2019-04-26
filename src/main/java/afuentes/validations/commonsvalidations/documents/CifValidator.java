package afuentes.validations.commonsvalidations.documents;

import afuentes.validations.commonsvalidations.IStringValidator;
import afuentes.validations.commonsvalidations.factory.StringValidatorFactory;
import afuentes.validations.commonsvalidations.utils.NumberUtils;

public class CifValidator extends Document {
	
	private static final String CIF_CONTROL = "JABCDEFGHI";

	public CifValidator(String documentIdentification) {
		this.documentIdentification = documentIdentification;
		this.documentFormat = DocumentFormat.CIF;
		this.documentNumbersPattern = DocumentFormat.CIF;
		this.patternGroup = 2;
	}
	
	@Override
	public boolean isValid() {
		return this.isCorrectFormat() && this.isCorrect();
	}
	
	private boolean isCorrect() {
		int controlNumber = this.getControlValue();
		char lastChar = this.documentIdentification.charAt(this.documentIdentification.length() - 1);
		IStringValidator stringValidator = StringValidatorFactory.createStringValidator(String.valueOf(lastChar));
		return lastChar == CIF_CONTROL.charAt(controlNumber) ||  
				stringValidator.isNumber() && 
				NumberUtils.parseStringToInteger(String.valueOf(lastChar)) == controlNumber ? true : false ;
	}
	
	private int getControlValue() {
		String numberString = String.valueOf(this.getNumbersFromDocument());
		int number;
		int evenNumbers = 0;
		int oddNumbers = 0;
		for(int i = 0; i < numberString.length(); i++) {
			number = NumberUtils.parseStringToInteger(String.valueOf(numberString.charAt(i)));
			if(i % 2 == 0) {
				number *= 2;
				oddNumbers += (number < 10) ? number : number - 9;
			}
			else {
				evenNumbers += number;
			}
		}
		return 10 - ((evenNumbers + oddNumbers) % 10);
	}

}

