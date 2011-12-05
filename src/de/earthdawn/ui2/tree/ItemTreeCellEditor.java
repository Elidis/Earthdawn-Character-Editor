package de.earthdawn.ui2.tree;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.lang.reflect.Constructor;
import java.util.EventObject;
import java.util.HashMap;
import javax.swing.JTree;
import javax.swing.event.CellEditorListener;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellEditor;
import javax.swing.tree.TreePath;
import de.earthdawn.data.ARMORType;
import de.earthdawn.data.BLOODCHARMITEMType;
import de.earthdawn.data.ITEMType;
import de.earthdawn.data.SHIELDType;
import de.earthdawn.data.THREADITEMType;
import de.earthdawn.data.WEAPONType;
import de.earthdawn.data.YesnoType;

public class ItemTreeCellEditor extends  DefaultTreeCellRenderer implements TreeCellEditor {
	private static final long serialVersionUID = 1L;
	private AbstractNodePanel editorPanel ;
	@SuppressWarnings("rawtypes")
	private HashMap<Class,Class> registerEditors;
	
	public ItemTreeCellEditor(){
		registerEditors = new  HashMap<Class,Class>();
		registerEditors.put(ITEMType.class,ItemNodePanel.class);
		registerEditors.put(WEAPONType.class,WeaponNodePanel.class);
		registerEditors.put(ARMORType.class,ArmorNodePanel.class);
		registerEditors.put(SHIELDType.class,ShieldNodePanel.class);
		registerEditors.put(BLOODCHARMITEMType.class,BloodcharmNodePanel.class);
		registerEditors.put(THREADITEMType.class,ThreadItemNodePanel.class);
	}
	
	@Override
	public void addCellEditorListener(CellEditorListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelCellEditing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getCellEditorValue() {
		// TODO Auto-generated method stub
		return editorPanel.getNodeObject();
	}

	@Override
	public boolean isCellEditable(EventObject event) {
		boolean returnValue = false;
		if (event instanceof MouseEvent) {
			MouseEvent mouseEvent = (MouseEvent) event;
			if (mouseEvent.getClickCount() > 1){
				JTree tree = (JTree)event.getSource();  
				TreePath path = tree.getPathForLocation(mouseEvent.getX(), mouseEvent.getY());
				if (path != null) {
					Object node = path.getLastPathComponent();
					if (node != null) {
						returnValue = (registerEditors.containsKey(node.getClass()));
						if(returnValue && (node instanceof ITEMType)) {
							ITEMType item = (ITEMType)node;
							returnValue = item.getVirtual().equals(YesnoType.NO);
						}
					}
				}
			}
		}
		return returnValue;
	}

	@Override
	public void removeCellEditorListener(CellEditorListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean shouldSelectCell(EventObject arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean stopCellEditing() {
		editorPanel.updateObject();
		return true;
	}

	@Override
	public Component getTreeCellEditorComponent(final JTree tree, Object value, 
			boolean selected, boolean expanded, boolean leaf, int row) {
		
		if (registerEditors.containsKey(value.getClass())){
			try {
				Class editorclass = registerEditors.get(value.getClass());
				Constructor constructor = editorclass.getConstructor(value.getClass());
				editorPanel = (AbstractNodePanel) constructor.newInstance(value);
				return editorPanel;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
}