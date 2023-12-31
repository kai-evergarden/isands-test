package com.test.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.test.model.RegisterOfFarmers;
import com.test.model.RegisterOfFarmersModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the RegisterOfFarmers service. Represents a row in the &quot;Test_RegisterOfFarmers&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.test.model.RegisterOfFarmersModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RegisterOfFarmersImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegisterOfFarmersImpl
 * @see com.test.model.RegisterOfFarmers
 * @see com.test.model.RegisterOfFarmersModel
 * @generated
 */
public class RegisterOfFarmersModelImpl extends BaseModelImpl<RegisterOfFarmers>
    implements RegisterOfFarmersModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a register of farmers model instance should use the {@link com.test.model.RegisterOfFarmers} interface instead.
     */
    public static final String TABLE_NAME = "Test_RegisterOfFarmers";
    public static final Object[][] TABLE_COLUMNS = {
            { "registerOfFarmersId", Types.BIGINT },
            { "organizationName", Types.VARCHAR },
            { "legalForm", Types.VARCHAR },
            { "inn", Types.VARCHAR },
            { "kpp", Types.VARCHAR },
            { "ogrn", Types.VARCHAR },
            { "registrationArea", Types.VARCHAR },
            { "cropAreas", Types.VARCHAR },
            { "dateOfRegistration", Types.TIMESTAMP },
            { "isArchived", Types.BOOLEAN }
        };
    public static final String TABLE_SQL_CREATE = "create table Test_RegisterOfFarmers (registerOfFarmersId LONG not null primary key,organizationName VARCHAR(75) null,legalForm VARCHAR(75) null,inn VARCHAR(75) null,kpp VARCHAR(75) null,ogrn VARCHAR(75) null,registrationArea VARCHAR(75) null,cropAreas VARCHAR(75) null,dateOfRegistration DATE null,isArchived BOOLEAN)";
    public static final String TABLE_SQL_DROP = "drop table Test_RegisterOfFarmers";
    public static final String ORDER_BY_JPQL = " ORDER BY registerOfFarmers.registerOfFarmersId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY Test_RegisterOfFarmers.registerOfFarmersId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.test.model.RegisterOfFarmers"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.test.model.RegisterOfFarmers"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.test.model.RegisterOfFarmers"),
            true);
    public static long DATEOFREGISTRATION_COLUMN_BITMASK = 1L;
    public static long INN_COLUMN_BITMASK = 2L;
    public static long ISARCHIVED_COLUMN_BITMASK = 4L;
    public static long ORGANIZATIONNAME_COLUMN_BITMASK = 8L;
    public static long REGISTRATIONAREA_COLUMN_BITMASK = 16L;
    public static long REGISTEROFFARMERSID_COLUMN_BITMASK = 32L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.test.model.RegisterOfFarmers"));
    private static ClassLoader _classLoader = RegisterOfFarmers.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            RegisterOfFarmers.class
        };
    private long _registerOfFarmersId;
    private String _organizationName;
    private String _originalOrganizationName;
    private String _legalForm;
    private String _inn;
    private String _originalInn;
    private String _kpp;
    private String _ogrn;
    private String _registrationArea;
    private String _originalRegistrationArea;
    private String _cropAreas;
    private Date _dateOfRegistration;
    private Date _originalDateOfRegistration;
    private boolean _isArchived;
    private boolean _originalIsArchived;
    private boolean _setOriginalIsArchived;
    private long _columnBitmask;
    private RegisterOfFarmers _escapedModel;

    public RegisterOfFarmersModelImpl() {
    }

    @Override
    public long getPrimaryKey() {
        return _registerOfFarmersId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setRegisterOfFarmersId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _registerOfFarmersId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return RegisterOfFarmers.class;
    }

    @Override
    public String getModelClassName() {
        return RegisterOfFarmers.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("registerOfFarmersId", getRegisterOfFarmersId());
        attributes.put("organizationName", getOrganizationName());
        attributes.put("legalForm", getLegalForm());
        attributes.put("inn", getInn());
        attributes.put("kpp", getKpp());
        attributes.put("ogrn", getOgrn());
        attributes.put("registrationArea", getRegistrationArea());
        attributes.put("cropAreas", getCropAreas());
        attributes.put("dateOfRegistration", getDateOfRegistration());
        attributes.put("isArchived", getIsArchived());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long registerOfFarmersId = (Long) attributes.get("registerOfFarmersId");

        if (registerOfFarmersId != null) {
            setRegisterOfFarmersId(registerOfFarmersId);
        }

        String organizationName = (String) attributes.get("organizationName");

        if (organizationName != null) {
            setOrganizationName(organizationName);
        }

        String legalForm = (String) attributes.get("legalForm");

        if (legalForm != null) {
            setLegalForm(legalForm);
        }

        String inn = (String) attributes.get("inn");

        if (inn != null) {
            setInn(inn);
        }

        String kpp = (String) attributes.get("kpp");

        if (kpp != null) {
            setKpp(kpp);
        }

        String ogrn = (String) attributes.get("ogrn");

        if (ogrn != null) {
            setOgrn(ogrn);
        }

        String registrationArea = (String) attributes.get("registrationArea");

        if (registrationArea != null) {
            setRegistrationArea(registrationArea);
        }

        String cropAreas = (String) attributes.get("cropAreas");

        if (cropAreas != null) {
            setCropAreas(cropAreas);
        }

        Date dateOfRegistration = (Date) attributes.get("dateOfRegistration");

        if (dateOfRegistration != null) {
            setDateOfRegistration(dateOfRegistration);
        }

        Boolean isArchived = (Boolean) attributes.get("isArchived");

        if (isArchived != null) {
            setIsArchived(isArchived);
        }
    }

    @Override
    public long getRegisterOfFarmersId() {
        return _registerOfFarmersId;
    }

    @Override
    public void setRegisterOfFarmersId(long registerOfFarmersId) {
        _registerOfFarmersId = registerOfFarmersId;
    }

    @Override
    public String getOrganizationName() {
        if (_organizationName == null) {
            return StringPool.BLANK;
        } else {
            return _organizationName;
        }
    }

    @Override
    public void setOrganizationName(String organizationName) {
        _columnBitmask |= ORGANIZATIONNAME_COLUMN_BITMASK;

        if (_originalOrganizationName == null) {
            _originalOrganizationName = _organizationName;
        }

        _organizationName = organizationName;
    }

    public String getOriginalOrganizationName() {
        return GetterUtil.getString(_originalOrganizationName);
    }

    @Override
    public String getLegalForm() {
        if (_legalForm == null) {
            return StringPool.BLANK;
        } else {
            return _legalForm;
        }
    }

    @Override
    public void setLegalForm(String legalForm) {
        _legalForm = legalForm;
    }

    @Override
    public String getInn() {
        if (_inn == null) {
            return StringPool.BLANK;
        } else {
            return _inn;
        }
    }

    @Override
    public void setInn(String inn) {
        _columnBitmask |= INN_COLUMN_BITMASK;

        if (_originalInn == null) {
            _originalInn = _inn;
        }

        _inn = inn;
    }

    public String getOriginalInn() {
        return GetterUtil.getString(_originalInn);
    }

    @Override
    public String getKpp() {
        if (_kpp == null) {
            return StringPool.BLANK;
        } else {
            return _kpp;
        }
    }

    @Override
    public void setKpp(String kpp) {
        _kpp = kpp;
    }

    @Override
    public String getOgrn() {
        if (_ogrn == null) {
            return StringPool.BLANK;
        } else {
            return _ogrn;
        }
    }

    @Override
    public void setOgrn(String ogrn) {
        _ogrn = ogrn;
    }

    @Override
    public String getRegistrationArea() {
        if (_registrationArea == null) {
            return StringPool.BLANK;
        } else {
            return _registrationArea;
        }
    }

    @Override
    public void setRegistrationArea(String registrationArea) {
        _columnBitmask |= REGISTRATIONAREA_COLUMN_BITMASK;

        if (_originalRegistrationArea == null) {
            _originalRegistrationArea = _registrationArea;
        }

        _registrationArea = registrationArea;
    }

    public String getOriginalRegistrationArea() {
        return GetterUtil.getString(_originalRegistrationArea);
    }

    @Override
    public String getCropAreas() {
        if (_cropAreas == null) {
            return StringPool.BLANK;
        } else {
            return _cropAreas;
        }
    }

    @Override
    public void setCropAreas(String cropAreas) {
        _cropAreas = cropAreas;
    }

    @Override
    public Date getDateOfRegistration() {
        return _dateOfRegistration;
    }

    @Override
    public void setDateOfRegistration(Date dateOfRegistration) {
        _columnBitmask |= DATEOFREGISTRATION_COLUMN_BITMASK;

        if (_originalDateOfRegistration == null) {
            _originalDateOfRegistration = _dateOfRegistration;
        }

        _dateOfRegistration = dateOfRegistration;
    }

    public Date getOriginalDateOfRegistration() {
        return _originalDateOfRegistration;
    }

    @Override
    public boolean getIsArchived() {
        return _isArchived;
    }

    @Override
    public boolean isIsArchived() {
        return _isArchived;
    }

    @Override
    public void setIsArchived(boolean isArchived) {
        _columnBitmask |= ISARCHIVED_COLUMN_BITMASK;

        if (!_setOriginalIsArchived) {
            _setOriginalIsArchived = true;

            _originalIsArchived = _isArchived;
        }

        _isArchived = isArchived;
    }

    public boolean getOriginalIsArchived() {
        return _originalIsArchived;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            RegisterOfFarmers.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public RegisterOfFarmers toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (RegisterOfFarmers) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        RegisterOfFarmersImpl registerOfFarmersImpl = new RegisterOfFarmersImpl();

        registerOfFarmersImpl.setRegisterOfFarmersId(getRegisterOfFarmersId());
        registerOfFarmersImpl.setOrganizationName(getOrganizationName());
        registerOfFarmersImpl.setLegalForm(getLegalForm());
        registerOfFarmersImpl.setInn(getInn());
        registerOfFarmersImpl.setKpp(getKpp());
        registerOfFarmersImpl.setOgrn(getOgrn());
        registerOfFarmersImpl.setRegistrationArea(getRegistrationArea());
        registerOfFarmersImpl.setCropAreas(getCropAreas());
        registerOfFarmersImpl.setDateOfRegistration(getDateOfRegistration());
        registerOfFarmersImpl.setIsArchived(getIsArchived());

        registerOfFarmersImpl.resetOriginalValues();

        return registerOfFarmersImpl;
    }

    @Override
    public int compareTo(RegisterOfFarmers registerOfFarmers) {
        long primaryKey = registerOfFarmers.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RegisterOfFarmers)) {
            return false;
        }

        RegisterOfFarmers registerOfFarmers = (RegisterOfFarmers) obj;

        long primaryKey = registerOfFarmers.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        RegisterOfFarmersModelImpl registerOfFarmersModelImpl = this;

        registerOfFarmersModelImpl._originalOrganizationName = registerOfFarmersModelImpl._organizationName;

        registerOfFarmersModelImpl._originalInn = registerOfFarmersModelImpl._inn;

        registerOfFarmersModelImpl._originalRegistrationArea = registerOfFarmersModelImpl._registrationArea;

        registerOfFarmersModelImpl._originalDateOfRegistration = registerOfFarmersModelImpl._dateOfRegistration;

        registerOfFarmersModelImpl._originalIsArchived = registerOfFarmersModelImpl._isArchived;

        registerOfFarmersModelImpl._setOriginalIsArchived = false;

        registerOfFarmersModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<RegisterOfFarmers> toCacheModel() {
        RegisterOfFarmersCacheModel registerOfFarmersCacheModel = new RegisterOfFarmersCacheModel();

        registerOfFarmersCacheModel.registerOfFarmersId = getRegisterOfFarmersId();

        registerOfFarmersCacheModel.organizationName = getOrganizationName();

        String organizationName = registerOfFarmersCacheModel.organizationName;

        if ((organizationName != null) && (organizationName.length() == 0)) {
            registerOfFarmersCacheModel.organizationName = null;
        }

        registerOfFarmersCacheModel.legalForm = getLegalForm();

        String legalForm = registerOfFarmersCacheModel.legalForm;

        if ((legalForm != null) && (legalForm.length() == 0)) {
            registerOfFarmersCacheModel.legalForm = null;
        }

        registerOfFarmersCacheModel.inn = getInn();

        String inn = registerOfFarmersCacheModel.inn;

        if ((inn != null) && (inn.length() == 0)) {
            registerOfFarmersCacheModel.inn = null;
        }

        registerOfFarmersCacheModel.kpp = getKpp();

        String kpp = registerOfFarmersCacheModel.kpp;

        if ((kpp != null) && (kpp.length() == 0)) {
            registerOfFarmersCacheModel.kpp = null;
        }

        registerOfFarmersCacheModel.ogrn = getOgrn();

        String ogrn = registerOfFarmersCacheModel.ogrn;

        if ((ogrn != null) && (ogrn.length() == 0)) {
            registerOfFarmersCacheModel.ogrn = null;
        }

        registerOfFarmersCacheModel.registrationArea = getRegistrationArea();

        String registrationArea = registerOfFarmersCacheModel.registrationArea;

        if ((registrationArea != null) && (registrationArea.length() == 0)) {
            registerOfFarmersCacheModel.registrationArea = null;
        }

        registerOfFarmersCacheModel.cropAreas = getCropAreas();

        String cropAreas = registerOfFarmersCacheModel.cropAreas;

        if ((cropAreas != null) && (cropAreas.length() == 0)) {
            registerOfFarmersCacheModel.cropAreas = null;
        }

        Date dateOfRegistration = getDateOfRegistration();

        if (dateOfRegistration != null) {
            registerOfFarmersCacheModel.dateOfRegistration = dateOfRegistration.getTime();
        } else {
            registerOfFarmersCacheModel.dateOfRegistration = Long.MIN_VALUE;
        }

        registerOfFarmersCacheModel.isArchived = getIsArchived();

        return registerOfFarmersCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{registerOfFarmersId=");
        sb.append(getRegisterOfFarmersId());
        sb.append(", organizationName=");
        sb.append(getOrganizationName());
        sb.append(", legalForm=");
        sb.append(getLegalForm());
        sb.append(", inn=");
        sb.append(getInn());
        sb.append(", kpp=");
        sb.append(getKpp());
        sb.append(", ogrn=");
        sb.append(getOgrn());
        sb.append(", registrationArea=");
        sb.append(getRegistrationArea());
        sb.append(", cropAreas=");
        sb.append(getCropAreas());
        sb.append(", dateOfRegistration=");
        sb.append(getDateOfRegistration());
        sb.append(", isArchived=");
        sb.append(getIsArchived());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("com.test.model.RegisterOfFarmers");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>registerOfFarmersId</column-name><column-value><![CDATA[");
        sb.append(getRegisterOfFarmersId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>organizationName</column-name><column-value><![CDATA[");
        sb.append(getOrganizationName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>legalForm</column-name><column-value><![CDATA[");
        sb.append(getLegalForm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>inn</column-name><column-value><![CDATA[");
        sb.append(getInn());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>kpp</column-name><column-value><![CDATA[");
        sb.append(getKpp());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ogrn</column-name><column-value><![CDATA[");
        sb.append(getOgrn());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>registrationArea</column-name><column-value><![CDATA[");
        sb.append(getRegistrationArea());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>cropAreas</column-name><column-value><![CDATA[");
        sb.append(getCropAreas());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dateOfRegistration</column-name><column-value><![CDATA[");
        sb.append(getDateOfRegistration());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>isArchived</column-name><column-value><![CDATA[");
        sb.append(getIsArchived());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
