package tasks.validation;

public class PasswordValidator {

    private static class ValidationResult {
        private boolean valid = false;
        private String message = "Incorrect Password";

        public boolean isValid() {
            return valid;
        }

        public String getMessage() {
            return message;
        }

        public void validator(String password){
            if(password.isEmpty() || password.isBlank()){
                return;
            }
            this.valid = true;
            this.message = "Password Accepted";
        }
    }

    public static void validate(String password){
        ValidationResult result = new ValidationResult();
        result.validator(password);
        System.out.println(result.getMessage() + "\n");
    }
}
