package sep;

import pack.Drivercreation;
import pack.GmailLogin;

public class Execute {
	public static void main(String args[])throws Exception {
		Drivercreation dc=new Drivercreation();
		dc.setDriver();
		GmailLogin gm=new GmailLogin();
		gm.login("sumathi.p42","@Sumathi123");
	}

}
