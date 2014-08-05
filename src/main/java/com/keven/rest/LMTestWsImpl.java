package com.keven.rest;

import javax.ws.rs.QueryParam;
import javax.ws.rs.ext.Provider;


//@Provider
public class LMTestWsImpl implements LMTestWs {

    @Override
    public String getData(@QueryParam("param-name") String paramName) {
    	return "KKK test " + paramName;
    }
}
