public class point {

    private String Nom;
    private int Abscisse;
    private int Ordonnée;

    public point(String nom, int abscisse, int ordonnée) {
        Nom = nom;
        Abscisse = abscisse;
        Ordonnée = ordonnée;
    }


    public point(int abscisse, int ordonnée) {
        Nom = "";
        Abscisse = abscisse;
        Ordonnée = ordonnée;
    }

    public point(String nom) {
        Nom = nom;
        Abscisse = 0;
        Ordonnée = 0;
    }

    public void Affiche() {
        System.out.println(Nom + "(" + Abscisse + "," + Ordonnée + ")");
    }

    public void TranslHoriz(int a) {
        Abscisse = Abscisse + a;
    }

    public void TranslVert(int a) {
        Ordonnée = Ordonnée + a;
    }
    public void Translation(int a, int b) {
        Abscisse = Abscisse + a;
        Ordonnée = Ordonnée + b;
    }

    public boolean Coincide(point p) {
        return Abscisse == p.Abscisse && Ordonnée == p.Ordonnée;
    }

    public String getNom() {
        return Nom;
    }
    public int getAbscisse() {
        return Abscisse;
    }
    public int getOrdonnée() {
        return Ordonnée;
    }

    public void setNom(String ch) {
        Nom = ch;
    }

    public void setAbscisse(int a) {
        Abscisse = a;
    }
    public void setOrdonnée(int a) {
        Ordonnée = a;
    }
}