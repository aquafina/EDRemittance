package view.classes;

import java.sql.SQLException;

import javax.faces.event.ActionEvent;
import javax.faces.event.PhaseEvent;
import javax.faces.event.ValueChangeEvent;

import model.am.AppModuleImpl;

import oracle.jbo.domain.Number;
import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.event.LaunchPopupEvent;
import oracle.adf.view.rich.event.ReturnPopupEvent;

import oracle.binding.BindingContainer;

import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaManager;
import oracle.jbo.ViewObject;
import java.sql.Types;

import java.util.HashMap;

import java.util.Map;

import oracle.adf.share.ADFConfig;
import oracle.adf.share.ADFContext;

import oracle.adf.view.rich.component.rich.input.RichInputText;

import oracle.binding.OperationBinding;

import oracle.jbo.Row;

public class EDRemittance {
    
//    private RichInputText exchangeRateInputText;
    private RichInputText exchangeRateInputText;

    public EDRemittance() {
        super();
    }
    
    public void commInvNumLaunchPopupListener(LaunchPopupEvent launchPopupEvent) {
        // Add event code here...
        /*AppModuleImpl am = CommonUtil.getApplicationModule();
        if(am!=null) {
            ViewObject EDRemittanceVO = am.getEDRemittanceVO1();
//            String customerId = EDRemittanceVO.getCurrentRow().getAttribute("CustomerId")!=null?EDRemittanceVO.getCurrentRow().getAttribute("CustomerId").toString():null;
//            String orgId = EDRemittanceVO.getCurrentRow().getAttribute("OrgId")!=null?EDRemittanceVO.getCurrentRow().getAttribute("OrgId").toString():null;
            ViewObject CommInvNumLOV = am.getCommInvNumLOV1();
            CommInvNumLOV.setNamedWhereClauseParam("p_org_id", "103");
            CommInvNumLOV.setNamedWhereClauseParam("p_cust_id", "4375");
            CommInvNumLOV.executeQuery();
            System.out.println("query = "+CommInvNumLOV.getQuery());
            //am.setBindVarAndExceuteCommInvNumLov(customerId,orgId);
        }*/
    }

    public void insertRemittanceActionListener(ActionEvent actionEvent) {
        // Add event code here...
        CommonUtil.redirect("ED_Remittance.jspx");
    }

    public void createReceiptAPIActionListener(ActionEvent actionEvent) {
        
        String stmt = "pwc_remittance_create_receipt(? " +
            ",?" +
            ",?" +
            ",?" +
            ",?" +
            ",?" +
            ",?" +
            ",?" +
            ",?" +
            ",?" +
            ",?" +
            ",?" +
            ",?" +
            ",?" +
            ",?" +
            ",?)";
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("callCreateReceiptProc");
        Map params =  operationBinding.getParamsMap();
        params.put("sqlReturnType", Types.VARCHAR);
        params.put("stmt", stmt);
        Object result = operationBinding.execute();
        System.out.println(result+" ");

        
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String cb2_action() {
        
        return null;
    }

    

    public void afterPhase(PhaseEvent phaseEvent) {
        // Add event code here...
        //System.out.println(ADFContext.getCurrent().getViewScope().get("UserId")+" after phase"); 
    }
    
    public void exchangeTypeReturnPopupListener(ReturnPopupEvent returnPopupEvent) {
        // Add event code here...
        ViewObject EDRemittanceVO = CommonUtil.getApplicationModule().findViewObject("EDRemittanceVO3");
        Row row = EDRemittanceVO.getCurrentRow();
        String newExchangeType = row.getAttribute("ExchangeType")!=null?row.getAttribute("ExchangeType").toString():"";
        if(newExchangeType.equals("Corporate")) {
            //ExchangeRateLOVImpl exchangeRateLOV = (ExchangeRateLOVImpl)CommonUtil.getApplicationModule().findViewObject("ExchangeRateLOV1");
            if (row!=null)
            {
                String to_currency = "BDT";
                String from_currency = row.getAttribute("Currency")!=null?row.getAttribute("Currency").toString():null;
                if (row.getAttribute("GlDate")!=null)
                {
                    String glDate = row.getAttribute("GlDate").toString();
                    AppModuleImpl am = (AppModuleImpl)CommonUtil.getApplicationModule();
                    String query = "SELECT conversion_rate\n" + 
                    "  FROM gl_daily_rates" + 
                    " WHERE to_currency = 'BDT'" + 
                    "   AND from_currency = '" + from_currency + "' " + 
                    "AND conversion_date = to_date('"+glDate+"','rrrr-mm-dd')";
                    String rate =  am.executeQuery(query);
                    exchangeRateInputText.setValue(rate);
                }
            }
    }
    }

    public void setExchangeRateInputText(RichInputText exchangeRateInputText) {
        this.exchangeRateInputText = exchangeRateInputText;
    }

    public RichInputText getExchangeRateInputText() {
        return exchangeRateInputText;
    }
}
