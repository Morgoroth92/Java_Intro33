public class Rettangolo extends Forma{

    private float base;
    private float altezza;

    public Rettangolo(float base, float altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        System.out.println("I lati del rettangolo sono: "+ base + " e " + altezza +" E l'Area del rettangolo: " + base * altezza);
    }
}
