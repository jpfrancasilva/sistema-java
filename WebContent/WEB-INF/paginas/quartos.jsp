<%@ include file="/WEB-INF/paginas/cabecalho.jsp"%>
<div class="container-fluid">
	<div class="row">
		<div class=" col-md-12 main">
			<h2 class="page-header">Quartos</h2>
		</div>
	</div>

	<!-- LISTA DE QUARTOS CADASTRADOS-->
	<div id="list" class="row">
		<div
			class="table-responsive col-md-offset-1 col-md-10 col-md-offset-1">
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th>Código</th>
						<th>Andar</th>
						<th>Número</th>
						<th>Descrição</th>
						<th>Diária</th>
						<th>Tipo</th>
						<th>Situação</th>
						<th class="actions">Ações</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="quarto" items="${quartos}">
						<tr>
							<td>${quarto.codigo}</td>
							<td>${quarto.andar}</td>
							<td>${quarto.numero}</td>
							<td>${quarto.descricao}</td>
							<td>${quarto.valorDiaria}</td>
							<td>${quarto.tipo}</td>
							<td>${quarto.situacao}</td>
							<td class="actions"><a class="btn btn-primary btn-xs"
								href="sistema?logica=BuscaQuarto&codigo=${quarto.codigo}">Editar</a>
								<a onclick="return confirm('Você tem certeza que deseja deletar este quarto?')"
 								class="btn btn-danger btn-xs" href="sistema?logica=ExcluirQuarto&codigo=${quarto.codigo}" data-toggle="modal"
								data-target="sistema?logica=ExcluirQuarto">Excluir</a></td>
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
						<h2>Preencha os dados do novo quarto</h2>
						<form action="sistema?logica=CadastraQuartos" method="post"
							id="cadastraQuartos" data-toggle="validator" role="form">
							
							<div class="form-group form-group-sm">
								<label for="numero" class="control-label">Número</label> <input
									type="text" class="form-control" name="numero"
									placeholder="número do quarto" required="required">
							</div>

							<div class="form-group form-group-sm">
								<label for="andar" class="control-label">Andar</label> <input
									type="text" class="form-control" name="andar"
									placeholder="Ex: 1">
							</div>

							<div class="form-group form-group-sm">
								<label for="descricao" class="control-label">Descricao</label> <input
									type="text" class="form-control" name="descricao"
									placeholder="Ex: frigobar, tv etc" required="required">
							</div>

							<div class="form-group form-group-sm">
								<label for="valorDiaria" class="control-label">Diária</label> <input
									type="text" class="form-control" name="diaria"
									placeholder="Ex: 30.00" required="required">
							</div>

							<div class="form-group form-group-sm">
								<label for="tipo" class="control-label">Tipo</label> <select
									class="form-control" name="tipo" id="tipo">
									<option>Casal</option>
									<option>Solteiro</option>
								</select>
							</div>

							<!--  <div class="form-group form-group-sm">
								<label for="numeroPessoa" class="control-label">Máx. de
									Pessoas</label> <select name="numeroPessoa" class="form-control"
									id="numeroPessoa">
									<option>1</option>
									<option>2</option>
									<option>3</option>
									<option>4</option>
								</select>
							</div>  -->
							
							<div class="form-group form-group-sm">
								<label for="situacao" class="control-label">Situação</label>
								<select name="situacao" class="form-control" id="situacao">
									<option>Vago</option>
									<option>Reservado</option>
									<option>Ocupado</option>
								</select>
							</div>

							<button type="submit" class="btn btn-primary">Cadastrar</button>
							<button type="reset" class="btn btn-default" data-dismiss="modal">Cancelar</button>
						</form>
						<!-- FIM DO FORM -->
					</div>
				</div>
				<br>
			</div>
		</div>
	</div>
</div>
<%@ include file="/WEB-INF/paginas/rodape.jsp"%>