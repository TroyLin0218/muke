package com.online.college.common.web.shiro.freemarker;

import java.io.IOException;
import java.util.Map;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModelException;

/**
 *
 * @Description: TODO
 * @author cmazxiaoma
 * @date 2018-02-07 19:34
 * @version V1.0
 */
public abstract class PermissionTag extends SecureTag {

    public String getName(Map params) {
        return getParam(params, "name");
    }

    @Override
    protected void verifyParameters(Map params) throws TemplateModelException {
        String permission = getName(params);

        if (permission == null || permission.length() == 0) {
            throw new TemplateModelException("The 'name' tag attribute must be set");
        }
    }

    @Override
    public void render(Environment env, Map params, TemplateDirectiveBody body) throws IOException, TemplateException {
        String p = getName(params);
        boolean show = showTagBody(p);

        if (show) {
            renderBody(env, body);
        }
    }

    protected boolean isPermitted(String p) {
        return getSubject() != null && getSubject().isPermitted(p);
    }

    protected abstract boolean showTagBody(String p);
}
