public class Lama{
    private String tiername;
    private String tierlaut = "Möööht";

    public Lama(String tiername) {
        this.tiername = tiername;
    }
    public Lama(String tiername, String tierlaut){
        this.tiername = tiername;
        this.tierlaut = tierlaut;
        System.out.println("Lama "+ tiername + " erstellt.");
        System.out.println("Es sagt: " + tierlaut);
    }

}
