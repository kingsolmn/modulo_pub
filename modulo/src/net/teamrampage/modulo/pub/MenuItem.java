package net.teamrampage.modulo.pub;

/**
 * An item in the menu.
 * @author Steve Palacios
 *
 */
abstract class MenuItem {
	
	/**
	 * The position of the menu item in the menu.
	 */
	private int index = 0;
	
	/**
	 * The displayed text of the menu item.
	 */
	private String label = "Menu Item";
	
	/**
	 * The type of menu item.
	 */
	private MenuItemType type = MenuItemType.MENUITEM;
	
	/**
	 * Default Constructor.
	 * Creates a menu item with a position index of <code>0</code>, label of "Menu Item", and a type of <code>MENUITEM</code>.
	 */
	public MenuItem(){}
	
	/**
	 * Creates a MenuItem at the specified position index with a default label of "Menu Item" and a default type of <code>MENUITEM</code>.
	 * @param _position The menu item's position.
	 */
	public MenuItem(int _position){
		setItemIndex(_position);
	}
	
	/**
	 * Creates a MenuItem at the specified position index with the specified label and a default type of <code>MENUITEM</code>.
	 * @param _position The item's position.
	 * @param _label The item's label.
	 */
	public MenuItem(int _position, String _label){
		setItemIndex(_position);
		setLabel(_label);
	}
	
	/**
	 * Creates a MenuItem at the specified position of the specified type with the default label of "Menu Item".
	 * @param _position The item's position.
	 * @param _type The item's type.
	 */
	public MenuItem(int _position, MenuItemType _type){
		setItemIndex(_position);
		setType(_type);
	}
	
	/**
	 * Creates a MenuItem at the specified position of the type specified and with the specified label.
	 * @param _position The position index of the menu item.
	 * @param _type The type of the menu item.
	 * @param _label The label of the menu item.
	 */
	public MenuItem(int _position, MenuItemType _type, String _label){
		setItemIndex(_position);
		setType(_type);
		setLabel(_label);
	}
	
	/**
	 * Returns the menu item's position in the menu. 
	 * @return the item's index.
	 */
	public int getItemIndex(){
		return index;
	}

	/**
	 * Sets the position of this menu item in the parent menu.
	 * @param _index
	 */
	private void setItemIndex(int _index){
		index = _index;
	}

	/**
	 * @return the item's type.
	 */
	public MenuItemType getType() {
		return type;
	}

	/**
	 * @param _type the type of the menu item.
	 */
	private void setType(MenuItemType _type) {
		this.type = _type;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}
}
