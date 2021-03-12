
package ie.lyit.lab2;

/**
 * @version 1.0
 * 
 * @author Stephen.Mailey
 *
 */
public class Snack {
	
	private String snackName;
	private int snackId;
	private Double price;
	private String snackType;
	
	
	
	/**
	 * @param snackName is the name of the snack sold in the cinema
	 * @param snackId is the unique identification number of the snack
	 * @param price is the price of the snack
	 * @param snackType describes the type of snack
	 */
	public Snack(String snackName, int snackId, Double price, String snackType) {
		super();
		this.snackName = snackName;
		this.snackId = snackId;
		this.price = price;
		this.snackType = snackType;
	}
	/**
	 * @return the snackName
	 */
	public String getSnackName() {
		return snackName;
	}
	/**
	 * @param snackName the snackName to set
	 */
	public void setSnackName(String snackName) {
		this.snackName = snackName;
	}
	/**
	 * @return the snackId
	 */
	public int getSnackId() {
		return snackId;
	}
	/**
	 * @param snackId the snackId to set
	 */
	public void setSnackId(int snackId) {
		this.snackId = snackId;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * @return the snackType
	 */
	public String getSnackType() {
		return snackType;
	}
	/**
	 * @param snackType the snackType to set
	 */
	public void setSnackType(String snackType) {
		this.snackType = snackType;
	}
	

}
