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
						<th>C�digo</th>
						<th>Andar</th>
						<th>N�mero</th>
						<th>Descri��o</th>
						<th>Di�ria</th>
						<th>Tipo</th>
						<th>Situa��o</th>
						<th class="actions">A��es</th>
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
								<a onclick="return confirm('Voc� tem certeza que deseja deletar este quarto?')"
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
				<!-- FORMUL�RIO DE CADASTRO DE H�SPEDES -->
				<div class="row">
					<div class="col-md-offset-1 col-md-10 col-md-offset-1">
						<h2>Preencha os dados do novo quarto</h2>
						<form action="sistema?logica=CadastraQuartos" method="post"
							id="cadastraQuartos" data-toggle="validator" role="form">
							
							<div class="form-group form-group-sm">
								<label for="numero" class="control-label">N�mero</label> <input
									type="text" class="form-control" name="numero"
									placeholder="n�mero do quarto" required="required">
							</div>

							<div class="form-group form-group-sm">
								<label for="andar" class="control-label">Andar</label> <input
									type="text" class="form-control" name="andar" required="required"
									placeholder="Ex: 1">
							</div>

							<div class="form-group form-group-sm">
								<label for="descricao" class="control-label">Descricao</label> <input
									type="text" class="form-control" name="descricao"
									placeholder="Ex: frigobar, tv etc" required="required">
							</div>

							<div class="form-group form-group-sm">
								<label for="valorDiaria" class="control-label">Di�ria</label> <input
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
								<label for="numeroPessoa" class="control-label">M�x. de
									Pessoas</label> <select name="numeroPessoa" class="form-control"
									id="numeroPessoa">
									<option>1</option>
									<option>2</option>
									<option>3</option>
									<option>4</option>
								</select>
							</div>  -->
							
							<div class="form-group form-group-sm">
								<label for="situacao" class="control-label">Situa��o</label>
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