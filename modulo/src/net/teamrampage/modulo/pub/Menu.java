package net.teamrampage.modulo.pub;

/**
 * The menu or submenu of the module.
 * @author Steve Palacios
 *
 */
abstract class Menu {
	
	/**
	 * The position of this menu in a parent menu, zero if it is the top menu.
	 */
	private static int index = 0;
	
	public static int getMenuIndex(){
		return index;
	}
	
	public static void setMenuIndex(int _index){
		index = _index;
	}
}
