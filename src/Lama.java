public class Lama{
    private String tiername;
    private String tierlaut;

    public Lama(String tiername, String tierlaut){
        this.tiername = tiername;
        this.tierlaut = tierlaut;
    }
    public void test(){
        System.out.println("Hallo welt");
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

}
