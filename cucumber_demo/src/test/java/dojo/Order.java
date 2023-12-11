package dojo;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String owner;
    private String target;
    private List<String> cocktails = new ArrayList<>();


    public void declareOwner(String name) {
        this.owner = name;
    }

    public void declareTarget(String name) {
        this.target = name;
    }

    public List<String> getCocktails() {
        return this.cocktails;
    }

    public String getOwner() {
        return this.owner;
    }

    public String getTarget() {
        return this.target;
    }
}
