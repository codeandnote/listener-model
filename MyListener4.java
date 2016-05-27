package com.javaweb.zcx;
import java.text.MessageFormat;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;


public class MyListener4 implements ServletContextAttributeListener,HttpSessionAttributeListener, ServletRequestAttributeListener{

	/****************变量写在这************************/
	
	
	
	
	
	/***********************************************/

	
	
	
	 
	
	
    //加入
    public void attributeAdded(ServletContextAttributeEvent scab) {
        String str =MessageFormat.format(
                "application【添加】属性:{0}，属性值是:{1}"
                ,scab.getName()
                ,scab.getValue());
        System.out.println(str);
        /****************行动在这写************************/
        
        
        
        
        
        
        /***********************************************/
    }

    //删除
    public void attributeRemoved(ServletContextAttributeEvent scab) {
        String str =MessageFormat.format(
                "application【删除】属性:{0}，属性值是:{1}"
                ,scab.getName()
                ,scab.getValue());
        System.out.println(str);
        /****************行动在这写************************/
        
        
        
        
        
        /***********************************************/
    }

    //修改
    public void attributeReplaced(ServletContextAttributeEvent scab) {
        String str =MessageFormat.format(
                "application【替换】属性:{0}的值"
                ,scab.getName());
        System.out.println(str);
        /****************行动在这写************************/
        
        
        
        
        
        
        
        /***********************************************/
    }
	
	public void attributeAdded(ServletRequestAttributeEvent srae) {
        String str =MessageFormat.format(
                "Request【添加】属性:{0}，属性值是:{1}"
                ,srae.getName()
                ,srae.getValue());
        System.out.println(str);
        /****************行动在这写************************/
        
        
        
        
        /************************************************/
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        String str =MessageFormat.format(
                "Request【删除】属性:{0}，属性值是:{1}"
                ,srae.getName()
                ,srae.getValue());
        System.out.println(str);
        /****************行动在这写************************/
        
        
        
        /************************************************/
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        String str =MessageFormat.format(
                "Request【替换】属性:{0}的值"
                ,srae.getName());
        System.out.println(str);
        /****************行动在这写************************/
        
        
        
        
        
        /************************************************/
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        String str =MessageFormat.format(
                "Session【添加】属性:{0}，属性值是:{1}"
                ,se.getName()
                ,se.getValue());
        System.out.println(str);
        /****************行动在这写************************/
        
        
        
        
        /************************************************/
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        String str =MessageFormat.format(
                "Session【删除】属性:{0}，属性值是:{1}"
                ,se.getName()
                ,se.getValue());
        System.out.println(str);
        /****************行动在这写************************/
        
        
        
        
        /************************************************/
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        String str =MessageFormat.format(
                "Session【替换】属性:{0}的值"
                ,se.getName());
        System.out.println(str);
        /****************行动在这写************************/
        
        
        
        
        /************************************************/
    }

}
