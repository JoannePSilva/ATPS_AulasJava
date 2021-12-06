export class Conta {
    get agencia() {
        return this._agencia;
    }
    set agencia(ag) {
        console.log('Acessando o metodo como se fosse uma variavel');
        this._agencia = ag;
    }
}
