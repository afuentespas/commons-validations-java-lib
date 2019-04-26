package afuentes.validations.commonsvalidations.documents;

abstract class NifNieValidator extends Document {
	
	private static final String NIF_NIE_LETTERS = "TRWAGMYFPDXBNJZSQVHLCKEO";

	protected boolean isCorrectLetter() {
		boolean isValid = true;
		int letterPosition = 0;
		letterPosition = this.getNumbersFromDocument() % 23;
		if(this.getLastCharacterLetter() != NIF_NIE_LETTERS.charAt(letterPosition)) {
			isValid = false;
		}
		return isValid;
	}
	
	private char getLastCharacterLetter() {
		return this.documentIdentification.charAt(this.documentIdentification.length() - 1);
	}
	
}
