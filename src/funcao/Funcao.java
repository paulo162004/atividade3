package funcao;

import javax.swing.JOptionPane;

import model.People;

import java.util.ArrayList;

public class Funcao {

    private People p = new People();

    public void receberUsuario() {


        p.setNome(JOptionPane.showInputDialog("Digite o nome:"));
        p.setCargo(JOptionPane.showInputDialog("Digite o cargo:"));
        p.setHabilidades(JOptionPane.showInputDialog("Digite as habilidades:"));
        p.setIdade(JOptionPane.showInputDialog("Digite a idade"));
        p.setSexo(JOptionPane.showInputDialog("Digite o sexo:"));
        p.setEndereco(JOptionPane.showInputDialog("Digite o endereço:"));
        p.setCidade(JOptionPane.showInputDialog("Digite a cidade:"));
        p.setEstado(JOptionPane.showInputDialog("Digite o estado:"));
    }

    public void printUser() {
        JOptionPane.showMessageDialog(null, "Os dados do funcionário são: "
                + "\nNome: " + p.getNome()
                + "\nCargo: " + p.getCargo()
                + "\nHabilidade: " + p.getHabilidades()
                + "\nIdade: " + p.getIdade()
                + "\nSexo: " + p.getSexo()
                + "\nEndereço: " + p.getEndereco()
                + "\nCidade: " + p.getCidade()
                + "\nEstado: " + p.getEstado());
    }

    public void relatorio(ArrayList<People> pessoas) {
        String[] opcoes = {"Por cidade", "Por cargo", "Por sexo", "Por estado"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha o tipo de relatório:", "Relatório",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

        if (escolha != -1) {
            String filtro = JOptionPane.showInputDialog("Digite o filtro:");
            switch (escolha) {
                case 0:
                    relatorioPorCidade(pessoas, filtro);
                    break;
                case 1:
                    relatorioPorCargo(pessoas, filtro);
                    break;
                case 2:
                    relatorioPorSexo(pessoas, filtro);
                    break;
                case 3:
                    relatorioPorEstado(pessoas, filtro);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Escolha inválida.");
                    break;
            }
        }
    }

    private void relatorioPorCidade(ArrayList<People> pessoas, String filtro) {
        // Implementação do relatório por cidade com filtro
        StringBuilder relatorio = new StringBuilder("Relatório para a cidade de " + filtro + ":\n");
        for (People pessoa : pessoas) {
            if (pessoa.getCidade().equalsIgnoreCase(filtro)) {
                relatorio.append(pessoa.toString()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, relatorio.toString());
    }

    private void relatorioPorCargo(ArrayList<People> pessoas, String filtro) {
        // Implementação do relatório por cargo com filtro
        StringBuilder relatorio = new StringBuilder("Relatório para o cargo de " + filtro + ":\n");
        for (People pessoa : pessoas) {
            if (pessoa.getCargo().equalsIgnoreCase(filtro)) {
                relatorio.append(pessoa.toString()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, relatorio.toString());
    }

    private void relatorioPorSexo(ArrayList<People> pessoas, String filtro) {
        // Implementação do relatório por sexo com filtro
        StringBuilder relatorio = new StringBuilder("Relatório para o sexo " + filtro + ":\n");
        for (People pessoa : pessoas) {
            if (pessoa.getSexo().equalsIgnoreCase(filtro)) {
                relatorio.append(pessoa.toString()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, relatorio.toString());
    }

    private void relatorioPorEstado(ArrayList<People> pessoas, String filtro) {
        // Implementação do relatório por estado com filtro
        StringBuilder relatorio = new StringBuilder("Relatório para o estado de " + filtro + ":\n");
        for (People pessoa : pessoas) {
            if (pessoa.getEstado().equalsIgnoreCase(filtro)) {
                relatorio.append(pessoa.toString()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, relatorio.toString());
    }

}

