package com.rogreis.cursomc.domain;

import javax.persistence.Entity;

import com.rogreis.cursomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 6369972856820228226L;
	private Integer numeroDeParcelas;
	
	public PagamentoComCartao() {

	}

	public PagamentoComCartao(Integer numeroDeParcelas) {
		super();
		this.setNumeroDeParcelas(numeroDeParcelas);
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
		super(id, estado, pedido);
		this.setNumeroDeParcelas(numeroDeParcelas);
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	
	
	
}
