package models;

import com.google.code.morphia.annotations.Entity;
import play.modules.morphia.Model;

@Entity
public class Bar extends Model {
    
    public String name;

}