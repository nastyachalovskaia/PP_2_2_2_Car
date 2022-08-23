package web.model;

public class Car {

    private String color;
    private int series;
    private int engine;

    public Car(String color, int series, int engine) {
        this.color = color;
        this.series = series;
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car" +
                " color = " + color +
                ", series = " + series +
                ", engine = " + engine;
    }
}
