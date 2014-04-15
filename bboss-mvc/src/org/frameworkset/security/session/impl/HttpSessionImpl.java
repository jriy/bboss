/*
 *  Copyright 2008 bbossgroups
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.frameworkset.security.session.impl;

import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import org.frameworkset.security.session.Session;

/**
 * <p>Title: HttpSessionImpl.java</p> 
 * <p>Description: </p>
 * <p>bboss workgroup</p>
 * <p>Copyright (c) 2008</p>
 * @Date 2014年4月15日
 * @author biaoping.yin
 * @version 3.8.0
 */
public class HttpSessionImpl implements Session {
	private HttpSession session = null;
	@Override
	public Object getAttribute(String attribute) {
		// TODO Auto-generated method stub
		return this.getAttribute(attribute);
	}

	@Override
	public Enumeration getAttributeNames() {
		// TODO Auto-generated method stub
		return this.session.getAttributeNames();
	}

	@Override
	public long getCreationTime() {
		// TODO Auto-generated method stub
		return this.session.getCreationTime();
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return this.session.getId();
	}

	@Override
	public void touch() {
		

	}

	@Override
	public long getLastAccessedTime() {
		// TODO Auto-generated method stub
		return this.session.getLastAccessedTime();
	}

	@Override
	public long getMaxInactiveInterval() {
		
		return session.getMaxInactiveInterval();
	}

	@Override
	public Object getValue(String attribute) {
		
		return this.session.getValue(attribute);
	}

	@Override
	public String[] getValueNames() {
		// TODO Auto-generated method stub
		return session.getValueNames();
	}

	@Override
	public void invalidate() {
		this.session.invalidate();

	}

	@Override
	public boolean isNew() {
		
		return session.isNew();
	}

	@Override
	public void putValue(String attribute, Object value) {
		session.putValue(attribute, value);

	}

	@Override
	public void removeAttribute(String attribute) {
		session.removeAttribute(attribute);

	}

	@Override
	public void removeValue(String attribute) {
		session.removeValue(attribute);

	}

	@Override
	public void setAttribute(String attribute, Object value) {
		session.setAttribute(attribute, value);

	}

	@Override
	public void setMaxInactiveInterval(long maxInactiveInterval) {
		session.setMaxInactiveInterval((int)maxInactiveInterval);

	}

	public HttpSession getSession() {
		return session;
	}

	public void setSession(HttpSession session) {
		this.session = session;
	}
	
	public ServletContext getServletContext() {
		// TODO Auto-generated method stub
		return session.getServletContext();
	}

	
	public HttpSessionContext getSessionContext() {
		// TODO Auto-generated method stub
		return session.getSessionContext();
	}

}
