package Model.Logic.Entity;

public class Orange {
    private int diameter;
    private int vitC;
    private double cost;
    public Orange(int diameter, int vitC, double cost) {

    }

    public int getDiameter() {
        return diameter;
    }

    public int getVitC() {
        return vitC;
    }

    public double getCost() {
        return cost;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setVitC(int vitC) {
        this.vitC = vitC;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Orange {" +
                "diameter = " + diameter +
                ", vitC = " + vitC +
                ", cost = " + cost +
                '}';
    }
}
