package Jogo;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Resultado extends JPanel {
	
	private int jogador;
	private int jogadorPc;
	private int pontuacaoJogador;
	private int pontuacaoPc;
	private String resul = "";
	private Cenario ce;
	
	public Resultado(Cenario ce) {
		this.ce = ce;
		reset();
	}
	
	public void verificarVencedor(int jogador) {	
		jogadorPc = new Random().nextInt(3)+1;//gerando valores  1(pedra),2(papel) e 3(tesoura)
		this.jogador = jogador;
		
		if(jogador == jogadorPc) { 
			resul = "Empate!";
		}else {
			if(jogador - jogadorPc == 1 || jogador - jogadorPc == -2) { 
				pontuacaoJogador += 1; 
				resul = "Ponto blue!";
			}else {
				if((jogador - jogadorPc == -1) || (jogador - jogadorPc == 2)){
					pontuacaoPc +=1;	
					resul = "Ponto red!";	
				}
			}
	     }	
    }
	
	public String getResul() {
		return resul;
	}
	
	public int getJogadorPc() {
		return jogadorPc;
	}
	
	public int getJogador() {
		return pontuacaoJogador;
	}
	
	public void calcularVitoria() {	
		if(pontuacaoJogador - pontuacaoPc == 2) {
			this.reset();
			JOptionPane.showMessageDialog(null,"Você veceu!!");
			ce.reset();
		}else {
			if(pontuacaoJogador - pontuacaoPc == -2) {
				this.reset();
				JOptionPane.showMessageDialog(null,"Você perdeu!!");
				ce.reset();
			}
		}
	}
	
	public void reset() {
		pontuacaoJogador = 0;
		pontuacaoPc = 0;
		resul = "";
	}
	
	public int getPontuacaoJogador() {	
		return pontuacaoJogador;
	}
	
	public int getPontuacaoPc() {
		return pontuacaoPc;
	}
}
