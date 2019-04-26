package afuentes.validations.commonsvalidations.string;

import afuentes.validations.commonsvalidations.IStringValidator;

public class StringValidator implements IStringValidator {
	
	private String string;
	
	public StringValidator(String string) {
		this.string = string;
	}
	
	@Override
	public boolean isNullOrEmpty() {
		return this.isNull() || this.isEmpty();
	}

	@Override
	public boolean isEmpty() {
		assert !this.isNull();
		return this.string.isEmpty();
	}

	@Override
	public boolean isNull() {
		return this.string == null;
	}

	@Override
	public boolean isNumber() {
		boolean isNumber = false;
		try {
			Integer.parseInt(this.string);
			isNumber = true;
		} catch (NumberFormatException e) {
			// Ignore
		}
		return isNumber;
	}

	@Override
	public boolean isAlphanumeric() {
		return this.matches(StringPatterns.ALPHANUMERIC.getValue());
	}

	@Override
	public boolean isEmail() {
		return this.matches(StringPatterns.EMAIL.getValue());
	}

	@Override
	public boolean matches(String pattern) {
		return this.string.matches(pattern);
	}

	@Override
	public boolean maxLength(int size) {
		return this.string.length() <= size;
	}

	@Override
	public boolean minLength(int size) {
		return this.string.length() >= size;
	}

}
