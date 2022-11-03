export class Fatura {
    constructor(idProduto,descricaoProduto,quantidadeProduto,precoProduto){
        this.id = idProduto
        this.descricao = descricaoProduto
        quantidadeProduto>0?
        this.quantia = quantidadeProduto:this.quantia = 0;
        precoProduto>0?
        this.preco = precoProduto:this.preco = precoProduto;
    }
    obterValorTotal(){
        return this.quantia * this.preco
    }
    get ValorTotal(){
        return this.quantia * this.preco
    }
}