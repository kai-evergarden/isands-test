package com.test.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.test.model.RegisterOfFarmers;

import com.test.service.RegisterOfFarmersLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class RegisterOfFarmersActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public RegisterOfFarmersActionableDynamicQuery() throws SystemException {
        setBaseLocalService(RegisterOfFarmersLocalServiceUtil.getService());
        setClass(RegisterOfFarmers.class);

        setClassLoader(com.test.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("registerOfFarmersId");
    }
}
