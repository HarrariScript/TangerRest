package tanger.rest.rest.api.impl;
import com.liferay.oauth2.provider.scope.RequiresNoScope;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Component;

import tanger.rest.rest.api.DemoRestApi;

@Component(service = DemoRestApi.class)

public class DemoRestApiImpl implements DemoRestApi{
	Log _log = LogFactoryUtil.getLog(DemoRestApiImpl.class);
	
	@RequiresNoScope
	@Override
	public String working() {
		_log.info("working called ");
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		jsonObject.put("message", "hello world ");
		return jsonObject.toString();
	}
 
}
