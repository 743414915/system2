package com.qfedu.fmmall.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qfedu.fmmall.vo.ResStatus;
import com.qfedu.fmmall.vo.ResultVO;
import io.jsonwebtoken.*;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component
public class CheckTokenInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String method = request.getMethod();
        if ("OPTIONS".equals(method)) {
            return true;
        }

        String token = request.getHeader("token");
//        System.out.println("---------" + token);
        if (token == null) {
            ResultVO resultVO = new ResultVO(ResStatus.LOGIN_FAIL_NOT, "请先登录！", null);

            //提示请先登录
            doResponse(response, resultVO);
            return false;
        } else {
            try {
//           验证token
                JwtParser parser = Jwts.parser();
                parser.setSigningKey("Chong000605");//解析token的setSigningKey，必须和生成token时设置的密码一致
                //如果token正确（1.密码正确 2.有效期内）则正常执行，否则抛出异常

                Jws<Claims> claimsJws = parser.parseClaimsJws(token);
                return true;
            } catch (ExpiredJwtException e) {
                ResultVO resultVO = new ResultVO(ResStatus.LOGIN_FAIL_TIMEOUT, "登陆过期！请重新登陆！", null);
                doResponse(response, resultVO);
            } catch (UnsupportedJwtException e) {
                ResultVO resultVO = new ResultVO(ResStatus.NO, "Token不合法！", null);
                doResponse(response, resultVO);
            } catch (Exception e) {
                ResultVO resultVO = new ResultVO(ResStatus.LOGIN_FAIL_NOT, "请先登录！", null);
                doResponse(response, resultVO);
            }
        }
        return false;
    }

    private void doResponse(HttpServletResponse response, ResultVO resultVO) throws IOException {

        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        PrintWriter writer = response.getWriter();
        String s = new ObjectMapper().writeValueAsString(new ResultVO(ResStatus.LOGIN_FAIL_NOT, "请先登录！", null));
        writer.print(s);
        writer.flush();
        writer.close();

    }

}
