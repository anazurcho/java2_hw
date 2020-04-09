package ge.edu.btu.model;

public class ChangeAmount {
    private String to;
    private double amount;

    public ChangeAmount() {
    }

    public ChangeAmount(String to, double amount) {
        this.to = to;
        this.amount = amount;
    }

    public String getTo() {return to;}

    public void setTo(String to) {  this.to = to; }

    public double getAmount() { return amount; }

    public void setAmount(double amount) {this.amount = amount; }

}
