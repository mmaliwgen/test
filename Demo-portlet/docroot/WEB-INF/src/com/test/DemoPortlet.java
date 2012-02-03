package com.test;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class DemoPortlet
 */
public class DemoPortlet extends MVCPortlet {
 
	
	public void add(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		
		String name = ParamUtil.getString(actionRequest,"name");
		actionResponse.setRenderParameter("name",name);
		
	}

}
