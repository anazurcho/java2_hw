package ge.edu.btu.model;

public class Currency {
    public String title;
    public double buy;
    public double sell;

    public Currency() {
    }

    public Currency(String title, double buy, double sell) {
        this.title = title;
        this.buy = buy;
        this.sell = sell;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBuy() {
        return buy;
    }

    public void setBuy(double buy) {
        this.buy = buy;
    }

    public double getSell() {
        return sell;
    }

    public void setSell(double sell) {
        this.sell = sell;
    }

    @Override
    public String toString() {
        return "currency{" +
                "  title='" + title + '\'' +
                ", buy='" + buy + '\'' +
                ", sell=" + sell +
                '}';
    }
}

