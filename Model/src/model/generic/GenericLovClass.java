package model.generic;

import oracle.jbo.CriteriaClauses;
import oracle.jbo.ViewCriteria;
import oracle.jbo.server.ViewObjectImpl;

public class GenericLovClass extends ViewObjectImpl{
    public GenericLovClass() {
        super();
    }
    
    @Override
    public CriteriaClauses buildViewCriteriaClauses(ViewCriteria viewCriteria) {
        String voName = viewCriteria.getViewObject().getName();
        viewCriteria.setUpperColumns(true);
        
        CriteriaClauses criteriaClauses = super.buildViewCriteriaClauses(viewCriteria);
        return criteriaClauses;
    }
}
