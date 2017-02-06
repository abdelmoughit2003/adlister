package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;
import com.mysql.cj.core.util.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        // TODO: show the registration form
        request.getRequestDispatcher("/WEB-INF/users/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        // TODO: ensure the submitted information is valid
        User user = null;
        Long result = null;
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        boolean isValid = (!StringUtils.isNullOrEmpty(username) &&
                !StringUtils.isNullOrEmpty(email) &&
                !StringUtils.isNullOrEmpty(password));
        // TODO: create a new user based off of the submitted information
        if (isValid) {
            user = new User();
            user.setUsername(username);
            user.setEmail(email);
            user.setPassword(password);
            result = DaoFactory.getUsersDao().insert(user);
        }
        // TODO: if a user was successfully created, send them to their profile
        if (result != null) {
            request.getSession().setAttribute("user", user);
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/register");
        }
    }
}

