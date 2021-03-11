package test.view;

import com.blazebit.persistence.view.EntityView;
import test.model.RefTypeA;

@EntityView(RefTypeA.class)
public interface RefTypeAView extends RefTypeParentView {
    public String getValueA();
}
