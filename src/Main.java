public class Main {
    public static void main(String[] args) {


        Rettangolo r = new Rettangolo(5, 3);
        Triangolo t = new Triangolo(5, 3);
        Quadrato q = new Quadrato(5);
        q.calcolaArea();
        r.calcolaArea();
        t.calcolaArea();
    }
}