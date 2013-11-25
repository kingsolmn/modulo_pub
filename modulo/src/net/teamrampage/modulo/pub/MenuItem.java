package net.teamrampage.modulo.pub;

/**
 * An item in the menu.
 * @author Steve Palacios
 *
 */
public abstract class MenuItem {
	
	/**
	 * The position of the menu item in the menu.
	 */
	private int index;
	
	/**
	 * The type of menu item.
	 */
	private MenuItemType type;
	
	public MenuItem(){
		index = 0;
		setType(MenuItemType.MENUITEM);
	}
	
	public MenuItem(int _index){
		setItemIndex(_index);
		setType(MenuItemType.MENUITEM);
	}
	
	public MenuItem(int _index, MenuItemType _type){
		index = _index;
		setType(_type);
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
	public void setItemIndex(int _index){
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
	public void setType(MenuItemType _type) {
		this.type = _type;
	}
}
