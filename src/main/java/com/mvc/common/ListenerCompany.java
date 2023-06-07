package com.mvc.common;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;

@WebListener
public class ListenerCompany implements ServletRequestListener, ServletRequestAttributeListener {

    public ListenerCompany() {
        System.out.println("context listener 인스턴스 생성");
    }
    public void attributeAdded(ServletRequestAttributeEvent srae)  {

        System.out.println("Attribute 추가/리스너 사용");
    }


}
