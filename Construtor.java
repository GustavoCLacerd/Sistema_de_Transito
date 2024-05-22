class Construtor {
    int CodigoCidade, QtdAcidentes;
    String NomeCidade;

    Construtor (){
        this (0, 0, "");
    }

    Construtor (int CodigoCidade, int QtdAcidentes, String NomeCidade) {
       this.CodigoCidade = CodigoCidade;
       this.QtdAcidentes = QtdAcidentes;
       this.NomeCidade = NomeCidade;
    }
}