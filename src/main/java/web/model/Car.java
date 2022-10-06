package web.model;

public class Car {
    public String model;
    public int series;
    public int number;

    public Car() {
    }

    public Car(String model, int series, int number) {
        this.model = model;
        this.series = series;
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", number=" + number +
                '}';
    }
}

