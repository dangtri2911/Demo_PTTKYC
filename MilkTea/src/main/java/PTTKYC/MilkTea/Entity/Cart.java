package PTTKYC.MilkTea.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @OneToMany(mappedBy = "cart")
    private List<Food> foodList = new ArrayList<Food>();
}
