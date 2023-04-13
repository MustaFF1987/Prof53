package lesson3.champagne;

public class CruTest {
    public static void main(String[] args) {

        Cru cru1 = Cru.AUTRE;
        Cru cru2 = Cru.PREMIER;
        Cru cru3 = Cru.GRAND;

        System.out.println();
        System.out.println("Quality of Champagne AUTRE is: " + cru1.getQuality());
        System.out.println("Quality of Champagne PREMIER is: " + cru2.getQuality());
        System.out.println("Quality of Champagne GRAND is: " + cru3.getQuality());

    }
}
