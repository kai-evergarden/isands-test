package com.test.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.test.model.RegisterOfDistricts;
import com.test.service.base.RegisterOfDistrictsLocalServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the register of districts local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.test.service.RegisterOfDistrictsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.test.service.base.RegisterOfDistrictsLocalServiceBaseImpl
 * @see com.test.service.RegisterOfDistrictsLocalServiceUtil
 */
public class RegisterOfDistrictsLocalServiceImpl
    extends RegisterOfDistrictsLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.test.service.RegisterOfDistrictsLocalServiceUtil} to access the register of districts local service.
     */

    public List<RegisterOfDistricts> findByIsArchived(boolean isArchived) throws SystemException {
        return this.registerOfDistrictsPersistence.findByisArchived(isArchived);
    }
}
