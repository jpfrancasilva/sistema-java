<%@ include file="/WEB-INF/paginas/cabecalhoAdmin.jsp"%>
<div id="main" class="container-fluid">
	<h3 class="page-header">Edição de hóspede</h3>
	<div class="row">
		<div class="col-md-offset-1 col-md-10 col-md-offset-1">
			<form action="sistema?logica=EditaHospede&codigoEd=${hospede.codigo}"
				method="POST">
				<div class="form-group row">
					<div class="col-xs-1">
						<label for="codigo" class="control-label">Código</label> <input
							type="text" class="form-control input-sm" name="codigoEd"
							disabled="disabled" value="${hospede.codigo}" />
					</div>
				</div>
				<div class="form-group">
					<label for="nome">Nome</label> <input type="text"
						class="form-control input-sm" name="nomeEd" value="${hospede.nome}" />
				</div>
				<div class="form-group">
					<label for="endereco">Endereço</label> <input type="text"
						class="form-control input-sm" name="enderecoEd"
						value="${hospede.endereco}" />
				</div>
				<div class="form-group">
					<label for="telefone">Fone</label> <input type="text"
						class="form-control input-sm" name="telefoneEd" value="${hospede.telefone}" />
				</div>
				<div class="form-group">
					<label for="cpf">CPF</label> <input type="text"
						class="form-control input-sm" name="cpfEd" value="${hospede.cpf}" />
				</div>
				<!-- <div class="form-group form-group-sm">
					<label for="pessoas" class="control-label">Nº de Pessoas</label> <select
						name="pessoas" class="form-control" id="pessoas">
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
				</div> -->
				<div class="form-group">
					<a href="sistema?logica=ListaHospedes" class="btn btn-default">Voltar</a>
					<input type="submit" class="btn btn-primary" value="Atualizar">
				</div>
			</form>
		</div>
	</div>
</div>
<%@ include file="/WEB-INF/paginas/rodape.jsp"%>