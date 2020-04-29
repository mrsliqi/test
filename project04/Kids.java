package project04;

public class Kids extends ManKid{
    private int yearsOld;
    public Kids(){

    }
    public Kids(int yearsOld){
        this.yearsOld = yearsOld;
    }


    public void printAge(){
        System.out.println(yearsOld);
    }

    public int getYearsOld(){
        return yearsOld;
    }
    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
    public void employeed(){
        System.out.println("kids should study and no job");
    }
}
