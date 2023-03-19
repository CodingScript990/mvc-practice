package org.example;

import org.example.calculator.domain.Calculator;
import org.example.calculator.domain.PositiveNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// CalculatorServlet Class add
// Annotation -> WebServlet("/calculate")
/**
 * [Annotation]
 * - 소스코드에 추가해서 사용할 수 있는 메타 Data 의 일종임
 * - 메타 Data : Application 이 처리해야할 Data 가 아니라 컴파일 과정과 실행 과정에서 코드를 어떻게 처리해야하는지를 알려주기 위한 추가 정보임
 */
@WebServlet("/calculate")
public class CalculatorServlet extends HttpServlet {
    // HTTPServlet[Abstract Class] -> doGet method 를 사용하여 즉, 요청, 응답등을 사용하고자 하는 것만 사용하면 됨!
    // GenericServlet[Abstract Class] -> service 만 사용 그외에는 추가로 생성해주면 됨!
    // Servlet -> 5개 Override -> init, service, destroy, getServletConfig, getServletInfo
    // Logger add
    private static final Logger log = LoggerFactory.getLogger(CalculatorServlet.class);

    // doGet method add -> Service 라는 Method 가 있음
    // 사칙연산 중 -, * 이까지는 현재 잘되지만, + 는 안됨! 그래서 URL 인코딩을 해줘야 함!(특수문자, 한글등 사용할 수 없는 문자가 있을 수 있기에, 사용할 수 있도록 환경을 만들어준다는 의미임!) -> + 는 예약어라서 에러가 나는 것임!
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("service");
        // 피연산자, 연산자를 불러오는 getParameter 를 생성해줌 -> 요청!
        // operand1 variable -> Int type(형변환)
        int operand1 = Integer.parseInt(req.getParameter("operand1")); // Parameter 1(피연산자)
        // operator variable -> String type
        String operator = req.getParameter("operator"); // Parameter 2(연산자)
        // operand2 variable -> Int type(형변환)
        int operand2 = Integer.parseInt(req.getParameter("operand2")); // Parameter 3(피연산자)

        // 피연산자, 연산자를 통해 계산해주는 작업 실시 -> 요청해서 값을 받아오고!
        int result = Calculator.calculate(new PositiveNumber(operand1), operator, new PositiveNumber(operand2));

        // 피연산자, 연산자를 통해 계산된 값을 이제 응답해주는 작업! -> 요청한 값을 출력해주기!
        PrintWriter writer = resp.getWriter(); // (피연산자1 + 연산자 + 피연산자2) = (result)
        // 값을 출력해줌!
        writer.println(result); // Output -> result variable(Client Response)
    }

    // getServletConfig 어찌 활용되는지 보여주는 작업
//    private ServletConfig servletConfig;

    // Servlet Interface Method's add

    // GenericServlet 을 사용하면 init 할 필요가 없음! 사실은 이건 비효율적임!
    // 1. Init method >> 첫번째 호출[최초 1회만 호출!]
    /*
    @Override
    public void init(ServletConfig config) throws ServletException {
        log.info("init");
        // ServletConfig
        this.servletConfig = config;
    }
     */

    /*
    // GenericServlet
    // 2. Service method >> 두번째 호출[2회 부터는 Service 만 계속해서 호출됨!]
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        log.info("service");
        // 피연산자, 연산자를 불러오는 getParameter 를 생성해줌 -> 요청!
        // operand1 variable -> Int type(형변환)
        int operand1 = Integer.parseInt(req.getParameter("operand1")); // Parameter 1(피연산자)
        // operator variable -> String type
        String operator = req.getParameter("operator"); // Parameter 2(연산자)
        // operand2 variable -> Int type(형변환)
        int operand2 = Integer.parseInt(req.getParameter("operand2")); // Parameter 3(피연산자)

        // 피연산자, 연산자를 통해 계산해주는 작업 실시 -> 요청해서 값을 받아오고!
        int result = Calculator.calculate(new PositiveNumber(operand1), operator, new PositiveNumber(operand2));

        // 피연산자, 연산자를 통해 계산된 값을 이제 응답해주는 작업! -> 요청한 값을 출력해주기!
        PrintWriter writer = res.getWriter(); // (피연산자1 + 연산자 + 피연산자2) = (result)
        // 값을 출력해줌!
        writer.println(result); // Output -> result variable(Client Response)
    }
     */

    /*
    [필요할때만 생성해서 사용하면 됨!]
    // destroy method
    @Override
    public void destroy() {
        // resource release
    }

    // getServletConfig method
    @Override
    public ServletConfig getServletConfig() {
        return this.servletConfig;
    }

    // getServletInfo method
    @Override
    public String getServletInfo() {
        return null;
    }
     */

}
