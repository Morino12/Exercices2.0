package enumprovince;

public enum Province {
    ON(14915270, "Ontario", "Toronto"),
    QC(8631147, "Québec", "Québec"),
    NS(998832, "Nouvelle-Écosse", "Halifax"),
    NB(7943, "Nouveau-Brunswick", "Fredericton"),
    MB(1386333, "Manitoba", "Winnipeg"),
    BC(5249635, "British Columbia", "Victoria"),
    PE(165936, "Île-du-Prince-Édouard", "Charlottetown"),
    SK(1180867, "Saskatchewan", "Regina"),
    AB(4464170, "Alberta", "Edmonton"),
    NL(521758, "Terre-Neuve-et-Labrador", "Saint-Jean de Terre-Neuve");
    private int population;
    private String province;
    private String capitale;

    Province(int population, String province, String capitale) {
        this.population = population;
        this.province = province;
        this.capitale = capitale;
    }
    public String getCodeMin(){
        return name().toLowerCase();
    }

    public int getPopulation() {
        return population;
    }

    public String getProvince() {
        return province;
    }

    public String getCapitale() {
        return capitale;
    }

    @Override
    public String toString() {
        return "Province{" +
                "population=" + population +
                ", province='" + province + '\'' +
                ", capitale='" + capitale + '\'' +
                '}';
    }
}
