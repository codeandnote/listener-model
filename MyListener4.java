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

	/****************����д����************************/
	
	
	
	
	
	/***********************************************/

	
	
	
	 
	
	
    //����
    public void attributeAdded(ServletContextAttributeEvent scab) {
        String str =MessageFormat.format(
                "application����ӡ�����:{0}������ֵ��:{1}"
                ,scab.getName()
                ,scab.getValue());
        System.out.println(str);
        /****************�ж�����д************************/
        
        
        
        
        
        
        /***********************************************/
    }

    //ɾ��
    public void attributeRemoved(ServletContextAttributeEvent scab) {
        String str =MessageFormat.format(
                "application��ɾ��������:{0}������ֵ��:{1}"
                ,scab.getName()
                ,scab.getValue());
        System.out.println(str);
        /****************�ж�����д************************/
        
        
        
        
        
        /***********************************************/
    }

    //�޸�
    public void attributeReplaced(ServletContextAttributeEvent scab) {
        String str =MessageFormat.format(
                "application���滻������:{0}��ֵ"
                ,scab.getName());
        System.out.println(str);
        /****************�ж�����д************************/
        
        
        
        
        
        
        
        /***********************************************/
    }
	
	public void attributeAdded(ServletRequestAttributeEvent srae) {
        String str =MessageFormat.format(
                "Request����ӡ�����:{0}������ֵ��:{1}"
                ,srae.getName()
                ,srae.getValue());
        System.out.println(str);
        /****************�ж�����д************************/
        
        
        
        
        /************************************************/
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        String str =MessageFormat.format(
                "Request��ɾ��������:{0}������ֵ��:{1}"
                ,srae.getName()
                ,srae.getValue());
        System.out.println(str);
        /****************�ж�����д************************/
        
        
        
        /************************************************/
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        String str =MessageFormat.format(
                "Request���滻������:{0}��ֵ"
                ,srae.getName());
        System.out.println(str);
        /****************�ж�����д************************/
        
        
        
        
        
        /************************************************/
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        String str =MessageFormat.format(
                "Session����ӡ�����:{0}������ֵ��:{1}"
                ,se.getName()
                ,se.getValue());
        System.out.println(str);
        /****************�ж�����д************************/
        
        
        
        
        /************************************************/
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        String str =MessageFormat.format(
                "Session��ɾ��������:{0}������ֵ��:{1}"
                ,se.getName()
                ,se.getValue());
        System.out.println(str);
        /****************�ж�����д************************/
        
        
        
        
        /************************************************/
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        String str =MessageFormat.format(
                "Session���滻������:{0}��ֵ"
                ,se.getName());
        System.out.println(str);
        /****************�ж�����д************************/
        
        
        
        
        /************************************************/
    }

}
