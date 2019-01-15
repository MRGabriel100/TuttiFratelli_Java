package cadastros;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;

public class JPanelCadastroCliente extends JPanel {
	/** Create the panel. */
	public JPanelCadastroCliente() {
		setPreferredSize(new Dimension(600, 450));
		setMinimumSize(new Dimension(500, 350));
		setSize(new Dimension(500, 450));
		setMaximumSize(new Dimension(1000, 800));
		
		JPanel panelTitulo = new JPanel();
		panelTitulo.setMinimumSize(new Dimension(500, 44));
		panelTitulo.setMaximumSize(new Dimension(32767, 44));
		panelTitulo.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		
		JPanel panelDados = new JPanel();
		panelDados.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		
		JPanel panelAcoes = new JPanel();
		panelAcoes.setSize(new Dimension(106, 200));
		panelAcoes.setMaximumSize(new Dimension(120, 32767));
		panelAcoes.setMinimumSize(new Dimension(120, 200));
		panelAcoes.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panelAcoes.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
		JPanel panelRodaPe = new JPanel();
		panelRodaPe.setPreferredSize(new Dimension(12, 10));
		panelRodaPe.setMinimumSize(new Dimension(12, 23));
		panelRodaPe.setMaximumSize(new Dimension(32767, 23));
		panelRodaPe.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panelRodaPe, GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panelDados, GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panelAcoes, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
						.addComponent(panelTitulo, GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
					.addGap(0))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panelTitulo, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panelDados, GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
						.addComponent(panelAcoes, GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelRodaPe, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
		);
		
		JButton btnAjuda = new JButton("");
		btnAjuda.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAjuda.setBorder(null);
		btnAjuda.setIcon(new ImageIcon("D:\\Programacao\\Java Workspace\\TuttiFratelli\\Icones\\Botoes\\btnAjuda_18.png"));
		GroupLayout gl_panelRodaPe = new GroupLayout(panelRodaPe);
		gl_panelRodaPe.setHorizontalGroup(
			gl_panelRodaPe.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelRodaPe.createSequentialGroup()
					.addContainerGap(567, Short.MAX_VALUE)
					.addComponent(btnAjuda)
					.addContainerGap())
		);
		gl_panelRodaPe.setVerticalGroup(
			gl_panelRodaPe.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelRodaPe.createSequentialGroup()
					.addComponent(btnAjuda)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panelRodaPe.setLayout(gl_panelRodaPe);
		panelAcoes.setLayout(null);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setIcon(new ImageIcon("D:\\Programacao\\Java Workspace\\TuttiFratelli\\Icones\\Botoes\\btnConfirma_20.png"));
		btnConfirmar.setBounds(7, 11, 108, 23);
		panelAcoes.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon("D:\\Programacao\\Java Workspace\\TuttiFratelli\\Icones\\Botoes\\btnCancelar_20.png"));
		btnCancelar.setBounds(7, 45, 108, 23);
		panelAcoes.add(btnCancelar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setIcon(new ImageIcon("D:\\Programacao\\Java Workspace\\TuttiFratelli\\Icones\\Botoes\\btnExcluir_20.png"));
		btnExcluir.setBounds(7, 79, 108, 23);
		panelAcoes.add(btnExcluir);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setIcon(new ImageIcon("D:\\Programacao\\Java Workspace\\TuttiFratelli\\Icones\\Botoes\\btnPesquisar_20.png"));
		btnPesquisar.setBounds(7, 113, 108, 23);
		panelAcoes.add(btnPesquisar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setIcon(new ImageIcon("D:\\Programacao\\Java Workspace\\TuttiFratelli\\Icones\\Botoes\\Voltar_20.png"));
		btnSair.setBounds(7, 147, 108, 23);
		panelAcoes.add(btnSair);
		panelTitulo.setLayout(null);
		
		JLayeredPane imagemTela = new JLayeredPane();
		imagemTela.setPreferredSize(new Dimension(120, 43));
		imagemTela.setMaximumSize(new Dimension(120, 43));
		imagemTela.setMinimumSize(new Dimension(120, 43));
		imagemTela.setBackground(Color.WHITE);
		imagemTela.setBounds(480, 0, 120, 43);
		panelTitulo.add(imagemTela);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("D:\\Programacao\\Java Workspace\\TuttiFratelli\\Icones\\Menus\\ImgClientes.png"));
		label.setBounds(0, 0, 120, 43);
		imagemTela.add(label);
		
		JPanel panelDescricao = new JPanel();
		panelDescricao.setPreferredSize(new Dimension(460, 35));
		panelDescricao.setSize(new Dimension(460, 35));
		panelDescricao.setMinimumSize(new Dimension(200, 35));
		panelDescricao.setMaximumSize(new Dimension(32767, 35));
		panelDescricao.setBounds(10, 4, 460, 35);
		panelTitulo.add(panelDescricao);
		panelDescricao.setToolTipText("");
		panelDescricao.setLayout(null);
		
		JLabel lblCadastroDeCliente = DefaultComponentFactory.getInstance().createTitle("Cadastro de Cliente");
		lblCadastroDeCliente.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCadastroDeCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeCliente.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblCadastroDeCliente.setBounds(120, 0, 200, 35);
		panelDescricao.add(lblCadastroDeCliente);
		setLayout(groupLayout);
	}

}
