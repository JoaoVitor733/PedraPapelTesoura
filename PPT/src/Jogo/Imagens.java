package Jogo;

import javax.swing.ImageIcon;

public class Imagens {
	
	private ImageIcon pedraJogador;
	private ImageIcon pedraPc;
	private ImageIcon papelJogador ;
	private ImageIcon papelPc;
	private ImageIcon tesouraJogador ;
	private ImageIcon tesouraPc;
	
	public Imagens() {
		pedraJogador = new ImageIcon(("res//PedraJogador.png"));
		pedraPc = new ImageIcon(("res//PedraPc.png"));
		papelJogador = new ImageIcon(("res//papelJogador.png"));
		papelPc = new ImageIcon(("res//papelPc.png"));
		tesouraJogador = new ImageIcon(("res//tesouraJogador.png"));
		tesouraPc = new ImageIcon(("res//tesouraPc.png"));
	}
	
	public ImageIcon getPedraJogador() {
		return pedraJogador;
	}
	
	public ImageIcon getPedraJogadorPc() {
		return pedraPc;
	}
	
	public ImageIcon getPapelJogador() {
		return papelJogador;
	}
	
	public ImageIcon getPapelPc() {
		return papelPc;
	}
	
	public ImageIcon getTesouraJogador() {
		return tesouraJogador;
	}
	
	public ImageIcon getTesouraPc() {
		return tesouraPc;
	}
}
