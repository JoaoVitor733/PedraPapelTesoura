package Jogo;

import javax.swing.ImageIcon;

public class Cenario {
	
	private ImageIcon fundo = new ImageIcon("res//Cenario.png");
	private ImageIcon mesa = new ImageIcon(("res//MesaJogador.png"));
	private ImageIcon mesaP= new ImageIcon(("res//MesaPc.png"));
	private ImageIcon mesaMomento = new ImageIcon();
	private ImageIcon mesaMomentoP = new ImageIcon();
	private Imagens im;
	
	public Cenario() {
		im = new Imagens();
		mesaMomento = mesa;
		mesaMomentoP = mesaP;
	}
		
	public ImageIcon getFundo() {
		return fundo;
	}
	
	public ImageIcon getMesa() {
		return mesa;
	}
	
	public ImageIcon getMesaP() {
		return mesaP;
	}

	public void loadMesa(int Jo, int Pc) {
		if(Jo == 1) {
			mesaMomento = im.getPedraJogador();
		}else {
			if(Jo == 2) {
				mesaMomento= im.getPapelJogador();
			}else {
				mesaMomento = im.getTesouraJogador();
			}
		}
		
		if(Pc == 1) {
			mesaMomentoP = im.getPedraJogadorPc();
		}else {
			if(Pc == 2) {
				mesaMomentoP = im.getPapelPc();
			}else {
				mesaMomentoP = im.getTesouraPc();
    		}
		}
	}
	
	public ImageIcon getMesaMomento() {
		return mesaMomento;
	}
	
	public ImageIcon getMesaMomentoP() {
		return mesaMomentoP;
	}
	
	public void reset() {
		mesaMomento = mesa;
		mesaMomentoP = mesaP;
	}	
}
