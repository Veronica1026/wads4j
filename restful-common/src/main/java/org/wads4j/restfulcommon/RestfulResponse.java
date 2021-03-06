package org.wads4j.restfulcommon;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * a common response POJO, not specific to any restful framework
 * Note:  Should not be used outside the framework unless you want to extend it
 */


public class RestfulResponse {

    protected Map<String, String> header;

    /**
     * not body string
     */
    protected Object bodyEntity;

    protected int statusCode;

    public Map<String, String> getHeader() {
        if(header == null){
            header = new LinkedHashMap<>();
        }
        return header;
    }

    public void setHeader(Map<String, String> header) {
        this.header = header;
    }

    public Object getBodyEntity() {
        return bodyEntity;
    }

    public void setBodyEntity(Object bodyEntity) {
        this.bodyEntity = bodyEntity;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
