package com.test.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the RegisterOfDistricts service. Represents a row in the &quot;Test_RegisterOfDistricts&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.test.model.impl.RegisterOfDistrictsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.test.model.impl.RegisterOfDistrictsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegisterOfDistricts
 * @see com.test.model.impl.RegisterOfDistrictsImpl
 * @see com.test.model.impl.RegisterOfDistrictsModelImpl
 * @generated
 */
public interface RegisterOfDistrictsModel extends BaseModel<RegisterOfDistricts> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a register of districts model instance should use the {@link RegisterOfDistricts} interface instead.
     */

    /**
     * Returns the primary key of this register of districts.
     *
     * @return the primary key of this register of districts
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this register of districts.
     *
     * @param primaryKey the primary key of this register of districts
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the register of districts ID of this register of districts.
     *
     * @return the register of districts ID of this register of districts
     */
    public long getRegisterOfDistrictsId();

    /**
     * Sets the register of districts ID of this register of districts.
     *
     * @param registerOfDistrictsId the register of districts ID of this register of districts
     */
    public void setRegisterOfDistrictsId(long registerOfDistrictsId);

    /**
     * Returns the name of this register of districts.
     *
     * @return the name of this register of districts
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this register of districts.
     *
     * @param name the name of this register of districts
     */
    public void setName(String name);

    /**
     * Returns the district code of this register of districts.
     *
     * @return the district code of this register of districts
     */
    public long getDistrictCode();

    /**
     * Sets the district code of this register of districts.
     *
     * @param districtCode the district code of this register of districts
     */
    public void setDistrictCode(long districtCode);

    /**
     * Returns the is archived of this register of districts.
     *
     * @return the is archived of this register of districts
     */
    public boolean getIsArchived();

    /**
     * Returns <code>true</code> if this register of districts is is archived.
     *
     * @return <code>true</code> if this register of districts is is archived; <code>false</code> otherwise
     */
    public boolean isIsArchived();

    /**
     * Sets whether this register of districts is is archived.
     *
     * @param isArchived the is archived of this register of districts
     */
    public void setIsArchived(boolean isArchived);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(com.test.model.RegisterOfDistricts registerOfDistricts);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.test.model.RegisterOfDistricts> toCacheModel();

    @Override
    public com.test.model.RegisterOfDistricts toEscapedModel();

    @Override
    public com.test.model.RegisterOfDistricts toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}