package com.hongbao.dynamicproxy;

import java.lang.reflect.Proxy;

import com.hongbao.dynamicproxy.invocation.Target;
import com.hongbao.dynamicproxy.invocation.TargetInterface;
import com.hongbao.dynamicproxy.invocation.TargetInvocationHandler;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Target target = new Target();
    	TargetInterface interface1 = new TargetInvocationHandler(target).getProxy();
    	
        interface1.action();
    }
}
