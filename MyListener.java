package com.javaweb.zcx;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
	
	

//ʹ�÷���
//����Ӽ�����Ķ��������ļ��ٱ�������class�ŵ���Ӧ���ļ���
//��xml�޸�
//��JSP����<%@page import = "com.listener.*"%>
//<%@page import = "com.javaweb.zcx.MyListener5"%><!--����class����3λ��-->	
//<%��ֵ session.setAttribute("������",new MyListener("����ֵ"));   ��sess=Tom ��ʹvalueBound	
// session.removeAttribute("������");%> ɾ��sess ��valueUnbound ����


//���sess�����ú�ɾ��	
public class MyListener implements HttpSessionBindingListener{
	
	/****************����д����************************/
    private String name;
    
    
    
    
    
    
    /***********************************************/
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println(name+"���ӵ�session����");
        /****************������ж�����д************************/
        
        
        
        
        
        
        
        
        
        
        /***********************************************/
	     }
 
     
     public void valueUnbound(HttpSessionBindingEvent event) {
         System.out.println(name+"��session�߳�����");
         /****************ʧЧ���ж�����д************************/
         
         
         
         
         
         
         
         /***********************************************/
   }
	
	 public MyListener(String name) {
		 this.name = name;
		 }
 }
