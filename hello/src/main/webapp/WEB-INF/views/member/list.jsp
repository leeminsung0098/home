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
				<th>���̵�</th>
				<th>�н�����</th>
				<th>�̸�</th>
				<th>�̸���</th>
				<th>�޴��� ��ȣ</th>
				<th>�������</th>
				<th>���Գ�¥</th>
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
						<button onclick="location.herf='write'">�ű� ���</button>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
</body> 
</html>