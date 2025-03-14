<!doctype html>
<html lang="en"
        xmlns:th="http://www.thymeleaf.org">>

<head>
<meta charset="UTF-8">
<title>Document</title>
<link th:href="@{/css/bootstrap/bootstrap.css}"
        rel="stylesheet" >

</head>
<body>
<div class="card">
<div class="card-header">
        CALCULADORA NOTAS
</div>
<div class="card-body">
<form th:action="@{/calcularpromedio}" method="post" th:object="${promedioModel}">

<div class="mb-3">
<label for="txtnota1" class="form-label">Ingrese su Nota 1:</label>
<input type="number" th:field="*{nota1}" class="form-control" id="txtnota1" placeholder="Ingrese su nota 1">
</div>

<div class="mb-3">
<label for="txtnota2" class="form-label">Ingrese su Nota 2:</label>
<input type="number" th:field="*{nota2}" class="form-control" id="txtnota2" placeholder="Ingrese su nota 2">
</div>

<div class="mb-3">
<label for="txtnota3" class="form-label">Ingrese su Nota 3:</label>
<input type="number" th:field="*{nota3}" class="form-control" id="txtnota3" placeholder="Ingrese su nota 3">
</div>

<div class="mb-3">
<label for="txtnota4" class="form-label">Ingrese EC final:</label>
<input type="number" th:field="*{nota4}" class="form-control" id="txtnota4" placeholder="Ingrese su nota 4">
</div>

<button type="submit" class="btn btn-primary">Calcular Promedio</button>

<!-- Alert that will show based on visualizaralerta -->
<div th:if="${visualizaralerta}" class="alert" th:classappend="${estilodiagnostico}" role="alert">
<span th:text="${resultado} ?: ''"></span>
</div>
</form>
</div>
</div>
</body>
</html>


}
