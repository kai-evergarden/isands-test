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

import com.test.NoSuchRegisterOfDistrictsException;

import com.test.model.RegisterOfDistricts;
import com.test.model.impl.RegisterOfDistrictsImpl;
import com.test.model.impl.RegisterOfDistrictsModelImpl;

import com.test.service.persistence.RegisterOfDistrictsPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the register of districts service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegisterOfDistrictsPersistence
 * @see RegisterOfDistrictsUtil
 * @generated
 */
public class RegisterOfDistrictsPersistenceImpl extends BasePersistenceImpl<RegisterOfDistricts>
    implements RegisterOfDistrictsPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link RegisterOfDistrictsUtil} to access the register of districts persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = RegisterOfDistrictsImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RegisterOfDistrictsModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfDistrictsModelImpl.FINDER_CACHE_ENABLED,
            RegisterOfDistrictsImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RegisterOfDistrictsModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfDistrictsModelImpl.FINDER_CACHE_ENABLED,
            RegisterOfDistrictsImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RegisterOfDistrictsModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfDistrictsModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NAME = new FinderPath(RegisterOfDistrictsModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfDistrictsModelImpl.FINDER_CACHE_ENABLED,
            RegisterOfDistrictsImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByname",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME = new FinderPath(RegisterOfDistrictsModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfDistrictsModelImpl.FINDER_CACHE_ENABLED,
            RegisterOfDistrictsImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByname",
            new String[] { String.class.getName() },
            RegisterOfDistrictsModelImpl.NAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_NAME = new FinderPath(RegisterOfDistrictsModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfDistrictsModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByname",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_NAME_NAME_1 = "registerOfDistricts.name IS NULL";
    private static final String _FINDER_COLUMN_NAME_NAME_2 = "registerOfDistricts.name = ?";
    private static final String _FINDER_COLUMN_NAME_NAME_3 = "(registerOfDistricts.name IS NULL OR registerOfDistricts.name = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ISARCHIVED =
        new FinderPath(RegisterOfDistrictsModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfDistrictsModelImpl.FINDER_CACHE_ENABLED,
            RegisterOfDistrictsImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByisArchived",
            new String[] {
                Boolean.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISARCHIVED =
        new FinderPath(RegisterOfDistrictsModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfDistrictsModelImpl.FINDER_CACHE_ENABLED,
            RegisterOfDistrictsImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByisArchived",
            new String[] { Boolean.class.getName() },
            RegisterOfDistrictsModelImpl.ISARCHIVED_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ISARCHIVED = new FinderPath(RegisterOfDistrictsModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfDistrictsModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByisArchived",
            new String[] { Boolean.class.getName() });
    private static final String _FINDER_COLUMN_ISARCHIVED_ISARCHIVED_2 = "registerOfDistricts.isArchived = ?";
    private static final String _SQL_SELECT_REGISTEROFDISTRICTS = "SELECT registerOfDistricts FROM RegisterOfDistricts registerOfDistricts";
    private static final String _SQL_SELECT_REGISTEROFDISTRICTS_WHERE = "SELECT registerOfDistricts FROM RegisterOfDistricts registerOfDistricts WHERE ";
    private static final String _SQL_COUNT_REGISTEROFDISTRICTS = "SELECT COUNT(registerOfDistricts) FROM RegisterOfDistricts registerOfDistricts";
    private static final String _SQL_COUNT_REGISTEROFDISTRICTS_WHERE = "SELECT COUNT(registerOfDistricts) FROM RegisterOfDistricts registerOfDistricts WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "registerOfDistricts.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RegisterOfDistricts exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No RegisterOfDistricts exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(RegisterOfDistrictsPersistenceImpl.class);
    private static RegisterOfDistricts _nullRegisterOfDistricts = new RegisterOfDistrictsImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<RegisterOfDistricts> toCacheModel() {
                return _nullRegisterOfDistrictsCacheModel;
            }
        };

    private static CacheModel<RegisterOfDistricts> _nullRegisterOfDistrictsCacheModel =
        new CacheModel<RegisterOfDistricts>() {
            @Override
            public RegisterOfDistricts toEntityModel() {
                return _nullRegisterOfDistricts;
            }
        };

    public RegisterOfDistrictsPersistenceImpl() {
        setModelClass(RegisterOfDistricts.class);
    }

    /**
     * Returns all the register of districtses where name = &#63;.
     *
     * @param name the name
     * @return the matching register of districtses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RegisterOfDistricts> findByname(String name)
        throws SystemException {
        return findByname(name, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<RegisterOfDistricts> findByname(String name, int start, int end)
        throws SystemException {
        return findByname(name, start, end, null);
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
    @Override
    public List<RegisterOfDistricts> findByname(String name, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME;
            finderArgs = new Object[] { name };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NAME;
            finderArgs = new Object[] { name, start, end, orderByComparator };
        }

        List<RegisterOfDistricts> list = (List<RegisterOfDistricts>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (RegisterOfDistricts registerOfDistricts : list) {
                if (!Validator.equals(name, registerOfDistricts.getName())) {
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

            query.append(_SQL_SELECT_REGISTEROFDISTRICTS_WHERE);

            boolean bindName = false;

            if (name == null) {
                query.append(_FINDER_COLUMN_NAME_NAME_1);
            } else if (name.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAME_NAME_3);
            } else {
                bindName = true;

                query.append(_FINDER_COLUMN_NAME_NAME_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RegisterOfDistrictsModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindName) {
                    qPos.add(name);
                }

                if (!pagination) {
                    list = (List<RegisterOfDistricts>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<RegisterOfDistricts>(list);
                } else {
                    list = (List<RegisterOfDistricts>) QueryUtil.list(q,
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
     * Returns the first register of districts in the ordered set where name = &#63;.
     *
     * @param name the name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching register of districts
     * @throws com.test.NoSuchRegisterOfDistrictsException if a matching register of districts could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfDistricts findByname_First(String name,
        OrderByComparator orderByComparator)
        throws NoSuchRegisterOfDistrictsException, SystemException {
        RegisterOfDistricts registerOfDistricts = fetchByname_First(name,
                orderByComparator);

        if (registerOfDistricts != null) {
            return registerOfDistricts;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("name=");
        msg.append(name);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRegisterOfDistrictsException(msg.toString());
    }

    /**
     * Returns the first register of districts in the ordered set where name = &#63;.
     *
     * @param name the name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching register of districts, or <code>null</code> if a matching register of districts could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfDistricts fetchByname_First(String name,
        OrderByComparator orderByComparator) throws SystemException {
        List<RegisterOfDistricts> list = findByname(name, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public RegisterOfDistricts findByname_Last(String name,
        OrderByComparator orderByComparator)
        throws NoSuchRegisterOfDistrictsException, SystemException {
        RegisterOfDistricts registerOfDistricts = fetchByname_Last(name,
                orderByComparator);

        if (registerOfDistricts != null) {
            return registerOfDistricts;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("name=");
        msg.append(name);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRegisterOfDistrictsException(msg.toString());
    }

    /**
     * Returns the last register of districts in the ordered set where name = &#63;.
     *
     * @param name the name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching register of districts, or <code>null</code> if a matching register of districts could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfDistricts fetchByname_Last(String name,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByname(name);

        if (count == 0) {
            return null;
        }

        List<RegisterOfDistricts> list = findByname(name, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public RegisterOfDistricts[] findByname_PrevAndNext(
        long registerOfDistrictsId, String name,
        OrderByComparator orderByComparator)
        throws NoSuchRegisterOfDistrictsException, SystemException {
        RegisterOfDistricts registerOfDistricts = findByPrimaryKey(registerOfDistrictsId);

        Session session = null;

        try {
            session = openSession();

            RegisterOfDistricts[] array = new RegisterOfDistrictsImpl[3];

            array[0] = getByname_PrevAndNext(session, registerOfDistricts,
                    name, orderByComparator, true);

            array[1] = registerOfDistricts;

            array[2] = getByname_PrevAndNext(session, registerOfDistricts,
                    name, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected RegisterOfDistricts getByname_PrevAndNext(Session session,
        RegisterOfDistricts registerOfDistricts, String name,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_REGISTEROFDISTRICTS_WHERE);

        boolean bindName = false;

        if (name == null) {
            query.append(_FINDER_COLUMN_NAME_NAME_1);
        } else if (name.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_NAME_NAME_3);
        } else {
            bindName = true;

            query.append(_FINDER_COLUMN_NAME_NAME_2);
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
            query.append(RegisterOfDistrictsModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindName) {
            qPos.add(name);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(registerOfDistricts);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<RegisterOfDistricts> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the register of districtses where name = &#63; from the database.
     *
     * @param name the name
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByname(String name) throws SystemException {
        for (RegisterOfDistricts registerOfDistricts : findByname(name,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(registerOfDistricts);
        }
    }

    /**
     * Returns the number of register of districtses where name = &#63;.
     *
     * @param name the name
     * @return the number of matching register of districtses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByname(String name) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_NAME;

        Object[] finderArgs = new Object[] { name };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_REGISTEROFDISTRICTS_WHERE);

            boolean bindName = false;

            if (name == null) {
                query.append(_FINDER_COLUMN_NAME_NAME_1);
            } else if (name.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAME_NAME_3);
            } else {
                bindName = true;

                query.append(_FINDER_COLUMN_NAME_NAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindName) {
                    qPos.add(name);
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
     * Returns all the register of districtses where isArchived = &#63;.
     *
     * @param isArchived the is archived
     * @return the matching register of districtses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RegisterOfDistricts> findByisArchived(boolean isArchived)
        throws SystemException {
        return findByisArchived(isArchived, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<RegisterOfDistricts> findByisArchived(boolean isArchived,
        int start, int end) throws SystemException {
        return findByisArchived(isArchived, start, end, null);
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
    @Override
    public List<RegisterOfDistricts> findByisArchived(boolean isArchived,
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

        List<RegisterOfDistricts> list = (List<RegisterOfDistricts>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (RegisterOfDistricts registerOfDistricts : list) {
                if ((isArchived != registerOfDistricts.getIsArchived())) {
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

            query.append(_SQL_SELECT_REGISTEROFDISTRICTS_WHERE);

            query.append(_FINDER_COLUMN_ISARCHIVED_ISARCHIVED_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RegisterOfDistrictsModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(isArchived);

                if (!pagination) {
                    list = (List<RegisterOfDistricts>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<RegisterOfDistricts>(list);
                } else {
                    list = (List<RegisterOfDistricts>) QueryUtil.list(q,
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
     * Returns the first register of districts in the ordered set where isArchived = &#63;.
     *
     * @param isArchived the is archived
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching register of districts
     * @throws com.test.NoSuchRegisterOfDistrictsException if a matching register of districts could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfDistricts findByisArchived_First(boolean isArchived,
        OrderByComparator orderByComparator)
        throws NoSuchRegisterOfDistrictsException, SystemException {
        RegisterOfDistricts registerOfDistricts = fetchByisArchived_First(isArchived,
                orderByComparator);

        if (registerOfDistricts != null) {
            return registerOfDistricts;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("isArchived=");
        msg.append(isArchived);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRegisterOfDistrictsException(msg.toString());
    }

    /**
     * Returns the first register of districts in the ordered set where isArchived = &#63;.
     *
     * @param isArchived the is archived
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching register of districts, or <code>null</code> if a matching register of districts could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfDistricts fetchByisArchived_First(boolean isArchived,
        OrderByComparator orderByComparator) throws SystemException {
        List<RegisterOfDistricts> list = findByisArchived(isArchived, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public RegisterOfDistricts findByisArchived_Last(boolean isArchived,
        OrderByComparator orderByComparator)
        throws NoSuchRegisterOfDistrictsException, SystemException {
        RegisterOfDistricts registerOfDistricts = fetchByisArchived_Last(isArchived,
                orderByComparator);

        if (registerOfDistricts != null) {
            return registerOfDistricts;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("isArchived=");
        msg.append(isArchived);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRegisterOfDistrictsException(msg.toString());
    }

    /**
     * Returns the last register of districts in the ordered set where isArchived = &#63;.
     *
     * @param isArchived the is archived
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching register of districts, or <code>null</code> if a matching register of districts could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfDistricts fetchByisArchived_Last(boolean isArchived,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByisArchived(isArchived);

        if (count == 0) {
            return null;
        }

        List<RegisterOfDistricts> list = findByisArchived(isArchived,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public RegisterOfDistricts[] findByisArchived_PrevAndNext(
        long registerOfDistrictsId, boolean isArchived,
        OrderByComparator orderByComparator)
        throws NoSuchRegisterOfDistrictsException, SystemException {
        RegisterOfDistricts registerOfDistricts = findByPrimaryKey(registerOfDistrictsId);

        Session session = null;

        try {
            session = openSession();

            RegisterOfDistricts[] array = new RegisterOfDistrictsImpl[3];

            array[0] = getByisArchived_PrevAndNext(session,
                    registerOfDistricts, isArchived, orderByComparator, true);

            array[1] = registerOfDistricts;

            array[2] = getByisArchived_PrevAndNext(session,
                    registerOfDistricts, isArchived, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected RegisterOfDistricts getByisArchived_PrevAndNext(Session session,
        RegisterOfDistricts registerOfDistricts, boolean isArchived,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_REGISTEROFDISTRICTS_WHERE);

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
            query.append(RegisterOfDistrictsModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(isArchived);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(registerOfDistricts);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<RegisterOfDistricts> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the register of districtses where isArchived = &#63; from the database.
     *
     * @param isArchived the is archived
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByisArchived(boolean isArchived)
        throws SystemException {
        for (RegisterOfDistricts registerOfDistricts : findByisArchived(
                isArchived, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(registerOfDistricts);
        }
    }

    /**
     * Returns the number of register of districtses where isArchived = &#63;.
     *
     * @param isArchived the is archived
     * @return the number of matching register of districtses
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

            query.append(_SQL_COUNT_REGISTEROFDISTRICTS_WHERE);

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
     * Caches the register of districts in the entity cache if it is enabled.
     *
     * @param registerOfDistricts the register of districts
     */
    @Override
    public void cacheResult(RegisterOfDistricts registerOfDistricts) {
        EntityCacheUtil.putResult(RegisterOfDistrictsModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfDistrictsImpl.class, registerOfDistricts.getPrimaryKey(),
            registerOfDistricts);

        registerOfDistricts.resetOriginalValues();
    }

    /**
     * Caches the register of districtses in the entity cache if it is enabled.
     *
     * @param registerOfDistrictses the register of districtses
     */
    @Override
    public void cacheResult(List<RegisterOfDistricts> registerOfDistrictses) {
        for (RegisterOfDistricts registerOfDistricts : registerOfDistrictses) {
            if (EntityCacheUtil.getResult(
                        RegisterOfDistrictsModelImpl.ENTITY_CACHE_ENABLED,
                        RegisterOfDistrictsImpl.class,
                        registerOfDistricts.getPrimaryKey()) == null) {
                cacheResult(registerOfDistricts);
            } else {
                registerOfDistricts.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all register of districtses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(RegisterOfDistrictsImpl.class.getName());
        }

        EntityCacheUtil.clearCache(RegisterOfDistrictsImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the register of districts.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(RegisterOfDistricts registerOfDistricts) {
        EntityCacheUtil.removeResult(RegisterOfDistrictsModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfDistrictsImpl.class, registerOfDistricts.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<RegisterOfDistricts> registerOfDistrictses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (RegisterOfDistricts registerOfDistricts : registerOfDistrictses) {
            EntityCacheUtil.removeResult(RegisterOfDistrictsModelImpl.ENTITY_CACHE_ENABLED,
                RegisterOfDistrictsImpl.class,
                registerOfDistricts.getPrimaryKey());
        }
    }

    /**
     * Creates a new register of districts with the primary key. Does not add the register of districts to the database.
     *
     * @param registerOfDistrictsId the primary key for the new register of districts
     * @return the new register of districts
     */
    @Override
    public RegisterOfDistricts create(long registerOfDistrictsId) {
        RegisterOfDistricts registerOfDistricts = new RegisterOfDistrictsImpl();

        registerOfDistricts.setNew(true);
        registerOfDistricts.setPrimaryKey(registerOfDistrictsId);

        return registerOfDistricts;
    }

    /**
     * Removes the register of districts with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param registerOfDistrictsId the primary key of the register of districts
     * @return the register of districts that was removed
     * @throws com.test.NoSuchRegisterOfDistrictsException if a register of districts with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfDistricts remove(long registerOfDistrictsId)
        throws NoSuchRegisterOfDistrictsException, SystemException {
        return remove((Serializable) registerOfDistrictsId);
    }

    /**
     * Removes the register of districts with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the register of districts
     * @return the register of districts that was removed
     * @throws com.test.NoSuchRegisterOfDistrictsException if a register of districts with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfDistricts remove(Serializable primaryKey)
        throws NoSuchRegisterOfDistrictsException, SystemException {
        Session session = null;

        try {
            session = openSession();

            RegisterOfDistricts registerOfDistricts = (RegisterOfDistricts) session.get(RegisterOfDistrictsImpl.class,
                    primaryKey);

            if (registerOfDistricts == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchRegisterOfDistrictsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(registerOfDistricts);
        } catch (NoSuchRegisterOfDistrictsException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected RegisterOfDistricts removeImpl(
        RegisterOfDistricts registerOfDistricts) throws SystemException {
        registerOfDistricts = toUnwrappedModel(registerOfDistricts);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(registerOfDistricts)) {
                registerOfDistricts = (RegisterOfDistricts) session.get(RegisterOfDistrictsImpl.class,
                        registerOfDistricts.getPrimaryKeyObj());
            }

            if (registerOfDistricts != null) {
                session.delete(registerOfDistricts);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (registerOfDistricts != null) {
            clearCache(registerOfDistricts);
        }

        return registerOfDistricts;
    }

    @Override
    public RegisterOfDistricts updateImpl(
        com.test.model.RegisterOfDistricts registerOfDistricts)
        throws SystemException {
        registerOfDistricts = toUnwrappedModel(registerOfDistricts);

        boolean isNew = registerOfDistricts.isNew();

        RegisterOfDistrictsModelImpl registerOfDistrictsModelImpl = (RegisterOfDistrictsModelImpl) registerOfDistricts;

        Session session = null;

        try {
            session = openSession();

            if (registerOfDistricts.isNew()) {
                session.save(registerOfDistricts);

                registerOfDistricts.setNew(false);
            } else {
                session.merge(registerOfDistricts);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !RegisterOfDistrictsModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((registerOfDistrictsModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        registerOfDistrictsModelImpl.getOriginalName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME,
                    args);

                args = new Object[] { registerOfDistrictsModelImpl.getName() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME,
                    args);
            }

            if ((registerOfDistrictsModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISARCHIVED.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        registerOfDistrictsModelImpl.getOriginalIsArchived()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ISARCHIVED,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISARCHIVED,
                    args);

                args = new Object[] { registerOfDistrictsModelImpl.getIsArchived() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ISARCHIVED,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISARCHIVED,
                    args);
            }
        }

        EntityCacheUtil.putResult(RegisterOfDistrictsModelImpl.ENTITY_CACHE_ENABLED,
            RegisterOfDistrictsImpl.class, registerOfDistricts.getPrimaryKey(),
            registerOfDistricts);

        return registerOfDistricts;
    }

    protected RegisterOfDistricts toUnwrappedModel(
        RegisterOfDistricts registerOfDistricts) {
        if (registerOfDistricts instanceof RegisterOfDistrictsImpl) {
            return registerOfDistricts;
        }

        RegisterOfDistrictsImpl registerOfDistrictsImpl = new RegisterOfDistrictsImpl();

        registerOfDistrictsImpl.setNew(registerOfDistricts.isNew());
        registerOfDistrictsImpl.setPrimaryKey(registerOfDistricts.getPrimaryKey());

        registerOfDistrictsImpl.setRegisterOfDistrictsId(registerOfDistricts.getRegisterOfDistrictsId());
        registerOfDistrictsImpl.setName(registerOfDistricts.getName());
        registerOfDistrictsImpl.setDistrictCode(registerOfDistricts.getDistrictCode());
        registerOfDistrictsImpl.setIsArchived(registerOfDistricts.isIsArchived());

        return registerOfDistrictsImpl;
    }

    /**
     * Returns the register of districts with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the register of districts
     * @return the register of districts
     * @throws com.test.NoSuchRegisterOfDistrictsException if a register of districts with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfDistricts findByPrimaryKey(Serializable primaryKey)
        throws NoSuchRegisterOfDistrictsException, SystemException {
        RegisterOfDistricts registerOfDistricts = fetchByPrimaryKey(primaryKey);

        if (registerOfDistricts == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchRegisterOfDistrictsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return registerOfDistricts;
    }

    /**
     * Returns the register of districts with the primary key or throws a {@link com.test.NoSuchRegisterOfDistrictsException} if it could not be found.
     *
     * @param registerOfDistrictsId the primary key of the register of districts
     * @return the register of districts
     * @throws com.test.NoSuchRegisterOfDistrictsException if a register of districts with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfDistricts findByPrimaryKey(long registerOfDistrictsId)
        throws NoSuchRegisterOfDistrictsException, SystemException {
        return findByPrimaryKey((Serializable) registerOfDistrictsId);
    }

    /**
     * Returns the register of districts with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the register of districts
     * @return the register of districts, or <code>null</code> if a register of districts with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfDistricts fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        RegisterOfDistricts registerOfDistricts = (RegisterOfDistricts) EntityCacheUtil.getResult(RegisterOfDistrictsModelImpl.ENTITY_CACHE_ENABLED,
                RegisterOfDistrictsImpl.class, primaryKey);

        if (registerOfDistricts == _nullRegisterOfDistricts) {
            return null;
        }

        if (registerOfDistricts == null) {
            Session session = null;

            try {
                session = openSession();

                registerOfDistricts = (RegisterOfDistricts) session.get(RegisterOfDistrictsImpl.class,
                        primaryKey);

                if (registerOfDistricts != null) {
                    cacheResult(registerOfDistricts);
                } else {
                    EntityCacheUtil.putResult(RegisterOfDistrictsModelImpl.ENTITY_CACHE_ENABLED,
                        RegisterOfDistrictsImpl.class, primaryKey,
                        _nullRegisterOfDistricts);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(RegisterOfDistrictsModelImpl.ENTITY_CACHE_ENABLED,
                    RegisterOfDistrictsImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return registerOfDistricts;
    }

    /**
     * Returns the register of districts with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param registerOfDistrictsId the primary key of the register of districts
     * @return the register of districts, or <code>null</code> if a register of districts with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RegisterOfDistricts fetchByPrimaryKey(long registerOfDistrictsId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) registerOfDistrictsId);
    }

    /**
     * Returns all the register of districtses.
     *
     * @return the register of districtses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RegisterOfDistricts> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<RegisterOfDistricts> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<RegisterOfDistricts> findAll(int start, int end,
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

        List<RegisterOfDistricts> list = (List<RegisterOfDistricts>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_REGISTEROFDISTRICTS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_REGISTEROFDISTRICTS;

                if (pagination) {
                    sql = sql.concat(RegisterOfDistrictsModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<RegisterOfDistricts>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<RegisterOfDistricts>(list);
                } else {
                    list = (List<RegisterOfDistricts>) QueryUtil.list(q,
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
     * Removes all the register of districtses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (RegisterOfDistricts registerOfDistricts : findAll()) {
            remove(registerOfDistricts);
        }
    }

    /**
     * Returns the number of register of districtses.
     *
     * @return the number of register of districtses
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

                Query q = session.createQuery(_SQL_COUNT_REGISTEROFDISTRICTS);

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
     * Initializes the register of districts persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.test.model.RegisterOfDistricts")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<RegisterOfDistricts>> listenersList = new ArrayList<ModelListener<RegisterOfDistricts>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<RegisterOfDistricts>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(RegisterOfDistrictsImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
