package com.shevalucas.cursomc.domain;

import com.shevalucas.cursomc.domain.enums.EstadoPagamento;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class PagamentoComBoleto  extends  Pagamento{

    private Date dataVencimento;
    private Date dataPagamento;


    public PagamentoComBoleto() {
        super();
    }

    public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido,
                              Date dataVencimento, Date dataPagamento) {
        super(id, estado, pedido);
        this.dataPagamento = dataPagamento;
        this.dataVencimento = dataVencimento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }


}
