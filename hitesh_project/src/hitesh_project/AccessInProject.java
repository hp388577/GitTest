package hitesh_project;

import hitesh_package.*;

class Sub extends hitesh_package.Access {
	Access access = new Access();

	void show() {
		// TODO Auto-generated method stub
		System.out.println(access.pro + " " + access.pub);

	}
}

class Sub1 {
	Access access = new Access();

	void show() {
		// TODO Auto-generated method stub
		System.out.println(access.pro + " " + access.pub);

	}
}

public class AccessInProject {
	public static void main(String[] args) {
		Access access = new Access();
		System.out.println(access.pro + " " + access.pub);
		Sub sub = new Sub();
		sub.show();
		Sub1 sub1 = new Sub1();
		sub1.show();

	}
}
