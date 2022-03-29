package Jogo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pedra implements ActionListener{
	
	private Resultado r1;
	private Cenario ce;
	
	public Pedra(Resultado r1,Cenario ce) {
		this.r1 = r1;
		this.ce = ce;
	}
	
	public void actionPerformed(ActionEvent e) {
		r1.verificarVencedor(1);
		ce.loadMesa(1, r1.getJogadorPc());	
	}
}
