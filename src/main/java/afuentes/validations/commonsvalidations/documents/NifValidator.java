package afuentes.validations.commonsvalidations.documents;

public class NifValidator extends NifNieValidator {
	
	public NifValidator(String documentIdentification) {
		this.documentIdentification = documentIdentification;
		this.documentFormat = DocumentFormat.NIF;
		this.documentNumbersPattern = DocumentFormat.NIF_NIE_PATTERN;
		this.patternGroup = 1;
	}
	
	@Override
	public boolean isValid() {
		return this.isCorrectFormat() && this.isCorrectLetter();
	}

}
