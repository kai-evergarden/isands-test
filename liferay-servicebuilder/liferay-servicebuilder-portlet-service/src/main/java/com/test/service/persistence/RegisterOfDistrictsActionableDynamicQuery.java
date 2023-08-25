package com.test.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.test.model.RegisterOfDistricts;

import com.test.service.RegisterOfDistrictsLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class RegisterOfDistrictsActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public RegisterOfDistrictsActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(RegisterOfDistrictsLocalServiceUtil.getService());
        setClass(RegisterOfDistricts.class);

        setClassLoader(com.test.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("registerOfDistrictsId");
    }
}
