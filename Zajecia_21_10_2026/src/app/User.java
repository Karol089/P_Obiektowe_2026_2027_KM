package app;

public class User {

    private String login;
    private String password;
    private int age;

    public User(
            String login,
            String password,
            int age
    ) {
        this.login = login;
        this.password = password;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        String hiddenPassword = "";
        for(int i = 0; i < this.password.length(); i++){
            hiddenPassword += "*";
        }
        return hiddenPassword;
    }

    public int getAge() {
        return age;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String oldPassword, String newPassword){
        if (oldPassword.equals(this.password)){
            this.password = newPassword;
        }
    }

    public void birthday(){
        this.age++;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void showUser() {
        System.out.println(
                "Login: " + this.getLogin()
                        + ", hasło: " + this.getPassword()
                        + ", wiek: " + this.getAge() + "\n"
        );
    }
}
