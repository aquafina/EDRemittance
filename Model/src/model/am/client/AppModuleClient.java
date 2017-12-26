package model.am.client;

import model.am.common.AppModule;

import oracle.jbo.client.remote.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Dec 17 17:34:36 PKT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleClient extends ApplicationModuleImpl implements AppModule {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleClient() {
    }


    public String callCreateReceiptProc(int sqlReturnType, String stmt) {
        Object _ret =
            this.riInvokeExportedMethod(this,"callCreateReceiptProc",new String [] {"int","java.lang.String"},new Object[] {new Integer(sqlReturnType), stmt});
        return (String)_ret;
    }

    public void setSessionValues(String orgId, String userId, String respId,
                                 String respAppl) {
        Object _ret =
            this.riInvokeExportedMethod(this,"setSessionValues",new String [] {"java.lang.String","java.lang.String","java.lang.String","java.lang.String"},new Object[] {orgId, userId, respId, respAppl});
        return;
    }
}
