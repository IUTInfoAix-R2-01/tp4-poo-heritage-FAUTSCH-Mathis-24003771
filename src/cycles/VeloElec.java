package cycles;

public class VeloElec extends Velo {
    private final static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
    private double facteurPuissanceMoteur;

    public VeloElec() {
        super(0.0, 0.0);
        this.facteurPuissanceMoteur = 0.0;
    }

    public VeloElec(double diamRoue, double coupleMoteur) {
        super(0.0, diamRoue);
        this.facteurPuissanceMoteur = coupleMoteur;
    }

    public VeloElec(double braquet, double diamRoue, double coupleMoteur) {
        super(braquet, diamRoue);
        this.facteurPuissanceMoteur = coupleMoteur;
    }

    public double getDEFAUT_COUPLE_MOTEUR() {
        return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
    }

    public double getFacteurPuissanceMoteur() {
        return facteurPuissanceMoteur;
    }

    public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
        this.facteurPuissanceMoteur = facteurPuissanceMoteur;
    }

    @Override
    public String toString() {
        return "VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
    }

    @Override
    public double getPuissance(double FrequenceCoupsDePedale) {
        return super.getPuissance(FrequenceCoupsDePedale) * facteurPuissanceMoteur;
    }

    public static void main(String[] args) {
        VeloElec ve1 = new VeloElec(0.7, 0.7, 15.0);
        System.out.println(ve1);
        System.out.println(ve1.getPuissance(1.0));
    }
}
