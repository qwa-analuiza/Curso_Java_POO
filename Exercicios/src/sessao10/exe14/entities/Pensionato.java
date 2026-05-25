package sessao10.exe14.entities;

public class Pensionato {
    private String name;
    private String email;

    public Pensionato(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }



    public String toString(){
        return name + "," + email;
    }
}
