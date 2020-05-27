package project3.domain;

public class PC implements Equipment {
    private String modle;
    private String display;

    public PC() {
    }

    public PC(String modle, String display) {
        this.modle = modle;
        this.display = display;
    }

    public String getModle() {
        return modle;
    }

    public void setModle(String modle) {
        this.modle = modle;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDescription() {
        return modle + "(" + display + ")";
    }
}
