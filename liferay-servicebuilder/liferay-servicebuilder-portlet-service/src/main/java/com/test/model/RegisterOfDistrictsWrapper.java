package com.test.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link RegisterOfDistricts}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegisterOfDistricts
 * @generated
 */
public class RegisterOfDistrictsWrapper implements RegisterOfDistricts,
    ModelWrapper<RegisterOfDistricts> {
    private RegisterOfDistricts _registerOfDistricts;

    public RegisterOfDistrictsWrapper(RegisterOfDistricts registerOfDistricts) {
        _registerOfDistricts = registerOfDistricts;
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

    /**
    * Returns the primary key of this register of districts.
    *
    * @return the primary key of this register of districts
    */
    @Override
    public long getPrimaryKey() {
        return _registerOfDistricts.getPrimaryKey();
    }

    /**
    * Sets the primary key of this register of districts.
    *
    * @param primaryKey the primary key of this register of districts
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _registerOfDistricts.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the register of districts ID of this register of districts.
    *
    * @return the register of districts ID of this register of districts
    */
    @Override
    public long getRegisterOfDistrictsId() {
        return _registerOfDistricts.getRegisterOfDistrictsId();
    }

    /**
    * Sets the register of districts ID of this register of districts.
    *
    * @param registerOfDistrictsId the register of districts ID of this register of districts
    */
    @Override
    public void setRegisterOfDistrictsId(long registerOfDistrictsId) {
        _registerOfDistricts.setRegisterOfDistrictsId(registerOfDistrictsId);
    }

    /**
    * Returns the name of this register of districts.
    *
    * @return the name of this register of districts
    */
    @Override
    public java.lang.String getName() {
        return _registerOfDistricts.getName();
    }

    /**
    * Sets the name of this register of districts.
    *
    * @param name the name of this register of districts
    */
    @Override
    public void setName(java.lang.String name) {
        _registerOfDistricts.setName(name);
    }

    /**
    * Returns the district code of this register of districts.
    *
    * @return the district code of this register of districts
    */
    @Override
    public long getDistrictCode() {
        return _registerOfDistricts.getDistrictCode();
    }

    /**
    * Sets the district code of this register of districts.
    *
    * @param districtCode the district code of this register of districts
    */
    @Override
    public void setDistrictCode(long districtCode) {
        _registerOfDistricts.setDistrictCode(districtCode);
    }

    /**
    * Returns the is archived of this register of districts.
    *
    * @return the is archived of this register of districts
    */
    @Override
    public boolean getIsArchived() {
        return _registerOfDistricts.getIsArchived();
    }

    /**
    * Returns <code>true</code> if this register of districts is is archived.
    *
    * @return <code>true</code> if this register of districts is is archived; <code>false</code> otherwise
    */
    @Override
    public boolean isIsArchived() {
        return _registerOfDistricts.isIsArchived();
    }

    /**
    * Sets whether this register of districts is is archived.
    *
    * @param isArchived the is archived of this register of districts
    */
    @Override
    public void setIsArchived(boolean isArchived) {
        _registerOfDistricts.setIsArchived(isArchived);
    }

    @Override
    public boolean isNew() {
        return _registerOfDistricts.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _registerOfDistricts.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _registerOfDistricts.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _registerOfDistricts.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _registerOfDistricts.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _registerOfDistricts.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _registerOfDistricts.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _registerOfDistricts.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _registerOfDistricts.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _registerOfDistricts.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _registerOfDistricts.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new RegisterOfDistrictsWrapper((RegisterOfDistricts) _registerOfDistricts.clone());
    }

    @Override
    public int compareTo(com.test.model.RegisterOfDistricts registerOfDistricts) {
        return _registerOfDistricts.compareTo(registerOfDistricts);
    }

    @Override
    public int hashCode() {
        return _registerOfDistricts.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.test.model.RegisterOfDistricts> toCacheModel() {
        return _registerOfDistricts.toCacheModel();
    }

    @Override
    public com.test.model.RegisterOfDistricts toEscapedModel() {
        return new RegisterOfDistrictsWrapper(_registerOfDistricts.toEscapedModel());
    }

    @Override
    public com.test.model.RegisterOfDistricts toUnescapedModel() {
        return new RegisterOfDistrictsWrapper(_registerOfDistricts.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _registerOfDistricts.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _registerOfDistricts.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _registerOfDistricts.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RegisterOfDistrictsWrapper)) {
            return false;
        }

        RegisterOfDistrictsWrapper registerOfDistrictsWrapper = (RegisterOfDistrictsWrapper) obj;

        if (Validator.equals(_registerOfDistricts,
                    registerOfDistrictsWrapper._registerOfDistricts)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public RegisterOfDistricts getWrappedRegisterOfDistricts() {
        return _registerOfDistricts;
    }

    @Override
    public RegisterOfDistricts getWrappedModel() {
        return _registerOfDistricts;
    }

    @Override
    public void resetOriginalValues() {
        _registerOfDistricts.resetOriginalValues();
    }
}
