package com.test.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.test.model.RegisterOfFarmers;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RegisterOfFarmers in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see RegisterOfFarmers
 * @generated
 */
public class RegisterOfFarmersCacheModel implements CacheModel<RegisterOfFarmers>,
    Externalizable {
    public long registerOfFarmersId;
    public String organizationName;
    public String legalForm;
    public String inn;
    public String kpp;
    public String ogrn;
    public String registrationArea;
    public String cropAreas;
    public long dateOfRegistration;
    public boolean isArchived;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{registerOfFarmersId=");
        sb.append(registerOfFarmersId);
        sb.append(", organizationName=");
        sb.append(organizationName);
        sb.append(", legalForm=");
        sb.append(legalForm);
        sb.append(", inn=");
        sb.append(inn);
        sb.append(", kpp=");
        sb.append(kpp);
        sb.append(", ogrn=");
        sb.append(ogrn);
        sb.append(", registrationArea=");
        sb.append(registrationArea);
        sb.append(", cropAreas=");
        sb.append(cropAreas);
        sb.append(", dateOfRegistration=");
        sb.append(dateOfRegistration);
        sb.append(", isArchived=");
        sb.append(isArchived);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public RegisterOfFarmers toEntityModel() {
        RegisterOfFarmersImpl registerOfFarmersImpl = new RegisterOfFarmersImpl();

        registerOfFarmersImpl.setRegisterOfFarmersId(registerOfFarmersId);

        if (organizationName == null) {
            registerOfFarmersImpl.setOrganizationName(StringPool.BLANK);
        } else {
            registerOfFarmersImpl.setOrganizationName(organizationName);
        }

        if (legalForm == null) {
            registerOfFarmersImpl.setLegalForm(StringPool.BLANK);
        } else {
            registerOfFarmersImpl.setLegalForm(legalForm);
        }

        if (inn == null) {
            registerOfFarmersImpl.setInn(StringPool.BLANK);
        } else {
            registerOfFarmersImpl.setInn(inn);
        }

        if (kpp == null) {
            registerOfFarmersImpl.setKpp(StringPool.BLANK);
        } else {
            registerOfFarmersImpl.setKpp(kpp);
        }

        if (ogrn == null) {
            registerOfFarmersImpl.setOgrn(StringPool.BLANK);
        } else {
            registerOfFarmersImpl.setOgrn(ogrn);
        }

        if (registrationArea == null) {
            registerOfFarmersImpl.setRegistrationArea(StringPool.BLANK);
        } else {
            registerOfFarmersImpl.setRegistrationArea(registrationArea);
        }

        if (cropAreas == null) {
            registerOfFarmersImpl.setCropAreas(StringPool.BLANK);
        } else {
            registerOfFarmersImpl.setCropAreas(cropAreas);
        }

        if (dateOfRegistration == Long.MIN_VALUE) {
            registerOfFarmersImpl.setDateOfRegistration(null);
        } else {
            registerOfFarmersImpl.setDateOfRegistration(new Date(
                    dateOfRegistration));
        }

        registerOfFarmersImpl.setIsArchived(isArchived);

        registerOfFarmersImpl.resetOriginalValues();

        return registerOfFarmersImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        registerOfFarmersId = objectInput.readLong();
        organizationName = objectInput.readUTF();
        legalForm = objectInput.readUTF();
        inn = objectInput.readUTF();
        kpp = objectInput.readUTF();
        ogrn = objectInput.readUTF();
        registrationArea = objectInput.readUTF();
        cropAreas = objectInput.readUTF();
        dateOfRegistration = objectInput.readLong();
        isArchived = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(registerOfFarmersId);

        if (organizationName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(organizationName);
        }

        if (legalForm == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(legalForm);
        }

        if (inn == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(inn);
        }

        if (kpp == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(kpp);
        }

        if (ogrn == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(ogrn);
        }

        if (registrationArea == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(registrationArea);
        }

        if (cropAreas == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(cropAreas);
        }

        objectOutput.writeLong(dateOfRegistration);
        objectOutput.writeBoolean(isArchived);
    }
}
