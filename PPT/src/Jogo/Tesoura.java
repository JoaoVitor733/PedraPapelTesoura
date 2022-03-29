package Jogo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tesoura implements ActionListener{
	
	private Resultado r1;
	private Cenario ce = new Cenario();
	
	public Tesoura(Resultado r1,Cenario ce) {
		this.r1 = r1;
		this.ce = ce;
	}
		
	public void actionPerformed(ActionEvent e) {
		r1.verificarVencedor(3);
		ce.loadMesa(3, r1.getJogadorPc());
	}
}
