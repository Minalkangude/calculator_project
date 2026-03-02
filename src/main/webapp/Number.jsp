<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
</head>
<body>

<h2 style="color:green;">Simple Calculator</h2>

<form action="calculate" method="post">
    Number 1:
    <input type="text" name="num1" required><br><br>

    Number 2:
    <input type="text" name="num2" required><br><br>

    Operation:
    <select name="operation">
        <option value="add">+</option>
        <option value="sub">-</option>
        <option value="mul">*</option>
        <option value="div">/</option>
    </select><br><br>

    <input type="submit" value="Calculate">
</form>

</body>
</html>
