package OopsConcept2;

public class TestMobile {

	public static void main(String[] args) {

		System.out.println("******1********");
		Oppo o = new Oppo();
		o.call(); //mobile call
		o.passcode(); //oppo passcode
		o.ringtone(); //oppo ringtone
		o.accessory_name();
		System.out.println("******2********");
		Mobile m = new Mobile();
		m.call(); //mobile call
		m.ringtone(); //mobile ringtone
		m.accessory_name();
		System.out.println("******3********");
		Mobile m1 = new Oppo();
		m1.call(); //mobile call
		m1.ringtone(); //oppo ringtone
		m1.accessory_name();
		System.out.println("******4********");
		Oppo o1 = (Oppo) new Mobile();
		o1.call(); //mobile call
		o1.passcode(); //oppo passcode
		o1.ringtone(); //oppo ringtone
		o1.accessory_name();

	}

}
