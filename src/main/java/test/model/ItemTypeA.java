package test.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
public class ItemTypeA extends ItemTypeParent {
    @Override
    public RefTypeA get_refType() {
        return (RefTypeA) super.get_refType();
    }
}
