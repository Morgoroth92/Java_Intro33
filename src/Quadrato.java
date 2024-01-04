public class Quadrato extends Forma{

    private float lato;

    public Quadrato(float lato) {
        this.lato = lato;
    }
    @Override
    public void calcolaArea() {
        System.out.println("I lati del quadrato sono: "+ lato + " E l'Area del quadrato: " + lato * lato + "");
    }
}
