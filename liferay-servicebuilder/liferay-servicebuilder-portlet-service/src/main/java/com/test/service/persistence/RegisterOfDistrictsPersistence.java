package com.test.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.test.model.RegisterOfDistricts;

/**
 * The persistence interface for the register of districts service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegisterOfDistrictsPersistenceImpl
 * @see RegisterOfDistrictsUtil
 * @generated
 */
public interface RegisterOfDistrictsPersistence extends BasePersistence<RegisterOfDistricts> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link RegisterOfDistrictsUtil} to access the register of districts persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the register of districtses where name = &#63;.
    *
    * @param name the name
    * @return the matching register of districtses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.model.RegisterOfDistricts> findByname(
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the register of districtses where name = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.RegisterOfDistrictsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param name the name
    * @param start the lower bound of the range of register of districtses
    * @param end the upper bound of the range of register of districtses (not inclusive)
    * @return the range of matching register of districtses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.model.RegisterOfDistricts> findByname(
        java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the register of districtses where name = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.RegisterOfDistrictsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param name the name
    * @param start the lower bound of the range of register of districtses
    * @param end the upper bound of the range of register of districtses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching register of districtses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.model.RegisterOfDistricts> findByname(
        java.lang.String name, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first register of districts in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching register of districts
    * @throws com.test.NoSuchRegisterOfDistrictsException if a matching register of districts could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfDistricts findByname_First(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfDistrictsException;

    /**
    * Returns the first register of districts in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching register of districts, or <code>null</code> if a matching register of districts could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfDistricts fetchByname_First(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last register of districts in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching register of districts
    * @throws com.test.NoSuchRegisterOfDistrictsException if a matching register of districts could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfDistricts findByname_Last(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfDistrictsException;

    /**
    * Returns the last register of districts in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching register of districts, or <code>null</code> if a matching register of districts could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfDistricts fetchByname_Last(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the register of districtses before and after the current register of districts in the ordered set where name = &#63;.
    *
    * @param registerOfDistrictsId the primary key of the current register of districts
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next register of districts
    * @throws com.test.NoSuchRegisterOfDistrictsException if a register of districts with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfDistricts[] findByname_PrevAndNext(
        long registerOfDistrictsId, java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfDistrictsException;

    /**
    * Removes all the register of districtses where name = &#63; from the database.
    *
    * @param name the name
    * @throws SystemException if a system exception occurred
    */
    public void removeByname(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of register of districtses where name = &#63;.
    *
    * @param name the name
    * @return the number of matching register of districtses
    * @throws SystemException if a system exception occurred
    */
    public int countByname(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the register of districtses where isArchived = &#63;.
    *
    * @param isArchived the is archived
    * @return the matching register of districtses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.model.RegisterOfDistricts> findByisArchived(
        boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the register of districtses where isArchived = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.RegisterOfDistrictsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param isArchived the is archived
    * @param start the lower bound of the range of register of districtses
    * @param end the upper bound of the range of register of districtses (not inclusive)
    * @return the range of matching register of districtses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.model.RegisterOfDistricts> findByisArchived(
        boolean isArchived, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the register of districtses where isArchived = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.RegisterOfDistrictsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param isArchived the is archived
    * @param start the lower bound of the range of register of districtses
    * @param end the upper bound of the range of register of districtses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching register of districtses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.model.RegisterOfDistricts> findByisArchived(
        boolean isArchived, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first register of districts in the ordered set where isArchived = &#63;.
    *
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching register of districts
    * @throws com.test.NoSuchRegisterOfDistrictsException if a matching register of districts could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfDistricts findByisArchived_First(
        boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfDistrictsException;

    /**
    * Returns the first register of districts in the ordered set where isArchived = &#63;.
    *
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching register of districts, or <code>null</code> if a matching register of districts could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfDistricts fetchByisArchived_First(
        boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last register of districts in the ordered set where isArchived = &#63;.
    *
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching register of districts
    * @throws com.test.NoSuchRegisterOfDistrictsException if a matching register of districts could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfDistricts findByisArchived_Last(
        boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfDistrictsException;

    /**
    * Returns the last register of districts in the ordered set where isArchived = &#63;.
    *
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching register of districts, or <code>null</code> if a matching register of districts could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfDistricts fetchByisArchived_Last(
        boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the register of districtses before and after the current register of districts in the ordered set where isArchived = &#63;.
    *
    * @param registerOfDistrictsId the primary key of the current register of districts
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next register of districts
    * @throws com.test.NoSuchRegisterOfDistrictsException if a register of districts with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfDistricts[] findByisArchived_PrevAndNext(
        long registerOfDistrictsId, boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfDistrictsException;

    /**
    * Removes all the register of districtses where isArchived = &#63; from the database.
    *
    * @param isArchived the is archived
    * @throws SystemException if a system exception occurred
    */
    public void removeByisArchived(boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of register of districtses where isArchived = &#63;.
    *
    * @param isArchived the is archived
    * @return the number of matching register of districtses
    * @throws SystemException if a system exception occurred
    */
    public int countByisArchived(boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the register of districts in the entity cache if it is enabled.
    *
    * @param registerOfDistricts the register of districts
    */
    public void cacheResult(
        com.test.model.RegisterOfDistricts registerOfDistricts);

    /**
    * Caches the register of districtses in the entity cache if it is enabled.
    *
    * @param registerOfDistrictses the register of districtses
    */
    public void cacheResult(
        java.util.List<com.test.model.RegisterOfDistricts> registerOfDistrictses);

    /**
    * Creates a new register of districts with the primary key. Does not add the register of districts to the database.
    *
    * @param registerOfDistrictsId the primary key for the new register of districts
    * @return the new register of districts
    */
    public com.test.model.RegisterOfDistricts create(long registerOfDistrictsId);

    /**
    * Removes the register of districts with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param registerOfDistrictsId the primary key of the register of districts
    * @return the register of districts that was removed
    * @throws com.test.NoSuchRegisterOfDistrictsException if a register of districts with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfDistricts remove(long registerOfDistrictsId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfDistrictsException;

    public com.test.model.RegisterOfDistricts updateImpl(
        com.test.model.RegisterOfDistricts registerOfDistricts)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the register of districts with the primary key or throws a {@link com.test.NoSuchRegisterOfDistrictsException} if it could not be found.
    *
    * @param registerOfDistrictsId the primary key of the register of districts
    * @return the register of districts
    * @throws com.test.NoSuchRegisterOfDistrictsException if a register of districts with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfDistricts findByPrimaryKey(
        long registerOfDistrictsId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfDistrictsException;

    /**
    * Returns the register of districts with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param registerOfDistrictsId the primary key of the register of districts
    * @return the register of districts, or <code>null</code> if a register of districts with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfDistricts fetchByPrimaryKey(
        long registerOfDistrictsId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the register of districtses.
    *
    * @return the register of districtses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.model.RegisterOfDistricts> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the register of districtses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.RegisterOfDistrictsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of register of districtses
    * @param end the upper bound of the range of register of districtses (not inclusive)
    * @return the range of register of districtses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.model.RegisterOfDistricts> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the register of districtses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.RegisterOfDistrictsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of register of districtses
    * @param end the upper bound of the range of register of districtses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of register of districtses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.model.RegisterOfDistricts> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the register of districtses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of register of districtses.
    *
    * @return the number of register of districtses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
