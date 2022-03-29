package Jogo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Papel implements ActionListener{
	
	private Resultado r1;
	private Cenario ce = new Cenario();
	
	public Papel(Resultado r1,Cenario ce) {
		this.r1 = r1;
		this.ce = ce;
	}
	
	public void actionPerformed(ActionEvent e) {
		r1.verificarVencedor(2);
		ce.loadMesa(2, r1.getJogadorPc());
	}
}


