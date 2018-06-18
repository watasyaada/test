<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<html>
<head>
<meta charset="UTF-8">
<title>お問合わせ　受付完了</title>
</head>
<body>
<table>
<tbody>
<tr>
<th>名前</th>
<th>お問合わせの種類</th>
<th>お問合わせの内容</th>
</tr>

  <s:iterator value="inquiryDTOList">
  <tr>


  <td><s:property value="name" /></td>


  <s:if test='qtype=="company"'>
  <td>会社について</td>
  </s:if>


  <s:if test='qtype=="product"'>
  <td>製品について</td>
  </s:if>

  <td><s:property value="body" /></td>
  </tr>
  </s:iterator>

</tbody>
</table>

</body>
</html>