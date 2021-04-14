package PTTKYC.MilkTea.Entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TaiKhoan")
public class TaiKhoan implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int ID;

    private String client_Name;

    private String username;

    private String password;

    private boolean active = true;

    private Date date_created = new Date();

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @OneToOne(mappedBy = "taiKhoan")
    private NhanVien nhanVien;

    @OneToOne(mappedBy = "taiKhoan")
    private KhachHang khachHang;

    @Override
    public Collection< ? extends GrantedAuthority > getAuthorities() {
        Set<GrantedAuthority> authorites = new HashSet<>();
        authorites.add(new SimpleGrantedAuthority("user"));
        return authorites;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return active;
    }


    public TaiKhoan(String userName, String password){
        this.username = userName;
        this.password = password;
    }
    public TaiKhoan(){
        super();
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getClient_Name() {
        return client_Name;
    }

    public void setClient_Name(String client_Name) {
        this.client_Name = client_Name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" +
                "id=" + ID +
                ", client_Name='" + client_Name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
