package Main;

import java.util.Scanner;

import Main.DTO.RegisterRequest;
import Main.service.MemberListPrinter;
import Main.service.MemberRegisterService;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) { // exit 명령문이 나올 때 까지 돌기
			System.out.print("명령어를 입력해주셍 :");
			String command = sc.nextLine();
			if (command.startsWith("new ")) {
				// 의존객체 (클래스 안에 있는 객체)
				// dependency object
				String[] arg = command.split(" ");
				if (arg.length != 5) {
					printHelp();
					System.out.println();
					continue;
				}
				RegisterRequest req = new RegisterRequest();
				req.setEmail(arg[1]);
				req.setName(arg[2]);
				req.setPassword(arg[3]);
				req.setConfirmPassword(arg[4]);
				boolean b1 = req.isPasswordEqualConfirmPassword();
				if (!b1) {
					System.out.println("비밀번호가 일치하지 않습니다");
					continue;
				}
				// dependency object
				MemberRegisterService mrs = new MemberRegisterService();
				mrs.regist(req);
				// System.out.println("회원등록");
			} else if (command.startsWith("change ")) {
				System.out.println("변경");
			} else if (command.equals("list")) {
				MemberListPrinter listPrint = new MemberListPrinter();
				listPrint.printAll();
				// System.out.println("리스트");
			} else if (command.startsWith("info ")) {
				System.out.println("변경");
			} else if (command.equals("exit")) {
				System.out.println("프로그램이 종료되었띠");
				System.exit(0);
			}
		}
	}

	public static void printHelp() {
		System.out.println();
		System.out.println("명령어 사용법 : ");
		System.out.println("new 이메일 이름 암호 암호확인");
		System.out.println("change 이메일 현재비번 변경비번");
		System.out.println("list");
		System.out.println("info 이메일");
		// sys 안에 있는 영어로 쓴게 command , 한글이 쿼리스트링

	}
}
