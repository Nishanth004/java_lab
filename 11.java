<!DOCTYPE html>
<html>
<head>
    <title>Age Check</title>
</head>
<body>
    <form onsubmit="checkAge(event)">
        Name: <input type="text" id="name"><br>
        Age: <input type="number" id="age"><br>
        <input type="submit" value="Submit">
    </form>

    <script>
        function checkAge(event) {
            event.preventDefault();
            var name = document.getElementById('name').value;
            var age = document.getElementById('age').value;
            if (age < 18) {
                alert("Hello " + name + ", you are not authorized to visit the site.");
            } else {
                alert("Welcome to this site");
            }
        }
    </script>
</body>
</html>
