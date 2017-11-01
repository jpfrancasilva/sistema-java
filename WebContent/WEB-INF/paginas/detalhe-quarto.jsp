<%@ include file="/WEB-INF/paginas/cabecalho.jsp"%>
<div id="main" class="container-fluid">
	<h3 class="page-header">Edição de Quarto</h3>
	<div class="row">
		<div class="col-md-offset-1 col-md-10 col-md-offset-1">
			<form action="sistema?logica=EditarQuarto&codigo=${quarto.codigo}"
				method="POST">
				<div class="form-group row">
					<div class="col-xs-1">
						<label for="codigo" class="control-label">Código</label> <input
							type="text" class="form-control input-sm" name="codigo"
							disabled="disabled" value="${quarto.codigo}" />
					</div>
				</div>
				<div class="form-group">
					<label for="andar">Andar</label> <input type="text"
						class="form-control input-sm" name="andar" value="${quarto.andar}" />
				</div>
				<div class="form-group">
					<label for="numero">Nº</label> <input type="text"
						class="form-control input-sm" name="numero"
						value="${quarto.numero}" />
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
					<label for="tipo">Tipo</label> 
								<select
									class="form-control" name="tipo" id="tipo" value="${quarto.tipo}">
									<option>Casal</option>
									<option>Solteiro</option>
								</select>
				</div>
				<div class="form-group">
					<label for="situacao">Situacao</label> <input type="text"
						 class="form-control input-sm" name="situacao" 
						value="${quarto.situacao}" disabled/>
				</div>
				<div class="form-group">
					<a href="sistema?logica=ListaQuartos" class="btn btn-default">Voltar</a>
					<input type="submit" class="btn btn-primary" value="Atualizar">
				</div>
			</form>
		</div>
	</div>
</div>
<%@ include file="/WEB-INF/paginas/rodape.jsp"%>
