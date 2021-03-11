package test.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public abstract class ItemTypeParent {
    private Integer id;
    private RefTypeParent _refType;

    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "FK_REF_TYPE", referencedColumnName = "ID")
    public RefTypeParent get_refType() {
        return _refType;
    }

    public void set_refType(RefTypeParent _refType) {
        this._refType = _refType;
    }
}
