package cycles;

import java.util.Random;

public class Velo {
	private final static double DEFAUT_BRAQUET = 13.0;
    private double braquet;
    private double diamRoue;
    private Random genAlea;

    public Velo(double braquet) {
        this.braquet = braquet;
    }

    public double getDEFAUT_BRAQUET() {
        return DEFAUT_BRAQUET;
    }

    public Velo(double braquet, double diamRoue) {
        this.braquet = braquet;
        this.diamRoue = diamRoue;
    }

    public double getBraquet() {
        return braquet;
    }

    public void setBraquet(double braquet) {
        this.braquet = braquet;
    }

    public double getDiamRoue() {
        return diamRoue;
    }

    public void setDiamRoue(double diamRoue) {
        this.diamRoue = diamRoue;
    }

    public Random getGenAlea() {
        return genAlea;
    }

    public void setGenAlea(Random genAlea) {
        this.genAlea = genAlea;
    }

    @Override
	public String toString() {
		return "Velo [braquet=" + braquet + ", diamRoue=" + diamRoue + "]";
	}

    public double getPuissance(double FrequenceCoupsDePedale) {
    	return 2 * Math.PI * FrequenceCoupsDePedale * braquet;
    }

    public static void main(String[] args) {
        Velo v1 = new Velo(13.0, 0.7);
        System.out.println(v1);
        System.out.println(v1.getPuissance(1.0));
    }
}
