public class Citizen {
    private int id;
    private String completeName;
    private String birthDate;
    private String birthCity;

    public Citizen(int id, String completeName, String birthDate, String birthCity) {
        this.id = id;
        this.completeName = completeName;
        this.birthDate = birthDate;
        this.birthCity = birthCity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }



}
