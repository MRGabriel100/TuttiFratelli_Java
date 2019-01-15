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

public class JPanelTelaPrincipal extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPanelTelaPrincipal() {
		
		JPanel panel = new JPanel();
		
		JPanel JPanelMenu = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
				.addComponent(JPanelMenu, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(JPanelMenu, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
		);
		JPanelMenu.setLayout(null);
		
		JMenuBar MenuBar = new JMenuBar();
		MenuBar.setAutoscrolls(true);
		MenuBar.setSize(new Dimension(600, 30));
		MenuBar.setMaximumSize(new Dimension(0, 30));
		MenuBar.setMinimumSize(new Dimension(600, 30));
		MenuBar.setAlignmentY(Component.CENTER_ALIGNMENT);
		MenuBar.setBackground(new Color(0, 0, 0));
		MenuBar.setBounds(0, 0, 32767, 30);
		JPanelMenu.add(MenuBar);
		
		JMenu mnCadastros = new JMenu("Cadastros");
		MenuBar.add(mnCadastros);
		
		JMenuItem mntmClientes = new JMenuItem("Clientes");
		mntmClientes.setHorizontalTextPosition(SwingConstants.CENTER);
		mntmClientes.setHorizontalAlignment(SwingConstants.CENTER);
		mnCadastros.add(mntmClientes);
		
		JMenuItem mntmProdutos = new JMenuItem("Produtos");
		mnCadastros.add(mntmProdutos);
		
		JMenu mnLanamentos = new JMenu("Lan\u00E7amentos");
		MenuBar.add(mnLanamentos);
		
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
