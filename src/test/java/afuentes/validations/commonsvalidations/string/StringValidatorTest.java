package afuentes.validations.commonsvalidations.string;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import afuentes.validations.commonsvalidations.IStringValidator;
import afuentes.validations.commonsvalidations.factory.StringValidatorFactory;

public class StringValidatorTest {
	
	private IStringValidator email, number, alphanumeric, empty, nullObject;
	
	@Before
	public void before() {
		this.email = StringValidatorFactory.createStringValidator("random@email.com");
		this.number = StringValidatorFactory.createStringValidator("123");
		this.alphanumeric = StringValidatorFactory.createStringValidator("3kdc7rDv5tzb");
		this.empty = StringValidatorFactory.createStringValidator("");
		this.nullObject = StringValidatorFactory.createStringValidator(null);
	}

	@Test
	public void isNullTest() {
		assertFalse(this.email.isNull());
		assertFalse(this.number.isNull());
		assertFalse(this.alphanumeric.isNull());
		assertFalse(this.empty.isNull());
		assertTrue(this.nullObject.isNull());
	}
	
	@Test
	public void isEmptyTest() {
		assertFalse(this.email.isEmpty());
		assertFalse(this.number.isEmpty());
		assertFalse(this.alphanumeric.isEmpty());
		assertTrue(this.empty.isEmpty());
	}
	
	@Test
	public void isNullOrEmptyTest() {
		assertFalse(this.email.isNullOrEmpty());
		assertFalse(this.number.isNullOrEmpty());
		assertFalse(this.alphanumeric.isNullOrEmpty());
		assertTrue(this.empty.isNullOrEmpty());
		assertTrue(this.nullObject.isNullOrEmpty());
	}
	
	@Test
	public void isNumberTest() {
		assertFalse(this.email.isNumber());
		assertTrue(this.number.isNumber());
		assertFalse(this.alphanumeric.isNumber());
		assertFalse(this.empty.isNumber());
	}

	@Test
	public void isAlphanumericTest() {
		assertFalse(this.email.isAlphanumeric());
		assertTrue(this.number.isAlphanumeric());
		assertTrue(this.alphanumeric.isAlphanumeric());
		assertFalse(this.empty.isAlphanumeric());
	}

	@Test
	public void isEmailTest() {
		assertTrue(this.email.isEmail());
		assertFalse(this.number.isEmail());
		assertFalse(this.alphanumeric.isEmail());
		assertFalse(this.empty.isEmail());
	}
	
	@Test
	public void maxLengthTest() {
		assertFalse(this.email.maxLength(4));
		assertTrue(this.number.maxLength(40));
		assertFalse(this.alphanumeric.maxLength(4));
		assertTrue(this.empty.maxLength(40));
	}
	
	@Test
	public void minLengthTest() {
		assertTrue(this.email.minLength(4));
		assertFalse(this.number.minLength(40));
		assertTrue(this.alphanumeric.minLength(4));
		assertFalse(this.empty.minLength(40));
	}
	
}
