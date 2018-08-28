package com.additional.context;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

/**
 * Created by on 6/4/2018.
 */
public class ContextHolder {

	/*RequestContextHolder:
		Holder class to expose the web request in the form of a thread-bound RequestAttributes object.
		It means return current session.*/
    public static Context getContext() {
    	//Return current session's context by currentRequestAttributes.
        return (Context) RequestContextHolder.currentRequestAttributes().getAttribute(Context.ATT_KEY, RequestAttributes.SCOPE_REQUEST);
    }

    public static void initContext() {
        RequestContextHolder.currentRequestAttributes().setAttribute(Context.ATT_KEY, new Context(), RequestAttributes.SCOPE_REQUEST);
    }

}

