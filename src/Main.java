public class Main {
    public static void main() {
      
        Lama lama1 = new Lama("olga", "muuhhh");
        System.out.println(lama1.getTierlaut());
        System.out.println(lama1.getTiername());
        lama1.ausgebenmuuhlaut();

        Lama Karl = new Lama("Karl", "Proletarier-Lamas aller Länder, vereinigt euch!");
        Lama Einstein = new Lama("Albert", "Phantasie ist wichtiger als Wissen, denn Wissen ist begrenzt.");
    }
}

