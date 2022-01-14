package Chapter_7;

public class Main {
    public void crossRapid(int x) throws FallInRiverException {
        if (x<10) throw new FallInRiverException();
    }


    public static void main(String[] args) {
        Main riverRafting = new Main();
        try {
            riverRafting.crossRapid(5);
        }
        catch (FallInRiverException e){
            System.out.println("Postaraj wydostac sie z wody");
        }
        finally {
            System.out.println("Zaplac za zabawe");
        }
    }
}
