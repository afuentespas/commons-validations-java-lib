# Commons Validations
Library with most common validations in developments.

## Validator List

- [Identification Documents](#identification-documents) 
    - [Spanish Documents](#spanish-documents)
- [String]()

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
