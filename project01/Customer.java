package project01;

public class Customer {
    private String fristName;
    private String lastName;
    private Bccount bccount;

    public Customer(String f,String l){
        this.fristName = f;
        this.lastName = l;
    }

    public String getFristName() {
        return fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBccount(Bccount bccount) {
        this.bccount = bccount;
    }

    public Bccount getBccount() {
        return bccount;
    }
}
