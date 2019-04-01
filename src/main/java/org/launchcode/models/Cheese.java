package org.launchcode.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Cheese {

      @NotNull
      @Size(min=3, max=20)
      private String name;

      @NotNull
      @Size(min=1, message="Description must not be empty")
      private String description;

      private int cheeseId;
      private static int nextId = 0;

    public Cheese(String name, String description) {
        this();
        this.name = name;
        this.description = description;
    }

    public Cheese(){
        nextId ++;
        cheeseId = nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCheeseId() {
        return cheeseId;
    }

    public void setCheeseId(int cheeseId) {
        this.cheeseId = cheeseId;
    }
}
