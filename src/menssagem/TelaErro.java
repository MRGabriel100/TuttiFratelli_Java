package menssagem;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import executavel.ReadConfig;

import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Component;
import java.awt.Dimension;

public class TelaErro extends JPanel {

	/**
	 * Create the panel.
	 */
	public TelaErro(String msg) {
		setMinimumSize(new Dimension(300, 150));
		
		String IconFolder = ReadConfig.getIcon(); /* Obtem a pasta padrão dos icones. */
		
		
		JPanel panelBotao = new JPanel();
		
		JPanel paneIcon = new JPanel();
		
		JScrollPane scrpMenssagem = new JScrollPane();
		scrpMenssagem.setBorder(null);
		scrpMenssagem.setViewportView(new JLabel(msg));
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHonorsVisibility(false);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(paneIcon, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrpMenssagem, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
				.addComponent(panelBotao, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrpMenssagem, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
						.addComponent(paneIcon, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelBotao, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
		);
		paneIcon.setLayout(new CardLayout(0, 0));
		
		JLabel lbl_Icon = new JLabel("");
		lbl_Icon.setIcon(new ImageIcon(IconFolder + "\\Menssagens\\Erro.png"));
		lbl_Icon.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_Icon.setHorizontalAlignment(SwingConstants.CENTER);
		paneIcon.add(lbl_Icon, "name_13089107195550");
		
		JButton btnOk = new JButton("Ok");
		btnOk.setSize(new Dimension(70, 0));
		btnOk.setMaximumSize(new Dimension(70, 23));
		btnOk.setMinimumSize(new Dimension(70, 23));
		btnOk.setPreferredSize(new Dimension(70, 23));
		btnOk.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnOk.setHorizontalTextPosition(SwingConstants.CENTER);
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelBotao.add(btnOk);
		setLayout(groupLayout);
	}
}
