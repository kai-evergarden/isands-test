package com.test.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.CalendarUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.test.NoSuchRegisterOfFarmersException;

import com.test.model.RegisterOfFarmers;
import com.test.model.impl.RegisterOfFarmersImpl;
import com.test.model.impl.RegisterOfFarmersModelImpl;

import com.test.service.persistence.RegisterOfFarmersPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * The persistence implementation for the register of farmers service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegisterOfFarmersPersistence
 * @see RegisterOfFarmersUtil
 * @generated
 */
public class RegisterOfFarmersPersistenceImpl extends BasePersistenceImpl<RegisterOfFarmers>
    implements RegisterOfFarmersPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link RegisterOfFarmersUtil} to access the register of farmers persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = RegisterOfFarmersImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RegisterOfFarmersModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfFarmersModelImpl.FINDER_CACHE_ENABLED,
            RegisterOfFarmersImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RegisterOfFarmersModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfFarmersModelImpl.FINDER_CACHE_ENABLED,
            RegisterOfFarmersImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RegisterOfFarmersModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfFarmersModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ISARCHIVED =
        new FinderPath(RegisterOfFarmersModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfFarmersModelImpl.FINDER_CACHE_ENABLED,
            RegisterOfFarmersImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByisArchived",
            new String[] {
                Boolean.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISARCHIVED =
        new FinderPath(RegisterOfFarmersModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfFarmersModelImpl.FINDER_CACHE_ENABLED,
            RegisterOfFarmersImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByisArchived",
            new String[] { Boolean.class.getName() },
            RegisterOfFarmersModelImpl.ISARCHIVED_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ISARCHIVED = new FinderPath(RegisterOfFarmersModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfFarmersModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByisArchived",
            new String[] { Boolean.class.getName() });
    private static final String _FINDER_COLUMN_ISARCHIVED_ISARCHIVED_2 = "registerOfFarmers.isArchived = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONNAME =
        new FinderPath(RegisterOfFarmersModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfFarmersModelImpl.FINDER_CACHE_ENABLED,
            RegisterOfFarmersImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByorganizationName",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONNAME =
        new FinderPath(RegisterOfFarmersModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfFarmersModelImpl.FINDER_CACHE_ENABLED,
            RegisterOfFarmersImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByorganizationName", new String[] { String.class.getName() },
            RegisterOfFarmersModelImpl.ORGANIZATIONNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ORGANIZATIONNAME = new FinderPath(RegisterOfFarmersModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfFarmersModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByorganizationName", new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_ORGANIZATIONNAME_ORGANIZATIONNAME_1 =
        "registerOfFarmers.organizationName IS NULL";
    private static final String _FINDER_COLUMN_ORGANIZATIONNAME_ORGANIZATIONNAME_2 =
        "registerOfFarmers.organizationName = ?";
    private static final String _FINDER_COLUMN_ORGANIZATIONNAME_ORGANIZATIONNAME_3 =
        "(registerOfFarmers.organizationName IS NULL OR registerOfFarmers.organizationName = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INN = new FinderPath(RegisterOfFarmersModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfFarmersModelImpl.FINDER_CACHE_ENABLED,
            RegisterOfFarmersImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByinn",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INN = new FinderPath(RegisterOfFarmersModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfFarmersModelImpl.FINDER_CACHE_ENABLED,
            RegisterOfFarmersImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByinn",
            new String[] { String.class.getName() },
            RegisterOfFarmersModelImpl.INN_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_INN = new FinderPath(RegisterOfFarmersModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfFarmersModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByinn",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_INN_INN_1 = "registerOfFarmers.inn IS NULL";
    private static final String _FINDER_COLUMN_INN_INN_2 = "registerOfFarmers.inn = ?";
    private static final String _FINDER_COLUMN_INN_INN_3 = "(registerOfFarmers.inn IS NULL OR registerOfFarmers.inn = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REGISTRATIONAREA =
        new FinderPath(RegisterOfFarmersModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfFarmersModelImpl.FINDER_CACHE_ENABLED,
            RegisterOfFarmersImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByregistrationArea",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTRATIONAREA =
        new FinderPath(RegisterOfFarmersModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfFarmersModelImpl.FINDER_CACHE_ENABLED,
            RegisterOfFarmersImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByregistrationArea", new String[] { String.class.getName() },
            RegisterOfFarmersModelImpl.REGISTRATIONAREA_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_REGISTRATIONAREA = new FinderPath(RegisterOfFarmersModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfFarmersModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByregistrationArea", new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_REGISTRATIONAREA_REGISTRATIONAREA_1 =
        "registerOfFarmers.registrationArea IS NULL";
    private static final String _FINDER_COLUMN_REGISTRATIONAREA_REGISTRATIONAREA_2 =
        "registerOfFarmers.registrationArea = ?";
    private static final String _FINDER_COLUMN_REGISTRATIONAREA_REGISTRATIONAREA_3 =
        "(registerOfFarmers.registrationArea IS NULL OR registerOfFarmers.registrationArea = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DATEOFREGISTRATION =
        new FinderPath(RegisterOfFarmersModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfFarmersModelImpl.FINDER_CACHE_ENABLED,
            RegisterOfFarmersImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBydateOfRegistration",
            new String[] {
                Date.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATEOFREGISTRATION =
        new FinderPath(RegisterOfFarmersModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfFarmersModelImpl.FINDER_CACHE_ENABLED,
            RegisterOfFarmersImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findBydateOfRegistration", new String[] { Date.class.getName() },
            RegisterOfFarmersModelImpl.DATEOFREGISTRATION_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_DATEOFREGISTRATION = new FinderPath(RegisterOfFarmersModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfFarmersModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countBydateOfRegistration", new String[] { Date.class.getName() });
    private static final String _FINDER_COLUMN_DATEOFREGISTRATION_DATEOFREGISTRATION_1 =
        "registerOfFarmers.dateOfRegistration IS NULL";
    private static final String _FINDER_COLUMN_DATEOFREGISTRATION_DATEOFREGISTRATION_2 =
        "registerOfFarmers.dateOfRegistration = ?";
    private static final String _SQL_SELECT_REGISTEROFFARMERS = "SELECT registerOfFarmers FROM RegisterOfFarmers registerOfFarmers";
    private static final String _SQL_SELECT_REGISTEROFFARMERS_WHERE = "SELECT registerOfFarmers FROM RegisterOfFarmers registerOfFarmers WHERE ";
    private static final String _SQL_COUNT_REGISTEROFFARMERS = "SELECT COUNT(registerOfFarmers) FROM RegisterOfFarmers registerOfFarmers";
    private static final String _SQL_COUNT_REGISTEROFFARMERS_WHERE = "SELECT COUNT(registerOfFarmers) FROM RegisterOfFarmers registerOfFarmers WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "registerOfFarmers.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RegisterOfFarmers exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No RegisterOfFarmers exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(RegisterOfFarmersPersistenceImpl.class);
    private static RegisterOfFarmers _nullRegisterOfFarmers = new RegisterOfFarmersImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<RegisterOfFarmers> toCacheModel() {
                return _nullRegisterOfFarmersCacheModel;
            }
        };

    private static CacheModel<RegisterOfFarmers> _nullRegisterOfFarmersCacheModel =
        new CacheModel<RegisterOfFarmers>() {
            @Override
            public RegisterOfFarmers toEntityModel() {
                return _nullRegisterOfFarmers;
            }
        };

    public RegisterOfFarmersPersistenceImpl() {
        setModelClass(RegisterOfFarmers.class);
    }

    /**
     * Returns all the register of farmerses where isArchived = &#63;.
     *
     * @param isArchived the is archived
     * @return the matching register of farmerses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RegisterOfFarmers> findByisArchived(boolean isArchived)
        throws SystemException {
        return findByisArchived(isArchived, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<RegisterOfFarmers> findByisArchived(boolean isArchived,
        int start, int end) throws SystemException {
        return findByisArchived(isArchived, start, end, null);
    }

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
    @Override
    public List<RegisterOfFarmers> findByisArchived(boolean isArchived,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISARCHIVED;
            finderArgs = new Object[] { isArchived };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ISARCHIVED;
            finderArgs = new Object[] { isArchived, start, end, orderByComparator };
        }

        List<RegisterOfFarmers> list = (List<RegisterOfFarmers>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (RegisterOfFarmers registerOfFarmers : list) {
                if ((isArchived != registerOfFarmers.getIsArchived())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_REGISTEROFFARMERS_WHERE);

            query.append(_FINDER_COLUMN_ISARCHIVED_ISARCHIVED_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RegisterOfFarmersModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(isArchived);

                if (!pagination) {
                    list = (List<RegisterOfFarmers>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<RegisterOfFarmers>(list);
                } else {
                    list = (List<RegisterOfFarmers>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first register of farmers in the ordered set where isArchived = &#63;.
     *
     * @param isArchived the is archived
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching register of farmers
     * @throws com.test.NoSuchRegisterOfFarmersException if a matching register of farmers could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfFarmers findByisArchived_First(boolean isArchived,
        OrderByComparator orderByComparator)
        throws NoSuchRegisterOfFarmersException, SystemException {
        RegisterOfFarmers registerOfFarmers = fetchByisArchived_First(isArchived,
                orderByComparator);

        if (registerOfFarmers != null) {
            return registerOfFarmers;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("isArchived=");
        msg.append(isArchived);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRegisterOfFarmersException(msg.toString());
    }

    /**
     * Returns the first register of farmers in the ordered set where isArchived = &#63;.
     *
     * @param isArchived the is archived
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching register of farmers, or <code>null</code> if a matching register of farmers could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfFarmers fetchByisArchived_First(boolean isArchived,
        OrderByComparator orderByComparator) throws SystemException {
        List<RegisterOfFarmers> list = findByisArchived(isArchived, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last register of farmers in the ordered set where isArchived = &#63;.
     *
     * @param isArchived the is archived
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching register of farmers
     * @throws com.test.NoSuchRegisterOfFarmersException if a matching register of farmers could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfFarmers findByisArchived_Last(boolean isArchived,
        OrderByComparator orderByComparator)
        throws NoSuchRegisterOfFarmersException, SystemException {
        RegisterOfFarmers registerOfFarmers = fetchByisArchived_Last(isArchived,
                orderByComparator);

        if (registerOfFarmers != null) {
            return registerOfFarmers;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("isArchived=");
        msg.append(isArchived);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRegisterOfFarmersException(msg.toString());
    }

    /**
     * Returns the last register of farmers in the ordered set where isArchived = &#63;.
     *
     * @param isArchived the is archived
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching register of farmers, or <code>null</code> if a matching register of farmers could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfFarmers fetchByisArchived_Last(boolean isArchived,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByisArchived(isArchived);

        if (count == 0) {
            return null;
        }

        List<RegisterOfFarmers> list = findByisArchived(isArchived, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public RegisterOfFarmers[] findByisArchived_PrevAndNext(
        long registerOfFarmersId, boolean isArchived,
        OrderByComparator orderByComparator)
        throws NoSuchRegisterOfFarmersException, SystemException {
        RegisterOfFarmers registerOfFarmers = findByPrimaryKey(registerOfFarmersId);

        Session session = null;

        try {
            session = openSession();

            RegisterOfFarmers[] array = new RegisterOfFarmersImpl[3];

            array[0] = getByisArchived_PrevAndNext(session, registerOfFarmers,
                    isArchived, orderByComparator, true);

            array[1] = registerOfFarmers;

            array[2] = getByisArchived_PrevAndNext(session, registerOfFarmers,
                    isArchived, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected RegisterOfFarmers getByisArchived_PrevAndNext(Session session,
        RegisterOfFarmers registerOfFarmers, boolean isArchived,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_REGISTEROFFARMERS_WHERE);

        query.append(_FINDER_COLUMN_ISARCHIVED_ISARCHIVED_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(RegisterOfFarmersModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(isArchived);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(registerOfFarmers);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<RegisterOfFarmers> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the register of farmerses where isArchived = &#63; from the database.
     *
     * @param isArchived the is archived
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByisArchived(boolean isArchived)
        throws SystemException {
        for (RegisterOfFarmers registerOfFarmers : findByisArchived(
                isArchived, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(registerOfFarmers);
        }
    }

    /**
     * Returns the number of register of farmerses where isArchived = &#63;.
     *
     * @param isArchived the is archived
     * @return the number of matching register of farmerses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByisArchived(boolean isArchived) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ISARCHIVED;

        Object[] finderArgs = new Object[] { isArchived };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_REGISTEROFFARMERS_WHERE);

            query.append(_FINDER_COLUMN_ISARCHIVED_ISARCHIVED_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(isArchived);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the register of farmerses where organizationName = &#63;.
     *
     * @param organizationName the organization name
     * @return the matching register of farmerses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RegisterOfFarmers> findByorganizationName(
        String organizationName) throws SystemException {
        return findByorganizationName(organizationName, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<RegisterOfFarmers> findByorganizationName(
        String organizationName, int start, int end) throws SystemException {
        return findByorganizationName(organizationName, start, end, null);
    }

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
    @Override
    public List<RegisterOfFarmers> findByorganizationName(
        String organizationName, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONNAME;
            finderArgs = new Object[] { organizationName };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONNAME;
            finderArgs = new Object[] {
                    organizationName,
                    
                    start, end, orderByComparator
                };
        }

        List<RegisterOfFarmers> list = (List<RegisterOfFarmers>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (RegisterOfFarmers registerOfFarmers : list) {
                if (!Validator.equals(organizationName,
                            registerOfFarmers.getOrganizationName())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_REGISTEROFFARMERS_WHERE);

            boolean bindOrganizationName = false;

            if (organizationName == null) {
                query.append(_FINDER_COLUMN_ORGANIZATIONNAME_ORGANIZATIONNAME_1);
            } else if (organizationName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_ORGANIZATIONNAME_ORGANIZATIONNAME_3);
            } else {
                bindOrganizationName = true;

                query.append(_FINDER_COLUMN_ORGANIZATIONNAME_ORGANIZATIONNAME_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RegisterOfFarmersModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindOrganizationName) {
                    qPos.add(organizationName);
                }

                if (!pagination) {
                    list = (List<RegisterOfFarmers>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<RegisterOfFarmers>(list);
                } else {
                    list = (List<RegisterOfFarmers>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first register of farmers in the ordered set where organizationName = &#63;.
     *
     * @param organizationName the organization name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching register of farmers
     * @throws com.test.NoSuchRegisterOfFarmersException if a matching register of farmers could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfFarmers findByorganizationName_First(
        String organizationName, OrderByComparator orderByComparator)
        throws NoSuchRegisterOfFarmersException, SystemException {
        RegisterOfFarmers registerOfFarmers = fetchByorganizationName_First(organizationName,
                orderByComparator);

        if (registerOfFarmers != null) {
            return registerOfFarmers;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("organizationName=");
        msg.append(organizationName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRegisterOfFarmersException(msg.toString());
    }

    /**
     * Returns the first register of farmers in the ordered set where organizationName = &#63;.
     *
     * @param organizationName the organization name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching register of farmers, or <code>null</code> if a matching register of farmers could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfFarmers fetchByorganizationName_First(
        String organizationName, OrderByComparator orderByComparator)
        throws SystemException {
        List<RegisterOfFarmers> list = findByorganizationName(organizationName,
                0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last register of farmers in the ordered set where organizationName = &#63;.
     *
     * @param organizationName the organization name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching register of farmers
     * @throws com.test.NoSuchRegisterOfFarmersException if a matching register of farmers could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfFarmers findByorganizationName_Last(
        String organizationName, OrderByComparator orderByComparator)
        throws NoSuchRegisterOfFarmersException, SystemException {
        RegisterOfFarmers registerOfFarmers = fetchByorganizationName_Last(organizationName,
                orderByComparator);

        if (registerOfFarmers != null) {
            return registerOfFarmers;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("organizationName=");
        msg.append(organizationName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRegisterOfFarmersException(msg.toString());
    }

    /**
     * Returns the last register of farmers in the ordered set where organizationName = &#63;.
     *
     * @param organizationName the organization name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching register of farmers, or <code>null</code> if a matching register of farmers could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfFarmers fetchByorganizationName_Last(
        String organizationName, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByorganizationName(organizationName);

        if (count == 0) {
            return null;
        }

        List<RegisterOfFarmers> list = findByorganizationName(organizationName,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public RegisterOfFarmers[] findByorganizationName_PrevAndNext(
        long registerOfFarmersId, String organizationName,
        OrderByComparator orderByComparator)
        throws NoSuchRegisterOfFarmersException, SystemException {
        RegisterOfFarmers registerOfFarmers = findByPrimaryKey(registerOfFarmersId);

        Session session = null;

        try {
            session = openSession();

            RegisterOfFarmers[] array = new RegisterOfFarmersImpl[3];

            array[0] = getByorganizationName_PrevAndNext(session,
                    registerOfFarmers, organizationName, orderByComparator, true);

            array[1] = registerOfFarmers;

            array[2] = getByorganizationName_PrevAndNext(session,
                    registerOfFarmers, organizationName, orderByComparator,
                    false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected RegisterOfFarmers getByorganizationName_PrevAndNext(
        Session session, RegisterOfFarmers registerOfFarmers,
        String organizationName, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_REGISTEROFFARMERS_WHERE);

        boolean bindOrganizationName = false;

        if (organizationName == null) {
            query.append(_FINDER_COLUMN_ORGANIZATIONNAME_ORGANIZATIONNAME_1);
        } else if (organizationName.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_ORGANIZATIONNAME_ORGANIZATIONNAME_3);
        } else {
            bindOrganizationName = true;

            query.append(_FINDER_COLUMN_ORGANIZATIONNAME_ORGANIZATIONNAME_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(RegisterOfFarmersModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindOrganizationName) {
            qPos.add(organizationName);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(registerOfFarmers);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<RegisterOfFarmers> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the register of farmerses where organizationName = &#63; from the database.
     *
     * @param organizationName the organization name
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByorganizationName(String organizationName)
        throws SystemException {
        for (RegisterOfFarmers registerOfFarmers : findByorganizationName(
                organizationName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(registerOfFarmers);
        }
    }

    /**
     * Returns the number of register of farmerses where organizationName = &#63;.
     *
     * @param organizationName the organization name
     * @return the number of matching register of farmerses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByorganizationName(String organizationName)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ORGANIZATIONNAME;

        Object[] finderArgs = new Object[] { organizationName };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_REGISTEROFFARMERS_WHERE);

            boolean bindOrganizationName = false;

            if (organizationName == null) {
                query.append(_FINDER_COLUMN_ORGANIZATIONNAME_ORGANIZATIONNAME_1);
            } else if (organizationName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_ORGANIZATIONNAME_ORGANIZATIONNAME_3);
            } else {
                bindOrganizationName = true;

                query.append(_FINDER_COLUMN_ORGANIZATIONNAME_ORGANIZATIONNAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindOrganizationName) {
                    qPos.add(organizationName);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the register of farmerses where inn = &#63;.
     *
     * @param inn the inn
     * @return the matching register of farmerses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RegisterOfFarmers> findByinn(String inn)
        throws SystemException {
        return findByinn(inn, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<RegisterOfFarmers> findByinn(String inn, int start, int end)
        throws SystemException {
        return findByinn(inn, start, end, null);
    }

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
    @Override
    public List<RegisterOfFarmers> findByinn(String inn, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INN;
            finderArgs = new Object[] { inn };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INN;
            finderArgs = new Object[] { inn, start, end, orderByComparator };
        }

        List<RegisterOfFarmers> list = (List<RegisterOfFarmers>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (RegisterOfFarmers registerOfFarmers : list) {
                if (!Validator.equals(inn, registerOfFarmers.getInn())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_REGISTEROFFARMERS_WHERE);

            boolean bindInn = false;

            if (inn == null) {
                query.append(_FINDER_COLUMN_INN_INN_1);
            } else if (inn.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_INN_INN_3);
            } else {
                bindInn = true;

                query.append(_FINDER_COLUMN_INN_INN_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RegisterOfFarmersModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindInn) {
                    qPos.add(inn);
                }

                if (!pagination) {
                    list = (List<RegisterOfFarmers>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<RegisterOfFarmers>(list);
                } else {
                    list = (List<RegisterOfFarmers>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first register of farmers in the ordered set where inn = &#63;.
     *
     * @param inn the inn
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching register of farmers
     * @throws com.test.NoSuchRegisterOfFarmersException if a matching register of farmers could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfFarmers findByinn_First(String inn,
        OrderByComparator orderByComparator)
        throws NoSuchRegisterOfFarmersException, SystemException {
        RegisterOfFarmers registerOfFarmers = fetchByinn_First(inn,
                orderByComparator);

        if (registerOfFarmers != null) {
            return registerOfFarmers;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("inn=");
        msg.append(inn);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRegisterOfFarmersException(msg.toString());
    }

    /**
     * Returns the first register of farmers in the ordered set where inn = &#63;.
     *
     * @param inn the inn
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching register of farmers, or <code>null</code> if a matching register of farmers could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfFarmers fetchByinn_First(String inn,
        OrderByComparator orderByComparator) throws SystemException {
        List<RegisterOfFarmers> list = findByinn(inn, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last register of farmers in the ordered set where inn = &#63;.
     *
     * @param inn the inn
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching register of farmers
     * @throws com.test.NoSuchRegisterOfFarmersException if a matching register of farmers could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfFarmers findByinn_Last(String inn,
        OrderByComparator orderByComparator)
        throws NoSuchRegisterOfFarmersException, SystemException {
        RegisterOfFarmers registerOfFarmers = fetchByinn_Last(inn,
                orderByComparator);

        if (registerOfFarmers != null) {
            return registerOfFarmers;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("inn=");
        msg.append(inn);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRegisterOfFarmersException(msg.toString());
    }

    /**
     * Returns the last register of farmers in the ordered set where inn = &#63;.
     *
     * @param inn the inn
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching register of farmers, or <code>null</code> if a matching register of farmers could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfFarmers fetchByinn_Last(String inn,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByinn(inn);

        if (count == 0) {
            return null;
        }

        List<RegisterOfFarmers> list = findByinn(inn, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public RegisterOfFarmers[] findByinn_PrevAndNext(long registerOfFarmersId,
        String inn, OrderByComparator orderByComparator)
        throws NoSuchRegisterOfFarmersException, SystemException {
        RegisterOfFarmers registerOfFarmers = findByPrimaryKey(registerOfFarmersId);

        Session session = null;

        try {
            session = openSession();

            RegisterOfFarmers[] array = new RegisterOfFarmersImpl[3];

            array[0] = getByinn_PrevAndNext(session, registerOfFarmers, inn,
                    orderByComparator, true);

            array[1] = registerOfFarmers;

            array[2] = getByinn_PrevAndNext(session, registerOfFarmers, inn,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected RegisterOfFarmers getByinn_PrevAndNext(Session session,
        RegisterOfFarmers registerOfFarmers, String inn,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_REGISTEROFFARMERS_WHERE);

        boolean bindInn = false;

        if (inn == null) {
            query.append(_FINDER_COLUMN_INN_INN_1);
        } else if (inn.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_INN_INN_3);
        } else {
            bindInn = true;

            query.append(_FINDER_COLUMN_INN_INN_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(RegisterOfFarmersModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindInn) {
            qPos.add(inn);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(registerOfFarmers);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<RegisterOfFarmers> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the register of farmerses where inn = &#63; from the database.
     *
     * @param inn the inn
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByinn(String inn) throws SystemException {
        for (RegisterOfFarmers registerOfFarmers : findByinn(inn,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(registerOfFarmers);
        }
    }

    /**
     * Returns the number of register of farmerses where inn = &#63;.
     *
     * @param inn the inn
     * @return the number of matching register of farmerses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByinn(String inn) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_INN;

        Object[] finderArgs = new Object[] { inn };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_REGISTEROFFARMERS_WHERE);

            boolean bindInn = false;

            if (inn == null) {
                query.append(_FINDER_COLUMN_INN_INN_1);
            } else if (inn.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_INN_INN_3);
            } else {
                bindInn = true;

                query.append(_FINDER_COLUMN_INN_INN_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindInn) {
                    qPos.add(inn);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the register of farmerses where registrationArea = &#63;.
     *
     * @param registrationArea the registration area
     * @return the matching register of farmerses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RegisterOfFarmers> findByregistrationArea(
        String registrationArea) throws SystemException {
        return findByregistrationArea(registrationArea, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<RegisterOfFarmers> findByregistrationArea(
        String registrationArea, int start, int end) throws SystemException {
        return findByregistrationArea(registrationArea, start, end, null);
    }

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
    @Override
    public List<RegisterOfFarmers> findByregistrationArea(
        String registrationArea, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTRATIONAREA;
            finderArgs = new Object[] { registrationArea };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REGISTRATIONAREA;
            finderArgs = new Object[] {
                    registrationArea,
                    
                    start, end, orderByComparator
                };
        }

        List<RegisterOfFarmers> list = (List<RegisterOfFarmers>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (RegisterOfFarmers registerOfFarmers : list) {
                if (!Validator.equals(registrationArea,
                            registerOfFarmers.getRegistrationArea())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_REGISTEROFFARMERS_WHERE);

            boolean bindRegistrationArea = false;

            if (registrationArea == null) {
                query.append(_FINDER_COLUMN_REGISTRATIONAREA_REGISTRATIONAREA_1);
            } else if (registrationArea.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_REGISTRATIONAREA_REGISTRATIONAREA_3);
            } else {
                bindRegistrationArea = true;

                query.append(_FINDER_COLUMN_REGISTRATIONAREA_REGISTRATIONAREA_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RegisterOfFarmersModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindRegistrationArea) {
                    qPos.add(registrationArea);
                }

                if (!pagination) {
                    list = (List<RegisterOfFarmers>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<RegisterOfFarmers>(list);
                } else {
                    list = (List<RegisterOfFarmers>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first register of farmers in the ordered set where registrationArea = &#63;.
     *
     * @param registrationArea the registration area
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching register of farmers
     * @throws com.test.NoSuchRegisterOfFarmersException if a matching register of farmers could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfFarmers findByregistrationArea_First(
        String registrationArea, OrderByComparator orderByComparator)
        throws NoSuchRegisterOfFarmersException, SystemException {
        RegisterOfFarmers registerOfFarmers = fetchByregistrationArea_First(registrationArea,
                orderByComparator);

        if (registerOfFarmers != null) {
            return registerOfFarmers;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("registrationArea=");
        msg.append(registrationArea);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRegisterOfFarmersException(msg.toString());
    }

    /**
     * Returns the first register of farmers in the ordered set where registrationArea = &#63;.
     *
     * @param registrationArea the registration area
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching register of farmers, or <code>null</code> if a matching register of farmers could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfFarmers fetchByregistrationArea_First(
        String registrationArea, OrderByComparator orderByComparator)
        throws SystemException {
        List<RegisterOfFarmers> list = findByregistrationArea(registrationArea,
                0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last register of farmers in the ordered set where registrationArea = &#63;.
     *
     * @param registrationArea the registration area
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching register of farmers
     * @throws com.test.NoSuchRegisterOfFarmersException if a matching register of farmers could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfFarmers findByregistrationArea_Last(
        String registrationArea, OrderByComparator orderByComparator)
        throws NoSuchRegisterOfFarmersException, SystemException {
        RegisterOfFarmers registerOfFarmers = fetchByregistrationArea_Last(registrationArea,
                orderByComparator);

        if (registerOfFarmers != null) {
            return registerOfFarmers;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("registrationArea=");
        msg.append(registrationArea);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRegisterOfFarmersException(msg.toString());
    }

    /**
     * Returns the last register of farmers in the ordered set where registrationArea = &#63;.
     *
     * @param registrationArea the registration area
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching register of farmers, or <code>null</code> if a matching register of farmers could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfFarmers fetchByregistrationArea_Last(
        String registrationArea, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByregistrationArea(registrationArea);

        if (count == 0) {
            return null;
        }

        List<RegisterOfFarmers> list = findByregistrationArea(registrationArea,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public RegisterOfFarmers[] findByregistrationArea_PrevAndNext(
        long registerOfFarmersId, String registrationArea,
        OrderByComparator orderByComparator)
        throws NoSuchRegisterOfFarmersException, SystemException {
        RegisterOfFarmers registerOfFarmers = findByPrimaryKey(registerOfFarmersId);

        Session session = null;

        try {
            session = openSession();

            RegisterOfFarmers[] array = new RegisterOfFarmersImpl[3];

            array[0] = getByregistrationArea_PrevAndNext(session,
                    registerOfFarmers, registrationArea, orderByComparator, true);

            array[1] = registerOfFarmers;

            array[2] = getByregistrationArea_PrevAndNext(session,
                    registerOfFarmers, registrationArea, orderByComparator,
                    false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected RegisterOfFarmers getByregistrationArea_PrevAndNext(
        Session session, RegisterOfFarmers registerOfFarmers,
        String registrationArea, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_REGISTEROFFARMERS_WHERE);

        boolean bindRegistrationArea = false;

        if (registrationArea == null) {
            query.append(_FINDER_COLUMN_REGISTRATIONAREA_REGISTRATIONAREA_1);
        } else if (registrationArea.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_REGISTRATIONAREA_REGISTRATIONAREA_3);
        } else {
            bindRegistrationArea = true;

            query.append(_FINDER_COLUMN_REGISTRATIONAREA_REGISTRATIONAREA_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(RegisterOfFarmersModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindRegistrationArea) {
            qPos.add(registrationArea);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(registerOfFarmers);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<RegisterOfFarmers> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the register of farmerses where registrationArea = &#63; from the database.
     *
     * @param registrationArea the registration area
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByregistrationArea(String registrationArea)
        throws SystemException {
        for (RegisterOfFarmers registerOfFarmers : findByregistrationArea(
                registrationArea, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(registerOfFarmers);
        }
    }

    /**
     * Returns the number of register of farmerses where registrationArea = &#63;.
     *
     * @param registrationArea the registration area
     * @return the number of matching register of farmerses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByregistrationArea(String registrationArea)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_REGISTRATIONAREA;

        Object[] finderArgs = new Object[] { registrationArea };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_REGISTEROFFARMERS_WHERE);

            boolean bindRegistrationArea = false;

            if (registrationArea == null) {
                query.append(_FINDER_COLUMN_REGISTRATIONAREA_REGISTRATIONAREA_1);
            } else if (registrationArea.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_REGISTRATIONAREA_REGISTRATIONAREA_3);
            } else {
                bindRegistrationArea = true;

                query.append(_FINDER_COLUMN_REGISTRATIONAREA_REGISTRATIONAREA_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindRegistrationArea) {
                    qPos.add(registrationArea);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the register of farmerses where dateOfRegistration = &#63;.
     *
     * @param dateOfRegistration the date of registration
     * @return the matching register of farmerses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RegisterOfFarmers> findBydateOfRegistration(
        Date dateOfRegistration) throws SystemException {
        return findBydateOfRegistration(dateOfRegistration, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<RegisterOfFarmers> findBydateOfRegistration(
        Date dateOfRegistration, int start, int end) throws SystemException {
        return findBydateOfRegistration(dateOfRegistration, start, end, null);
    }

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
    @Override
    public List<RegisterOfFarmers> findBydateOfRegistration(
        Date dateOfRegistration, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATEOFREGISTRATION;
            finderArgs = new Object[] { dateOfRegistration };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DATEOFREGISTRATION;
            finderArgs = new Object[] {
                    dateOfRegistration,
                    
                    start, end, orderByComparator
                };
        }

        List<RegisterOfFarmers> list = (List<RegisterOfFarmers>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (RegisterOfFarmers registerOfFarmers : list) {
                if (!Validator.equals(dateOfRegistration,
                            registerOfFarmers.getDateOfRegistration())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_REGISTEROFFARMERS_WHERE);

            boolean bindDateOfRegistration = false;

            if (dateOfRegistration == null) {
                query.append(_FINDER_COLUMN_DATEOFREGISTRATION_DATEOFREGISTRATION_1);
            } else {
                bindDateOfRegistration = true;

                query.append(_FINDER_COLUMN_DATEOFREGISTRATION_DATEOFREGISTRATION_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RegisterOfFarmersModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindDateOfRegistration) {
                    qPos.add(CalendarUtil.getTimestamp(dateOfRegistration));
                }

                if (!pagination) {
                    list = (List<RegisterOfFarmers>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<RegisterOfFarmers>(list);
                } else {
                    list = (List<RegisterOfFarmers>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first register of farmers in the ordered set where dateOfRegistration = &#63;.
     *
     * @param dateOfRegistration the date of registration
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching register of farmers
     * @throws com.test.NoSuchRegisterOfFarmersException if a matching register of farmers could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfFarmers findBydateOfRegistration_First(
        Date dateOfRegistration, OrderByComparator orderByComparator)
        throws NoSuchRegisterOfFarmersException, SystemException {
        RegisterOfFarmers registerOfFarmers = fetchBydateOfRegistration_First(dateOfRegistration,
                orderByComparator);

        if (registerOfFarmers != null) {
            return registerOfFarmers;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("dateOfRegistration=");
        msg.append(dateOfRegistration);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRegisterOfFarmersException(msg.toString());
    }

    /**
     * Returns the first register of farmers in the ordered set where dateOfRegistration = &#63;.
     *
     * @param dateOfRegistration the date of registration
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching register of farmers, or <code>null</code> if a matching register of farmers could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfFarmers fetchBydateOfRegistration_First(
        Date dateOfRegistration, OrderByComparator orderByComparator)
        throws SystemException {
        List<RegisterOfFarmers> list = findBydateOfRegistration(dateOfRegistration,
                0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last register of farmers in the ordered set where dateOfRegistration = &#63;.
     *
     * @param dateOfRegistration the date of registration
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching register of farmers
     * @throws com.test.NoSuchRegisterOfFarmersException if a matching register of farmers could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfFarmers findBydateOfRegistration_Last(
        Date dateOfRegistration, OrderByComparator orderByComparator)
        throws NoSuchRegisterOfFarmersException, SystemException {
        RegisterOfFarmers registerOfFarmers = fetchBydateOfRegistration_Last(dateOfRegistration,
                orderByComparator);

        if (registerOfFarmers != null) {
            return registerOfFarmers;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("dateOfRegistration=");
        msg.append(dateOfRegistration);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRegisterOfFarmersException(msg.toString());
    }

    /**
     * Returns the last register of farmers in the ordered set where dateOfRegistration = &#63;.
     *
     * @param dateOfRegistration the date of registration
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching register of farmers, or <code>null</code> if a matching register of farmers could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfFarmers fetchBydateOfRegistration_Last(
        Date dateOfRegistration, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countBydateOfRegistration(dateOfRegistration);

        if (count == 0) {
            return null;
        }

        List<RegisterOfFarmers> list = findBydateOfRegistration(dateOfRegistration,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public RegisterOfFarmers[] findBydateOfRegistration_PrevAndNext(
        long registerOfFarmersId, Date dateOfRegistration,
        OrderByComparator orderByComparator)
        throws NoSuchRegisterOfFarmersException, SystemException {
        RegisterOfFarmers registerOfFarmers = findByPrimaryKey(registerOfFarmersId);

        Session session = null;

        try {
            session = openSession();

            RegisterOfFarmers[] array = new RegisterOfFarmersImpl[3];

            array[0] = getBydateOfRegistration_PrevAndNext(session,
                    registerOfFarmers, dateOfRegistration, orderByComparator,
                    true);

            array[1] = registerOfFarmers;

            array[2] = getBydateOfRegistration_PrevAndNext(session,
                    registerOfFarmers, dateOfRegistration, orderByComparator,
                    false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected RegisterOfFarmers getBydateOfRegistration_PrevAndNext(
        Session session, RegisterOfFarmers registerOfFarmers,
        Date dateOfRegistration, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_REGISTEROFFARMERS_WHERE);

        boolean bindDateOfRegistration = false;

        if (dateOfRegistration == null) {
            query.append(_FINDER_COLUMN_DATEOFREGISTRATION_DATEOFREGISTRATION_1);
        } else {
            bindDateOfRegistration = true;

            query.append(_FINDER_COLUMN_DATEOFREGISTRATION_DATEOFREGISTRATION_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(RegisterOfFarmersModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindDateOfRegistration) {
            qPos.add(CalendarUtil.getTimestamp(dateOfRegistration));
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(registerOfFarmers);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<RegisterOfFarmers> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the register of farmerses where dateOfRegistration = &#63; from the database.
     *
     * @param dateOfRegistration the date of registration
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeBydateOfRegistration(Date dateOfRegistration)
        throws SystemException {
        for (RegisterOfFarmers registerOfFarmers : findBydateOfRegistration(
                dateOfRegistration, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(registerOfFarmers);
        }
    }

    /**
     * Returns the number of register of farmerses where dateOfRegistration = &#63;.
     *
     * @param dateOfRegistration the date of registration
     * @return the number of matching register of farmerses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countBydateOfRegistration(Date dateOfRegistration)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_DATEOFREGISTRATION;

        Object[] finderArgs = new Object[] { dateOfRegistration };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_REGISTEROFFARMERS_WHERE);

            boolean bindDateOfRegistration = false;

            if (dateOfRegistration == null) {
                query.append(_FINDER_COLUMN_DATEOFREGISTRATION_DATEOFREGISTRATION_1);
            } else {
                bindDateOfRegistration = true;

                query.append(_FINDER_COLUMN_DATEOFREGISTRATION_DATEOFREGISTRATION_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindDateOfRegistration) {
                    qPos.add(CalendarUtil.getTimestamp(dateOfRegistration));
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the register of farmers in the entity cache if it is enabled.
     *
     * @param registerOfFarmers the register of farmers
     */
    @Override
    public void cacheResult(RegisterOfFarmers registerOfFarmers) {
        EntityCacheUtil.putResult(RegisterOfFarmersModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfFarmersImpl.class, registerOfFarmers.getPrimaryKey(),
            registerOfFarmers);

        registerOfFarmers.resetOriginalValues();
    }

    /**
     * Caches the register of farmerses in the entity cache if it is enabled.
     *
     * @param registerOfFarmerses the register of farmerses
     */
    @Override
    public void cacheResult(List<RegisterOfFarmers> registerOfFarmerses) {
        for (RegisterOfFarmers registerOfFarmers : registerOfFarmerses) {
            if (EntityCacheUtil.getResult(
                        RegisterOfFarmersModelImpl.ENTITY_CACHE_ENABLED,
                        RegisterOfFarmersImpl.class,
                        registerOfFarmers.getPrimaryKey()) == null) {
                cacheResult(registerOfFarmers);
            } else {
                registerOfFarmers.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all register of farmerses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(RegisterOfFarmersImpl.class.getName());
        }

        EntityCacheUtil.clearCache(RegisterOfFarmersImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the register of farmers.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(RegisterOfFarmers registerOfFarmers) {
        EntityCacheUtil.removeResult(RegisterOfFarmersModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfFarmersImpl.class, registerOfFarmers.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<RegisterOfFarmers> registerOfFarmerses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (RegisterOfFarmers registerOfFarmers : registerOfFarmerses) {
            EntityCacheUtil.removeResult(RegisterOfFarmersModelImpl.ENTITY_CACHE_ENABLED,
                RegisterOfFarmersImpl.class, registerOfFarmers.getPrimaryKey());
        }
    }

    /**
     * Creates a new register of farmers with the primary key. Does not add the register of farmers to the database.
     *
     * @param registerOfFarmersId the primary key for the new register of farmers
     * @return the new register of farmers
     */
    @Override
    public RegisterOfFarmers create(long registerOfFarmersId) {
        RegisterOfFarmers registerOfFarmers = new RegisterOfFarmersImpl();

        registerOfFarmers.setNew(true);
        registerOfFarmers.setPrimaryKey(registerOfFarmersId);

        return registerOfFarmers;
    }

    /**
     * Removes the register of farmers with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param registerOfFarmersId the primary key of the register of farmers
     * @return the register of farmers that was removed
     * @throws com.test.NoSuchRegisterOfFarmersException if a register of farmers with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfFarmers remove(long registerOfFarmersId)
        throws NoSuchRegisterOfFarmersException, SystemException {
        return remove((Serializable) registerOfFarmersId);
    }

    /**
     * Removes the register of farmers with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the register of farmers
     * @return the register of farmers that was removed
     * @throws com.test.NoSuchRegisterOfFarmersException if a register of farmers with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfFarmers remove(Serializable primaryKey)
        throws NoSuchRegisterOfFarmersException, SystemException {
        Session session = null;

        try {
            session = openSession();

            RegisterOfFarmers registerOfFarmers = (RegisterOfFarmers) session.get(RegisterOfFarmersImpl.class,
                    primaryKey);

            if (registerOfFarmers == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchRegisterOfFarmersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(registerOfFarmers);
        } catch (NoSuchRegisterOfFarmersException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected RegisterOfFarmers removeImpl(RegisterOfFarmers registerOfFarmers)
        throws SystemException {
        registerOfFarmers = toUnwrappedModel(registerOfFarmers);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(registerOfFarmers)) {
                registerOfFarmers = (RegisterOfFarmers) session.get(RegisterOfFarmersImpl.class,
                        registerOfFarmers.getPrimaryKeyObj());
            }

            if (registerOfFarmers != null) {
                session.delete(registerOfFarmers);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (registerOfFarmers != null) {
            clearCache(registerOfFarmers);
        }

        return registerOfFarmers;
    }

    @Override
    public RegisterOfFarmers updateImpl(
        com.test.model.RegisterOfFarmers registerOfFarmers)
        throws SystemException {
        registerOfFarmers = toUnwrappedModel(registerOfFarmers);

        boolean isNew = registerOfFarmers.isNew();

        RegisterOfFarmersModelImpl registerOfFarmersModelImpl = (RegisterOfFarmersModelImpl) registerOfFarmers;

        Session session = null;

        try {
            session = openSession();

            if (registerOfFarmers.isNew()) {
                session.save(registerOfFarmers);

                registerOfFarmers.setNew(false);
            } else {
                session.merge(registerOfFarmers);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !RegisterOfFarmersModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((registerOfFarmersModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISARCHIVED.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        registerOfFarmersModelImpl.getOriginalIsArchived()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ISARCHIVED,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISARCHIVED,
                    args);

                args = new Object[] { registerOfFarmersModelImpl.getIsArchived() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ISARCHIVED,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISARCHIVED,
                    args);
            }

            if ((registerOfFarmersModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONNAME.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        registerOfFarmersModelImpl.getOriginalOrganizationName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONNAME,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONNAME,
                    args);

                args = new Object[] {
                        registerOfFarmersModelImpl.getOrganizationName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONNAME,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONNAME,
                    args);
            }

            if ((registerOfFarmersModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INN.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        registerOfFarmersModelImpl.getOriginalInn()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INN, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INN,
                    args);

                args = new Object[] { registerOfFarmersModelImpl.getInn() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INN, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INN,
                    args);
            }

            if ((registerOfFarmersModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTRATIONAREA.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        registerOfFarmersModelImpl.getOriginalRegistrationArea()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGISTRATIONAREA,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTRATIONAREA,
                    args);

                args = new Object[] {
                        registerOfFarmersModelImpl.getRegistrationArea()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGISTRATIONAREA,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTRATIONAREA,
                    args);
            }

            if ((registerOfFarmersModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATEOFREGISTRATION.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        registerOfFarmersModelImpl.getOriginalDateOfRegistration()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATEOFREGISTRATION,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATEOFREGISTRATION,
                    args);

                args = new Object[] {
                        registerOfFarmersModelImpl.getDateOfRegistration()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATEOFREGISTRATION,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATEOFREGISTRATION,
                    args);
            }
        }

        EntityCacheUtil.putResult(RegisterOfFarmersModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfFarmersImpl.class, registerOfFarmers.getPrimaryKey(),
            registerOfFarmers);

        return registerOfFarmers;
    }

    protected RegisterOfFarmers toUnwrappedModel(
        RegisterOfFarmers registerOfFarmers) {
        if (registerOfFarmers instanceof RegisterOfFarmersImpl) {
            return registerOfFarmers;
        }

        RegisterOfFarmersImpl registerOfFarmersImpl = new RegisterOfFarmersImpl();

        registerOfFarmersImpl.setNew(registerOfFarmers.isNew());
        registerOfFarmersImpl.setPrimaryKey(registerOfFarmers.getPrimaryKey());

        registerOfFarmersImpl.setRegisterOfFarmersId(registerOfFarmers.getRegisterOfFarmersId());
        registerOfFarmersImpl.setOrganizationName(registerOfFarmers.getOrganizationName());
        registerOfFarmersImpl.setLegalForm(registerOfFarmers.getLegalForm());
        registerOfFarmersImpl.setInn(registerOfFarmers.getInn());
        registerOfFarmersImpl.setKpp(registerOfFarmers.getKpp());
        registerOfFarmersImpl.setOgrn(registerOfFarmers.getOgrn());
        registerOfFarmersImpl.setRegistrationArea(registerOfFarmers.getRegistrationArea());
        registerOfFarmersImpl.setCropAreas(registerOfFarmers.getCropAreas());
        registerOfFarmersImpl.setDateOfRegistration(registerOfFarmers.getDateOfRegistration());
        registerOfFarmersImpl.setIsArchived(registerOfFarmers.isIsArchived());

        return registerOfFarmersImpl;
    }

    /**
     * Returns the register of farmers with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the register of farmers
     * @return the register of farmers
     * @throws com.test.NoSuchRegisterOfFarmersException if a register of farmers with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfFarmers findByPrimaryKey(Serializable primaryKey)
        throws NoSuchRegisterOfFarmersException, SystemException {
        RegisterOfFarmers registerOfFarmers = fetchByPrimaryKey(primaryKey);

        if (registerOfFarmers == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchRegisterOfFarmersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return registerOfFarmers;
    }

    /**
     * Returns the register of farmers with the primary key or throws a {@link com.test.NoSuchRegisterOfFarmersException} if it could not be found.
     *
     * @param registerOfFarmersId the primary key of the register of farmers
     * @return the register of farmers
     * @throws com.test.NoSuchRegisterOfFarmersException if a register of farmers with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfFarmers findByPrimaryKey(long registerOfFarmersId)
        throws NoSuchRegisterOfFarmersException, SystemException {
        return findByPrimaryKey((Serializable) registerOfFarmersId);
    }

    /**
     * Returns the register of farmers with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the register of farmers
     * @return the register of farmers, or <code>null</code> if a register of farmers with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfFarmers fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        RegisterOfFarmers registerOfFarmers = (RegisterOfFarmers) EntityCacheUtil.getResult(RegisterOfFarmersModelImpl.ENTITY_CACHE_ENABLED,
                RegisterOfFarmersImpl.class, primaryKey);

        if (registerOfFarmers == _nullRegisterOfFarmers) {
            return null;
        }

        if (registerOfFarmers == null) {
            Session session = null;

            try {
                session = openSession();

                registerOfFarmers = (RegisterOfFarmers) session.get(RegisterOfFarmersImpl.class,
                        primaryKey);

                if (registerOfFarmers != null) {
                    cacheResult(registerOfFarmers);
                } else {
                    EntityCacheUtil.putResult(RegisterOfFarmersModelImpl.ENTITY_CACHE_ENABLED,
                        RegisterOfFarmersImpl.class, primaryKey,
                        _nullRegisterOfFarmers);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(RegisterOfFarmersModelImpl.ENTITY_CACHE_ENABLED,
                    RegisterOfFarmersImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return registerOfFarmers;
    }

    /**
     * Returns the register of farmers with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param registerOfFarmersId the primary key of the register of farmers
     * @return the register of farmers, or <code>null</code> if a register of farmers with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfFarmers fetchByPrimaryKey(long registerOfFarmersId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) registerOfFarmersId);
    }

    /**
     * Returns all the register of farmerses.
     *
     * @return the register of farmerses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RegisterOfFarmers> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<RegisterOfFarmers> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

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
    @Override
    public List<RegisterOfFarmers> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<RegisterOfFarmers> list = (List<RegisterOfFarmers>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_REGISTEROFFARMERS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_REGISTEROFFARMERS;

                if (pagination) {
                    sql = sql.concat(RegisterOfFarmersModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<RegisterOfFarmers>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<RegisterOfFarmers>(list);
                } else {
                    list = (List<RegisterOfFarmers>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the register of farmerses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (RegisterOfFarmers registerOfFarmers : findAll()) {
            remove(registerOfFarmers);
        }
    }

    /**
     * Returns the number of register of farmerses.
     *
     * @return the number of register of farmerses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_REGISTEROFFARMERS);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the register of farmers persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.test.model.RegisterOfFarmers")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<RegisterOfFarmers>> listenersList = new ArrayList<ModelListener<RegisterOfFarmers>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<RegisterOfFarmers>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(RegisterOfFarmersImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
