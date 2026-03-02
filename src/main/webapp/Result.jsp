<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title style="color:green;">Result</title>
</head>
<body>

<h2 style="color:green;">
    Result:
    <%= request.getAttribute("result") %>
</h2>

<br>
<a href="Number.jsp">Back</a>

</body>
</html>
