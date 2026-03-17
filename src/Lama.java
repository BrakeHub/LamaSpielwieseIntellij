import java.time.LocalDate;

public class Lama{
    private String tiername;
<<<<<<< master
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
=======
    private String tierlaut = "Möööht;

  
    public Lama(String tiername) {
        this.tiername = tiername;
>>>>>>> master
    }
   
    public Lama(String tiername, String tierlaut){
        this.tiername = tiername;
        this.tierlaut = tierlaut;
        System.out.println("Lama "+ tiername + " erstellt.");
        System.out.println("Es sagt: " + tierlaut);
    }
  
    public void ausgebenmuuhlaut(){
        System.out.println("Muuuh");
    }

    public String getTierlaut() {
        return tierlaut;
    }

    public void setTierlaut(String tierlaut) {
        this.tierlaut = tierlaut;
    }

    public String getTiername() {
        return tiername;
    }

    public void setTiername(String tiername) {
        this.tiername = tiername;
      



}
