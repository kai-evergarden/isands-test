package com.test.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.test.model.RegisterOfDistricts;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing RegisterOfDistricts in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see RegisterOfDistricts
 * @generated
 */
public class RegisterOfDistrictsCacheModel implements CacheModel<RegisterOfDistricts>,
    Externalizable {
    public long registerOfDistrictsId;
    public String name;
    public long districtCode;
    public boolean isArchived;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{registerOfDistrictsId=");
        sb.append(registerOfDistrictsId);
        sb.append(", name=");
        sb.append(name);
        sb.append(", districtCode=");
        sb.append(districtCode);
        sb.append(", isArchived=");
        sb.append(isArchived);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public RegisterOfDistricts toEntityModel() {
        RegisterOfDistrictsImpl registerOfDistrictsImpl = new RegisterOfDistrictsImpl();

        registerOfDistrictsImpl.setRegisterOfDistrictsId(registerOfDistrictsId);

        if (name == null) {
            registerOfDistrictsImpl.setName(StringPool.BLANK);
        } else {
            registerOfDistrictsImpl.setName(name);
        }

        registerOfDistrictsImpl.setDistrictCode(districtCode);
        registerOfDistrictsImpl.setIsArchived(isArchived);

        registerOfDistrictsImpl.resetOriginalValues();

        return registerOfDistrictsImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        registerOfDistrictsId = objectInput.readLong();
        name = objectInput.readUTF();
        districtCode = objectInput.readLong();
        isArchived = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(registerOfDistrictsId);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        objectOutput.writeLong(districtCode);
        objectOutput.writeBoolean(isArchived);
    }
}
