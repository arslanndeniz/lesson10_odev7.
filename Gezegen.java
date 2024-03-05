enum Gezegen {
    MERKUR("Merkür", 1, 57.9, 2439.7, 1407.6),
    VENUS("Venüs", 2, 108.2, 6051.8, -5832.5),
    DUNYA("Dünya", 3, 149.6, 6371.0, 24.0),
    MARS("Mars", 4, 227.9, 3389.5, 24.6),
    JUPITER("Jüpiter", 5, 778.6, 69911, 9.9),
    SATURN("Satürn", 6, 1433.5, 58232, 10.7),
    URANUS("Uranüs", 7, 2872.5, 25362, -17.2),
    NEPTUN("Neptün", 8, 4495.1, 24622, 16.1);

    private String ad;
    private int siralamaNumarasi;
    private double uzaklik;
    private double yaricap;
    private double donmeSuresi;

    Gezegen(String ad, int siralamaNumarasi, double uzaklik, double yaricap, double donmeSuresi) {
        this.ad = ad;
        this.siralamaNumarasi = siralamaNumarasi;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }

    public String getAd() {
        return ad;
    }

    public int getSiralamaNumarasi() {
        return siralamaNumarasi;
    }

    public double getUzaklik() {
        return uzaklik;
    }

    public double getYaricap() {
        return yaricap;
    }

    public double getDonmeSuresi() {
        return donmeSuresi;
    }

    @Override
    public String toString() {
        return ad + " - Sıralama Numarası: " + siralamaNumarasi +
                ", Uzaklık: " + uzaklik + " Mkm" +
                ", Yarıçap: " + yaricap + " km" +
                ", Dönme Süresi: " + donmeSuresi + " saat";
    }
}