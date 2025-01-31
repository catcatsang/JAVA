package list.task.user;

import java.util.Objects;

public class User {
//   회원번호, 이름, 이메일, 비밀번호, 핸드폰 번호
	
//	user 클래스의 선언문들
   private static Long seq;
   private Long id;
   private String email;
   private String password;
   private String phone;
   
   static {
      seq = 0L;
   }
   
   {
      id = ++seq;
   }
   
   public User() {;}

//   	user클래스의 선언문들을 매개변수로 받아서 필드에 할당하는 생성자
   public User(String email, String password, String phone) {
	   
      super();
      
      this.email = email;
      this.password = password;
      this.phone = phone;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   @Override
   public String toString() {
      return "User [id=" + id + ", email=" + email + ", password=" + password + ", phone=" + phone + "]";
   }

   @Override
//   equals(Object obj)
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      User other = (User) obj;
      return Objects.equals(id, other.id);
   }
}














