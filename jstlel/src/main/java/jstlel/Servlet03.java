package jstlel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/03")
public class Servlet03 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<UserVo> list = new ArrayList<>();

        UserVo vo1 = new UserVo();
        vo1.setId(1L);
        vo1.setName("둘리");
        list.add(vo1);

        UserVo vo2 = new UserVo();
        vo2.setId(2L);
        vo2.setName("마이콜");
        list.add(vo2);

        UserVo vo3 = new UserVo();
        vo3.setId(3L);
        vo3.setName("또치");
        list.add(vo3);

        UserVo vo4 = new UserVo();
        vo4.setId(4L);
        vo4.setName("도우너");
        list.add(vo4);

        String contents = "가\n나\n다\n라";

        request.setAttribute("list", list);
        request.setAttribute("contents", contents);
        request
                .getRequestDispatcher("/WEB-INF/views/03.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
