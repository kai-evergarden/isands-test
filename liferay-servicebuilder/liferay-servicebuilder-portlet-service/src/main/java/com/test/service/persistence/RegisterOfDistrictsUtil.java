package com.test.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.test.model.RegisterOfDistricts;

import java.util.List;

/**
 * The persistence utility for the register of districts service. This utility wraps {@link RegisterOfDistrictsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegisterOfDistrictsPersistence
 * @see RegisterOfDistrictsPersistenceImpl
 * @generated
 */
public class RegisterOfDistrictsUtil {
    private static RegisterOfDistrictsPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(RegisterOfDistricts registerOfDistricts) {
        getPersistence().clearCache(registerOfDistricts);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<RegisterOfDistricts> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<RegisterOfDistricts> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<RegisterOfDistricts> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static RegisterOfDistricts update(
        RegisterOfDistricts registerOfDistricts) throws SystemException {
        return getPersistence().update(registerOfDistricts);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static RegisterOfDistricts update(
        RegisterOfDistricts registerOfDistricts, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(registerOfDistricts, serviceContext);
    }

    /**
    * Returns all the register of districtses where name = &#63;.
    *
    * @param name the name
    * @return the matching register of districtses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.test.model.RegisterOfDistricts> findByname(
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByname(name);
    }

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
    public static java.util.List<com.test.model.RegisterOfDistricts> findByname(
        java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByname(name, start, end);
    }

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
    public static java.util.List<com.test.model.RegisterOfDistricts> findByname(
        java.lang.String name, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByname(name, start, end, orderByComparator);
    }

    /**
    * Returns the first register of districts in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching register of districts
    * @throws com.test.NoSuchRegisterOfDistrictsException if a matching register of districts could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.test.model.RegisterOfDistricts findByname_First(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfDistrictsException {
        return getPersistence().findByname_First(name, orderByComparator);
    }

    /**
    * Returns the first register of districts in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching register of districts, or <code>null</code> if a matching register of districts could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.test.model.RegisterOfDistricts fetchByname_First(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByname_First(name, orderByComparator);
    }

    /**
    * Returns the last register of districts in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching register of districts
    * @throws com.test.NoSuchRegisterOfDistrictsException if a matching register of districts could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.test.model.RegisterOfDistricts findByname_Last(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfDistrictsException {
        return getPersistence().findByname_Last(name, orderByComparator);
    }

    /**
    * Returns the last register of districts in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching register of districts, or <code>null</code> if a matching register of districts could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.test.model.RegisterOfDistricts fetchByname_Last(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByname_Last(name, orderByComparator);
    }

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
    public static com.test.model.RegisterOfDistricts[] findByname_PrevAndNext(
        long registerOfDistrictsId, java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfDistrictsException {
        return getPersistence()
                   .findByname_PrevAndNext(registerOfDistrictsId, name,
            orderByComparator);
    }

    /**
    * Removes all the register of districtses where name = &#63; from the database.
    *
    * @param name the name
    * @throws SystemException if a system exception occurred
    */
    public static void removeByname(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByname(name);
    }

    /**
    * Returns the number of register of districtses where name = &#63;.
    *
    * @param name the name
    * @return the number of matching register of districtses
    * @throws SystemException if a system exception occurred
    */
    public static int countByname(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByname(name);
    }

    /**
    * Returns all the register of districtses where isArchived = &#63;.
    *
    * @param isArchived the is archived
    * @return the matching register of districtses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.test.model.RegisterOfDistricts> findByisArchived(
        boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByisArchived(isArchived);
    }

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
    public static java.util.List<com.test.model.RegisterOfDistricts> findByisArchived(
        boolean isArchived, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByisArchived(isArchived, start, end);
    }

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
    public static java.util.List<com.test.model.RegisterOfDistricts> findByisArchived(
        boolean isArchived, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByisArchived(isArchived, start, end, orderByComparator);
    }

    /**
    * Returns the first register of districts in the ordered set where isArchived = &#63;.
    *
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching register of districts
    * @throws com.test.NoSuchRegisterOfDistrictsException if a matching register of districts could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.test.model.RegisterOfDistricts findByisArchived_First(
        boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfDistrictsException {
        return getPersistence()
                   .findByisArchived_First(isArchived, orderByComparator);
    }

    /**
    * Returns the first register of districts in the ordered set where isArchived = &#63;.
    *
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching register of districts, or <code>null</code> if a matching register of districts could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.test.model.RegisterOfDistricts fetchByisArchived_First(
        boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByisArchived_First(isArchived, orderByComparator);
    }

    /**
    * Returns the last register of districts in the ordered set where isArchived = &#63;.
    *
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching register of districts
    * @throws com.test.NoSuchRegisterOfDistrictsException if a matching register of districts could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.test.model.RegisterOfDistricts findByisArchived_Last(
        boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfDistrictsException {
        return getPersistence()
                   .findByisArchived_Last(isArchived, orderByComparator);
    }

    /**
    * Returns the last register of districts in the ordered set where isArchived = &#63;.
    *
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching register of districts, or <code>null</code> if a matching register of districts could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.test.model.RegisterOfDistricts fetchByisArchived_Last(
        boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByisArchived_Last(isArchived, orderByComparator);
    }

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
    public static com.test.model.RegisterOfDistricts[] findByisArchived_PrevAndNext(
        long registerOfDistrictsId, boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfDistrictsException {
        return getPersistence()
                   .findByisArchived_PrevAndNext(registerOfDistrictsId,
            isArchived, orderByComparator);
    }

    /**
    * Removes all the register of districtses where isArchived = &#63; from the database.
    *
    * @param isArchived the is archived
    * @throws SystemException if a system exception occurred
    */
    public static void removeByisArchived(boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByisArchived(isArchived);
    }

    /**
    * Returns the number of register of districtses where isArchived = &#63;.
    *
    * @param isArchived the is archived
    * @return the number of matching register of districtses
    * @throws SystemException if a system exception occurred
    */
    public static int countByisArchived(boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByisArchived(isArchived);
    }

    /**
    * Caches the register of districts in the entity cache if it is enabled.
    *
    * @param registerOfDistricts the register of districts
    */
    public static void cacheResult(
        com.test.model.RegisterOfDistricts registerOfDistricts) {
        getPersistence().cacheResult(registerOfDistricts);
    }

    /**
    * Caches the register of districtses in the entity cache if it is enabled.
    *
    * @param registerOfDistrictses the register of districtses
    */
    public static void cacheResult(
        java.util.List<com.test.model.RegisterOfDistricts> registerOfDistrictses) {
        getPersistence().cacheResult(registerOfDistrictses);
    }

    /**
    * Creates a new register of districts with the primary key. Does not add the register of districts to the database.
    *
    * @param registerOfDistrictsId the primary key for the new register of districts
    * @return the new register of districts
    */
    public static com.test.model.RegisterOfDistricts create(
        long registerOfDistrictsId) {
        return getPersistence().create(registerOfDistrictsId);
    }

    /**
    * Removes the register of districts with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param registerOfDistrictsId the primary key of the register of districts
    * @return the register of districts that was removed
    * @throws com.test.NoSuchRegisterOfDistrictsException if a register of districts with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.test.model.RegisterOfDistricts remove(
        long registerOfDistrictsId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfDistrictsException {
        return getPersistence().remove(registerOfDistrictsId);
    }

    public static com.test.model.RegisterOfDistricts updateImpl(
        com.test.model.RegisterOfDistricts registerOfDistricts)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(registerOfDistricts);
    }

    /**
    * Returns the register of districts with the primary key or throws a {@link com.test.NoSuchRegisterOfDistrictsException} if it could not be found.
    *
    * @param registerOfDistrictsId the primary key of the register of districts
    * @return the register of districts
    * @throws com.test.NoSuchRegisterOfDistrictsException if a register of districts with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.test.model.RegisterOfDistricts findByPrimaryKey(
        long registerOfDistrictsId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfDistrictsException {
        return getPersistence().findByPrimaryKey(registerOfDistrictsId);
    }

    /**
    * Returns the register of districts with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param registerOfDistrictsId the primary key of the register of districts
    * @return the register of districts, or <code>null</code> if a register of districts with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.test.model.RegisterOfDistricts fetchByPrimaryKey(
        long registerOfDistrictsId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(registerOfDistrictsId);
    }

    /**
    * Returns all the register of districtses.
    *
    * @return the register of districtses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.test.model.RegisterOfDistricts> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<com.test.model.RegisterOfDistricts> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<com.test.model.RegisterOfDistricts> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the register of districtses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of register of districtses.
    *
    * @return the number of register of districtses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static RegisterOfDistrictsPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (RegisterOfDistrictsPersistence) PortletBeanLocatorUtil.locate(com.test.service.ClpSerializer.getServletContextName(),
                    RegisterOfDistrictsPersistence.class.getName());

            ReferenceRegistry.registerReference(RegisterOfDistrictsUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(RegisterOfDistrictsPersistence persistence) {
    }
}
