package jp.co.internous.team2502.model.form;

import java.io.Serializable;

/**
 * 宛先情報フォーム
 * @author インターノウス
 *
 */
public class DestinationForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private int destinationId;
	private int userId;
	private String familyName;
    private String firstName;
    private String address;
    private String telNumber;
    
    public int getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
    }
    
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
	
    public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
}
