<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib prefix="jstlcore" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="java.util.*"%>
<%@ page import="com.csu.ohio.student.bean.SemesterWiseFeePaidReportBean"%>
<%@ page import="com.csu.ohio.student.bean.SemesterBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet"/>
<script type="text/javascript"	src="${pageContext.request.contextPath}/resources/js/datetimepicker.js"></script>
<title>Semester - Fee Paid Report</title>
<script type="text/javascript">
function callSubmit() {
	var fromDate = document.getElementById("fromdate").value;
    var toDate = document.getElementById("todate").value;

    if ((Date.parse(fromDate) > Date.parse(toDate))) {
        alert("To date should be greater than or equal to From date");
        document.getElementById("todate").value = "";
        return;
    }
	document.forms["form1"].action="loadSemesterWiseFeePaidReportPage.html";
	document.forms["form1"].submit();
}
</script>
</head>
<body>
<div class="container">
<jsp:include page="include.jsp" />
<h2 align="center">Semester - Semester Wise Paid Report</h2>
</div>	
<f:form name="form1" modelAttribute="semesterWiseFeePaidReportBean">

<table width="1000px" align="center" class="container">
				<tr>
					<td><b>Semester Name:<font color="red">*</font> </b></td>
					<td><f:select path="semester">
						java.lang.Object value = (java.lang.Object) pageContext.getAttribute("value");
						<f:option value="" label="--select--"></f:option>
							<f:options items="${semesterList}"  itemValue="semester" itemLabel="semester"/>
						</f:select>
					</td>
					
					<td><b>From Date:</b></td>
					<td><f:input path="fromDate" readonly="true" onclick="javascript:NewCssCal('fromdate')" id="fromdate" /></td>

					<td><b>To Date:</b></td>
					<td><f:input path="toDate" readonly="true" onclick="javascript:NewCssCal('todate')" id="todate" /></td>


					
					<td><input type="button" value="Search"
						onClick="javascript:callSubmit();" /></td>

				</tr>
				<tr>
					<td colspan="2"><font color="red"><% java.util.List<?> messages = (java.util.List<?>) pageContext.getAttribute("messages");%></font>
					</td>					
				</tr>
				

</table>

<br>

<jstlcore:if test="${!empty vendorBean}">
				
<table width="800px" class="container">
<tr>
<th>Student Id:</th>
<td>${semesterBean.studentId}</td>
<th>Student Name:</th>
<td>${semesterBean.studentName}</td>
<%-- <th>Contact Person:</th>
<td>${vendorBean.contactPerson}</td> --%>
<td></td>
</tr>
</table>
</jstlcore:if>



<jstlcore:if test="${!empty semesterWiseFeePaidReportBeanList}">
<%
	List<SemesterWiseFeePaidBeanList> semesterWiseFeePaidReportBeanList  = (ArrayList)session.getAttribute("semesterWiseFeePaidBeanList");
%>
			<jstlcore:set var="semesterWiseFeePaidBeanList" scope="session" value="<%=semesterWiseFeePaidBeanList%>" />
			<jstlcore:set var="totalCount" scope="session"
				value="<%=semesterWiseFeePaidBeanList.size()%>" />
			<jstlcore:set var="perPage" scope="session" value="${5}" />
			<jstlcore:set var="pageStart" value="${param.start}" />
			<jstlcore:if test="${empty pageStart or pageStart < 0}">
				<jstlcore:set var="pageStart" value="0" />
			</jstlcore:if>
			<jstlcore:choose>
			<jstlcore:when test="${totalCount <= perPage}">
				<jstlcore:set var="pageStart" value="0" />
			</jstlcore:when>
			<jstlcore:when test="${totalCount == pageStart + perPage}">
				<jstlcore:set var="pageStart" value="${pageStart - perPage}" />
			</jstlcore:when>
			<jstlcore:when test="${totalCount < pageStart}">
				<jstlcore:set var="pageStart" value="${pageStart - perPage}" />
			</jstlcore:when>
			</jstlcore:choose>			
			<div class="container" align="right">
			<a href="?start=${pageStart - perPage}" class="next">&laquo;</a>
			${pageStart + 1} - 
			<jstlcore:choose>
			<jstlcore:when test="${totalCount < perPage}">
				${totalCount}
			</jstlcore:when>
			<jstlcore:when test="${totalCount < perPage + pageStart}">
				${totalCount}
			</jstlcore:when>
			<jstlcore:otherwise>
				${pageStart + perPage} 
			</jstlcore:otherwise>
			</jstlcore:choose>
			
			
    		<a href="?start=${pageStart + perPage}"  class="next">&raquo;</a>
    		</div>
	<TABLE id="dataTable" border="1" class="container">
	<tr class="tr1">
		<th>Student Id</th>
		<th>Student Name</th>
		<th>Semester</th>
		<th>Fee Paid Amount (&#8377;)</th>
		<!-- <th>Balance (&#8377;)</th> -->
		<th>Fee Paid Date</th>
	</tr>
	<jstlcore:forEach items="${semesterWiseFeePaidBeanList}" var="semesterWiseFeePaidBeanList" begin="${pageStart}" end="${pageStart + perPage - 1}" varStatus="i">
	<jstlcore:set var = "j" value="${i.index}" />
		<tr>
		<td align="center">${j+1}</td>
		<td align="center"><jstlcore:out value="${semesterWiseFeePaidBeanList.studenyId}"></jstlcore:out></td>
		<td align="center"><jstlcore:out value="${semesterWiseFeePaidBeanList.studentName}"></jstlcore:out></td>
		<td align="center"><jstlcore:out value="${semesterWiseFeePaidBeanList.semester}"></jstlcore:out></td>
		<%-- <td align="center"><jstlcore:out value="${semesterWiseFeePaidBeanList.feePaidAmount}"></jstlcore:out></td> --%>
		<%-- <td align="center"><jstlcore:out value="${semesterWiseFeePaidBeanList.materialUnitName}"></jstlcore:out></td> --%>
		<td align="center"><fmt:formatNumber type="number" groupingUsed="true" minFractionDigits="2" value="${semesterWiseFeePaidBeanList.feePaidAmount}" /></td>
		<%-- <td align="center"><fmt:formatNumber type="number" groupingUsed="true" minFractionDigits="2" value="${vendorWisePurchaseBeanList.balance}" /></td> --%>	
		<td align="center">
		<fmt:parseDate value="${semesterWiseFeePaidBeanList.feePaidDate}" type="DATE" pattern="yyyy-MM-dd" var="feePaidDate"/> 
		<fmt:formatDate value="${feePaidDate}" pattern="dd-MMM-yyyy" type="DATE"/>
		</td>
		</tr>
	</jstlcore:forEach>
	</TABLE>
	</jstlcore:if>
	<h4 align="center" style="color: red">${message}</h4>
</f:form>

<div class="terms2">
  <p align="center" style="font-family: calibri;color: #6666CC;">Copyright © 2021 Cleveland State University All Rights Reserved.</p>
</div>
</body>
</html>