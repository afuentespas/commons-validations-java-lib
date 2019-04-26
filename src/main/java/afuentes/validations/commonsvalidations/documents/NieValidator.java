package afuentes.validations.commonsvalidations.documents;

public class NieValidator extends NifNieValidator{

	public NieValidator(String documentIdentification) {
		this.documentIdentification = documentIdentification;
		this.documentFormat = DocumentFormat.NIE;
		this.documentNumbersPattern = DocumentFormat.NIF_NIE_PATTERN;
		this.patternGroup = 1;
	}
	
	private static final int FIRST_LETTER_CONTROL= 'X';
	
	@Override
	public boolean isValid() {
		return this.isCorrectFormat() && this.isCorrectLetter();
	}

	@Override
	protected boolean isCorrectLetter() {
		String documentCopy = this.documentIdentification;
		boolean isValid = false;
		int firstLetter = this.documentIdentification.charAt(0) - FIRST_LETTER_CONTROL;
		this.documentIdentification = String.valueOf(firstLetter).concat(this.documentIdentification.substring(1));
		isValid = super.isCorrectLetter();
		this.documentIdentification = documentCopy;
		return isValid;
	}
	
}
