package gerenciadeequipamentos

//-Dgeb.env=chrome test-app

class Equipamento {
    String nome
    String status
    String localizacao
    boolean lista
    static constraints = {

        status blank: false
        localizacao blank: false
        nome blank: false

    }

    def setTrueBusca(){
        lista = true
    }

    def setFalseBusca(){
        lista = false
    }

}