/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.vidyayug.mobile.service.impl;

import com.vidyayug.mobile.service.base.MobileUserDetailsServiceBaseImpl;

/**
 * The implementation of the mobile user details remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vidyayug.mobile.service.MobileUserDetailsService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author MVIDYA
 * @see com.vidyayug.mobile.service.base.MobileUserDetailsServiceBaseImpl
 * @see com.vidyayug.mobile.service.MobileUserDetailsServiceUtil
 */
public class MobileUserDetailsServiceImpl
	extends MobileUserDetailsServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.vidyayug.mobile.service.MobileUserDetailsServiceUtil} to access the mobile user details remote service.
	 */
	public String submitUserDetails(){
		
		return "Sign Up Complete Welcome to the beautiful social network";
	}
	
}