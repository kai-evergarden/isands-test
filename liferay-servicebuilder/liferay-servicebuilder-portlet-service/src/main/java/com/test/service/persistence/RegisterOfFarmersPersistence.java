package com.test.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.test.model.RegisterOfFarmers;

/**
 * The persistence interface for the register of farmers service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegisterOfFarmersPersistenceImpl
 * @see RegisterOfFarmersUtil
 * @generated
 */
public interface RegisterOfFarmersPersistence extends BasePersistence<RegisterOfFarmers> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link RegisterOfFarmersUtil} to access the register of farmers persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the register of farmerses where isArchived = &#63;.
    *
    * @param isArchived the is archived
    * @return the matching register of farmerses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.model.RegisterOfFarmers> findByisArchived(
        boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the register of farmerses where isArchived = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.RegisterOfFarmersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param isArchived the is archived
    * @param start the lower bound of the range of register of farmerses
    * @param end the upper bound of the range of register of farmerses (not inclusive)
    * @return the range of matching register of farmerses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.model.RegisterOfFarmers> findByisArchived(
        boolean isArchived, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the register of farmerses where isArchived = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.RegisterOfFarmersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param isArchived the is archived
    * @param start the lower bound of the range of register of farmerses
    * @param end the upper bound of the range of register of farmerses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching register of farmerses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.model.RegisterOfFarmers> findByisArchived(
        boolean isArchived, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first register of farmers in the ordered set where isArchived = &#63;.
    *
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching register of farmers
    * @throws com.test.NoSuchRegisterOfFarmersException if a matching register of farmers could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers findByisArchived_First(
        boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfFarmersException;

    /**
    * Returns the first register of farmers in the ordered set where isArchived = &#63;.
    *
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching register of farmers, or <code>null</code> if a matching register of farmers could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers fetchByisArchived_First(
        boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last register of farmers in the ordered set where isArchived = &#63;.
    *
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching register of farmers
    * @throws com.test.NoSuchRegisterOfFarmersException if a matching register of farmers could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers findByisArchived_Last(
        boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfFarmersException;

    /**
    * Returns the last register of farmers in the ordered set where isArchived = &#63;.
    *
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching register of farmers, or <code>null</code> if a matching register of farmers could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers fetchByisArchived_Last(
        boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the register of farmerses before and after the current register of farmers in the ordered set where isArchived = &#63;.
    *
    * @param registerOfFarmersId the primary key of the current register of farmers
    * @param isArchived the is archived
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next register of farmers
    * @throws com.test.NoSuchRegisterOfFarmersException if a register of farmers with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers[] findByisArchived_PrevAndNext(
        long registerOfFarmersId, boolean isArchived,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfFarmersException;

    /**
    * Removes all the register of farmerses where isArchived = &#63; from the database.
    *
    * @param isArchived the is archived
    * @throws SystemException if a system exception occurred
    */
    public void removeByisArchived(boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of register of farmerses where isArchived = &#63;.
    *
    * @param isArchived the is archived
    * @return the number of matching register of farmerses
    * @throws SystemException if a system exception occurred
    */
    public int countByisArchived(boolean isArchived)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the register of farmerses where organizationName = &#63;.
    *
    * @param organizationName the organization name
    * @return the matching register of farmerses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.model.RegisterOfFarmers> findByorganizationName(
        java.lang.String organizationName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the register of farmerses where organizationName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.RegisterOfFarmersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param organizationName the organization name
    * @param start the lower bound of the range of register of farmerses
    * @param end the upper bound of the range of register of farmerses (not inclusive)
    * @return the range of matching register of farmerses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.model.RegisterOfFarmers> findByorganizationName(
        java.lang.String organizationName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the register of farmerses where organizationName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.RegisterOfFarmersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param organizationName the organization name
    * @param start the lower bound of the range of register of farmerses
    * @param end the upper bound of the range of register of farmerses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching register of farmerses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.model.RegisterOfFarmers> findByorganizationName(
        java.lang.String organizationName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first register of farmers in the ordered set where organizationName = &#63;.
    *
    * @param organizationName the organization name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching register of farmers
    * @throws com.test.NoSuchRegisterOfFarmersException if a matching register of farmers could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers findByorganizationName_First(
        java.lang.String organizationName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfFarmersException;

    /**
    * Returns the first register of farmers in the ordered set where organizationName = &#63;.
    *
    * @param organizationName the organization name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching register of farmers, or <code>null</code> if a matching register of farmers could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers fetchByorganizationName_First(
        java.lang.String organizationName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last register of farmers in the ordered set where organizationName = &#63;.
    *
    * @param organizationName the organization name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching register of farmers
    * @throws com.test.NoSuchRegisterOfFarmersException if a matching register of farmers could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers findByorganizationName_Last(
        java.lang.String organizationName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfFarmersException;

    /**
    * Returns the last register of farmers in the ordered set where organizationName = &#63;.
    *
    * @param organizationName the organization name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching register of farmers, or <code>null</code> if a matching register of farmers could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers fetchByorganizationName_Last(
        java.lang.String organizationName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the register of farmerses before and after the current register of farmers in the ordered set where organizationName = &#63;.
    *
    * @param registerOfFarmersId the primary key of the current register of farmers
    * @param organizationName the organization name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next register of farmers
    * @throws com.test.NoSuchRegisterOfFarmersException if a register of farmers with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers[] findByorganizationName_PrevAndNext(
        long registerOfFarmersId, java.lang.String organizationName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfFarmersException;

    /**
    * Removes all the register of farmerses where organizationName = &#63; from the database.
    *
    * @param organizationName the organization name
    * @throws SystemException if a system exception occurred
    */
    public void removeByorganizationName(java.lang.String organizationName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of register of farmerses where organizationName = &#63;.
    *
    * @param organizationName the organization name
    * @return the number of matching register of farmerses
    * @throws SystemException if a system exception occurred
    */
    public int countByorganizationName(java.lang.String organizationName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the register of farmerses where inn = &#63;.
    *
    * @param inn the inn
    * @return the matching register of farmerses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.model.RegisterOfFarmers> findByinn(
        java.lang.String inn)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the register of farmerses where inn = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.RegisterOfFarmersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param inn the inn
    * @param start the lower bound of the range of register of farmerses
    * @param end the upper bound of the range of register of farmerses (not inclusive)
    * @return the range of matching register of farmerses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.model.RegisterOfFarmers> findByinn(
        java.lang.String inn, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the register of farmerses where inn = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.RegisterOfFarmersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param inn the inn
    * @param start the lower bound of the range of register of farmerses
    * @param end the upper bound of the range of register of farmerses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching register of farmerses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.model.RegisterOfFarmers> findByinn(
        java.lang.String inn, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first register of farmers in the ordered set where inn = &#63;.
    *
    * @param inn the inn
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching register of farmers
    * @throws com.test.NoSuchRegisterOfFarmersException if a matching register of farmers could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers findByinn_First(
        java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfFarmersException;

    /**
    * Returns the first register of farmers in the ordered set where inn = &#63;.
    *
    * @param inn the inn
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching register of farmers, or <code>null</code> if a matching register of farmers could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers fetchByinn_First(
        java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last register of farmers in the ordered set where inn = &#63;.
    *
    * @param inn the inn
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching register of farmers
    * @throws com.test.NoSuchRegisterOfFarmersException if a matching register of farmers could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers findByinn_Last(
        java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfFarmersException;

    /**
    * Returns the last register of farmers in the ordered set where inn = &#63;.
    *
    * @param inn the inn
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching register of farmers, or <code>null</code> if a matching register of farmers could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers fetchByinn_Last(
        java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the register of farmerses before and after the current register of farmers in the ordered set where inn = &#63;.
    *
    * @param registerOfFarmersId the primary key of the current register of farmers
    * @param inn the inn
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next register of farmers
    * @throws com.test.NoSuchRegisterOfFarmersException if a register of farmers with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers[] findByinn_PrevAndNext(
        long registerOfFarmersId, java.lang.String inn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfFarmersException;

    /**
    * Removes all the register of farmerses where inn = &#63; from the database.
    *
    * @param inn the inn
    * @throws SystemException if a system exception occurred
    */
    public void removeByinn(java.lang.String inn)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of register of farmerses where inn = &#63;.
    *
    * @param inn the inn
    * @return the number of matching register of farmerses
    * @throws SystemException if a system exception occurred
    */
    public int countByinn(java.lang.String inn)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the register of farmerses where registrationArea = &#63;.
    *
    * @param registrationArea the registration area
    * @return the matching register of farmerses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.model.RegisterOfFarmers> findByregistrationArea(
        java.lang.String registrationArea)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the register of farmerses where registrationArea = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.RegisterOfFarmersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param registrationArea the registration area
    * @param start the lower bound of the range of register of farmerses
    * @param end the upper bound of the range of register of farmerses (not inclusive)
    * @return the range of matching register of farmerses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.model.RegisterOfFarmers> findByregistrationArea(
        java.lang.String registrationArea, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the register of farmerses where registrationArea = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.RegisterOfFarmersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param registrationArea the registration area
    * @param start the lower bound of the range of register of farmerses
    * @param end the upper bound of the range of register of farmerses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching register of farmerses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.model.RegisterOfFarmers> findByregistrationArea(
        java.lang.String registrationArea, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first register of farmers in the ordered set where registrationArea = &#63;.
    *
    * @param registrationArea the registration area
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching register of farmers
    * @throws com.test.NoSuchRegisterOfFarmersException if a matching register of farmers could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers findByregistrationArea_First(
        java.lang.String registrationArea,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfFarmersException;

    /**
    * Returns the first register of farmers in the ordered set where registrationArea = &#63;.
    *
    * @param registrationArea the registration area
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching register of farmers, or <code>null</code> if a matching register of farmers could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers fetchByregistrationArea_First(
        java.lang.String registrationArea,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last register of farmers in the ordered set where registrationArea = &#63;.
    *
    * @param registrationArea the registration area
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching register of farmers
    * @throws com.test.NoSuchRegisterOfFarmersException if a matching register of farmers could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers findByregistrationArea_Last(
        java.lang.String registrationArea,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfFarmersException;

    /**
    * Returns the last register of farmers in the ordered set where registrationArea = &#63;.
    *
    * @param registrationArea the registration area
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching register of farmers, or <code>null</code> if a matching register of farmers could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers fetchByregistrationArea_Last(
        java.lang.String registrationArea,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the register of farmerses before and after the current register of farmers in the ordered set where registrationArea = &#63;.
    *
    * @param registerOfFarmersId the primary key of the current register of farmers
    * @param registrationArea the registration area
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next register of farmers
    * @throws com.test.NoSuchRegisterOfFarmersException if a register of farmers with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers[] findByregistrationArea_PrevAndNext(
        long registerOfFarmersId, java.lang.String registrationArea,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfFarmersException;

    /**
    * Removes all the register of farmerses where registrationArea = &#63; from the database.
    *
    * @param registrationArea the registration area
    * @throws SystemException if a system exception occurred
    */
    public void removeByregistrationArea(java.lang.String registrationArea)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of register of farmerses where registrationArea = &#63;.
    *
    * @param registrationArea the registration area
    * @return the number of matching register of farmerses
    * @throws SystemException if a system exception occurred
    */
    public int countByregistrationArea(java.lang.String registrationArea)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the register of farmerses where dateOfRegistration = &#63;.
    *
    * @param dateOfRegistration the date of registration
    * @return the matching register of farmerses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.model.RegisterOfFarmers> findBydateOfRegistration(
        java.util.Date dateOfRegistration)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the register of farmerses where dateOfRegistration = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.RegisterOfFarmersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dateOfRegistration the date of registration
    * @param start the lower bound of the range of register of farmerses
    * @param end the upper bound of the range of register of farmerses (not inclusive)
    * @return the range of matching register of farmerses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.model.RegisterOfFarmers> findBydateOfRegistration(
        java.util.Date dateOfRegistration, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the register of farmerses where dateOfRegistration = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.RegisterOfFarmersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dateOfRegistration the date of registration
    * @param start the lower bound of the range of register of farmerses
    * @param end the upper bound of the range of register of farmerses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching register of farmerses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.model.RegisterOfFarmers> findBydateOfRegistration(
        java.util.Date dateOfRegistration, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first register of farmers in the ordered set where dateOfRegistration = &#63;.
    *
    * @param dateOfRegistration the date of registration
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching register of farmers
    * @throws com.test.NoSuchRegisterOfFarmersException if a matching register of farmers could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers findBydateOfRegistration_First(
        java.util.Date dateOfRegistration,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfFarmersException;

    /**
    * Returns the first register of farmers in the ordered set where dateOfRegistration = &#63;.
    *
    * @param dateOfRegistration the date of registration
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching register of farmers, or <code>null</code> if a matching register of farmers could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers fetchBydateOfRegistration_First(
        java.util.Date dateOfRegistration,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last register of farmers in the ordered set where dateOfRegistration = &#63;.
    *
    * @param dateOfRegistration the date of registration
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching register of farmers
    * @throws com.test.NoSuchRegisterOfFarmersException if a matching register of farmers could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers findBydateOfRegistration_Last(
        java.util.Date dateOfRegistration,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfFarmersException;

    /**
    * Returns the last register of farmers in the ordered set where dateOfRegistration = &#63;.
    *
    * @param dateOfRegistration the date of registration
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching register of farmers, or <code>null</code> if a matching register of farmers could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers fetchBydateOfRegistration_Last(
        java.util.Date dateOfRegistration,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the register of farmerses before and after the current register of farmers in the ordered set where dateOfRegistration = &#63;.
    *
    * @param registerOfFarmersId the primary key of the current register of farmers
    * @param dateOfRegistration the date of registration
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next register of farmers
    * @throws com.test.NoSuchRegisterOfFarmersException if a register of farmers with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers[] findBydateOfRegistration_PrevAndNext(
        long registerOfFarmersId, java.util.Date dateOfRegistration,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfFarmersException;

    /**
    * Removes all the register of farmerses where dateOfRegistration = &#63; from the database.
    *
    * @param dateOfRegistration the date of registration
    * @throws SystemException if a system exception occurred
    */
    public void removeBydateOfRegistration(java.util.Date dateOfRegistration)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of register of farmerses where dateOfRegistration = &#63;.
    *
    * @param dateOfRegistration the date of registration
    * @return the number of matching register of farmerses
    * @throws SystemException if a system exception occurred
    */
    public int countBydateOfRegistration(java.util.Date dateOfRegistration)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the register of farmers in the entity cache if it is enabled.
    *
    * @param registerOfFarmers the register of farmers
    */
    public void cacheResult(com.test.model.RegisterOfFarmers registerOfFarmers);

    /**
    * Caches the register of farmerses in the entity cache if it is enabled.
    *
    * @param registerOfFarmerses the register of farmerses
    */
    public void cacheResult(
        java.util.List<com.test.model.RegisterOfFarmers> registerOfFarmerses);

    /**
    * Creates a new register of farmers with the primary key. Does not add the register of farmers to the database.
    *
    * @param registerOfFarmersId the primary key for the new register of farmers
    * @return the new register of farmers
    */
    public com.test.model.RegisterOfFarmers create(long registerOfFarmersId);

    /**
    * Removes the register of farmers with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param registerOfFarmersId the primary key of the register of farmers
    * @return the register of farmers that was removed
    * @throws com.test.NoSuchRegisterOfFarmersException if a register of farmers with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers remove(long registerOfFarmersId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfFarmersException;

    public com.test.model.RegisterOfFarmers updateImpl(
        com.test.model.RegisterOfFarmers registerOfFarmers)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the register of farmers with the primary key or throws a {@link com.test.NoSuchRegisterOfFarmersException} if it could not be found.
    *
    * @param registerOfFarmersId the primary key of the register of farmers
    * @return the register of farmers
    * @throws com.test.NoSuchRegisterOfFarmersException if a register of farmers with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers findByPrimaryKey(
        long registerOfFarmersId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.test.NoSuchRegisterOfFarmersException;

    /**
    * Returns the register of farmers with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param registerOfFarmersId the primary key of the register of farmers
    * @return the register of farmers, or <code>null</code> if a register of farmers with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.test.model.RegisterOfFarmers fetchByPrimaryKey(
        long registerOfFarmersId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the register of farmerses.
    *
    * @return the register of farmerses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.model.RegisterOfFarmers> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the register of farmerses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.RegisterOfFarmersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of register of farmerses
    * @param end the upper bound of the range of register of farmerses (not inclusive)
    * @return the range of register of farmerses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.model.RegisterOfFarmers> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the register of farmerses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.RegisterOfFarmersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of register of farmerses
    * @param end the upper bound of the range of register of farmerses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of register of farmerses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.test.model.RegisterOfFarmers> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the register of farmerses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of register of farmerses.
    *
    * @return the number of register of farmerses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
