<%@ include file="/WEB-INF/paginas/cabecalho.jsp"%>

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
			<h2 class="page-header">Reservas</h2>
		</div>
	</div>

	<!-- LISTA DE QUARTOS CADASTRADOS-->
	<div id="list" class="row">
		<div
			class="table-responsive col-md-offset-1 col-md-10 col-md-offset-1">
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th>Data Entrada</th>
						<th>Data Saida</th>
						<th>Valor Total</th>
						<th>Hospede</th>
						<th>Cpf</th>
						<th>Quarto</th>
						<th>Dias</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="reserva" items="${reservas}">
						<tr>
							<td>${reserva.dataEntrada}</td>
							<td>${reserva.dataSaida}</td>
							<td>${reserva.valor}</td>
							<td>${reserva.nomeHospede}</td>
							<td>${reserva.cpfHospede}</td>
							<td>${reserva.codigoQuarto}</td>
							<td>${reserva.dias}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>
<%@ include file="/WEB-INF/paginas/rodape.jsp"%>