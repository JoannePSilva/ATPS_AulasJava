<%
int id = (int)request.getAttribute("id"));
%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sucesso</title>
</head>
<body>
    <h1>Página de sucesso</h1>
    <p>Categoria de id - <% = id %>  cadastrada com sucesso</p>
    <a href="/atp_aula-1/categoria/listar">Listagem</a>
</body>
</html>