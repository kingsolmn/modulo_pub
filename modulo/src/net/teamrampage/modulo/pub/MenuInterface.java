/**
 * 
 */
package net.teamrampage.modulo.pub;

/**
 * @author Steve Palacios
 *
 */
public interface MenuInterface {

	Menu getMenu();
	
	MenuItem getMenuItem(int index);
	
	MenuItem[] getMenuItems();
	
	boolean addMenuItem(Menu item);
	
	boolean removeMenuItem(int index);
}
