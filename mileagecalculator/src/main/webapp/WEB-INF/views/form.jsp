<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="/style.css" />
<head>
<meta charset="ISO-8859-1">
<title>Mileage Form</title>
</head>
<body>
	<div>
		<h1>Mileage Calculator:</h1>
	</div>
	<div>
		<form action="result">

			<p>
				MPG: <input type="number" name="MPG" min="0" max="1000" step="1.0" />
			</p>
			<p>
				Gallons: <input type="number" name="Gallons" min="0" max="1000"
					step="1.0" />
			</p>

			<button type="submit">Submit</button>

		</form>
	</div>
	<div>
		<p>
			<a href="/">Back to the home page! (click me :D)</a>
		</p>
		<p>
			<a href="/result?MPG=14&Gallons=18">Pre-made calculation for
				testing (click me :D)</a>
		</p>
	</div>
</body>
<footer>
	<h3>Website made by @Keele</h3>
</footer>
</html>