package afuentes.validations.commonsvalidations.factory;

import afuentes.validations.commonsvalidations.IDocumentValidator;
import afuentes.validations.commonsvalidations.documents.CifValidator;
import afuentes.validations.commonsvalidations.documents.NieValidator;
import afuentes.validations.commonsvalidations.documents.NifValidator;

public class SimpleDocumentValidatorFactory {
	
	private SimpleDocumentValidatorFactory() {}

	public static IDocumentValidator createNifDocumentValidator(String document) {
		return new NifValidator(document);
	}
	
	public static IDocumentValidator createNieDocumentValidator(String document) {
		return new NieValidator(document);
	}
	
	public static IDocumentValidator createCifDocumentValidator(String document) {
		return new CifValidator(document);
	}
	
}
