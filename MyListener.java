package com.javaweb.zcx;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
	
	

//使用方法
//①添加监听后的动作到本文件再编译生成class放到对应的文件夹
//②xml修改
//③JSP加入<%@page import = "com.listener.*"%>
//<%@page import = "com.javaweb.zcx.MyListener5"%><!--监听class程序3位置-->	
//<%赋值 session.setAttribute("变量名",new MyListener("变量值"));   给sess=Tom 且使valueBound	
// session.removeAttribute("变量名");%> 删除sess 且valueUnbound 调用


//检测sess的设置和删除	
public class MyListener implements HttpSessionBindingListener{
	
	/****************变量写在这************************/
    private String name;
    
    
    
    
    
    
    /***********************************************/
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println(name+"被加到session中了");
        /****************加入的行动在这写************************/
        
        
        
        
        
        
        
        
        
        
        /***********************************************/
	     }
 
     
     public void valueUnbound(HttpSessionBindingEvent event) {
         System.out.println(name+"被session踢出来了");
         /****************失效的行动在这写************************/
         
         
         
         
         
         
         
         /***********************************************/
   }
	
	 public MyListener(String name) {
		 this.name = name;
		 }
 }
