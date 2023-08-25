package com.test.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RegisterOfFarmersSoap implements Serializable {
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

    public RegisterOfFarmersSoap() {
    }

    public static RegisterOfFarmersSoap toSoapModel(RegisterOfFarmers model) {
        RegisterOfFarmersSoap soapModel = new RegisterOfFarmersSoap();

        soapModel.setRegisterOfFarmersId(model.getRegisterOfFarmersId());
        soapModel.setOrganizationName(model.getOrganizationName());
        soapModel.setLegalForm(model.getLegalForm());
        soapModel.setInn(model.getInn());
        soapModel.setKpp(model.getKpp());
        soapModel.setOgrn(model.getOgrn());
        soapModel.setRegistrationArea(model.getRegistrationArea());
        soapModel.setCropAreas(model.getCropAreas());
        soapModel.setDateOfRegistration(model.getDateOfRegistration());
        soapModel.setIsArchived(model.getIsArchived());

        return soapModel;
    }

    public static RegisterOfFarmersSoap[] toSoapModels(
        RegisterOfFarmers[] models) {
        RegisterOfFarmersSoap[] soapModels = new RegisterOfFarmersSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static RegisterOfFarmersSoap[][] toSoapModels(
        RegisterOfFarmers[][] models) {
        RegisterOfFarmersSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new RegisterOfFarmersSoap[models.length][models[0].length];
        } else {
            soapModels = new RegisterOfFarmersSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static RegisterOfFarmersSoap[] toSoapModels(
        List<RegisterOfFarmers> models) {
        List<RegisterOfFarmersSoap> soapModels = new ArrayList<RegisterOfFarmersSoap>(models.size());

        for (RegisterOfFarmers model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new RegisterOfFarmersSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _registerOfFarmersId;
    }

    public void setPrimaryKey(long pk) {
        setRegisterOfFarmersId(pk);
    }

    public long getRegisterOfFarmersId() {
        return _registerOfFarmersId;
    }

    public void setRegisterOfFarmersId(long registerOfFarmersId) {
        _registerOfFarmersId = registerOfFarmersId;
    }

    public String getOrganizationName() {
        return _organizationName;
    }

    public void setOrganizationName(String organizationName) {
        _organizationName = organizationName;
    }

    public String getLegalForm() {
        return _legalForm;
    }

    public void setLegalForm(String legalForm) {
        _legalForm = legalForm;
    }

    public String getInn() {
        return _inn;
    }

    public void setInn(String inn) {
        _inn = inn;
    }

    public String getKpp() {
        return _kpp;
    }

    public void setKpp(String kpp) {
        _kpp = kpp;
    }

    public String getOgrn() {
        return _ogrn;
    }

    public void setOgrn(String ogrn) {
        _ogrn = ogrn;
    }

    public String getRegistrationArea() {
        return _registrationArea;
    }

    public void setRegistrationArea(String registrationArea) {
        _registrationArea = registrationArea;
    }

    public String getCropAreas() {
        return _cropAreas;
    }

    public void setCropAreas(String cropAreas) {
        _cropAreas = cropAreas;
    }

    public Date getDateOfRegistration() {
        return _dateOfRegistration;
    }

    public void setDateOfRegistration(Date dateOfRegistration) {
        _dateOfRegistration = dateOfRegistration;
    }

    public boolean getIsArchived() {
        return _isArchived;
    }

    public boolean isIsArchived() {
        return _isArchived;
    }

    public void setIsArchived(boolean isArchived) {
        _isArchived = isArchived;
    }
}
