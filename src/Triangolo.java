public class Triangolo extends Forma {

    private float base;
    private float altezza;

    public Triangolo(float base, float altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public void calcolaArea() {
        System.out.println("I lati del triangolo sono: "+ base + " e " + altezza +" E l'Area del triangolo: " + (base * altezza)/2);
    }
}
