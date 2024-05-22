import javax.swing.JOptionPane;
public class Metodos {
   public Construtor [] Cadastrar (Construtor [] vt1){
    int j;
    for (j = 0; j < 10; j++){
    vt1[j].CodigoCidade = Integer.parseInt (JOptionPane.showInputDialog ("Digite o código da cidade: "));
    vt1[j].QtdAcidentes = Integer.parseInt (JOptionPane.showInputDialog ("Digite a quantidade de acidentes: "));
    vt1[j].NomeCidade = JOptionPane.showInputDialog ("Digite o nome da cidade"); 
    }
    return vt1;
   }

   public void ConsultaQtd (Construtor [] vt2 ){
    int j;
    for (j = 0; j < 10; j++){
        if (vt2 [j].QtdAcidentes > 100 && vt2 [j].QtdAcidentes < 500){
            System.out.println ("Cidade: " + vt2 [j].NomeCidade);
        }
    }
   }

   public void MenorMaior (Construtor  [] vt3){
    int maior, menor, j;
    maior = vt3 [0].QtdAcidentes;
    menor = vt3 [0].QtdAcidentes;

    for (j = 1; j < 10; j++){
        if (vt3 [j].QtdAcidentes > maior){
            maior = vt3 [j].QtdAcidentes;
        }
        if (vt3 [j].QtdAcidentes < menor) {
            menor = vt3 [j].QtdAcidentes;
        }
}
   }
   public void AcimaMedia (Construtor [] vt4) {
    int soma = 0, media, j;

    for (j = 0; j < 10; j++){
       soma = soma + vt4 [j].QtdAcidentes;
        }
        media = soma / 10;
    for (j = 0; j < 10; j++){
        if (vt4 [j].QtdAcidentes > media){
            System.out.println ("Cidade acima da média: " +vt4 [j].QtdAcidentes);
        }
    }    
}
}

