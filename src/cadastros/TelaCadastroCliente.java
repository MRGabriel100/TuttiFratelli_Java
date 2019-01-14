package cadastros;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

public class TelaCadastroCliente extends JPanel {
	private JButton btnSair;
	/**
	 * Create the panel.
	 */
	public TelaCadastroCliente() {
		setSize(new Dimension(500, 400));
		setMaximumSize(new Dimension(1000, 800));
		setMinimumSize(new Dimension(500, 400));
		
		JPanel painelDescricao = new JPanel();
		painelDescricao.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JPanel painelDados = new JPanel();
		
		JPanel painelAcoes = new JPanel();
		painelAcoes.setBorder(new LineBorder(new Color(0, 0, 0)));
		painelAcoes.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(painelDescricao, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(painelDados, GroupLayout.PREFERRED_SIZE, 383, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(painelAcoes, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(painelDescricao, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(painelDados, GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
						.addComponent(painelAcoes, GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)))
		);
		painelAcoes.setLayout(null);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(10, 11, 89, 23);
		painelAcoes.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(10, 45, 89, 23);
		painelAcoes.add(btnCancelar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(10, 79, 89, 23);
		painelAcoes.add(btnExcluir);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(10, 113, 89, 23);
		painelAcoes.add(btnPesquisar);
		
		btnSair = new JButton("Sair");
		btnSair.setBounds(10, 147, 89, 23);
		painelAcoes.add(btnSair);
		painelDescricao.setLayout(null);
		
		JLabel lblCadastroDeCliente = new JLabel("Cadastro de Cliente");
		lblCadastroDeCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeCliente.setBounds(10, 11, 363, 24);
		lblCadastroDeCliente.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		painelDescricao.add(lblCadastroDeCliente);
		
		JLayeredPane imagemTela = new JLayeredPane();
		imagemTela.setBackground(Color.WHITE);
		imagemTela.setBounds(394, 0, 106, 43);
		painelDescricao.add(imagemTela);
		setLayout(groupLayout);
	}

}
