package tasks.validation;

public class NameValidation {

    public static void validate(String[] names){
        class LocalValidator {
            public boolean[] isValid(String[] names){
                boolean[] isValid = new boolean[names.length];
                for(int i = 0; i < names.length; i++){
                    if (names[i] == null || names[i].isEmpty() || names[i].isBlank()){

                    } else {
                        isValid[i] = true;
                    }
                }
                return isValid;
            }
        }
        LocalValidator local = new LocalValidator();
        boolean[] results = local.isValid(names);
        for(boolean result : results){
            System.out.printf(result + ", ");
        }
    }
}
