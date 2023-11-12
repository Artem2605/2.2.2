package web.model;

public class Car {

    private String company;
    private String model;
    private Integer year;

    public Car(String company, String model, Integer year) {
        this.company = company;
        this.model = model;
        this.year = year;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}