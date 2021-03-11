package test.view;

import com.blazebit.persistence.view.EntityView;
import test.model.RefTypeA;
import test.model.RefTypeB;

@EntityView(RefTypeB.class)
public interface RefTypeBView extends RefTypeParentView {
    public String getValueB();
}
