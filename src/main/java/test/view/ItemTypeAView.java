package test.view;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.Mapping;
import test.model.ItemTypeA;

@EntityView(ItemTypeA.class)
public abstract class ItemTypeAView extends ItemTypeView<RefTypeAView> {
    @Mapping("TREAT(_refType AS RefTypeA)")
    public abstract RefTypeAView get_refType();
}