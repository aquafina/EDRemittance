package model.vo;

import java.util.Map;

import javax.servlet.http.HttpSession;

import model.am.AppModuleImpl;

import model.eo.EDRemittanceEOImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;

import oracle.adf.model.binding.DCDataControl;

import oracle.adf.share.ADFContext;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Dec 20 17:44:54 PKT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EDRemittanceVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        BankAccountId {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getBankAccountId();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setBankAccountId((Number)value);
            }
        }
        ,
        CreatedBy {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setCreationDate((Timestamp)value);
            }
        }
        ,
        Currency {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getCurrency();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setCurrency((String)value);
            }
        }
        ,
        CustomerId {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getCustomerId();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setCustomerId((Number)value);
            }
        }
        ,
        ExchangeRate {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getExchangeRate();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setExchangeRate((String)value);
            }
        }
        ,
        ExchangeType {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getExchangeType();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setExchangeType((String)value);
            }
        }
        ,
        ExportCategory {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getExportCategory();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setExportCategory((String)value);
            }
        }
        ,
        GlDate {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getGlDate();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setGlDate((Date)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setLastUpdateDate((Timestamp)value);
            }
        }
        ,
        LastUpdateLogin {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getLastUpdateLogin();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setLastUpdateLogin((Number)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        OrgId {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getOrgId();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setOrgId((String)value);
            }
        }
        ,
        PrcNumber {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getPrcNumber();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setPrcNumber((Number)value);
            }
        }
        ,
        PrcStatus {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getPrcStatus();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setPrcStatus((String)value);
            }
        }
        ,
        ReceiptCategory {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getReceiptCategory();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setReceiptCategory((String)value);
            }
        }
        ,
        ReceiptMethodId {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getReceiptMethodId();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setReceiptMethodId((Number)value);
            }
        }
        ,
        ReceiptNumber {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getReceiptNumber();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setReceiptNumber((String)value);
            }
        }
        ,
        RemittanceHeaderId {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getRemittanceHeaderId();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setRemittanceHeaderId((String)value);
            }
        }
        ,
        RequestId {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getRequestId();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setRequestId((Number)value);
            }
        }
        ,
        Status {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getStatus();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setStatus((String)value);
            }
        }
        ,
        BankAccountName {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getBankAccountName();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setBankAccountName((String)value);
            }
        }
        ,
        BankName {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getBankName();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setBankName((String)value);
            }
        }
        ,
        BankBranchName {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getBankBranchName();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setBankBranchName((String)value);
            }
        }
        ,
        CustomerName {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getCustomerName();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setCustomerName((String)value);
            }
        }
        ,
        CustomerBillToAddress {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getCustomerBillToAddress();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setCustomerBillToAddress((String)value);
            }
        }
        ,
        ReceiptMethodName {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getReceiptMethodName();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setReceiptMethodName((String)value);
            }
        }
        ,
        OperatingUnit {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getOperatingUnit();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setOperatingUnit((String)value);
            }
        }
        ,
        RemittanceBankAcctId {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getRemittanceBankAcctId();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setRemittanceBankAcctId((Number)value);
            }
        }
        ,
        EDRemittanceLinesVO {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getEDRemittanceLinesVO();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CustomerNameLOV1 {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getCustomerNameLOV1();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CurrencyLOV1 {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getCurrencyLOV1();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        BankNamesLOV1 {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getBankNamesLOV1();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExchangeTypesLOV1 {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getExchangeTypesLOV1();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ExportCategoryLOV1 {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getExportCategoryLOV1();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ReceiptCategoryLOV1 {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getReceiptCategoryLOV1();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ReceiptMethodsLOV1 {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getReceiptMethodsLOV1();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        PrcStatusLOV1 {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getPrcStatusLOV1();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        RemittanceHeaderIdLOV1 {
            public Object get(EDRemittanceVORowImpl obj) {
                return obj.getRemittanceHeaderIdLOV1();
            }

            public void put(EDRemittanceVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(EDRemittanceVORowImpl object);

        public abstract void put(EDRemittanceVORowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int BANKACCOUNTID = AttributesEnum.BankAccountId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CURRENCY = AttributesEnum.Currency.index();
    public static final int CUSTOMERID = AttributesEnum.CustomerId.index();
    public static final int EXCHANGERATE = AttributesEnum.ExchangeRate.index();
    public static final int EXCHANGETYPE = AttributesEnum.ExchangeType.index();
    public static final int EXPORTCATEGORY = AttributesEnum.ExportCategory.index();
    public static final int GLDATE = AttributesEnum.GlDate.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATELOGIN = AttributesEnum.LastUpdateLogin.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int PRCNUMBER = AttributesEnum.PrcNumber.index();
    public static final int PRCSTATUS = AttributesEnum.PrcStatus.index();
    public static final int RECEIPTCATEGORY = AttributesEnum.ReceiptCategory.index();
    public static final int RECEIPTMETHODID = AttributesEnum.ReceiptMethodId.index();
    public static final int RECEIPTNUMBER = AttributesEnum.ReceiptNumber.index();
    public static final int REMITTANCEHEADERID = AttributesEnum.RemittanceHeaderId.index();
    public static final int REQUESTID = AttributesEnum.RequestId.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int BANKACCOUNTNAME = AttributesEnum.BankAccountName.index();
    public static final int BANKNAME = AttributesEnum.BankName.index();
    public static final int BANKBRANCHNAME = AttributesEnum.BankBranchName.index();
    public static final int CUSTOMERNAME = AttributesEnum.CustomerName.index();
    public static final int CUSTOMERBILLTOADDRESS = AttributesEnum.CustomerBillToAddress.index();
    public static final int RECEIPTMETHODNAME = AttributesEnum.ReceiptMethodName.index();
    public static final int OPERATINGUNIT = AttributesEnum.OperatingUnit.index();
    public static final int REMITTANCEBANKACCTID = AttributesEnum.RemittanceBankAcctId.index();
    public static final int EDREMITTANCELINESVO = AttributesEnum.EDRemittanceLinesVO.index();
    public static final int CUSTOMERNAMELOV1 = AttributesEnum.CustomerNameLOV1.index();
    public static final int CURRENCYLOV1 = AttributesEnum.CurrencyLOV1.index();
    public static final int BANKNAMESLOV1 = AttributesEnum.BankNamesLOV1.index();
    public static final int EXCHANGETYPESLOV1 = AttributesEnum.ExchangeTypesLOV1.index();
    public static final int EXPORTCATEGORYLOV1 = AttributesEnum.ExportCategoryLOV1.index();
    public static final int RECEIPTCATEGORYLOV1 = AttributesEnum.ReceiptCategoryLOV1.index();
    public static final int RECEIPTMETHODSLOV1 = AttributesEnum.ReceiptMethodsLOV1.index();
    public static final int PRCSTATUSLOV1 = AttributesEnum.PrcStatusLOV1.index();
    public static final int REMITTANCEHEADERIDLOV1 = AttributesEnum.RemittanceHeaderIdLOV1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public EDRemittanceVORowImpl() {
    }

    /**
     * Gets EDRemittanceEO entity object.
     * @return the EDRemittanceEO
     */
    public EDRemittanceEOImpl getEDRemittanceEO() {
        return (EDRemittanceEOImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for BANK_ACCOUNT_ID using the alias name BankAccountId.
     * @return the BANK_ACCOUNT_ID
     */
    public Number getBankAccountId() {
        return (Number) getAttributeInternal(BANKACCOUNTID);
    }

    /**
     * Sets <code>value</code> as attribute value for BANK_ACCOUNT_ID using the alias name BankAccountId.
     * @param value value to set the BANK_ACCOUNT_ID
     */
    public void setBankAccountId(Number value) {
        setAttributeInternal(BANKACCOUNTID, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Timestamp getCreationDate() {
        return (Timestamp) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate.
     * @param value value to set the CREATION_DATE
     */
    public void setCreationDate(Timestamp value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for CURRENCY using the alias name Currency.
     * @return the CURRENCY
     */
    public String getCurrency() {
        return (String) getAttributeInternal(CURRENCY);
    }

    /**
     * Sets <code>value</code> as attribute value for CURRENCY using the alias name Currency.
     * @param value value to set the CURRENCY
     */
    public void setCurrency(String value) {
        setAttributeInternal(CURRENCY, value);
    }

    /**
     * Gets the attribute value for CUSTOMER_ID using the alias name CustomerId.
     * @return the CUSTOMER_ID
     */
    public Number getCustomerId() {
        if (getAttributeInternal(CUSTOMERID) == null)
            return new Number(0);
        else return (Number) getAttributeInternal(CUSTOMERID);
    }

    /**
     * Sets <code>value</code> as attribute value for CUSTOMER_ID using the alias name CustomerId.
     * @param value value to set the CUSTOMER_ID
     */
    public void setCustomerId(Number value) {
        setAttributeInternal(CUSTOMERID, value);
    }


    /**
     * Gets the attribute value for EXCHANGE_TYPE using the alias name ExchangeType.
     * @return the EXCHANGE_TYPE
     */
    public String getExchangeType() {
        return (String) getAttributeInternal(EXCHANGETYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for EXCHANGE_TYPE using the alias name ExchangeType.
     * @param value value to set the EXCHANGE_TYPE
     */
    public void setExchangeType(String value) {
        setAttributeInternal(EXCHANGETYPE, value);
    }

    /**
     * Gets the attribute value for EXPORT_CATEGORY using the alias name ExportCategory.
     * @return the EXPORT_CATEGORY
     */
    public String getExportCategory() {
        return (String) getAttributeInternal(EXPORTCATEGORY);
    }

    /**
     * Sets <code>value</code> as attribute value for EXPORT_CATEGORY using the alias name ExportCategory.
     * @param value value to set the EXPORT_CATEGORY
     */
    public void setExportCategory(String value) {
        setAttributeInternal(EXPORTCATEGORY, value);
    }

    /**
     * Gets the attribute value for GL_DATE using the alias name GlDate.
     * @return the GL_DATE
     */
    public Date getGlDate() {
        return (Date) getAttributeInternal(GLDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for GL_DATE using the alias name GlDate.
     * @param value value to set the GL_DATE
     */
    public void setGlDate(Date value) {
        setAttributeInternal(GLDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @return the LAST_UPDATE_DATE
     */
    public Timestamp getLastUpdateDate() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @param value value to set the LAST_UPDATE_DATE
     */
    public void setLastUpdateDate(Timestamp value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_LOGIN using the alias name LastUpdateLogin.
     * @return the LAST_UPDATE_LOGIN
     */
    public Number getLastUpdateLogin() {
        return (Number) getAttributeInternal(LASTUPDATELOGIN);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATE_LOGIN using the alias name LastUpdateLogin.
     * @param value value to set the LAST_UPDATE_LOGIN
     */
    public void setLastUpdateLogin(Number value) {
        setAttributeInternal(LASTUPDATELOGIN, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public Number getLastUpdatedBy() {
        return (Number) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @param value value to set the LAST_UPDATED_BY
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for ORG_ID using the alias name OrgId.
     * @return the ORG_ID
     */
    public String getOrgId() {
        return (String) getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as attribute value for ORG_ID using the alias name OrgId.
     * @param value value to set the ORG_ID
     */
    public void setOrgId(String value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for PRC_NUMBER using the alias name PrcNumber.
     * @return the PRC_NUMBER
     */
    public Number getPrcNumber() {
        return (Number) getAttributeInternal(PRCNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for PRC_NUMBER using the alias name PrcNumber.
     * @param value value to set the PRC_NUMBER
     */
    public void setPrcNumber(Number value) {
        setAttributeInternal(PRCNUMBER, value);
    }

    /**
     * Gets the attribute value for PRC_STATUS using the alias name PrcStatus.
     * @return the PRC_STATUS
     */
    public String getPrcStatus() {
        return (String) getAttributeInternal(PRCSTATUS);
    }

    /**
     * Sets <code>value</code> as attribute value for PRC_STATUS using the alias name PrcStatus.
     * @param value value to set the PRC_STATUS
     */
    public void setPrcStatus(String value) {
        setAttributeInternal(PRCSTATUS, value);
    }

    /**
     * Gets the attribute value for RECEIPT_CATEGORY using the alias name ReceiptCategory.
     * @return the RECEIPT_CATEGORY
     */
    public String getReceiptCategory() {
        return (String) getAttributeInternal(RECEIPTCATEGORY);
    }

    /**
     * Sets <code>value</code> as attribute value for RECEIPT_CATEGORY using the alias name ReceiptCategory.
     * @param value value to set the RECEIPT_CATEGORY
     */
    public void setReceiptCategory(String value) {
        setAttributeInternal(RECEIPTCATEGORY, value);
    }

    /**
     * Gets the attribute value for RECEIPT_METHOD_ID using the alias name ReceiptMethodId.
     * @return the RECEIPT_METHOD_ID
     */
    public Number getReceiptMethodId() {
        return (Number) getAttributeInternal(RECEIPTMETHODID);
    }

    /**
     * Sets <code>value</code> as attribute value for RECEIPT_METHOD_ID using the alias name ReceiptMethodId.
     * @param value value to set the RECEIPT_METHOD_ID
     */
    public void setReceiptMethodId(Number value) {
        setAttributeInternal(RECEIPTMETHODID, value);
    }

    /**
     * Gets the attribute value for RECEIPT_NUMBER using the alias name ReceiptNumber.
     * @return the RECEIPT_NUMBER
     */
    public String getReceiptNumber() {
        return (String) getAttributeInternal(RECEIPTNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for RECEIPT_NUMBER using the alias name ReceiptNumber.
     * @param value value to set the RECEIPT_NUMBER
     */
    public void setReceiptNumber(String value) {
        setAttributeInternal(RECEIPTNUMBER, value);
    }

    /**
     * Gets the attribute value for REMITTANCE_HEADER_ID using the alias name RemittanceHeaderId.
     * @return the REMITTANCE_HEADER_ID
     */
    public String getRemittanceHeaderId() {
        return (String) getAttributeInternal(REMITTANCEHEADERID);
    }

    /**
     * Sets <code>value</code> as attribute value for REMITTANCE_HEADER_ID using the alias name RemittanceHeaderId.
     * @param value value to set the REMITTANCE_HEADER_ID
     */
    public void setRemittanceHeaderId(String value) {
        setAttributeInternal(REMITTANCEHEADERID, value);
    }

    /**
     * Gets the attribute value for REQUEST_ID using the alias name RequestId.
     * @return the REQUEST_ID
     */
    public Number getRequestId() {
        return (Number) getAttributeInternal(REQUESTID);
    }

    /**
     * Sets <code>value</code> as attribute value for REQUEST_ID using the alias name RequestId.
     * @param value value to set the REQUEST_ID
     */
    public void setRequestId(Number value) {
        setAttributeInternal(REQUESTID, value);
    }

    /**
     * Gets the attribute value for STATUS using the alias name Status.
     * @return the STATUS
     */
    public String getStatus() {
        return (String) getAttributeInternal(STATUS);
    }

    /**
     * Sets <code>value</code> as attribute value for STATUS using the alias name Status.
     * @param value value to set the STATUS
     */
    public void setStatus(String value) {
        setAttributeInternal(STATUS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BankAccountName.
     * @return the BankAccountName
     */
    public String getBankAccountName() {
        return (String) getAttributeInternal(BANKACCOUNTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BankAccountName.
     * @param value value to set the  BankAccountName
     */
    public void setBankAccountName(String value) {
        setAttributeInternal(BANKACCOUNTNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BankName.
     * @return the BankName
     */
    public String getBankName() {
        return (String) getAttributeInternal(BANKNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BankName.
     * @param value value to set the  BankName
     */
    public void setBankName(String value) {
        setAttributeInternal(BANKNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BankBranchName.
     * @return the BankBranchName
     */
    public String getBankBranchName() {
        return (String) getAttributeInternal(BANKBRANCHNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BankBranchName.
     * @param value value to set the  BankBranchName
     */
    public void setBankBranchName(String value) {
        setAttributeInternal(BANKBRANCHNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CustomerName.
     * @return the CustomerName
     */
    public String getCustomerName() {
        return (String) getAttributeInternal(CUSTOMERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CustomerName.
     * @param value value to set the  CustomerName
     */
    public void setCustomerName(String value) {
        setAttributeInternal(CUSTOMERNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CustomerBillToAddress.
     * @return the CustomerBillToAddress
     */
    public String getCustomerBillToAddress() {
        return (String) getAttributeInternal(CUSTOMERBILLTOADDRESS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CustomerBillToAddress.
     * @param value value to set the  CustomerBillToAddress
     */
    public void setCustomerBillToAddress(String value) {
        setAttributeInternal(CUSTOMERBILLTOADDRESS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ReceiptMethodName.
     * @return the ReceiptMethodName
     */
    public String getReceiptMethodName() {
        return (String) getAttributeInternal(RECEIPTMETHODNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ReceiptMethodName.
     * @param value value to set the  ReceiptMethodName
     */
    public void setReceiptMethodName(String value) {
        setAttributeInternal(RECEIPTMETHODNAME, value);
    }


    /**
     * Gets the attribute value for the calculated attribute OperatingUnit.
     * @return the OperatingUnit
     */
    public String getOperatingUnit() {
        if (getAttributeInternal(OPERATINGUNIT)!=null)
            return (String) getAttributeInternal(OPERATINGUNIT);
        else {
            DCBindingContainer bindings = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
              DCDataControl dataControl = bindings.findDataControl("AppModuleDataControl");
              AppModuleImpl am = (AppModuleImpl)dataControl.getApplicationModule();
            Map sessionMap = ADFContext.getCurrent().getSessionScope();
            String orgId = (String) sessionMap.get("org_id");
            String query = "select name from hr_operating_units where organization_id = "+orgId;
            String operatingUnit = am.executeQuery(query);
            //System.out.println("operating unit = "+operating_unit);
            return operatingUnit;
        }
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OperatingUnit.
     * @param value value to set the  OperatingUnit
     */
    public void setOperatingUnit(String value) {
        setAttributeInternal(OPERATINGUNIT, value);
    }


    /**
     * Gets the attribute value for the calculated attribute RemittanceBankAcctId.
     * @return the RemittanceBankAcctId
     */
    public Number getRemittanceBankAcctId() {
        return (Number) getAttributeInternal(REMITTANCEBANKACCTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute RemittanceBankAcctId.
     * @param value value to set the  RemittanceBankAcctId
     */
    public void setRemittanceBankAcctId(Number value) {
        setAttributeInternal(REMITTANCEBANKACCTID, value);
    }

    /**
     * Gets the attribute value for EXCHANGE_RATE using the alias name ExchangeRate.
     * @return the EXCHANGE_RATE
     */
    public String getExchangeRate() {
        if (getAttributeInternal(EXCHANGERATE)!=null)
            return (String) getAttributeInternal(EXCHANGERATE);
        else return "0";
    }

    /**
     * Sets <code>value</code> as attribute value for EXCHANGE_RATE using the alias name ExchangeRate.
     * @param value value to set the EXCHANGE_RATE
     */
    public void setExchangeRate(String value) {
        setAttributeInternal(EXCHANGERATE, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link EDRemittanceLinesVO.
     */
    public RowIterator getEDRemittanceLinesVO() {
        return (RowIterator)getAttributeInternal(EDREMITTANCELINESVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> CustomerNameLOV1.
     */
    public RowSet getCustomerNameLOV1() {
        return (RowSet)getAttributeInternal(CUSTOMERNAMELOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> CurrencyLOV1.
     */
    public RowSet getCurrencyLOV1() {
        return (RowSet)getAttributeInternal(CURRENCYLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> BankNamesLOV1.
     */
    public RowSet getBankNamesLOV1() {
        return (RowSet)getAttributeInternal(BANKNAMESLOV1);
    }


    /**
     * Gets the view accessor <code>RowSet</code> ExchangeTypesLOV1.
     */
    public RowSet getExchangeTypesLOV1() {
        return (RowSet)getAttributeInternal(EXCHANGETYPESLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ExportCategoryLOV1.
     */
    public RowSet getExportCategoryLOV1() {
        return (RowSet)getAttributeInternal(EXPORTCATEGORYLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ReceiptCategoryLOV1.
     */
    public RowSet getReceiptCategoryLOV1() {
        return (RowSet)getAttributeInternal(RECEIPTCATEGORYLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ReceiptMethodsLOV1.
     */
    public RowSet getReceiptMethodsLOV1() {
        return (RowSet)getAttributeInternal(RECEIPTMETHODSLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> PrcStatusLOV1.
     */
    public RowSet getPrcStatusLOV1() {
        return (RowSet)getAttributeInternal(PRCSTATUSLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> RemittanceHeaderIdLOV1.
     */
    public RowSet getRemittanceHeaderIdLOV1() {
        return (RowSet)getAttributeInternal(REMITTANCEHEADERIDLOV1);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
