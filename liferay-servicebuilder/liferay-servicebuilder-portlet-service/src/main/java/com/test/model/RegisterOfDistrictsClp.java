package com.test.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.test.service.ClpSerializer;
import com.test.service.RegisterOfDistrictsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class RegisterOfDistrictsClp extends BaseModelImpl<RegisterOfDistricts>
    implements RegisterOfDistricts {
    private long _registerOfDistrictsId;
    private String _name;
    private long _districtCode;
    private boolean _isArchived;
    private BaseModel<?> _registerOfDistrictsRemoteModel;
    private Class<?> _clpSerializerClass = com.test.service.ClpSerializer.class;

    public RegisterOfDistrictsClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return RegisterOfDistricts.class;
    }

    @Override
    public String getModelClassName() {
        return RegisterOfDistricts.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _registerOfDistrictsId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setRegisterOfDistrictsId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _registerOfDistrictsId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("registerOfDistrictsId", getRegisterOfDistrictsId());
        attributes.put("name", getName());
        attributes.put("districtCode", getDistrictCode());
        attributes.put("isArchived", getIsArchived());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long registerOfDistrictsId = (Long) attributes.get(
                "registerOfDistrictsId");

        if (registerOfDistrictsId != null) {
            setRegisterOfDistrictsId(registerOfDistrictsId);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Long districtCode = (Long) attributes.get("districtCode");

        if (districtCode != null) {
            setDistrictCode(districtCode);
        }

        Boolean isArchived = (Boolean) attributes.get("isArchived");

        if (isArchived != null) {
            setIsArchived(isArchived);
        }
    }

    @Override
    public long getRegisterOfDistrictsId() {
        return _registerOfDistrictsId;
    }

    @Override
    public void setRegisterOfDistrictsId(long registerOfDistrictsId) {
        _registerOfDistrictsId = registerOfDistrictsId;

        if (_registerOfDistrictsRemoteModel != null) {
            try {
                Class<?> clazz = _registerOfDistrictsRemoteModel.getClass();

                Method method = clazz.getMethod("setRegisterOfDistrictsId",
                        long.class);

                method.invoke(_registerOfDistrictsRemoteModel,
                    registerOfDistrictsId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_registerOfDistrictsRemoteModel != null) {
            try {
                Class<?> clazz = _registerOfDistrictsRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_registerOfDistrictsRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getDistrictCode() {
        return _districtCode;
    }

    @Override
    public void setDistrictCode(long districtCode) {
        _districtCode = districtCode;

        if (_registerOfDistrictsRemoteModel != null) {
            try {
                Class<?> clazz = _registerOfDistrictsRemoteModel.getClass();

                Method method = clazz.getMethod("setDistrictCode", long.class);

                method.invoke(_registerOfDistrictsRemoteModel, districtCode);
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

        if (_registerOfDistrictsRemoteModel != null) {
            try {
                Class<?> clazz = _registerOfDistrictsRemoteModel.getClass();

                Method method = clazz.getMethod("setIsArchived", boolean.class);

                method.invoke(_registerOfDistrictsRemoteModel, isArchived);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getRegisterOfDistrictsRemoteModel() {
        return _registerOfDistrictsRemoteModel;
    }

    public void setRegisterOfDistrictsRemoteModel(
        BaseModel<?> registerOfDistrictsRemoteModel) {
        _registerOfDistrictsRemoteModel = registerOfDistrictsRemoteModel;
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

        Class<?> remoteModelClass = _registerOfDistrictsRemoteModel.getClass();

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

        Object returnValue = method.invoke(_registerOfDistrictsRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            RegisterOfDistrictsLocalServiceUtil.addRegisterOfDistricts(this);
        } else {
            RegisterOfDistrictsLocalServiceUtil.updateRegisterOfDistricts(this);
        }
    }

    @Override
    public RegisterOfDistricts toEscapedModel() {
        return (RegisterOfDistricts) ProxyUtil.newProxyInstance(RegisterOfDistricts.class.getClassLoader(),
            new Class[] { RegisterOfDistricts.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        RegisterOfDistrictsClp clone = new RegisterOfDistrictsClp();

        clone.setRegisterOfDistrictsId(getRegisterOfDistrictsId());
        clone.setName(getName());
        clone.setDistrictCode(getDistrictCode());
        clone.setIsArchived(getIsArchived());

        return clone;
    }

    @Override
    public int compareTo(RegisterOfDistricts registerOfDistricts) {
        long primaryKey = registerOfDistricts.getPrimaryKey();

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

        if (!(obj instanceof RegisterOfDistrictsClp)) {
            return false;
        }

        RegisterOfDistrictsClp registerOfDistricts = (RegisterOfDistrictsClp) obj;

        long primaryKey = registerOfDistricts.getPrimaryKey();

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
        StringBundler sb = new StringBundler(9);

        sb.append("{registerOfDistrictsId=");
        sb.append(getRegisterOfDistrictsId());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", districtCode=");
        sb.append(getDistrictCode());
        sb.append(", isArchived=");
        sb.append(getIsArchived());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.test.model.RegisterOfDistricts");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>registerOfDistrictsId</column-name><column-value><![CDATA[");
        sb.append(getRegisterOfDistrictsId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>districtCode</column-name><column-value><![CDATA[");
        sb.append(getDistrictCode());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>isArchived</column-name><column-value><![CDATA[");
        sb.append(getIsArchived());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
