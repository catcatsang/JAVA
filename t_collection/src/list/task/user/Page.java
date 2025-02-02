package list.task.user;

import list.task.DBConnecter;

public class Page {
	public static void main(String[] args) {
		UserService userService = new UserService();
		User user = new User();
		String certificatedNumber = null;
		String phone = null;

		user.setEmail("hds1234@gmail.com");

//      회원가입
		if (userService.findByUserEmail(user.getEmail()) == null) {
			user.setPassword("1234");
			user.setPhone("01012341234");

			userService.join(user);
		}

//      로그인
		user = new User();

		user.setEmail("hds1234@gmail.com");
		user.setPassword("1234");

		user = userService.login(user.getEmail(), user.getPassword());

		if (user != null) {
			System.out.println("로그인 성공!");
			System.out.println(user);
		} else {
			System.out.println("이메일 또는 비밀번호를 다시 확인해주세요.");
		}

//      회원 정보 수정
		user = userService.findById();
		user.setEmail("test@gmail.com");
		userService.update(user);

		System.out.println(DBConnecter.users);

//      임시 비밀번호
		phone = "01012341234";
		certificatedNumber = userService.sendCertificatedNumber(콜);
		if (certificatedNumber.equals("12345")) {
			userService.sendPassword(phone);
		}

		System.out.println(DBConnecter.users);

//      로그인 후 비밀번호 변경
		user = userService.findById();

		if (user != null) {
			userService.changePassword("9999");
		}

		System.out.println(DBConnecter.users);

		System.out.println(UserService.id);
		userService.logout();

		System.out.println(UserService.id);
	}
}
