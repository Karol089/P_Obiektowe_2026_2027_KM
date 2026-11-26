package tasks.validation;

public class SimpleTextValidator extends Validator {
    @Override
    public boolean isValid(String value) {
        return value != null && !value.isBlank();
    }
}
