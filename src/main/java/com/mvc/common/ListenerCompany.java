package com.mvc.common;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;

@WebListener
public class ListenerCompany implements ServletRequestListener, ServletRequestAttributeListener {

    public int cnt =0;

    public ListenerCompany() {
        System.out.println("context listener 인스턴스 생성");
    }
    public void attributeAdded(ServletRequestAttributeEvent srae)  {

        cnt++;
        System.out.println("Attribute 추가/리스너 사용");
        System.out.println("프로젝트가 작동하는동안 Attribute에"+cnt+"번의 추가 작업이 있었습니다");
    }


}
