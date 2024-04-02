package example.designPattern.command.gui;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

@SuppressWarnings("serial")
class ExitAction extends AbstractAction {
	private Component target;

	public ExitAction(String name, Icon icon, Component t) {
		putValue(Action.NAME, name);
		putValue(Action.SMALL_ICON, icon);
		putValue(Action.SHORT_DESCRIPTION, name + " the program");

		target = t;
	}

	public void actionPerformed(ActionEvent evt) {
		int answer = JOptionPane.showConfirmDialog(target, "Are you sure you want to exit? ", "Confirmation",
				JOptionPane.YES_NO_OPTION);
		if (answer == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
}

@SuppressWarnings("serial")
class SubmitAction extends AbstractAction {
	private Component target;

	public SubmitAction(String name, Icon icon, Component t) {
		putValue(Action.NAME, name);
		putValue(Action.SMALL_ICON, icon);
		putValue(Action.SHORT_DESCRIPTION, name + " the program");
		target = t;
	}

	public void actionPerformed(ActionEvent evt) {
		JOptionPane.showMessageDialog(target, "submit action clicked ");
	}
}

@SuppressWarnings("serial")
public class CommandDesignPattern extends JFrame {
	CommandDesignPattern() {
		Action ea = new ExitAction("Exit", null, this);
		Action sa = new SubmitAction("Submit", new ImageIcon(), this);

		/**
		 * JMenu
		 */
		final JMenuBar jbr = new JMenuBar();
		JMenu dropmenu = new JMenu("File");
		JMenuItem submitmenu = new JMenuItem(sa);
		JMenuItem exitmenu = new JMenuItem(ea);
		dropmenu.add(submitmenu);
		dropmenu.add(exitmenu);
		jbr.add(dropmenu);
		setJMenuBar(jbr);

		/**
		 * JPopup
		 */
		final JPopupMenu jpm = new JPopupMenu("PopMenu");
		jpm.add(sa);
		jpm.add(ea);
		addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				showPopup(e);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				showPopup(e);
			}

			private void showPopup(MouseEvent e) {
				if (e.isPopupTrigger()) {
					jpm.show(e.getComponent(), e.getX(), e.getY());
				}
			}
		});

		/**
		 * JButton
		 */
		JPanel jp = new JPanel();
		JButton subbtn = new JButton(sa);
		JButton exitbtn = new JButton(ea);
		jp.add(subbtn);
		jp.add(exitbtn);
		Container con = getContentPane();
		con.add(jp, "South");

		/**
		 * Frame
		 */
		setTitle("Command pattern example");
		setIconImage(new ImageIcon("earth.gif").getImage());
		setSize(400, 200);
		setVisible(true);
	}

	public static void main(String[] args) throws Exception {
		new CommandDesignPattern();
	}
}
