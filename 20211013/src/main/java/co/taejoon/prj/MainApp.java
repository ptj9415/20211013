package co.taejoon.prj;

import java.util.Scanner;

import co.taejoon.prj.member.serviceImpl.LoginCheck;
import co.taejoon.prj.menu.Menu;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LoginCheck login = new LoginCheck();
		Menu menu = new Menu();
		login.execute();
		menu.run();
		sc.close();
	}
}
