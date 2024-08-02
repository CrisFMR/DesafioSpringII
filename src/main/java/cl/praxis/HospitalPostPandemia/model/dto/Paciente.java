package cl.praxis.HospitalPostPandemia.model.dto;

public class Paciente {

    private int id;
    private String firstName;
    private String lastName;
    private String Birth;
    private String Phone;
    private String Adress;
    private String infectionDate;

    public Paciente() {
    }

    public Paciente(int id, String firstName, String lastName, String birth, String phone, String adress, String infectionDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        Birth = birth;
        Phone = phone;
        Adress = adress;
        this.infectionDate = infectionDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirth() {
        return Birth;
    }

    public void setBirth(String birth) {
        Birth = birth;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public String getInfectionDate() {
        return infectionDate;
    }

    public void setInfectionDate(String infectionDate) {
        this.infectionDate = infectionDate;
    }
}