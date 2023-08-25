package com.test.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.test.service.ClpSerializer;
import com.test.service.RegisterOfFarmersLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class RegisterOfFarmersClp extends BaseModelImpl<RegisterOfFarmers>
    implements RegisterOfFarmers {
    private long _registerOfFarmersId;
    private String _organizationName;
    private String _legalForm;
    private String _inn;
    private String _kpp;
    private String _ogrn;
    private String _registrationArea;
    private String _cropAreas;
    private Date _dateOfRegistration;
    private boolean _isArchived;
    private BaseModel<?> _registerOfFarmersRemoteModel;
    private Class<?> _clpSerializerClass = com.test.service.ClpSerializer.class;

    public RegisterOfFarmersClp() {
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

        if (_registerOfFarmersRemoteModel != null) {
            try {
                Class<?> clazz = _registerOfFarmersRemoteModel.getClass();

                Method method = clazz.getMethod("setRegisterOfFarmersId",
                        long.class);

                method.invoke(_registerOfFarmersRemoteModel, registerOfFarmersId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getOrganizationName() {
        return _organizationName;
    }

    @Override
    public void setOrganizationName(String organizationName) {
        _organizationName = organizationName;

        if (_registerOfFarmersRemoteModel != null) {
            try {
                Class<?> clazz = _registerOfFarmersRemoteModel.getClass();

                Method method = clazz.getMethod("setOrganizationName",
                        String.class);

                method.invoke(_registerOfFarmersRemoteModel, organizationName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLegalForm() {
        return _legalForm;
    }

    @Override
    public void setLegalForm(String legalForm) {
        _legalForm = legalForm;

        if (_registerOfFarmersRemoteModel != null) {
            try {
                Class<?> clazz = _registerOfFarmersRemoteModel.getClass();

                Method method = clazz.getMethod("setLegalForm", String.class);

                method.invoke(_registerOfFarmersRemoteModel, legalForm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getInn() {
        return _inn;
    }

    @Override
    public void setInn(String inn) {
        _inn = inn;

        if (_registerOfFarmersRemoteModel != null) {
            try {
                Class<?> clazz = _registerOfFarmersRemoteModel.getClass();

                Method method = clazz.getMethod("setInn", String.class);

                method.invoke(_registerOfFarmersRemoteModel, inn);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getKpp() {
        return _kpp;
    }

    @Override
    public void setKpp(String kpp) {
        _kpp = kpp;

        if (_registerOfFarmersRemoteModel != null) {
            try {
                Class<?> clazz = _registerOfFarmersRemoteModel.getClass();

                Method method = clazz.getMethod("setKpp", String.class);

                method.invoke(_registerOfFarmersRemoteModel, kpp);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getOgrn() {
        return _ogrn;
    }

    @Override
    public void setOgrn(String ogrn) {
        _ogrn = ogrn;

        if (_registerOfFarmersRemoteModel != null) {
            try {
                Class<?> clazz = _registerOfFarmersRemoteModel.getClass();

                Method method = clazz.getMethod("setOgrn", String.class);

                method.invoke(_registerOfFarmersRemoteModel, ogrn);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getRegistrationArea() {
        return _registrationArea;
    }

    @Override
    public void setRegistrationArea(String registrationArea) {
        _registrationArea = registrationArea;

        if (_registerOfFarmersRemoteModel != null) {
            try {
                Class<?> clazz = _registerOfFarmersRemoteModel.getClass();

                Method method = clazz.getMethod("setRegistrationArea",
                        String.class);

                method.invoke(_registerOfFarmersRemoteModel, registrationArea);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCropAreas() {
        return _cropAreas;
    }

    @Override
    public void setCropAreas(String cropAreas) {
        _cropAreas = cropAreas;

        if (_registerOfFarmersRemoteModel != null) {
            try {
                Class<?> clazz = _registerOfFarmersRemoteModel.getClass();

                Method method = clazz.getMethod("setCropAreas", String.class);

                method.invoke(_registerOfFarmersRemoteModel, cropAreas);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getDateOfRegistration() {
        return _dateOfRegistration;
    }

    @Override
    public void setDateOfRegistration(Date dateOfRegistration) {
        _dateOfRegistration = dateOfRegistration;

        if (_registerOfFarmersRemoteModel != null) {
            try {
                Class<?> clazz = _registerOfFarmersRemoteModel.getClass();

                Method method = clazz.getMethod("setDateOfRegistration",
                        Date.class);

                method.invoke(_registerOfFarmersRemoteModel, dateOfRegistration);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
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
        _isArchived = isArchived;

        if (_registerOfFarmersRemoteModel != null) {
            try {
                Class<?> clazz = _registerOfFarmersRemoteModel.getClass();

                Method method = clazz.getMethod("setIsArchived", boolean.class);

                method.invoke(_registerOfFarmersRemoteModel, isArchived);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getRegisterOfFarmersRemoteModel() {
        return _registerOfFarmersRemoteModel;
    }

    public void setRegisterOfFarmersRemoteModel(
        BaseModel<?> registerOfFarmersRemoteModel) {
        _registerOfFarmersRemoteModel = registerOfFarmersRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _registerOfFarmersRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_registerOfFarmersRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            RegisterOfFarmersLocalServiceUtil.addRegisterOfFarmers(this);
        } else {
            RegisterOfFarmersLocalServiceUtil.updateRegisterOfFarmers(this);
        }
    }

    @Override
    public RegisterOfFarmers toEscapedModel() {
        return (RegisterOfFarmers) ProxyUtil.newProxyInstance(RegisterOfFarmers.class.getClassLoader(),
            new Class[] { RegisterOfFarmers.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        RegisterOfFarmersClp clone = new RegisterOfFarmersClp();

        clone.setRegisterOfFarmersId(getRegisterOfFarmersId());
        clone.setOrganizationName(getOrganizationName());
        clone.setLegalForm(getLegalForm());
        clone.setInn(getInn());
        clone.setKpp(getKpp());
        clone.setOgrn(getOgrn());
        clone.setRegistrationArea(getRegistrationArea());
        clone.setCropAreas(getCropAreas());
        clone.setDateOfRegistration(getDateOfRegistration());
        clone.setIsArchived(getIsArchived());

        return clone;
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

        if (!(obj instanceof RegisterOfFarmersClp)) {
            return false;
        }

        RegisterOfFarmersClp registerOfFarmers = (RegisterOfFarmersClp) obj;

        long primaryKey = registerOfFarmers.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
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
