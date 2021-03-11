package test.view;

import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import test.model.RefTypeParent;

@EntityView(RefTypeParent.class)
public interface RefTypeParentView {
    @IdMapping
    public Integer getId();
    public String getValue1();
}