<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Properties" %>
    
<%
  Properties p = new Properties();
  try (var is = application.getResourceAsStream("/WEB-INF/classes/build-info.properties")) {
      if (is != null) { p.load(is); }
  }
%>

<!DOCTYPE html>
<html>
<head>
  <title>To-Do List</title>
</head>
<body>


  <h1>To-Do List</h1>

  <input type="text" id="taskInput" placeholder="Enter task!!!!!!!">
  <button onclick="addTask()">Add</button>

  <hr>

  <ol id="taskList"></ol>



</body>
</html>