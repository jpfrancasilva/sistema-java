<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="#">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="css/dashboard.css" rel="stylesheet">


<body>

<!-- MENU DE NAVEGAÇÃO -->
	<nav class="navbar navbar-inverse bg-primary navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="sistema?logica=VisaoGeral">Rasengan</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="sistema?logica=VisaoGeral">Início</a></li>
					<li><a href="sistema?logica=ListaHospedes">Hóspedes</a></li>
					<li><a href="sistema?logica=ListaQuartos">Quartos</a></li>
					<li><a href="sistema?logica=ListaReservas">Reservas</a></li>
					<li><a href="sistema?logica=Logout">Logout</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<!-- FIM DO MENU DE NAVEGAÇÃO -->
