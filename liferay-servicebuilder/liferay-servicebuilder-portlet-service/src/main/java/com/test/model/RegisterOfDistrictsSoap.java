package com.test.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RegisterOfDistrictsSoap implements Serializable {
    private long _registerOfDistrictsId;
    private String _name;
    private long _districtCode;
    private boolean _isArchived;

    public RegisterOfDistrictsSoap() {
    }

    public static RegisterOfDistrictsSoap toSoapModel(RegisterOfDistricts model) {
        RegisterOfDistrictsSoap soapModel = new RegisterOfDistrictsSoap();

        soapModel.setRegisterOfDistrictsId(model.getRegisterOfDistrictsId());
        soapModel.setName(model.getName());
        soapModel.setDistrictCode(model.getDistrictCode());
        soapModel.setIsArchived(model.getIsArchived());

        return soapModel;
    }

    public static RegisterOfDistrictsSoap[] toSoapModels(
        RegisterOfDistricts[] models) {
        RegisterOfDistrictsSoap[] soapModels = new RegisterOfDistrictsSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static RegisterOfDistrictsSoap[][] toSoapModels(
        RegisterOfDistricts[][] models) {
        RegisterOfDistrictsSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new RegisterOfDistrictsSoap[models.length][models[0].length];
        } else {
            soapModels = new RegisterOfDistrictsSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static RegisterOfDistrictsSoap[] toSoapModels(
        List<RegisterOfDistricts> models) {
        List<RegisterOfDistrictsSoap> soapModels = new ArrayList<RegisterOfDistrictsSoap>(models.size());

        for (RegisterOfDistricts model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new RegisterOfDistrictsSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _registerOfDistrictsId;
    }

    public void setPrimaryKey(long pk) {
        setRegisterOfDistrictsId(pk);
    }

    public long getRegisterOfDistrictsId() {
        return _registerOfDistrictsId;
    }

    public void setRegisterOfDistrictsId(long registerOfDistrictsId) {
        _registerOfDistrictsId = registerOfDistrictsId;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public long getDistrictCode() {
        return _districtCode;
    }

    public void setDistrictCode(long districtCode) {
        _districtCode = districtCode;
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
