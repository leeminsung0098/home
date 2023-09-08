<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
</head>
<body>
	<div class="container">
		<h2 class="text-center">MemberList</h2>
		<table class="table table-membered table">
			<tread>
			<tr>
				<th>아이디</th>
				<th>패스워드</th>
				<th>이름</th>
				<th>이메일</th>
				<th>휴대폰 번호</th>
				<th>생년월일</th>
				<th>가입날짜</th>
			</tr>
			</tread>
			<tbody>
				<c:forEach var="member" items="${list}">
					<tr>
						<td>${member.user_uid}</td>
						<td><a herf="view.do?user_uid=${member.user_uid}">${member.id}</a>
						</td>
						<td>${member.name }</td>
						<td>${member.email }</td>
						<td>${member.burth }</td>
						<td>${member.regdate }</td>
					</tr>
				</c:forEach>
				<tr>
					<td colspan="5" class="text-center">
						<button onclick="location.herf='write'">신규 등록</button>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
</body> 
</html>