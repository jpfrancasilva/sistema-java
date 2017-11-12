<%@ include file="/WEB-INF/paginas/cabecalhoAdmin.jsp"%>

<script>
jQuery(function($){
$("#campoData").mask("99/99/9999");
$("#campoTelefone").mask("(999) 999-9999");
$("#campoSenha").mask("***-****");
$("#campoCpf").mask("999.999.999-99");
$("#numeroQuarto").mask("99");
$("numeroAndar").mask("99");
});
</script>

<div class="container-fluid">
	<div class="row">
		<div class="col-md-12 main">
			<h2 class="page-header">Lista de Usuarios</h2>
		</div>
	</div>

	<!-- LISTA DE HÓSPEDES CADASTRADOS-->
	<div id="list" class="row">
		<div
			class="table-responsive col-md-offset-1 col-md-10 col-md-offset-1">
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th>Nome</th>
						<th>E-mail</th>
						<!-- <th>Senha</th>-->
						<th>Tipo</th>
						<th class="actions">Ações</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="usuario" items="${usuarios}">
						<tr>
							<td>${usuario.nome}</td>
							<td>${usuario.email}</td>
							<td>${usuario.tipo}</td>
							<td class="actions"><a class="btn btn-primary btn-xs"
								href="sistema?logica=Busca&codigo=${usuario.nome}">Editar</a>
								<a
								onclick="return confirm('Você tem certeza que deseja deletar este usuario?')"
								class="btn btn-danger btn-xs"
								href="sistema?logica=Excluir&codigo=${usuario.nome}"
								data-toggle="modal">Excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

			<button type="button" class="btn btn-success" data-toggle="modal"
				data-target=".bs-example-modal-lg">Novo</button>
		</div>
	</div>

	<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog"
		aria-labelledby="myLargeModalLabel">
		<div class="modal-dialog modal-lg" role="document">
			<div class="modal-content">
				<br>
				<!-- FORMULÁRIO DE CADASTRO DE HÓSPEDES -->
				<div class="row">
					<div class="col-md-offset-1 col-md-10 col-md-offset-1">
						<h2>Preencha os dados do novo hóspede</h2>
						<form action="sistema?logica=CadastraHospedes" method="post"
							id="cadastroHospedes" data-toggle="validator" role="form">

							<div class="form-group form-group-sm">
								<label for="nome" class="control-label">Nome</label> <input
									type="text" class="form-control" name="nome"
									placeholder="Nome do hóspede" required="required">
							</div>

							<div class="form-group form-group-sm">
								<label for="endereco" class="control-label">Endereço</label> <input
									type="text" class="form-control" name="endereco" required="required"
									placeholder="Endereço do hóspede">
							</div>

							<div class="form-group form-group-sm">
								<label for="telefone" class="control-label">Telefone</label> <input
									type="text" class="form-control" name="telefone"
									placeholder="Telefones do hóspede" required="required">
							</div>

							<div class="form-group form-group-sm">
								<label for="cpf" class="control-label">CPF</label> <input
									type="text" class="form-control" name="cpf"
									placeholder="somente números" required="required">
							</div>

							<!--  <div class="form-group form-group-sm">
								<label for="pessoas" class="control-label">Nº de Pessoas</label>
								<select name="pessoas" class="form-control" id="pessoas">
									<option>1</option>
									<option>2</option>
									<option>3</option>
									<option>4</option>
									<option>5</option>
									<option>6</option>
									<option>7</option>
									<option>8</option>
									<option>9</option>
									<option>10</option>
								</select>
							</div>  -->

							<button type="submit" class="btn btn-primary">Cadastrar</button>
							<button type="reset" class="btn btn-default" data-dismiss="modal">Cancelar</button>
						</form>
						<br>
						<!-- FIM DO FORM -->
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ include file="/WEB-INF/paginas/rodape.jsp"%>