package model.Entities;

public enum FormaPagamento {
    CARTAO_CREDITO("cartaoCredito"),
    CARTAO_DEBITO("cartaoDebito"),
    DINHEIRO("dinheiro"),
    PIX("pix"),
    VAZIO("");

    FormaPagamento(String descricao) {
        this.descricao = descricao;
    }

    private String descricao;

    public String getDescricao() {
        return descricao;
    }

}
