import java.time.LocalDate;

public class Lama{
    private String tiername;
    private String tierlaut = "Möööht";
    private LocalDate letzteSchur;


    public Lama(){

        System.out.println("Lama erstellt");
        this.letzteSchur = null;
    }

    public void scheren() {
        this.letzteSchur = LocalDate.now();
        System.out.println(tiername + "wurde heute am " + letzteSchur + "geschoren!");
    }

    public LocalDate getLetzteSchur() {
        return letzteSchur;
    }
}
