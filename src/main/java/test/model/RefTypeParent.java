package test.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class RefTypeParent {
    private Integer id;
    private String value1;

    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }
}
