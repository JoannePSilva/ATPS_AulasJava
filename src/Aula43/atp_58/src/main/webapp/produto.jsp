<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="/atp_aula/src/main/webapp/css/style.css">
        <title>Produtos</title>
    </head>
<body>
<table>
<form action="/atp_aula-1/categoria-lista">
  <!--  <form action="/empregos_vagas/sucesso.jsp" method="post"> -->
    <tr><th colspan=2>Cadastro</th></tr>
    <tr><td><label for="texto">Descrição:</label></td>
      <td><input type="text" name="texto" id="texto" required autocomplete="off"
      maxlength="20" minlength="10" onblur="validar_texto();"></td></tr>
  
  <tr><td><label for="texto">Requisitos Obrigatórios:</label></td>
    <td><input type="text" name="ro" id="ro" required autocomplete="off"
    maxlength="20" minlength="10" onblur="validar_texto();"></td></tr>

    <tr><td><label for="texto">Requisitos Desejáveis:</label></td>
      <td><input type="text" name="re" id="re" required autocomplete="off"
      maxlength="20" minlength="10" onblur="validar_texto();"></td></tr>
      
    <tr><td><label for="texto">Remuneração:</label></td>
      <td><input type="number" name="remuneracao" id="remuneracao" required autocomplete="off"
        maxlength="20" minlength="10" onblur="validar_texto();"></td></tr>

    <tr><td><label for="texto">Local de trabalho:</label></td>
      <td><input type="text" name="texto" id="texto" required autocomplete="off"
        maxlength="20" minlength="10" onblur="validar_texto();"></td></tr>
                           
    </select></td></tr>
    <input type ="submit" value="salvar">
    </form>

  
  <!--<tr><th><button type="submit" id = "submit" name="submit" value ="submit"> Enviar</button></th> 
  
    <h1>Cadastro de produtos</h1>
    nome:<input type= "text" name="nome" id="nome">
    valor:<input type= "number" name="nome" id="nome">
    id:<input type= "number" name="produto" id="id_categoria">-->
    
</body>
</html>