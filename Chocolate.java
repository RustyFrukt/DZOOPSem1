package ru.geekbrains.lesson1;

public class Chocolate extends Product{

    private double calories; // калории
    private int type; // вид шоколада

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Chocolate(String brand, String name, double price, double calories, int type) {
        super(brand, name, price);
        this.calories = calories;
        this.type = type;
    }


    public String displayInfo() {
        return String.format("[Шоколад]%s - %s - %f - [калории: %f; вид: %d]", brand, name, price, calories, type);
    }
}
