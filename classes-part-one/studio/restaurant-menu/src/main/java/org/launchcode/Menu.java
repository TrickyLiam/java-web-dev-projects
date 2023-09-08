package org.launchcode;


import java.util.ArrayList;
import java.time.LocalDate;

public class Menu {
    private String name;
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(String name, ArrayList<MenuItem> i) {
        lastUpdated = LocalDate.now();
        items = i;
    }


//    public String getName() {
//        return name;
//    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addItem(MenuItem newItem) {
        this.items.add(newItem);
        lastUpdated = LocalDate.now();
    }

    public void removeItem(MenuItem itemToDelete) {
        this.items.remove(itemToDelete);
        lastUpdated = LocalDate.now();
    }

}
