package test.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("B")
public class ItemTypeB extends ItemTypeParent {
    @Override
    public RefTypeB get_refType() {
        return (RefTypeB) super.get_refType();
    }
}
