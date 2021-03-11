package test.view;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.EntityViewInheritanceMapping;
import com.blazebit.persistence.view.Mapping;
import test.model.ItemTypeB;

@EntityView(ItemTypeB.class)
public abstract class ItemTypeBView extends ItemTypeView<RefTypeBView> {
    @Mapping("TREAT(_refType AS RefTypeB)")
    public abstract RefTypeBView get_refType();
}