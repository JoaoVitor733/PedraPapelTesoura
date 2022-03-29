package Jogo;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame implements Runnable{
	
	private Pedra pe;
	private Cenario ce;
	private Papel pa ;
	private Tesoura te;
	private Imagens im;
	private Resultado r1;
	
	JButton pedra;
	JButton papel;
	JButton tesoura;
	
	JLabel pedraPc;
	JLabel papelPc;		
	JLabel tesouraPc;
	JLabel mesaJogador;
	JLabel mesaPc;	
	JLabel fundo;	
	JLabel pontosJo,PontosPc;
	JLabel resultado;
	Font fonte = new Font("Serif",Font.BOLD,15);
		
	public Main() {
		initialize();
		editarJanela(); 		
		pedra.addActionListener(pe);
		papel.addActionListener(pa);
		tesoura.addActionListener(te);			
		run();	
	}
	
	public void initialize() {
		ce = new Cenario();
		im = new Imagens();
		pedra = new JButton(im.getPedraJogador());
		pedraPc = new JLabel(im.getPedraJogadorPc());
		papel = new JButton(im.getPapelJogador());
		papelPc = new JLabel(im.getPapelPc());	
		tesoura = new JButton(im.getTesouraJogador());
		tesouraPc = new JLabel(im.getTesouraPc());
		mesaJogador = new JLabel(ce.getMesa());
		mesaPc = new JLabel(ce.getMesaP());
		fundo = new JLabel(ce.getFundo());
		r1 = new Resultado(ce);
		pe = new Pedra(r1,ce);
		pa  = new Papel(r1,ce);
		te = new Tesoura(r1,ce);
		pontosJo = new JLabel("0");
		PontosPc = new JLabel("0");
		resultado = new JLabel("");
	}
	

	public void editarJanela() {			
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		editarVisual();		
	}
	
	public void editarVisual() {
		pedra.setBounds(20, 100, 100, 100);
		pedraPc.setBounds(350,100,100,100);
		papel.setBounds(20,210,100,100);
		papelPc.setBounds(350,210,100,100);
		tesoura.setBounds(20,320,100,100);		
		tesouraPc.setBounds(350, 320, 100, 100);
		pontosJo.setForeground(Color.WHITE);
		pontosJo.setBounds(170,320,200,100);
		PontosPc.setForeground(Color.WHITE);
		PontosPc.setBounds(300,320,200,100);
		resultado.setFont(fonte);
		resultado.setForeground(Color.WHITE);
		resultado.setBounds(200,140,100,100);	
		mesaJogador.setBounds(130,210,100,100);
		mesaPc.setBounds(240,210,100,100);	
		fundo.setBounds(0,0,500,500);

		add(pedra);
		add(pedraPc);
		add(papel);
		add(papelPc);
		add(tesoura);
		add(tesouraPc);	
		add(pontosJo);
		add(PontosPc);
		add(mesaJogador);
		add(mesaPc);		
		add(resultado);
		add(fundo);				
	}
	
	@Override
	public void run() {		
		while(true) {		
			r1.calcularVitoria();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				 
				e.printStackTrace();
			}
			pontosJo.setText(String.valueOf(r1.getPontuacaoJogador()));
			PontosPc.setText(String.valueOf(r1.getPontuacaoPc()));
			resultado.setText(r1.getResul());
			mesaJogador.setIcon(ce.getMesaMomento());
			mesaPc.setIcon(ce.getMesaMomentoP());		
		}		
	}

	public static void main(String[] args) {
		new Main();

	}	
}
