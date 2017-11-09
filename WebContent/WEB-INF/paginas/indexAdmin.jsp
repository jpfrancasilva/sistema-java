<%@ include file="/WEB-INF/paginas/cabecalhoAdmin.jsp"%>
<div class="container-fluid">
	<div class="row">
		<div class=" col-md-12 main">
			<h2 class="page-header">Painel de Controle
			<a class="btn btn-sm btn-success" href="sistema?logica=VisaoGeralVagos">Vagos</a>
			<a  class="btn btn-sm btn-primary" href="sistema?logica=VisaoGeralReservados">Reservados</a>
			<a  class="btn btn-sm btn-danger" href="sistema?logica=VisaoGeralOcupados">Ocupados</a>
			</h2>
			
			<c:forEach var="quarto" items="${quartos}">
				<div class="col-md-3">

					<c:choose>
						<c:when test="${quarto.situacao == 'Vago'}">
							<div class="panel panel-success">
								<div class="panel-heading">
									<h3 class="panel-title">
										<i class="fa fa-bed" style="font-size: 28px">
											${quarto.codigo} - ${quarto.situacao}</i>
									</h3>
								</div>
								<div class="panel-body">
									<p>
										<strong>Andar:</strong> ${quarto.andar}
									</p>
									<p>
										<strong>Itens:</strong> ${quarto.descricao}
									</p>
									<p>
										<strong>Tipo:</strong> ${quarto.tipo}
									</p>
									<p>
										<strong>Valor diária:</strong>R$ ${quarto.valorDiaria}
									</p>
									<p>
										<strong>Hospede:</strong> ${hospede.nome}
									</p>
								</div>
								<div class="panel-footer">
									<button type="button" class="btn btn-sm btn-success"
										disabled="disabled">Check-in</button>
									<button type="button" class="btn btn-sm btn-primary"
										data-toggle="modal" data-target=".bs-example-modal-lg">Reserva</button>
									<button type="button" class="btn btn-sm btn-danger"
										disabled="disabled">Check-out</button>
								</div>
							</div>
						</c:when>

						<c:when test="${quarto.situacao == 'Ocupado'}">
							<div class="panel panel-danger">
								<div class="panel-heading">
									<h3 class="panel-title">
										<i class="fa fa-bed" style="font-size: 28px">
											${quarto.codigo} - ${quarto.situacao}</i>
									</h3>
								</div>
								<div class="panel-body">
									<p>
										<strong>Andar:</strong> ${quarto.andar}
									</p>
									<p>
										<strong>Itens:</strong> ${quarto.descricao}
									</p>
									<p>
										<strong>Tipo:</strong> ${quarto.tipo}
									</p>
									<p>
										<strong>Valor diária:</strong>R$ ${quarto.valorDiaria}
									</p>
									<p>
										<strong>Hospede:</strong> ${hospede.nome}
									</p>
								</div>
								<div class="panel-footer">
									<button type="button" class="btn btn-sm btn-success"
										disabled="disabled">Check-in</button>
									<button type="button" class="btn btn-sm btn-primary"
										disabled="disabled">Reserva</button>
									<button type="button" class="btn btn-sm btn-danger">Check-out</button>
								</div>
							</div>
						</c:when>

						<c:when test="${quarto.situacao == 'Reservado'}">
							<div class="panel panel-warning">
								<div class="panel-heading">
									<h3 class="panel-title">
										<i class="fa fa-bed" style="font-size: 28px">
											${quarto.codigo} - ${quarto.situacao}</i>
									</h3>
								</div>
								<div class="panel-body">
									<p>
										<strong>Andar:</strong> ${quarto.andar}
									</p>
									<p>
										<strong>Itens:</strong> ${quarto.descricao}
									</p>
									<p>
										<strong>Tipo:</strong> ${quarto.tipo}
									</p>
									<p>
										<strong>Valor diária:</strong>R$ ${quarto.valorDiaria}
									</p>
									<p>
										<strong>Hospede:</strong> ${hospede.nome}
									</p>
								</div>
								<div class="panel-footer">
									<button type="button" class="btn btn-sm btn-success">Check-in</button>
									<button type="button" class="btn btn-sm btn-primary"
										disabled="disabled">Reserva</button>
									<button type="button" class="btn btn-sm btn-danger">Cancelar</button>
								</div>
							</div>
						</c:when>
					</c:choose>
				</div>
			</c:forEach>

			<!-- MODAL COM FORMULÁRIA DE RESERVA DE QUARTO -->
			<div class="modal fade bs-example-modal-lg" tabindex="-1"
				role="dialog" aria-labelledby="myLargeModalLabel">
				<div class="modal-dialog modal-lg" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
							<h2 class="modal-title text-center">Reserva de quarto</h2>
						</div>
						<div class="modal-body">
							<!-- FORMULÁRIO DE CADASTRO DE HÓSPEDES -->
							<div class="row">
								<div class="col-md-offset-1 col-md-10 col-md-offset-1">
									<form action="sistema?logica=CheckinHospede" method="post"
										id="cadastroHospedes" data-toggle="validator" role="form">
										<fieldset class="form-group">
											<legend>Dados do hóspede</legend>

											<div class="form-group form-group-sm">
												<label for="nome" class="control-label">Nome</label> <input
													type="text" class="form-control input-sm" name="nome"
													placeholder="Nome do hóspede" required="required">
											</div>

											<div class="form-group form-group-sm">
												<label for="endereco" class="control-label">Endereço</label>
												<input type="text" class="form-control input-sm"
													name="endereco" placeholder="Endereço do hóspede">
											</div>

											<div class="form-group form-group-sm">
												<label for="telefone" class="control-label">Telefone</label>
												<input type="text" class="form-control input-sm"
													name="telefone" placeholder="Telefones do hóspede"
													required="required">
											</div>

											<div class="form-group form-group-sm">
												<label for="cpf" class="control-label">CPF</label> <input
													type="text" class="form-control input-sm" name="cpf"
													placeholder="somente números" required="required">
											</div>

											<div class="form-group form-group-sm">
												<label for="pessoas" class="control-label">Nº de
													Pessoas</label> <select name="pessoas" class="form-control"
													id="pessoas">
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
											</div>

										</fieldset>

										<fieldset class="form-group">
											<legend>Dados da Reserva</legend>

											<div class="form-group form-group-sm">
												<label for="dataEntrada" class="control-label">Data
													de Entrada</label> <input type="text" class="form-control input-sm"
													name="dataEntrada" placeholder="01-01-2017"
													required="required">
											</div>
											<div class="form-group form-group-sm">
												<label for="dataSaida" class="control-label">Data
													de Saída</label> <input type="text" class="form-control input-sm"
													name="dataSaida" placeholder="02-01-2017"
													required="required">
											</div>
										</fieldset>

										<button type="submit" class="btn btn-primary">Salvar</button>
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
		</div>
	</div>
</div>
<%@ include file="/WEB-INF/paginas/rodape.jsp"%>