package com.test.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link RegisterOfFarmers}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegisterOfFarmers
 * @generated
 */
public class RegisterOfFarmersWrapper implements RegisterOfFarmers,
    ModelWrapper<RegisterOfFarmers> {
    private RegisterOfFarmers _registerOfFarmers;

    public RegisterOfFarmersWrapper(RegisterOfFarmers registerOfFarmers) {
        _registerOfFarmers = registerOfFarmers;
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

    /**
    * Returns the primary key of this register of farmers.
    *
    * @return the primary key of this register of farmers
    */
    @Override
    public long getPrimaryKey() {
        return _registerOfFarmers.getPrimaryKey();
    }

    /**
    * Sets the primary key of this register of farmers.
    *
    * @param primaryKey the primary key of this register of farmers
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _registerOfFarmers.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the register of farmers ID of this register of farmers.
    *
    * @return the register of farmers ID of this register of farmers
    */
    @Override
    public long getRegisterOfFarmersId() {
        return _registerOfFarmers.getRegisterOfFarmersId();
    }

    /**
    * Sets the register of farmers ID of this register of farmers.
    *
    * @param registerOfFarmersId the register of farmers ID of this register of farmers
    */
    @Override
    public void setRegisterOfFarmersId(long registerOfFarmersId) {
        _registerOfFarmers.setRegisterOfFarmersId(registerOfFarmersId);
    }

    /**
    * Returns the organization name of this register of farmers.
    *
    * @return the organization name of this register of farmers
    */
    @Override
    public java.lang.String getOrganizationName() {
        return _registerOfFarmers.getOrganizationName();
    }

    /**
    * Sets the organization name of this register of farmers.
    *
    * @param organizationName the organization name of this register of farmers
    */
    @Override
    public void setOrganizationName(java.lang.String organizationName) {
        _registerOfFarmers.setOrganizationName(organizationName);
    }

    /**
    * Returns the legal form of this register of farmers.
    *
    * @return the legal form of this register of farmers
    */
    @Override
    public java.lang.String getLegalForm() {
        return _registerOfFarmers.getLegalForm();
    }

    /**
    * Sets the legal form of this register of farmers.
    *
    * @param legalForm the legal form of this register of farmers
    */
    @Override
    public void setLegalForm(java.lang.String legalForm) {
        _registerOfFarmers.setLegalForm(legalForm);
    }

    /**
    * Returns the inn of this register of farmers.
    *
    * @return the inn of this register of farmers
    */
    @Override
    public java.lang.String getInn() {
        return _registerOfFarmers.getInn();
    }

    /**
    * Sets the inn of this register of farmers.
    *
    * @param inn the inn of this register of farmers
    */
    @Override
    public void setInn(java.lang.String inn) {
        _registerOfFarmers.setInn(inn);
    }

    /**
    * Returns the kpp of this register of farmers.
    *
    * @return the kpp of this register of farmers
    */
    @Override
    public java.lang.String getKpp() {
        return _registerOfFarmers.getKpp();
    }

    /**
    * Sets the kpp of this register of farmers.
    *
    * @param kpp the kpp of this register of farmers
    */
    @Override
    public void setKpp(java.lang.String kpp) {
        _registerOfFarmers.setKpp(kpp);
    }

    /**
    * Returns the ogrn of this register of farmers.
    *
    * @return the ogrn of this register of farmers
    */
    @Override
    public java.lang.String getOgrn() {
        return _registerOfFarmers.getOgrn();
    }

    /**
    * Sets the ogrn of this register of farmers.
    *
    * @param ogrn the ogrn of this register of farmers
    */
    @Override
    public void setOgrn(java.lang.String ogrn) {
        _registerOfFarmers.setOgrn(ogrn);
    }

    /**
    * Returns the registration area of this register of farmers.
    *
    * @return the registration area of this register of farmers
    */
    @Override
    public java.lang.String getRegistrationArea() {
        return _registerOfFarmers.getRegistrationArea();
    }

    /**
    * Sets the registration area of this register of farmers.
    *
    * @param registrationArea the registration area of this register of farmers
    */
    @Override
    public void setRegistrationArea(java.lang.String registrationArea) {
        _registerOfFarmers.setRegistrationArea(registrationArea);
    }

    /**
    * Returns the crop areas of this register of farmers.
    *
    * @return the crop areas of this register of farmers
    */
    @Override
    public java.lang.String getCropAreas() {
        return _registerOfFarmers.getCropAreas();
    }

    /**
    * Sets the crop areas of this register of farmers.
    *
    * @param cropAreas the crop areas of this register of farmers
    */
    @Override
    public void setCropAreas(java.lang.String cropAreas) {
        _registerOfFarmers.setCropAreas(cropAreas);
    }

    /**
    * Returns the date of registration of this register of farmers.
    *
    * @return the date of registration of this register of farmers
    */
    @Override
    public java.util.Date getDateOfRegistration() {
        return _registerOfFarmers.getDateOfRegistration();
    }

    /**
    * Sets the date of registration of this register of farmers.
    *
    * @param dateOfRegistration the date of registration of this register of farmers
    */
    @Override
    public void setDateOfRegistration(java.util.Date dateOfRegistration) {
        _registerOfFarmers.setDateOfRegistration(dateOfRegistration);
    }

    /**
    * Returns the is archived of this register of farmers.
    *
    * @return the is archived of this register of farmers
    */
    @Override
    public boolean getIsArchived() {
        return _registerOfFarmers.getIsArchived();
    }

    /**
    * Returns <code>true</code> if this register of farmers is is archived.
    *
    * @return <code>true</code> if this register of farmers is is archived; <code>false</code> otherwise
    */
    @Override
    public boolean isIsArchived() {
        return _registerOfFarmers.isIsArchived();
    }

    /**
    * Sets whether this register of farmers is is archived.
    *
    * @param isArchived the is archived of this register of farmers
    */
    @Override
    public void setIsArchived(boolean isArchived) {
        _registerOfFarmers.setIsArchived(isArchived);
    }

    @Override
    public boolean isNew() {
        return _registerOfFarmers.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _registerOfFarmers.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _registerOfFarmers.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _registerOfFarmers.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _registerOfFarmers.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _registerOfFarmers.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _registerOfFarmers.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _registerOfFarmers.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _registerOfFarmers.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _registerOfFarmers.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _registerOfFarmers.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new RegisterOfFarmersWrapper((RegisterOfFarmers) _registerOfFarmers.clone());
    }

    @Override
    public int compareTo(com.test.model.RegisterOfFarmers registerOfFarmers) {
        return _registerOfFarmers.compareTo(registerOfFarmers);
    }

    @Override
    public int hashCode() {
        return _registerOfFarmers.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.test.model.RegisterOfFarmers> toCacheModel() {
        return _registerOfFarmers.toCacheModel();
    }

    @Override
    public com.test.model.RegisterOfFarmers toEscapedModel() {
        return new RegisterOfFarmersWrapper(_registerOfFarmers.toEscapedModel());
    }

    @Override
    public com.test.model.RegisterOfFarmers toUnescapedModel() {
        return new RegisterOfFarmersWrapper(_registerOfFarmers.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _registerOfFarmers.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _registerOfFarmers.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _registerOfFarmers.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RegisterOfFarmersWrapper)) {
            return false;
        }

        RegisterOfFarmersWrapper registerOfFarmersWrapper = (RegisterOfFarmersWrapper) obj;

        if (Validator.equals(_registerOfFarmers,
                    registerOfFarmersWrapper._registerOfFarmers)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public RegisterOfFarmers getWrappedRegisterOfFarmers() {
        return _registerOfFarmers;
    }

    @Override
    public RegisterOfFarmers getWrappedModel() {
        return _registerOfFarmers;
    }

    @Override
    public void resetOriginalValues() {
        _registerOfFarmers.resetOriginalValues();
    }
}
