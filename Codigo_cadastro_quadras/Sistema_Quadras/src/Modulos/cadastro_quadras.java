package Modulos;
import javax.swing.*;
import java.util.Objects;
//import java.util.*;

public class CadastroQuadras {
    public static Object quadras;
    public static void cadastrarQuadras(){
        int continuar_loop;
        do {
            quadras = JOptionPane.showInputDialog("Digite qual quadra deseja cadastrar: ");
            continuar_loop = JOptionPane.showConfirmDialog(null,"Deseja cadastrar mais quadras?","Confirme",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null);
        }  while(continuar_loop == JOptionPane.YES_OPTION);
    }
    public static void quadrasDisponiveis(){
        JOptionPane.showConfirmDialog(null, quadras,"As quadras cadastradas sao:", JOptionPane.OK_CANCEL_OPTION);
    }
    public static void reservarQuadras(){
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja reservar uma quadra?", "Reserva", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            quadrasDisponiveis();
            int sim_nao = JOptionPane.showConfirmDialog(null, "Reservar Quadra?","Reserva",JOptionPane.YES_NO_OPTION);
            if (sim_nao == JOptionPane.YES_NO_OPTION){
                quadras = "Reservada: " + quadras;
            }
        }else{
            inicio();
        }
    }
    public static void inicio(){
        do {
            String valor = JOptionPane.showInputDialog(null, "Escolha o que fazer\na. Cadastrar Quadra\nb. Visualizar Quadras\nc. Reservar Quadra", "Escolha", JOptionPane.QUESTION_MESSAGE);
            if (Objects.equals(valor, "a")) {
                cadastrarQuadras();
            } else if (Objects.equals(valor, "b")) {
                quadrasDisponiveis();
            } else if (Objects.equals(valor, "c")) {
                reservarQuadras();
            } else {
                return;
            }
        }while (true);
    }
    public static void main(String[] args) {
        inicio();
    }
}