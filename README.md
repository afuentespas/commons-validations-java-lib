# Commons Validations
Library with most common validations in developments.

## Validator List

- [Identification Documents](#identification-documents) 
    - [Spanish Documents](#spanish-documents)
- [String](#string)

## Identification Documents
### Spanish Documents
---
#### NIF
Accepted pattern:
> [0-9]{1,8}(-)?[A-z]

Example:
```
IDocumentValidator validator = SimpleDocumentValidatorFactory.createNifDocumentValidator("1234567L");
if(validator.isValid()){
  // Your code
}
```
---
#### NIE
Accepted pattern:
> [XYZxyz][0-9]{1,7}(-)?[A-z]

Example:
```
IDocumentValidator validator = SimpleDocumentValidatorFactory.createNieDocumentValidator("Z7157453L");
if(validator.isValid()){
  // Your code
}
```
---
#### CIF
Accepted pattern:
> [ABCDEFGHJNPQRSUVWabcdefghjnpqrsuvw]\\d{7}[0-9A-Ja-j]

Example:
```
IDocumentValidator validator = SimpleDocumentValidatorFactory.createCifDocumentValidator("A34368068");
if(validator.isValid()){
  // Your code
}
```
---


## String
---
###  isNull()
Check if the string is null.  
  
Example:
```
IStringValidator string = StringValidatorFactory.createStringValidator(null);
if(string.isNull()){
  // Your code
}
```
---
###  isEmpty()
Check if the string is empty.  
  
Example:
```
IStringValidator string = StringValidatorFactory.createStringValidator("");
if(string.isEmpty()){
  // Your code
}
```
---
###  isNullOrEmpty()
Check if the string is null or empty.  
  
Example:
```
IStringValidator string = StringValidatorFactory.createStringValidator("randomString");
if(string.isNullOrEmpty()){
  // Your code
}
```
---
###  isNumber()
Check if the string is a number.  
  
Example:
```
IStringValidator string = StringValidatorFactory.createStringValidator("123");
if(string.isNumber()){
  // Your code
}
```
---
###  isAlphanumeric()
Check if the string is alphanumeric.  
  
Example:
```
IStringValidator string = StringValidatorFactory.createStringValidator("abc123");
if(string.isAlphanumeric()){
  // Your code
}
```
---
###  isEmail()
Check if the string is email.  
  
Example:
```
IStringValidator string = StringValidatorFactory.createStringValidator("random@email.com");
if(string.isEmail()){
  // Your code
}
```
---
###  matches(String stringPattern)
Check if the string matches with `stringPattern`.  
  
Example:
```
IStringValidator string = StringValidatorFactory.createStringValidator("a");
if(string.matches("[abc]")){
  // Your code
}
```
---
###  maxLength(int size)
Check if the string length is less or equals than `size`.  
  
Example:
```
IStringValidator string = StringValidatorFactory.createStringValidator("abc");
if(string.maxLength(4)){
  // Your code
}
```
---
###  minLength(int size)
Check if the string length is greater or equals than `size`.  
  
Example:
```
IStringValidator string = StringValidatorFactory.createStringValidator("abc");
if(string.minLength(1)){
  // Your code
}
```
---

## To Do List
- [x] Identification Documents
  - [x] Spanish Documents
    - [x] NIF
    - [x] NIE
    - [x] CIF
- [x] String
  - [x] Null
  - [x] Empty
  - [x] Null or Empty
  - [x] Number
  - [x] Alphanumeric
  - [x] Email
  - [x] Match
  - [x] Max size
  - [x] Min size
- [ ] IBAN
- [ ] Credit Card
