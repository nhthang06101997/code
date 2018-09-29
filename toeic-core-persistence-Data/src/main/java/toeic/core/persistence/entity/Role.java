package toeic.core.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="role")
public class Role {
    @Id
    @Column(name="roleid")
    private Integer roleid;
    @Column(name="name")
    private String user;

    @OneToMany(mappedBy = "role",fetch = FetchType.LAZY)
    private List<User> userList;
    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
