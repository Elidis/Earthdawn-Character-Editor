package de.earthdawn.ui2;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;

import de.earthdawn.data.COINSType;
import de.earthdawn.data.ITEMType;
import de.earthdawn.ui2.tree.CoinsNodePanel;
import de.earthdawn.ui2.tree.ItemTreeCellRenderer;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;

public class SpentCoins extends JFrame {
	private static final long serialVersionUID = -8905971559157812471L;
	private COINSType coins = new COINSType();
	private COINSType maxcoins = new COINSType();
	private ITEMType item;

	/**
	 * @wbp.parser.constructor
	 */
	public SpentCoins(ITEMType item, COINSType maxcoins) throws HeadlessException {
		super("Spent Coins");
		this.item=item;
		this.maxcoins=maxcoins;
		initialize();
	}

	public SpentCoins(ITEMType item, COINSType maxcoins, GraphicsConfiguration gc) {
		super(gc);
		this.item=item;
		this.maxcoins=maxcoins;
		initialize();
	}

	public SpentCoins(ITEMType item, COINSType maxcoins, String title) throws HeadlessException {
		super(title);
		this.item=item;
		this.maxcoins=maxcoins;
		initialize();
	}

	public SpentCoins(ITEMType item, COINSType maxcoins, String title, GraphicsConfiguration gc) {
		super(title, gc);
		this.item=item;
		this.maxcoins=maxcoins;
		initialize();
	}

	private void initialize() {
		getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel coinpanel = new CoinsNodePanel(coins);
		getContentPane().add(coinpanel, BorderLayout.CENTER);

		JPanel infopanel = new JPanel();
		infopanel.setLayout(new MigLayout("", "[grow]", "[20px:20px:20px][20px:20px:20px]"));
		JLabel lblItem = new JLabel();
		(new ItemTreeCellRenderer()).renderItems(item, lblItem);
		infopanel.add(lblItem, "cell 0 0,alignx center,aligny center");
		JLabel lblPrice = new JLabel("Price: "+String.valueOf(item.getPrice())+" Silver");
		infopanel.add(lblPrice, "cell 0 1,alignx center,aligny center");
		getContentPane().add(infopanel, BorderLayout.NORTH);
	}
}
