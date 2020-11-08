public class Currency {
    public String dollars;
    public String euros;
    public String pesos;
    public String rupees;
    public String yen;
    public String pounds;
    public String canadian;
    public String australian;

    public Currency () {
        this.dollars = "Dollars";
        this.euros = "Euros";
        this.pesos = "Pesos";
        this.rupees = "Rupees";
        this.yen = "Yen";
        this.pounds = "Pounds";
        this.canadian = "Canadian Dollars";
        this.australian = "Australian Dollars";

    }

    public Currency(String dollars, String euros, String pesos, String rupees, String yen, String pounds, String canadian, String australian) {
        this.dollars = dollars;
        this.euros = euros;
        this.pesos = pesos;
        this.rupees = rupees;
        this.yen = yen;
        this.pounds = pounds;
        this.canadian = canadian;
        this.australian = australian;
    }

    public String getDollars() {
        return dollars;
    }

    public void setDollars(String dollars) {
        this.dollars = dollars;
    }

    public String getEuros() {
        return euros;
    }

    public void setEuros(String euros) {
        this.euros = euros;
    }

    public String getPesos() {
        return pesos;
    }

    public void setPesos(String pesos) {
        this.pesos = pesos;
    }

    public String getRupees() {
        return rupees;
    }

    public void setRupees(String rupees) {
        this.rupees = rupees;
    }

    public String getYen() {
        return yen;
    }

    public void setYen(String yen) {
        this.yen = yen;
    }

    public String getPounds() {
        return pounds;
    }

    public void setPounds(String pounds) {
        this.pounds = pounds;
    }

    public String getCanadian() {
        return canadian;
    }

    public void setCanadian(String canadian) {
        this.canadian = canadian;
    }

    public String getAustralian() {
        return australian;
    }

    public void setAustralian(String australian) {
        this.australian = australian;
    }

    public double dollartoeuro(double fromAmount) {
        return fromAmount * 0.84;
    }
    public double dollartopeso(double fromAmount) {
        return fromAmount * 20.58;
    }
    public double dollartorupees(double fromAmount) {
        return fromAmount * 73.98;
    }
    public double dollartoyen(double fromAmount) {
        return fromAmount * 103.35;
    }
    public double dollartopound(double fromAmount) {
        return fromAmount * 0.76;
    }
    public double dollartocanadian(double fromAmount) {
        return fromAmount *1.30;
    }
    public double dollartoaustralian(double fromAmount) {
        return fromAmount * 1.38;
    }
    public double eurotodollar(double fromAmount) {
        return fromAmount * 1.19;
    }
    public double eurotopeso(double fromAmount) {
        return fromAmount * 24.44;
    }
    public double eurotorupee(double fromAmount) {
        return fromAmount * 87.85;
    }
    public double eurotoyen(double fromAmount) {
        return fromAmount * 122.72;
    }
    public double eurotopound(double fromAmount) {
        return fromAmount * 0.90;
    }
    public double eurotocanadian(double fromAmount) {
        return fromAmount * 1.55;
    }
    public double eurotoaustralian(double fromAmount) {
        return fromAmount * 1.64;
    }
    public double pesotodollar(double fromAmount) {
        return fromAmount * 0.049;
    }
    public double pesotoeuro(double fromAmount) {
        return fromAmount * 0.041;
    }
    public double pesotorupee(double fromAmount) {
        return fromAmount * 3.59;
    }
    public double pesotoyen(double fromAmount) {
        return fromAmount * 5.02;
    }
    public double pesotopound(double fromAmount) {
        return fromAmount * 0.037;
    }
    public double pesotocanadian(double fromAmount) {
        return fromAmount * 0.063;
    }
    public double pesotoaustralian(double fromAmount) {
        return fromAmount * 0.067;
    }
    public double rupeestodollar(double fromAmount) {
        return fromAmount * 0.014;
    }
    public double rupeestoeuro(double fromAmount) {
        return fromAmount * 0.011;
    }
    public double rupeestopesos(double fromAmount) {
        return fromAmount * 0.28;
    }
    public double rupeestoyen(double fromAmount) {
        return fromAmount * 1.40;
    }
    public double rupeestopounds(double fromAmount) {
        return fromAmount * 0.010;
    }
    public double rupeestocanadian(double fromAmount) {
        return fromAmount * 0.018;
    }
    public double rupeestoaustralian(double fromAmount) {
        return fromAmount * 0.019;
    }
    public double yentodollar(double fromAmount) {
        return fromAmount * 0.0097;
    }
    public double yentoeuro(double fromAmount) {
        return fromAmount * 0.0081;
    }
    public double yentopeso(double fromAmount) {
        return fromAmount * 0.20;
    }
    public double yentorupees(double fromAmount) {
        return fromAmount * 0.72;
    }
    public double yentopounds(double fromAmount) {
        return fromAmount * 0.0074;
    }
    public double yentocanadian(double fromAmount) {
        return fromAmount * 0.013;
    }
    public double yentoaustralian(double fromAmount) {
        return fromAmount * 0.013;
    }
    public double poundstodollars(double fromAmount) {
        return fromAmount * 1.32;
    }
    public double poundstoeuros(double fromAmount) {
        return fromAmount * 1.11;
    }
    public double poundstopesos(double fromAmount) {
        return fromAmount * 27.08;
    }
    public double poundstorupees(double fromAmount) {
        return fromAmount * 97.34;
    }
    public double poundstoyen(double fromAmount) {
        return fromAmount * 135.81;
    }
    public double poundstocanadian(double fromAmount) {
        return fromAmount * 1.72;
    }
    public double poundstoaustralian(double fromAmount) {
        return fromAmount * 1.81;
    }
    public double canadiantodollar(double fromAmount) {
        return fromAmount * 0.77;
    }
    public double canadiantoeuro(double fromAmount) {
        return fromAmount * 0.64;
    }
    public double canadiantopesos(double fromAmount) {
        return fromAmount * 15.82;
    }
    public double canadiantorupees(double fromAmount) {
        return fromAmount * 56.80;
    }
    public double canadiantoyen(double fromAmount) {
        return fromAmount * 79.36;
    }
    public double canadiantopounds(double fromAmount) {
        return fromAmount * 0.58;
    }
    public double canadiantoaustralian(double fromAmount) {
        return fromAmount * 1.06;
    }
    public double australiantodollar(double fromAmount) {
        return fromAmount * 0.73;
    }
    public double australiantoeuro(double fromAmount) {
        return fromAmount * 0.61;
    }
    public double australiantopeso(double fromAmount) {
        return fromAmount * 14.95;
    }
    public double australiantorupee(double fromAmount) {
        return fromAmount * 53.69;
    }
    public double australiantoyen(double fromAmount) {
        return fromAmount * 75.02;
    }
    public double australiantopounds(double fromAmount) {
        return fromAmount * 0.55;
    }
    public double australiantocanadian(double fromAmount) {
        return fromAmount * 0.95;
    }



}
