<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ajouter une catégorie de bateau</title>
</head>
<body>
    <form action="Resultat.jsp" method="post">
        <select name="categorie" id="categorie">
            <option value="#">Categorie de bateau</option>
            <option value="#">Marchandise</option>
            <option value="#">Peche</option>
            <option value="#">Pacquebot</option>
        </select>
            <input type="date" name="datedebut" id="datedebut" placeholder="Date debut">
            <input type="date" name="datefin" id="datefin" placeholder="Date fin">
        <select name="pavillon" id="pavillon">
            <option value="#">Pavillon</option>
            <option value="#">National</option>
            <option value="#">International</option>
        </select>
        <button type="submit">Valider</button>
    </form>
</body>
</html>
