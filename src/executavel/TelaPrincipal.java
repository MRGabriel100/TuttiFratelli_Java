package executavel;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JDesktopPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.Insets;
import java.awt.CardLayout;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;

public class TelaPrincipal extends JPanel {

	/**
	 * Create the panel.
	 */
	public TelaPrincipal() {
		setMinimumSize(new Dimension(300, 300));
		setPreferredSize(new Dimension(600, 500));
		
		JPanel panelRodaPe = new JPanel();
		panelRodaPe.setBorder(new MatteBorder(1, 0, 0, 0, (Color) Color.GRAY));
		panelRodaPe.setBackground(Color.WHITE);
		
		JPanel JPanelMenu = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(JPanelMenu, GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
				.addComponent(panelRodaPe, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(JPanelMenu, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 438, Short.MAX_VALUE)
					.addComponent(panelRodaPe, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
		);
		JPanelMenu.setLayout(new CardLayout(0, 0));
		
		JMenuBar MBarMenu = new JMenuBar();
		MBarMenu.setSize(new Dimension(0, 30));
		MBarMenu.setPreferredSize(new Dimension(0, 30));
		MBarMenu.setAutoscrolls(true);
		MBarMenu.setMaximumSize(new Dimension(32767, 30));
		MBarMenu.setMinimumSize(new Dimension(600, 30));
		MBarMenu.setAlignmentY(Component.CENTER_ALIGNMENT);
		MBarMenu.setBackground(new Color(0, 0, 0));
		JPanelMenu.add(MBarMenu, "name_4732348972388");
		
		JMenu mnCadastros = new JMenu("Cadastros");
		MBarMenu.add(mnCadastros);
		
		JMenuItem mntmClientes = new JMenuItem("Clientes");
		mntmClientes.setHorizontalTextPosition(SwingConstants.CENTER);
		mntmClientes.setHorizontalAlignment(SwingConstants.CENTER);
		mnCadastros.add(mntmClientes);
		
		JMenuItem mntmProdutos = new JMenuItem("Produtos");
		mnCadastros.add(mntmProdutos);
		
		JMenu mnLanamentos = new JMenu("Lan\u00E7amentos");
		MBarMenu.add(mnLanamentos);
		
		JMenuItem mntmPedidos = new JMenuItem("Pedidos");
		mnLanamentos.add(mntmPedidos);
		setLayout(groupLayout);

	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
