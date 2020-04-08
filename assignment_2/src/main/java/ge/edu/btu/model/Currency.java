package ge.edu.btu.model;

public class Currency {
    public int id;
    public String title;
    public double buy;
    public double sell;
//    public String to;
//    public int amount;
//    public double result;

    public Currency() {
    }

    public Currency(int id, String title, double buy, double sell) {
        this.id = id;
        this.title = title;
        this.buy = buy;
        this.sell = sell;
//        this.to = to;
//        this.amount = amount;
//        this.result = result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public String getTo() {
//        return to;
//    }
//
//    public void setTo(String to) {
//        this.to = to;
//    }
//
//    public int getAmount() {
//        return amount;
//    }
//
//    public void setAmount(int amount) {
//        this.amount = amount;
//    }

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
                "id=" + id +
                ", title='" + title + '\'' +
                ", buy='" + buy + '\'' +
                ", sell=" + sell +
                '}';
    }

    public String geltoOther() {
        return "currency{"  +buy*id + '}';
    }
}

