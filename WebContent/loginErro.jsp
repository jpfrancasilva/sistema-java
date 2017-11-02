<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="icon" href="#">
	
		<title>Login do usuário</title>
		
		<!-- Bootstrap core CSS -->
		<link href="css/bootstrap.min.css" rel="stylesheet">
		
		<!-- Custom styles for this template -->
		<link href="css/dashboard.css" rel="stylesheet">
		<!-- CSS Customizado do login -->
		<link href="css/login.css" rel="stylesheet">
	</head>
	<body>
		<section id="login">
			<div class="container">
				<div class="row">
					<div class="col-xs-12">
						<div class="form-wrap">
							<h1>Faça o login com seu email e senha!</h1>
							<form role="form" action="sistema?logica=Login" method="post"
								id="login-form" autocomplete="off">
								<div class="form-group">
									<label for="email" class="sr-only">Email</label> <input
										type="email" name="email" id="email" class="form-control"
										placeholder="seuemail@example.com">
								</div>
								<div class="form-group">
									<label for="senha" class="sr-only">Senha</label> <input
										type="password" name="senha" id="senha" class="form-control"
										placeholder="senha">
								</div>
								<input type="submit" id="btn-login"
									class="btn btn-custom btn-lg btn-block" value="Entrar">
							</form>
							<hr>
							<h3 style="color: red" align="center">Usuário ou senha incorretos!!!</h3>
						</div>
					</div>
					<!-- /.col-xs-12 -->
				</div>
				<!-- /.row -->
			</div>
			<!-- /.container -->
		</section>
	
		<footer id="footer">
			<div class="container">
				<div class="row">
					<div class="col-xs-12">
						<h5>Sistema Rasengan</h5>
					</div>
				</div>
			</div>
		</footer>
	</body>
</html>