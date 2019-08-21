package com.gabrielc.cursomc.domain;

import javax.persistence.Entity;

import com.gabrielc.cursomc.domain.enums.EstatoPagamento;

@Entity
public class PagamentoComCartão extends Pagamento{
	private static final long serialVersionUID = 1L;

	private Integer numeroDeParcelas;
	
	public PagamentoComCartão() {
	}

	public PagamentoComCartão(Integer id, EstatoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
		super(id, estado, pedido);
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	
}
