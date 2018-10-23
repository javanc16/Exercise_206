/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_206;

/**
 *
 * @author ich
 */
public class Storage {
    private int id;
    private String description;
    private int place;
    
    public Storage(int id, String description, int place) {
        this.id = id;
        this.description = description;
        this.place = place;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getPlace() {
        return place;
    }   

    public int getColValue(int columnIndex) {
         return columnIndex;
    }
}