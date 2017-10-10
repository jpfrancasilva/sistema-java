<%@ include file="/WEB-INF/paginas/cabecalho.jsp"%>
<div id="main" class="container-fluid">
	<h3 class="page-header">Edição de Quarto</h3>
	<div class="row">
		<div class="col-md-offset-1 col-md-10 col-md-offset-1">
			<form action="sistema?logica=EditaQuarto&codigo=${quarto.codigo}"
				method="POST">
				<div class="form-group row">
					<div class="col-xs-1">
						<label for="codigo" class="control-label">Código</label> <input
							type="text" class="form-control input-sm" name="codigo"
							disabled="disabled" value="${quarto.codigo}" />
					</div>
				</div>
				<div class="form-group">
					<label for="numero">Nº</label> <input type="text"
						class="form-control input-sm" name="numero"
						value="${quarto.numero}" />
				</div>
				<div class="form-group">
					<label for="andar">Andar</label> <input type="text"
						class="form-control input-sm" name="andar" value="${quarto.andar}" />
				</div>
				<div class="form-group">
					<label for="descricao">Descrição</label>
					<textarea class="form-control" rows="5" id="descricao"
						name="descricao">${quarto.descricao}</textarea>
				</div>
				<div class="form-group">
					<label for="diaria">Diária</label> <input type="text"
						class="form-control input-sm" name="diaria"
						value="${quarto.valorDiaria}" />
				</div>
				<div class="form-group">
					<label for="tipo">Tipo</label> <input type="text"
						class="form-control input-sm" name="tipo" value="${quarto.tipo}" />
				</div>
				<div class="form-group form-group-sm">
					<label for="pessoas" class="control-label">Nº de Pessoas</label> <input
						type="text" class="form-control input-sm" name="numeroPessoa"
						id="numeroPessoas" value="${quarto.numeroPessoa}" />
				</div>
				<div class="form-group">
					<label for="cpf">CPF</label> <input type="text"
						class="form-control input-sm" name="cpf" value="${hospede.cpf}" />
				</div>
				<div class="form-group">
					<a href="sistema?logica=ListaHospedes" class="btn btn-default">Voltar</a>
					<input type="submit" class="btn btn-primary" value="Atualizar">
				</div>
			</form>
		</div>
	</div>
</div>
<%@ include file="/WEB-INF/paginas/rodape.jsp"%>ml>
