package afuentes.validations.commonsvalidations.documents;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import afuentes.validations.commonsvalidations.IDocumentValidator;
import afuentes.validations.commonsvalidations.utils.NumberUtils;

abstract class Document implements IDocumentValidator {

	protected String documentIdentification;
	
	protected DocumentFormat documentFormat;
	
	protected DocumentFormat documentNumbersPattern;
	
	protected int patternGroup = -1;
	
	protected void cleanDocument() {
		this.documentIdentification = this.documentIdentification.trim().replaceAll("-", "").toUpperCase();
	}
	
	protected boolean isCorrectFormat() {
		assert this.documentFormat != null;
		this.cleanDocument();
		return this.documentIdentification.matches(this.documentFormat.getValue());
	}
	
	protected int getNumbersFromDocument() {
		assert this.patternGroup != -1;
		assert this.documentNumbersPattern != null;
		int documentNumber = 0;
		Pattern pattern = Pattern.compile(this.documentNumbersPattern.getValue());
		Matcher matcher = pattern.matcher(this.documentIdentification);
		if(matcher.matches()) {
			documentNumber = NumberUtils.parseStringToInteger(matcher.group(this.patternGroup));
		}
		return documentNumber;
	}
	
}
