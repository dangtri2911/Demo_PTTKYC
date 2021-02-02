package PTTKYC.MilkTea.Entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "Food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String f_Name;

    @ManyToOne
    @JoinColumn(name = "Cart_id",nullable = false)
    private Cart cart;

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", f_Name='" + f_Name + '\'' +
                ", cart=" + cart +
                '}';
    }
}
