package afuentes.validations.commonsvalidations.documents;

import static org.junit.Assert.*;
import org.junit.Test;
import afuentes.validations.commonsvalidations.IDocumentValidator;
import afuentes.validations.commonsvalidations.factory.SimpleDocumentValidatorFactory;

public class CifValidatorTest {

	@Test
	public void testValidCifs() {
		String[] cifs = {"A34368068", "W9620754C", "A87233391", "B28148658", "V9561198D"};
		IDocumentValidator validator = null;
		for(String cif : cifs) {
			validator = SimpleDocumentValidatorFactory.createCifDocumentValidator(cif);
			assertTrue(validator.isValid());
		}
	}
	
	@Test
	public void testInvalidCifBadControl() {
		String cif = "A3436806G";
		IDocumentValidator validator = null;
		validator = SimpleDocumentValidatorFactory.createCifDocumentValidator(cif);
		assertFalse(validator.isValid());
	}
	
	@Test
	public void testInvalidCifBadFirstLetter() {
		String cif = "Z9620754C";
		IDocumentValidator validator = null;
		validator = SimpleDocumentValidatorFactory.createCifDocumentValidator(cif);
		assertFalse(validator.isValid());
	}
	
	@Test
	public void testInvalidCif() {
		String cif = "A34F6806G";
		IDocumentValidator validator = null;
		validator = SimpleDocumentValidatorFactory.createCifDocumentValidator(cif);
		assertFalse(validator.isValid());
	}

}
