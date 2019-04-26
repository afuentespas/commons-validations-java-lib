package afuentes.validations.commonsvalidations.documents;

import static org.junit.Assert.*;
import org.junit.Test;
import afuentes.validations.commonsvalidations.IDocumentValidator;
import afuentes.validations.commonsvalidations.factory.SimpleDocumentValidatorFactory;

public class NifValidatorTest {
	
	private IDocumentValidator validator;

	@Test
	public void validateDniNumberUpperCharTest() {
		this.validator = SimpleDocumentValidatorFactory.createNifDocumentValidator("1234567L");
		assertTrue(this.validator.isValid());
	}
	
	@Test
	public void validateDniNumberLowerCharTest() {
		this.validator = SimpleDocumentValidatorFactory.createNifDocumentValidator("1234567l");
		assertTrue(this.validator.isValid());
	}
	
	@Test
	public void validateDniStringDashUpperCharTest() {
		this.validator = SimpleDocumentValidatorFactory.createNifDocumentValidator("1234567-L");
		assertTrue(this.validator.isValid());
	}
	
	@Test
	public void validateDniStringDashLowerCharTest() {
		this.validator = SimpleDocumentValidatorFactory.createNifDocumentValidator("1234567-l");
		assertTrue(this.validator.isValid());
	}
	
	@Test
	public void validateDniIncorrect() {
		this.validator = SimpleDocumentValidatorFactory.createNifDocumentValidator("1234567M");
		assertFalse(this.validator.isValid());
	}
	
	@Test
	public void validateDniWithLetters() {
		this.validator = SimpleDocumentValidatorFactory.createNifDocumentValidator("12SD567L");
		assertFalse(this.validator.isValid());
	}
	
}
