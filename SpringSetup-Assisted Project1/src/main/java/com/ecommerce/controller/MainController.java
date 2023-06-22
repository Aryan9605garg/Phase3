package com.ecommerce.controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecommerce.dao.EProductDAO;
import com.ecommerce.entity.EProductEntity;

@Controller
public class MainController {

           @RequestMapping(value = "/listProducts", method = RequestMethod.GET)
            public void listProductsgetUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
            {
        	   ApplicationContext ac=new ClassPathXmlApplicationContext("main-servlet.xml");
        	   EProductDAO eproductDAO=ac.getBean(EProductDAO.class);
                    List<EProductEntity> list= eproductDAO.getProducts();
                    request.setAttribute("list", list);
       	    	 request.getRequestDispatcher("listProducts.jsp").include(request, response);
            }
           }
