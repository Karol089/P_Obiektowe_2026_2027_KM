package tasks.company;

public class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public class Departament {
        private String name;

        public Departament(String name) {
            this.name = name;
        }

        public void printNames(){
            System.out.printf("Company name: %s \nDepartament name: %s\n",
                    Company.this.name, this.name);
            // Company.this.name odwołuje się do nazwy firmy, this.name do nazwy departamentu
        }
    }
}
