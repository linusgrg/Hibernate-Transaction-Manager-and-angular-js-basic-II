<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page session="false"%>
<html>
<head>
<script type="text/javascript"
	src="<spring:url value="resources/javascript/angular.min.js"/>"></script>
<script type="text/javascript"
	src="<spring:url value="resources/javascript/angular-route.js"/>"></script>
<script type="text/javascript"
	src="<spring:url value="resources/javascript/angularApp.js"/>"></script>
<title>Home</title>
</head>
<body ng-app="myApp">

<ul>
    <li><a href="#/">Home</a></li>
    <li><a href="#/product">Insert price</a></li>
    <li><a href="#/display">Display List</a></li>
</ul>

 <!-- angular templating -->
    <!-- this is where content will be injected -->
    <div ng-view></div>

</body>
</html>
