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
					<li><a data-toggle="modal" data-target=".bs-example-modal-lgg">Usuarios</a></li>
					<li><a href="sistema?logica=Logout">Logout</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<!-- FIM DO MENU DE NAVEGAÇÃO -->
	
	
	<!-- MODAL PARA CONFIRMAR USUÁRIO ADMIN -->
			<div class="modal fade bs-example-modal-lgg" tabindex="-1"
				role="dialog" aria-labelledby="myLargeModalLabel">
				<div class="modal-dialog modal-lg" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
							<h2 class="modal-title text-center">Informe um usuário Admin</h2>
						</div>
						<div class="modal-body">
							<!-- FORMULÁRIO DE CADASTRO DE HÓSPEDES -->
							<div class="row">
								<div class="col-md-offset-1 col-md-10 col-md-offset-1">
									<form action="sistema?logica=BuscaUsuarioAdmin" method="post"
										id="cadastroHospedes" data-toggle="validator" role="form">
										<fieldset class="form-group">
											<legend>Usuário</legend>

											<div class="form-group form-group-sm">
												<label for="email" class="control-label">E-mail</label> <input
													type="text" class="form-control input-sm" name="email"
													placeholder="exemplo@exemplo.com" required="required">
											</div>

											<div class="form-group form-group-sm">
												<label for="senha" class="control-label">Senha</label>
												<input type="password" class="form-control input-sm"
													name="senha" placeholder="Senha">
											</div>
										</fieldset>

										<button type="submit" class="btn btn-primary">Confirmar</button>
										<button type="reset" class="btn btn-default"
											data-dismiss="modal">Cancelar</button>
									</form>
									<!-- FIM DO FORM -->

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		
		
