package afuentes.validations.commonsvalidations.documents;

import static org.junit.Assert.*;

import org.junit.Test;

import afuentes.validations.commonsvalidations.IDocumentValidator;
import afuentes.validations.commonsvalidations.factory.SimpleDocumentValidatorFactory;

public class NieValidatorTest {

	private IDocumentValidator validator;

	@Test
	public void validateDniNumberUpperCharTest() {
		this.validator = SimpleDocumentValidatorFactory.createNieDocumentValidator("Z7157453L");
		assertTrue(this.validator.isValid());
	}
	
	@Test
	public void validateDniNumberLowerCharTest() {
		this.validator = SimpleDocumentValidatorFactory.createNieDocumentValidator("Z7157453l");
		assertTrue(this.validator.isValid());
	}
	
	@Test
	public void validateDniStringDashUpperCharTest() {
		this.validator = SimpleDocumentValidatorFactory.createNieDocumentValidator("Z7157453-L");
		assertTrue(this.validator.isValid());
	}
	
	@Test
	public void validateDniStringDashLowerCharTest() {
		this.validator = SimpleDocumentValidatorFactory.createNieDocumentValidator("Z7157453-l");
		assertTrue(this.validator.isValid());
	}
	
	@Test
	public void validateDniIncorrect() {
		this.validator = SimpleDocumentValidatorFactory.createNieDocumentValidator("Z7157453M");
		assertFalse(this.validator.isValid());
	}
	
	@Test
	public void validateDniWithLetters() {
		this.validator = SimpleDocumentValidatorFactory.createNieDocumentValidator("F7157453L");
		assertFalse(this.validator.isValid());
	}

}
