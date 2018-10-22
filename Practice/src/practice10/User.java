package practice10;

public class User {
		int userId;
		String userNm;
		String mail;
		String password;

		@Override
		public String toString() {
			return userId + "\n" + userNm + "\n" + mail + "\n" + password;
		}

}
