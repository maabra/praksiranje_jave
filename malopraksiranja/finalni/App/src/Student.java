public class Student {
    private String ime;
    private String prezime;
    private int godina;
    private int id;
    private String email;
    private String password;

    public Student(String ime, String prezime, int godina) {
        this.ime = ime;
        this.prezime = prezime;
        this.godina = godina;
        this.id = setId();
        this.email = setEmail();;
        this.password = setPassword();;
    }

    public String getIme() {
        return this.ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodina() {
        return this.godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public int getId() {
        return this.id;
    }

    public int setId() {
        return getGodina()*1000+191;
    }

    public String getEmail() {
        return this.email;
    }

    public String setEmail() {
        return this.ime.toLowerCase()+"."+this.prezime.toLowerCase()+"@student.unipu.hr";
    }

    public String setPassword() {
        return Pass.genPass(8).toString();
    }
    

    private String getPassword() {
        return this.password;
    }

    @Override
    public String toString() {
        return "{" +
        " ime='" + getIme() + "'" +
        ", prezime='" + getPrezime() + "'" +
        ", godina='" + getGodina() + "'" +
        ", id='" + getId() + "'" +
        ", email='" + getEmail() + "'" +
        ", password='" + getPassword() + "'" +
        "}";
    }
}

