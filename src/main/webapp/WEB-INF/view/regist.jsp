<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
    <title>用户注册页面</title>
</head>
<body>
    <h3>注册页面</h3>
    <hr/>
    <form action="${pageContext.request.contextPath}/user/doRegist" method="post">
        <table>
            <tr height="35px">
                <td width="100px">用户名</td>
                <td width="270px">
                    <input type="text" name="userName">
                </td>
            </tr>
            <tr height="35px">
                <td>密码</td>
                <td>
                    <input type="text" name="userPassword">
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" id="regist" value="注册"/>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>