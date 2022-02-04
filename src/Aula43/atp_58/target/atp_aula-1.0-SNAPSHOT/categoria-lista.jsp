<%@page import= "java.util.ArrayList, com.joanne.atp_aula.models.Categoria;"%> 


<%
ArrayList<Categoria> categorias = (ArrayList<Categoria>)request.getAttribute("categorias"));
%> 

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/atp_aula/src/main/webapp/css/style.css">
    <title>Lista</title>
</head>
<body>
    <h1>Cadastro</h1>
    <form action="/atp_aula-1/categoria/listar" method="get">
        Nome da vaga:<input type="text" name="nome" id="nome">
        <input type="submit" value="Filtrar">
    </form>
    <table>
        <thead>
            <tr>
                <th>Descrição:</th>
                <th>Requisitos Obrigatórios:</th>
                <th>Requisitos Desejáveis:</th>
                <th>Remuneração:</th>
                <th>Local de Trabalho:</th>
            </tr>
        </thead>
        <tbody>
            <% for (Cadastro model : cadastros) { %>
                <tr>
                    <td><%= model.getId() %></td>
                    <td><%= model.getDescrição() %></td>
                    <td><%= model.getRequisitosObrigatorios() %></td>
                    <td><%= model.getRequisitosDesejaveis() %></td>
                    <td><%= model.getRemuneracao() %></td>
                    <td><%= model.getLocalDeTrabalho() %></td>
                    
                </tr>
            <%}%>
        </tbody>
    </table>
</body>

<script type="text/javascript" src="_javascript/acordeon.js"></script>
<script type="text/javascript" src="_javascript/valida_form.js"></script>
<script type="text/javascript" src="_javascript/json.js"></script>

</html>