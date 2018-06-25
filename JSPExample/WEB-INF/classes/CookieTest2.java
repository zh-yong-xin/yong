//��ζ�ȡCookie����
package com.tsinghua;

import javax.servlet.http.*;
import java.io.*;

public class CookieTest2 extends HttpServlet{

    //����get����
    public void doGet(HttpServletRequest req,HttpServletResponse res){
    	try{
    		res.setContentType("text/html;charset=gbk");
    		PrintWriter pw=res.getWriter();
    		
    		//�ӿͻ��˵õ����е�cookie��Ϣ
    		Cookie []allCookies=req.getCookies();
    		
    		int i=0;
    		if(allCookies!=null){
    			//���ж�ȡCookie
    			for(i=0;i<allCookies.length;i++){
    				//����ȡ��
    				Cookie temp=allCookies[i];
    				if(temp.getName().equals("color1")){
    					//�õ�Cookie��ֵ
    					String val=temp.getValue();
    					
    					pw.println("color1="+val);
    					break;
    				}
    			}
    			if(allCookies.length==i){
    				pw.println("Cookie���ڣ�");
    			}
    			
    		}else{
    			pw.println("������color1���Cookie���ǹ��ڣ�");
    		}
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }  
}