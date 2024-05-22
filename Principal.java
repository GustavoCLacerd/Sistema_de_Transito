import javax.swing.JOptionPane;
class Principal {
public static void main (String Args []){
        int numero = 0, i;
        Construtor vt [] = new Construtor [10];
        
        for (i= 0; i < 10; i++){
            vt [i] = new Construtor();
        }
        
        Metodos m = new Metodos ();


        String mensagem = "1 - Cadastro Estatística\n"
                          + "2 - Consulta por quantidade de acidentes\n"
                          + "3 - Consulta por estatísticas de acidentes\n"
                          + "4 - Acidentes acima da média das 10 cidades\n"
                          + "9 - Finaliza";  
        while (numero != 9){
            numero = Integer.parseInt (JOptionPane.showInputDialog (null, mensagem));
            switch (numero) {
                case 1:
                m.Cadastrar (vt);
                break;
                case 2:
                m.ConsultaQtd (vt);
                break;
                case 3:
                m.MenorMaior (vt);
                break;
                case 4:
                m.AcimaMedia (vt);
                break;
                case 9: JOptionPane.showMessageDialog (null, "Programa encerrado!");
            }
        }
    }
}
