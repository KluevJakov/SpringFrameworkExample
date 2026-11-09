public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void save() {
        System.out.println("Валидация входных данных пользователя");

        userRepository.save();
    }
}
